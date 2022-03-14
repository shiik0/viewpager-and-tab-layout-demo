package com.example.androidtabs_demo.modules.gallery

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class GalleryViewModelFactory(): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val viewModel = GalleryViewModel(
        )
        return viewModel as T
    }

}
