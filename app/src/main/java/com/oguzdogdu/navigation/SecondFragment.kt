package com.oguzdogdu.navigation

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.oguzdogdu.navigation.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private val args by navArgs<SecondFragmentArgs>()

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textView.text = "First Name: ${args.currentUser.firstName} \n Last Name: ${args.currentUser.lastName}"

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}