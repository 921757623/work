package com.example.myhole

import android.os.Bundle
import android.view.*
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.myhole.adapter.ItemAdapter
import com.example.myhole.adapter.SpaceItemDecoration
import com.example.myhole.data.HomeScreenViewModel
import com.example.myhole.databinding.HomeScreenFragmentBinding

class HomeScreenFragment : Fragment() {

    private val viewModel: HomeScreenViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = HomeScreenFragmentBinding.inflate(inflater, container , false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        binding.recyclerView.adapter = ItemAdapter()
        binding.recyclerView.addItemDecoration(SpaceItemDecoration(0,20))
        return binding.root
    }

    fun changeThumbIcon(
    imageView: ImageView,
    isThumbUp: Boolean
) {
        if(!isThumbUp)
            imageView.setImageResource(R.drawable.ic_thumbs)
        else
            imageView.setImageResource(R.drawable.ic_thumbs_up)
    }
}