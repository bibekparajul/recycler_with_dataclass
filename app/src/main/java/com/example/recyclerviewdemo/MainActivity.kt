package com.example.recyclerviewdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val Drinks = listOf<Drink>(
    Drink("Coke","Eleven"),
            Drink("Deu","TwoHundred"),
            Drink("Pepsi","aa"),
        Drink("Frooti","aa"),
        Drink("Red Lable","dd"),
        Drink("Black Lable","ff"),
        Drink("Old Durbar","aa"),
        Drink("RedBull","cc")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setBackgroundColor(Color.BLUE)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter(Drinks) { selectedItem: Drink ->
            listItemClicked(selectedItem)
        }


    }

    private fun listItemClicked(drink: Drink){
        Toast.makeText(this@MainActivity, "Selected Quantity is ${drink.quantity}", Toast.LENGTH_SHORT).show()
    }
}