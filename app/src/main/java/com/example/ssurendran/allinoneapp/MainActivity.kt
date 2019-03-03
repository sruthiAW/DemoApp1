package com.example.ssurendran.allinoneapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.ssurendran.allinoneapp.model.User
import com.example.ssurendran.allinoneapp.retrofit.SampleAPI
import com.example.ssurendran.allinoneapp.retrofit.SampleRetrofitClient
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->

            SampleRetrofitClient().getSampleAPI().getUser(1).enqueue(object: Callback<User>{
                override fun onFailure(call: Call<User>?, t: Throwable?) {
                    Toast.makeText(this@MainActivity, "Failure: ${t.toString()}", Toast.LENGTH_SHORT).show()
                }

                override fun onResponse(call: Call<User>?, response: Response<User>?) {
                    if (response?.isSuccessful == true) {
                        userTv.text = response.body().toString()
                    } else{
                        Toast.makeText(this@MainActivity, "Error: ${response?.errorBody()}", Toast.LENGTH_LONG).show()
                    }
                }

            })


            //do with normal internet call httpConnection

            //do with call.execute from within coroutines

        }
    }



}
