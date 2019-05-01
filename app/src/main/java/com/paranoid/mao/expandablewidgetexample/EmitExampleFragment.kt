package com.paranoid.mao.expandablewidgetexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class EmitExampleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_emit_example, container, false)
        with(view) {
            val fab = findViewById<FloatingActionButton>(R.id.fab)
            fab.setOnClickListener {
                fab.isExpanded = !fab.isExpanded
                fab.isActivated = fab.isExpanded
            }

            findViewById<FloatingActionButton>(R.id.upload).setOnClickListener {
                Snackbar.make(it, "Upload clicked!", Snackbar.LENGTH_SHORT)
                        .show()
            }
            findViewById<FloatingActionButton>(R.id.send).setOnClickListener {
                Snackbar.make(it, "Send clicked!", Snackbar.LENGTH_SHORT)
                        .show()
            }
            findViewById<FloatingActionButton>(R.id.copy).setOnClickListener {
                Snackbar.make(it, "Copy clicked!", Snackbar.LENGTH_SHORT)
                        .show()
            }
            findViewById<FloatingActionButton>(R.id.email).setOnClickListener {
                Snackbar.make(it, "Email clicked!", Snackbar.LENGTH_SHORT)
                        .show()
            }
        }
        return view
    }
}
