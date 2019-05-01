package com.paranoid.mao.expandablewidgetexample

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.widget.FrameLayout
import com.google.android.material.circularreveal.CircularRevealHelper
import com.google.android.material.circularreveal.CircularRevealWidget

class CircularRevealConstraintLayout @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null
) : FrameLayout(context, attrs), CircularRevealWidget {

    private val helper = CircularRevealHelper(this)

    override fun getRevealInfo(): CircularRevealWidget.RevealInfo? = helper.revealInfo

    override fun setRevealInfo(revealInfo: CircularRevealWidget.RevealInfo?) {
        helper.revealInfo = revealInfo
    }

    override fun getCircularRevealOverlayDrawable(): Drawable? {
        return helper.circularRevealOverlayDrawable
    }

    override fun getCircularRevealScrimColor(): Int {
        return helper.circularRevealScrimColor
    }

    override fun setCircularRevealScrimColor(color: Int) {
        helper.circularRevealScrimColor = color
    }

    override fun setCircularRevealOverlayDrawable(drawable: Drawable?) {
        helper.circularRevealOverlayDrawable = drawable
    }

    override fun buildCircularRevealCache() {
        helper.buildCircularRevealCache()
    }

    override fun actualIsOpaque(): Boolean {
        return helper.isOpaque
    }

    override fun actualDraw(canvas: Canvas?) {
        helper.draw(canvas)
    }

    override fun destroyCircularRevealCache() {
        helper.destroyCircularRevealCache()
    }
}
