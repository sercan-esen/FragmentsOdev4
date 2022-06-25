package com.sercanesen.fragmentsodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.sercanesen.fragmentsodev4.databinding.FragmentSayfaYBinding

class SayfaYFragment : Fragment() {

    private lateinit var tasarim : FragmentSayfaYBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentSayfaYBinding.inflate(inflater,container,false)

        return tasarim.root
    }
}