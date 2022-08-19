package com.example.myhole.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myhole.R
import com.example.myhole.databinding.ListItemBinding
import com.example.myhole.model.Hole

/**
 *@classname ItemAdapter
 * @description:
 * @date :2022/8/6 12:51
 * @version :1.0
 * @author
 */
class ItemAdapter : ListAdapter<Hole,
        ItemAdapter.ItemViewHolder>(DiffCallback) {

    class ItemViewHolder(
        private var binding: ListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(hole: Hole) {
            binding.let {
                it.hole = hole
                it.thumbsUp.setOnClickListener {
                    if (hole.isThumb == true)
                        binding.thumbsUp.setImageResource(R.drawable.ic_thumb_inactive)
                    else
                        binding.thumbsUp.setImageResource(R.drawable.ic_thumbs_active)
                }
                it.imgStar.setOnClickListener {
                    if (hole.isFollow == true)
                        binding.imgStar.setImageResource(R.drawable.ic_follow_inactive)
                    else
                        binding.imgStar.setImageResource(R.drawable.ic_follow_active)
                }
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