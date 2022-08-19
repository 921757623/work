package com.example.myhole.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myhole.HomeScreenFragment
import com.example.myhole.R
import com.example.myhole.data.HomeScreenViewModel
import com.example.myhole.databinding.ListItemBinding
import com.example.myhole.model.Hole
import com.example.myhole.model.Interact
import com.example.myhole.network.HustHoleApi
import com.example.myhole.network.HustHoleApiService

/**
 *@classname ItemAdapter
 * @description:
 * @date :2022/8/6 12:51
 * @version :1.0
 * @author
 */
class ItemAdapter(
    val context: HomeScreenFragment
) : ListAdapter<Hole,
        ItemAdapter.ItemViewHolder>(DiffCallback) {

    class ItemViewHolder(
        private var binding: ListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(hole: Hole) {
            binding.let {
                it.thumbsUp.setOnClickListener {
                    if (binding.hole?.isThumb == true) {
                        binding.thumbsUp.setImageResource(R.drawable.ic_thumb_inactive)
                        try {
                            HustHoleApi.retrofitService.postInteractUnLike(Interact(hole.holeID))
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    } else {
                        binding.thumbsUp.setImageResource(R.drawable.ic_thumbs_active)
                        try {
                            HustHoleApi.retrofitService.postInteractLike(Interact(hole.holeID))
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }
                }
                it.imgStar.setOnClickListener {
                    if (binding.hole?.isFollow == true) {
                        binding.imgStar.setImageResource(R.drawable.ic_follow_inactive)
                        binding.hole?.follow = binding.hole?.follow!! - 1
                        binding.textStar.text = binding.hole?.follow.toString()
                        try {
                            HustHoleApi.retrofitService.postInteractUnFollow(Interact(hole.holeID))
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }
                    else {
                        binding.imgStar.setImageResource(R.drawable.ic_follow_active)
                        binding.hole?.follow = binding.hole?.follow!! + 1
                        binding.textStar.text = binding.hole?.follow.toString()
                        try {
                            HustHoleApi.retrofitService.postInteractFollow(Interact(hole.holeID))
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }
                    binding.hole?.isFollow = !binding.hole?.isFollow!!

                }
                it.hole = hole
                it.executePendingBindings()
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemViewHolder {
        return ItemViewHolder(
            ListItemBinding.inflate(
                LayoutInflater.from(parent.context)
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Hole>() {
        override fun areItemsTheSame(oldItem: Hole, newItem: Hole): Boolean {
            return false
        }

        override fun areContentsTheSame(oldItem: Hole, newItem: Hole): Boolean {
            return false
        }
    }
}