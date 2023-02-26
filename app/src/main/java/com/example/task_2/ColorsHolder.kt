package com.example.task_2


import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ColorsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var itemCircle: ImageView
    var itemTitle: TextView

    init {
        itemCircle = itemView.findViewById(R.id.item_image)
        itemTitle = itemView.findViewById(R.id.item_title)

        itemView.setOnClickListener { view: View ->
            val position: Int = absoluteAdapterPosition
            Toast.makeText(itemView.context, "you clicked on Item $position", Toast.LENGTH_SHORT)
                .show()


        }


    }
}




