package com.example.parcial3kt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.parcial3kt.data.RetrofitInstance
import com.example.parcial3kt.databinding.FragmentServiciosBinding
import com.xwray.groupie.GroupieAdapter

class Servicios : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        RetrofitInstance().ligaApi().traerDatos("2020")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_servicios, container, false)
        val binding = DataBindingUtil.setContentView<FragmentServiciosBinding>(this, R.layout.item_liga)

        //Se puede manipular el binding
        binding.textB.text = "Hola"
        binding.subtitleTextView.text = "Mundo"
        binding.button.setOnClickListener {
            binding.nameTextView.text = "Chao"
        }
        binding.countriesRecyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = GroupieAdapter()
        adapter.add(LigaItem("Ecuador"))
        adapter.add(LigaItem("Colombia"))
        adapter.add(LigaItem("España"))
        adapter.add(LigaItem("Argentina"))
        adapter.add(LigaItem("Venezuela"))

        binding.countriesRecyclerView.adapter = adapter
    }
}