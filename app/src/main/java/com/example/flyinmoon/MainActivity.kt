package com.example.flyinmoon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.grpc.ManagedChannelBuilder
import kotlinx.coroutines.runBlocking
import polar_align.PolarAlignGrpc
import polar_align.PolarAlignGrpcKt
import polar_align.PolarAlignOuterClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //val channel = ManagedChannelBuilder.forAddress("192.168.1.13", 8000).usePlaintext().build()
       // val stub = PolarAlignGrpcKt.PolarAlignCoroutineStub(channel)
       // val request = PolarAlignOuterClass.Request.newBuilder().build()
        runBlocking {
            print("-------------- start")
           // stub.startPolarAlign(request).collect { value -> println("collected $value") }
            println("--------------- done")
        }
    }
}
