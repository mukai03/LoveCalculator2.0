package com.example.lovecalculator20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.Navigation.findNavController
import com.example.lovecalculator20.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //initClickers()
    }

/*    private fun doRequest(firstName : String, secondName : String) {
        App.api.calculate(firstName, secondName).enqueue(object : Callback<LoveModel> {
            override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                Log.e("ololo", "onResponse: ${response.body()}")
                binding.okBtn.text = response.body()?.result
            }

            override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                Log.e("ololo", "onFailure: ${t.message}")
            }

        })
    }

    private fun initClickers() {
        with(binding){
            okBtn.setOnClickListener {
                doRequest(firstNameEd.text.toString(), secondNameEd.text.toString())
            }
        }
    }*/
}