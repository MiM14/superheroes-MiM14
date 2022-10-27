package com.moaimar.superheroes.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.moaimar.app.extensions.loadUrl
import com.moaimar.superheroes.databinding.ViewItemSuperheroBinding
import com.moaimar.superheroes.domain.SuperHero

class SuperHeroDetailViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    private var binding: ViewItemSuperheroBinding? = null
    fun render(model: SuperHero) {
        binding = ViewItemSuperheroBinding.bind(view)
        binding?.apply {
            image.loadUrl(model.images.xs)
            name.text = model.name
            realName.text = model.id.toString()
            occupation.text = model.work.occupation.toString()
        }
    }
}