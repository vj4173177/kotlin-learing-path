package com.example.miniproject.ui.on_boarding_screen

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.miniproject.R



class ViewPager2AdapterOnBoarding(private var content: FragmentManager,var list:List<onBoardingScreenData>): RecyclerView.Adapter<ViewPager2AdapterOnBoarding.ViewHolder>(){


    inner class ViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView) {

        val itemTitle: TextView = itemView.findViewById(R.id.textViewForOnBoarding)
        val imageView: ImageView = itemView.findViewById(R.id.imageViewForOnBoarding)

        init {

            imageView.setOnClickListener { v: View ->
                val position = adapterPosition

                Toast.makeText(itemView.context, "this is ${position}", Toast.LENGTH_SHORT).show()


            }
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPager2AdapterOnBoarding.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.on_boarding_screen_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPager2AdapterOnBoarding.ViewHolder, position: Int) {


          holder.itemTitle.text=list[position].title
        holder.imageView.setImageResource(list[position].image)



    }

    override fun getItemCount(): Int {
        return 3
    }


}