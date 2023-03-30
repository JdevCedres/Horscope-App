package com.example.horoscopapp.ui.compatibility

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.horoscopapp.R
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class CompatibilityFragment : Fragment() {

    private val viewModel by viewModels<CompatibilityViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_compatibility, container, false)
    }

}