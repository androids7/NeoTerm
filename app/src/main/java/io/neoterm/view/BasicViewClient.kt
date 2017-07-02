package io.neoterm.view

import android.view.KeyEvent
import android.view.MotionEvent
import io.neoterm.backend.TerminalSession

/**
 * @author kiva
 */
class BasicViewClient(val terminalView: TerminalView) : TerminalViewClient {
    override fun onScale(scale: Float): Float {
        if (scale < 0.9f || scale > 1.1f) {
            val increase = scale > 1f
            val changedSize = (if (increase) 1 else -1) * 2
            val fontSize = terminalView.textSize + changedSize
            terminalView.textSize = fontSize
            return 1.0f
        }
        return scale
    }

    override fun onSingleTapUp(e: MotionEvent?) {
    }

    override fun shouldBackButtonBeMappedToEscape(): Boolean {
        return false
    }

    override fun copyModeChanged(copyMode: Boolean) {
    }

    override fun onKeyDown(keyCode: Int, e: KeyEvent?, session: TerminalSession?): Boolean {
        return false
    }

    override fun onKeyUp(keyCode: Int, e: KeyEvent?): Boolean {
        return false
    }

    override fun readControlKey(): Boolean {
        return false
    }

    override fun readAltKey(): Boolean {
        return false
    }

    override fun onCodePoint(codePoint: Int, ctrlDown: Boolean, session: TerminalSession?): Boolean {
        return false
    }

    override fun onLongPress(event: MotionEvent?): Boolean {
        return false
    }
}