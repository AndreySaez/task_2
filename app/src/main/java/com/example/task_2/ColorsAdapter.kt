package com.example.task_2

import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.LayerDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.graphics.BlendModeColorFilterCompat
import androidx.core.graphics.BlendModeCompat
import androidx.core.graphics.green
import androidx.core.graphics.toColorLong
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
        val colorView = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ColorsHolder(colorView)


    }

    override fun getItemCount(): Int {
        return 50

    }

    override fun onBindViewHolder(holder: ColorsHolder, position: Int) {
        val string = holder.itemTitle.context.getString(R.string.item_number)
        holder.itemTitle.text = "$string $position"
        holder.itemCircle.drawable.colorFilter =
            BlendModeColorFilterCompat.createBlendModeColorFilterCompat(
                holder.itemCircle.context.getColor(colors[position % colors.size]),
                BlendModeCompat.SRC
            )


    }

}



