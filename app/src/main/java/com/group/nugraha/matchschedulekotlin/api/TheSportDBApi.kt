package com.group.nugraha.matchschedulekotlin.api

import com.group.nugraha.matchschedulekotlin.BuildConfig

object TheSportDBApi {
    fun getResultTeams(): String{
        return  BuildConfig.BASE_URL + "api/v1/json/${BuildConfig.TSDB_API_KEY}" + "/eventspastleague.php?id=4328"
    }
}