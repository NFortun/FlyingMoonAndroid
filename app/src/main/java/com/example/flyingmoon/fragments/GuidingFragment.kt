package com.example.flyingmoon.fragments;

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.flyingmoon.services.PolarAlignService
import com.example.flyinmoon.R
import com.example.flyinmoon.databinding.GuidingFragmentBinding

class GuidingFragment : Fragment(R.layout.guiding_fragment) {
    private lateinit var guidingFragmentBinding : GuidingFragmentBinding;
    private lateinit var polarAlignService: PolarAlignService ;

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        super.onCreateView(inflater, container, savedInstanceState);
        this.guidingFragmentBinding = GuidingFragmentBinding.inflate(inflater);

        guidingFragmentBinding.button.setOnClickListener {
            println("coucou")
        }

        return this.guidingFragmentBinding.root
    }
}