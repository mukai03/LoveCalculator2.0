package com.example.lovecalculator20

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lovecalculator20.R
import com.example.lovecalculator20.databinding.FragmentSecondBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
        listener()
    }

    private fun onClick() {
        val firstName = arguments?.getString("fname")
        val secondName = arguments?.getString("sname")
        val percentage = arguments?.getString("percentage")
        val result = arguments?.getString("result")

        binding.tvFirstName.text = firstName
        binding.tvSecondName.text = secondName
        binding.tvPercent.text = percentage
        binding.tvResult.text = result
    }

    private fun listener() {
        binding.btnTryAgain.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}