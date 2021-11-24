package com.oguzdogdu.navigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.oguzdogdu.navigation.databinding.FragmentFirstBinding
import com.oguzdogdu.navigation.model.User


class FirstFragment : Fragment(R.layout.fragment_first) {

    private lateinit var binding: FragmentFirstBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.bind(view)

        sendData()
    }

    private fun sendData() {

        binding.btnSend.setOnClickListener {
            /*  val firstName = binding.txtFirstname.text.toString()
                val lastName = binding.txtLastname.text.toString()
                val user = User(fiName, lastName)
                val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(user)
                findNavController().navigate(action)*/
            val bundle = Bundle()
            bundle.putParcelable(
                "users",
                User(binding.txtFirstname.text.toString(), binding.txtLastname.text.toString())
            )

            findNavController().navigate(R.id.action_firstFragment_to_secondFragment, bundle)
        }
    }
}
