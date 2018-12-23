package com.group.nugraha.matchschedulekotlin.Presenter

import com.google.gson.Gson
import com.group.nugraha.matchschedulekotlin.View.FirstView
import com.group.nugraha.matchschedulekotlin.api.ApiRepository
import com.group.nugraha.matchschedulekotlin.api.TheSportDBApi
import com.group.nugraha.matchschedulekotlin.model.ResultTeamResponse
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class FirstPresenter (private val resultview: FirstView,
                      private val apiRepository: ApiRepository,
                      private val gson: Gson) {
    fun getResultTeamList(){ //di sini biasanya diandak (league: String?)
        doAsync {
            val resultdata = gson.fromJson(apiRepository
                .doRequest(TheSportDBApi.getResultTeams()), //disini diandak (league)
                ResultTeamResponse::class.java)

            uiThread {
                resultview.showResultTeamList(resultdata.resultteams)
            }
        }
    }
}