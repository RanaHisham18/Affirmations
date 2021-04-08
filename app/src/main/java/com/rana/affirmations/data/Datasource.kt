package com.rana.affirmations.data

import com.rana.affirmations.R
import com.rana.affirmations.model.Affirmation


class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.nagib),
            Affirmation(R.string.affirmation2,R.drawable.arab),
            Affirmation(R.string.affirmation3,R.drawable.nagib),
            Affirmation(R.string.affirmation4,R.drawable.darwesh),
            Affirmation(R.string.affirmation5,R.drawable.radwaa),
            Affirmation(R.string.affirmation6,R.drawable.rana),
            Affirmation(R.string.affirmation7,R.drawable.arab),
            Affirmation(R.string.affirmation8,R.drawable.rana),
            Affirmation(R.string.affirmation9,R.drawable.darwesh),
            Affirmation(R.string.affirmation10,R.drawable.radwaa)
        )
    }
}