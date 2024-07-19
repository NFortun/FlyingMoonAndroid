package com.example.flyingmoon

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.flyingmoon.fragments.GuidingFragment
import com.example.flyingmoon.fragments.ImagingFragment
import com.example.flyingmoon.services.PolarAlignService
import com.example.flyinmoon.R
import com.example.flyinmoon.databinding.ActivityMainBinding
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import polar_align.PolarAlignGrpcKt
import polar_align.PolarAlignOuterClass
import kotlin.jvm.internal.Intrinsics

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val channel = ManagedChannelBuilder.forAddress("192.168.1.13", 8000).usePlaintext().build()
    private val guidingFragment = GuidingFragment()
    private val imagingFragment = ImagingFragment()
    private val polarAlignService = PolarAlignService(channel)

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(layoutInflater)
        val activityMainBinding = this.binding
        setContentView(activityMainBinding.root)
    }

    fun loadGuidingFragment(item: MenuItem?) {
        supportFragmentManager.beginTransaction().setReorderingAllowed(true).replace(R.id.fragmentContainerView, this.guidingFragment).commit()
        binding.drawerLayout.closeDrawers()
    }

    fun loadImagingFragment(item: MenuItem?) {
        supportFragmentManager.beginTransaction().setReorderingAllowed(true).replace(R.id.fragmentContainerView, this.imagingFragment).commit()
        binding.drawerLayout.closeDrawers()
    }
}