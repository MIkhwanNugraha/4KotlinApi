package com.group.nugraha.matchschedulekotlin.View

import com.group.nugraha.matchschedulekotlin.model.ResultTeam

interface FirstView {
    fun showResultTeamList(data: List<ResultTeam>)
}