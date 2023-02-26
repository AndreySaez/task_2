package com.example.task_2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.graphics.BlendModeColorFilterCompat
import androidx.core.graphics.BlendModeCompat
import androidx.recyclerview.widget.RecyclerView


class ColorsAdapter : RecyclerView.Adapter<ColorsHolder>() {


    private val colors = arrayOf(
        R.color.red,
        R.color.orange,
        R.color.yellow,
        R.color.green,
        R.color.blue,
        R.color.navy,
        R.color.purple,
        R.color.trans
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorsHolder {
        val colorView =
            LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ColorsHolder(colorView)


    }

    override fun getItemCount() = 51

    override fun onBindViewHolder(holder: ColorsHolder, position: Int) {
        val title = holder.itemTitle.context.getString(R.string.item_string, position)
        holder.itemTitle.text = title
        holder.itemCircle.drawable.colorFilter =
            BlendModeColorFilterCompat.createBlendModeColorFilterCompat(
                holder.itemCircle.context.getColor(colors[position % colors.size]),
                BlendModeCompat.SRC
            )


    }

}



