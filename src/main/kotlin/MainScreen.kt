import javafx.application.Application
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.canvas.Canvas
import javafx.scene.canvas.GraphicsContext
import javafx.scene.input.KeyCombination
import javafx.scene.paint.Color
import javafx.stage.Stage
import javax.swing.event.ChangeEvent
import javax.swing.event.ChangeListener

class MainScreen: Application(){
    var WIDTH = 1280.0
    var HEIGTH = 720.0

    lateinit var g:GraphicsContext

    override fun start(stage: Stage?) {
        var root = Group()
        stage!!.scene = Scene(root, WIDTH, HEIGTH)
        stage.show()
    }
}