package com.example.hungry

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.hungry.databinding.FragmentRestBinding

class RestFragment : Fragment() {

    lateinit var binding: FragmentRestBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRestBinding.inflate(inflater, container, false)

        return binding.root
    }
}