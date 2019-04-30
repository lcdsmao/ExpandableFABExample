package com.paranoid.mao.expandablewidgetexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MorphExampleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_morph_example, container, false)
        with(view) {
            val fab = findViewById<FloatingActionButton>(R.id.fab)
            fab.setOnClickListener {
                fab.isExpanded = true
            }
            val sheet = findViewById<FrameLayout>(R.id.sheet)
            sheet.setOnClickListener {
                fab.isExpanded = false
            }
        }
        return view
    }
}
