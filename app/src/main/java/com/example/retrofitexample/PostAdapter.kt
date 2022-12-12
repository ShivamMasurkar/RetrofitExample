package com.example.retrofitexample

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(val postModel:MutableList<PostModel>): RecyclerView.Adapter<PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val View=LayoutInflater.from(parent.context).inflate(R.layout.card_post,parent,false)
        return PostViewHolder(View)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        return holder.bindView(postModel[position])
    }

    override fun getItemCount(): Int {
       return postModel.size
    }


}



class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    private val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
    private val tvBody: TextView=itemView.findViewById(R.id.tvBody)

    fun bindView(postModel: PostModel) {

        tvTitle.text=postModel.title
        tvBody.text=postModel.body

    }
}