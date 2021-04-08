package com.rana.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.rana.affirmations.adapter.ItemAdapter
import com.rana.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //create instance from datasource to call the functions on
        val myDataset = Datasource().loadAffirmations()

        //create a variable to display the recyclerview in the layout
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

         //create new instance from item adapter to be used
        recyclerView.adapter = ItemAdapter(this, myDataset)

         //setting fixed size in order to improve performance
        recyclerView.setHasFixedSize(true)



    }
}