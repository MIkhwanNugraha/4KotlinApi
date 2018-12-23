package com.group.nugraha.matchschedulekotlin.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.google.gson.Gson
import com.group.nugraha.matchschedulekotlin.Presenter.FirstPresenter
import com.group.nugraha.matchschedulekotlin.View.FirstView
import com.group.nugraha.matchschedulekotlin.adapter.FirstAdapter
import com.group.nugraha.matchschedulekotlin.api.ApiRepository
import com.group.nugraha.matchschedulekotlin.model.ResultTeam
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class FirstActivity : AppCompatActivity(), FirstView {

    private lateinit var resultlistTeam: RecyclerView
    private lateinit var presenterik: FirstPresenter
    private lateinit var adapterik: FirstAdapter
    private var resultteams: MutableList<ResultTeam> = mutableListOf() //ResultTeamnya dapat dari model

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        linearLayout {
            lparams(matchParent, wrapContent)
            orientation = LinearLayout.VERTICAL
            padding = dip(15) ///kena coba pindah paddingnya 30

            resultlistTeam = recyclerView {
                lparams(matchParent, wrapContent)
                layoutManager = LinearLayoutManager(context)
            }
        }

        adapterik = FirstAdapter(resultteams){

        }

        resultlistTeam.adapter = adapterik
        presenterik = FirstPresenter(this, ApiRepository(), Gson())

    }

    override fun showResultTeamList(data: List<ResultTeam>) {
        resultteams.clear()
        resultteams.addAll(data)
        adapterik.notifyDataSetChanged()

    }
}