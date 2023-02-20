package com.example.task_2


import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.green
import androidx.recyclerview.widget.RecyclerView
import com.example.task_2.databinding.ActivityMainBinding

@Suppress("DEPRECATION")
class ColorsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var itemCircle: ImageView
    var itemTitle: TextView

    init {
        itemCircle = itemView.findViewById(R.id.item_image)
        itemTitle = itemView.findViewById(R.id.item_title)

        itemView.setOnClickListener { view: View ->
            val position: Int = adapterPosition
            Toast.makeText(itemView.context, "you clicked on Item $position", Toast.LENGTH_SHORT).show()


        }


    }
}




