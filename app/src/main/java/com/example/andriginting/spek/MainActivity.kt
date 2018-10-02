package com.example.andriginting.spek

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), ShapeContract.View {

    private var presenter: ImpPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        presenter = ImpPresenter(this)

        fab.setOnClickListener {
            presenter?.calculateShape(height = height_item.text.toString().toInt()
                    , width = widht_item.text.toString().toInt())
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    @SuppressLint("SetTextI18n")
    override fun showResult(result: Int) {
        calculate_result.text = resources.getString(R.string.result_hint) + result.toString()
    }

    override fun emptyField() {
        height_item.text.clear()
        widht_item.text.clear()
    }
}
