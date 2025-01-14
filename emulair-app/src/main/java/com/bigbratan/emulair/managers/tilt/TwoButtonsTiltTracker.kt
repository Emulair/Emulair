package com.bigbratan.emulair.managers.tilt

import com.swordfish.radialgamepad.library.RadialGamePad

class TwoButtonsTiltTracker(private val leftId: Int, private val rightId: Int) : TiltTracker {

    override fun updateTracking(xTilt: Float, yTilt: Float, pads: Sequence<RadialGamePad>) {
        val leftPressed = xTilt < 0.25
        val rightPressed = xTilt > 0.75
        val bothPressed = !leftPressed && !rightPressed && yTilt < 0.1

        pads.forEach {
            it.simulateKeyEvent(leftId, bothPressed || leftPressed)
            it.simulateKeyEvent(rightId, bothPressed || rightPressed)
        }
    }

    override fun stopTracking(pads: Sequence<RadialGamePad>) {
        pads.forEach {
            it.simulateClearKeyEvent(leftId)
            it.simulateClearKeyEvent(rightId)
        }
    }

    override fun trackedIds(): Set<Int> = setOf(leftId, rightId)
}
