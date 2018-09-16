package com.dicoding.hendro.kotlinankorecyclerview

import android.graphics.Color
import android.os.Build
import android.support.annotation.RequiresApi
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_view.view.*
import org.jetbrains.anko.*

class DetailActivityUI constructor(lg: Int , nm: String, ds: String): AnkoComponent<DetailActivity> {
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)

    lateinit var gambar: ImageView
    val l = lg
    val n = nm
    val d = ds

    override fun createView(ui: AnkoContext<DetailActivity>) = with(ui) {
        verticalLayout{

            /*
            imageView(l).
                    lparams(width= sp(50), height = sp(50)) {
                        margin = dip(15)
                        gravity= Gravity.CENTER_HORIZONTAL;
                    }
             */

            gambar = imageView().
                    lparams(width= sp(50), height = sp(50)) {
                        margin = dip(15)
                        gravity= Gravity.CENTER_HORIZONTAL;
                    }

            Glide.with(this).load(l).into(gambar)

            textView {
                text = n
                textSize = 20f
                textColor = Color.GREEN
                textAlignment = View.TEXT_ALIGNMENT_CENTER //CENTER can be INHERIT GRAVITY TEXT_START TEXT_END VIEW_START VIEW_END
            }

            textView {
                text = d
                textSize = 18f
                textColor = Color.GREEN
                textAlignment = View.TEXT_ALIGNMENT_CENTER //CENTER can be INHERIT GRAVITY TEXT_START TEXT_END VIEW_START VIEW_END
            }
        }
    }
}