package com.group.nugraha.matchschedulekotlin.model

import com.google.gson.annotations.SerializedName

data class ResultTeam (
    @SerializedName("strEvent") var teamIdevent: String? = null,

    @SerializedName("intHomeScore") var teamIdHome: String? = null,

    @SerializedName("intAwayScore") var teamIdAway: String? = null
)