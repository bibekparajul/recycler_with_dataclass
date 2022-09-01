package com.example.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val Drinks: List<Drink>, private val clickListener:(Drink)-> Unit):RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
    val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list,parent,false)
        return MyViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val fruit = Drinks[position]
        holder.bind(fruit,clickListener)

//        holder.myText.text = "Hello World $position"

    }

    override fun getItemCount(): Int {
        return Drinks.size
    }

}

class MyViewHolder(val view: View):RecyclerView.ViewHolder(view){
    fun bind(drink:Drink,clickListener:(Drink)-> Unit){

    val myText = view.findViewById<TextView>(R.id.tvName)
        myText.text = drink.name

        view.setOnClickListener {
//            Toast.makeText(view.context, "Selected Drink is ${drink.name}", Toast.LENGTH_SHORT).show()
       clickListener(drink)

        }

    }


}