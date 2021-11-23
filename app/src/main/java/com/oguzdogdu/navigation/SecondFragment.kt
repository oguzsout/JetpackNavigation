package com.oguzdogdu.navigation

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.oguzdogdu.navigation.databinding.FragmentSecondBinding


class SecondFragment : Fragment(R.layout.fragment_second) {

    private lateinit var binding: FragmentSecondBinding

    private val args by navArgs<SecondFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)

        binding.tvSecondname.text = "Name: ${args.userData.firstName}"
        binding.tvSecondlast.text = "Lastname: ${args.userData.lastName}"

    }
}