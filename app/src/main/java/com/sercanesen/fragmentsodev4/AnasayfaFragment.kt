package com.sercanesen.fragmentsodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.sercanesen.fragmentsodev4.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var tasarim : FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater,container,false)

        tasarim.buttonGitAnasayfatoA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anasayfa_toSayfaA)
        }
        tasarim.buttonGitAnasayfatoX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anasayfa_toSayfaX)
        }
        return tasarim.root
    }
}