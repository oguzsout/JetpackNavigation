package com.oguzdogdu.navigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.oguzdogdu.navigation.databinding.FragmentSecondBinding


class SecondFragment : Fragment(R.layout.fragment_second) {

    private lateinit var binding: FragmentSecondBinding

    private val args by navArgs<SecondFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)

        dataSet()

    }

    private fun dataSet() {
        "Name: ${args.userData.firstName}".also {
            binding.tvSecondname.text = it
        }
        "Lastname: ${args.userData.lastName}".also {
            binding.tvSecondlast.text = it
        }
    }
}