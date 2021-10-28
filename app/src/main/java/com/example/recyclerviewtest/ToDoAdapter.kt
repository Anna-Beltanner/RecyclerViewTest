package com.example.recyclerviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_to_do.view.*

class ToDoAdapter(
    var todos: List<Todo>
) : RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>() {

    inner class ToDoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoAdapter.ToDoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_to_do, parent, false)
        return ToDoViewHolder(view)
    }


    override fun getItemCount(): Int {
        return todos.size
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        holder.itemView.apply {
            tvTitle.text = todos[position].title
            cbDone.isChecked = todos[position].isChecked

        }
    }
}