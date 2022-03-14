package com.example.androidtabs_demo.modules.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

//class GalleryFragment: Fragment() {
//
//    private lateinit var viewModel: GalleryViewModel
//    private lateinit var binding: GalleryFragmentBinding
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        binding = GalleryFragmentBinding.inflate(inflater)
//        context ?: return binding.root
//
//        val factory = GalleryViewModelFactory()
//        viewModel = ViewModelProvider(this, factory).get(GalleryViewModel::class.java)
//        binding.viewModel = viewModel
//        binding.lifecycleOwner = viewLifecycleOwner
//
//        return binding.root
//    }
//}