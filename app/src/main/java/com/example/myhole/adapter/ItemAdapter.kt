package com.example.myhole.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myhole.HomeScreenFragment
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
        ItemAdapter.ItemViewHolder>(DiffCallback){

    class ItemViewHolder(
        private var binding: ListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(hole: Hole) {
            binding.hole = hole
            binding.thumbsUp.setOnClickListener {
                if(hole.isThumb == true)
                    binding.thumbsUp.setImageResource(R.drawable.ic_thumbs)
                else
                    binding.thumbsUp.setImageResource(R.drawable.ic_thumbs_up)
            }
            binding.executePendingBindings()
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