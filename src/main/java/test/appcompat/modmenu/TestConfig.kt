package test.appcompat.modmenu

import me.lunaluna.clothaddons.LunaConfig
import me.lunaluna.clothaddons.views.field.*
import me.lunaluna.clothaddons.views.list.stringList
import me.lunaluna.clothaddons.views.slider.intSlider
import me.lunaluna.clothaddons.views.slider.longSlider
import me.lunaluna.clothaddons.views.toggle.booleanToggle

object TestConfig : LunaConfig(name = "test-config") {

    var alphaColor by colorField(hasAlpha = true)
    var color by colorField()
    var int by intField(default = 5)
    var keyCode by keyCodeField()
    var long by longField()
    var string by stringField()

    var strings by stringList()

    var intSlider by intSlider(0..3)
    var longSlider by longSlider(0L..3L)

    var boolean by booleanToggle()

}