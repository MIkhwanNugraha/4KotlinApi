package com.group.nugraha.matchschedulekotlin.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class FirstActivity : AppCompatActivity() {

    private lateinit var resultlistTeam: RecyclerView

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




    }
}