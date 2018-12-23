package com.group.nugraha.matchschedulekotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.group.nugraha.matchschedulekotlin.R
import com.group.nugraha.matchschedulekotlin.R.id.team_event
import com.group.nugraha.matchschedulekotlin.model.ResultTeam
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class FirstAdapter (private val resultteams: List<ResultTeam>, private val lastlistener: (ResultTeam) -> Unit)  //ini awal muncul listener, last itu sama kaya result, kasan ke detailnya
    : RecyclerView.Adapter<ResultTeamViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ResultTeamViewHolder {
        return ResultTeamViewHolder(LastTeamUI().createView(AnkoContext.create(p0.context, p0)))
    }

    override fun getItemCount(): Int = resultteams.size

    override fun onBindViewHolder(p0: ResultTeamViewHolder, p1: Int) {
        p0.bindItem(resultteams[p1], lastlistener)
    }

}

class LastTeamUI : AnkoComponent<ViewGroup>{
    override fun createView(ui: AnkoContext<ViewGroup>): View {
        return with(ui){
            linearLayout {
                lparams(matchParent, wrapContent)
                padding = dip(5)
                orientation = LinearLayout.VERTICAL

                textView {
                    id = R.id.team_event
                    textSize = 16f
                }.lparams{
                    margin = dip(15)
                }

                //skor home dan away balum ditambah
            }
        }
    }
}

class ResultTeamViewHolder (lastview: View): RecyclerView.ViewHolder(lastview){
    private val yangbertanding: TextView = lastview.find(team_event)


    fun bindItem(lastteams: ResultTeam, lastlistener: (ResultTeam) -> Unit){
        yangbertanding.text = lastteams.teamIdevent

        yangbertanding.onClick {
            lastlistener(lastteams)
        }
    }
}