package com.group.nugraha.matchschedulekotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.group.nugraha.matchschedulekotlin.model.ResultTeam
import org.jetbrains.anko.*

class FirstAdapter (private val resultteams: List<ResultTeam>, private val lastlistener: (ResultTeam) -> Unit)  //ini awal muncul listener, last itu sama kaya result, kasan ke detailnya
    : RecyclerView.Adapter<ResultTeamViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ResultTeamViewHolder {
   }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(p0: ResultTeamViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class LastTeamUI : AnkoComponent<ViewGroup>{
    override fun createView(ui: AnkoContext<ViewGroup>): View {
        return with(ui){
            linearLayout {
                lparams(matchParent, wrapContent)
                padding
            }
        }
    }
}

class ResultTeamViewHolder (lastview: View): RecyclerView.ViewHolder(lastview){
    fun bindItem(lastteams: ResultTeam, lastlistener: (ResultTeam) -> Unit){

    }
}