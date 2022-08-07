package com.example.lovecalculator20

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lovecalculator20.App
import com.example.lovecalculator20.LoveModel
import com.example.lovecalculator20.R
import com.example.lovecalculator20.databinding.FragmentFirstBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClickers()
    }

    private fun initClickers() {
        with(binding){
            val firstName = binding.firstNameEd.text.toString()
            val secondName = binding.secondNameEd.text.toString()
            App.api.calculate(firstName, secondName).enqueue(object : Callback<LoveModel>{
                override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                    if (response.isSuccessful){
                        val bundle = Bundle()
                        bundle.putString("fname", response.body()?.firstName)
                        bundle.putString("sname", response.body()?.secondName)
                        bundle.putString("percentage", response.body()?.percentage)
                        bundle.putString("result", response.body()?.result)
                        btnNext.setOnClickListener {
                            findNavController().navigate(R.id.secondFragment, bundle)
                        }
                    }
                }

                override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })
        }
    }
}