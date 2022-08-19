package com.example.myhole

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.myhole.adapter.ItemAdapter
import com.example.myhole.adapter.SpaceItemDecoration
import com.example.myhole.data.HomeScreenViewModel
import com.example.myhole.databinding.HomeScreenFragmentBinding

class HomeScreenFragment : Fragment() {
    private lateinit var binding:HomeScreenFragmentBinding
    private val viewModel: HomeScreenViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = HomeScreenFragmentBinding.inflate(inflater, container , false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.recyclerView.adapter = ItemAdapter(this)
        binding.recyclerView.addItemDecoration(SpaceItemDecoration(0,20))
    }

}