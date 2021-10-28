package com.example.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var toDoList = mutableListOf(
            Todo ("Take a shower", false),
            Todo ("Have breakfast", false),
            Todo ("Get a job", true),
            Todo ("Complete Android project", false),
        )

        val adapter = ToDoAdapter(toDoList)
        rvTodos.adapter = adapter
        rvTodos.layoutManager = LinearLayoutManager(this)


        btnAddToDo.setOnClickListener {
            val title = etToDo.text.toString()
            val todo = Todo(title, false)
            toDoList.add(todo)
            adapter.notifyItemInserted(toDoList.size - 1)
        }

    }
}