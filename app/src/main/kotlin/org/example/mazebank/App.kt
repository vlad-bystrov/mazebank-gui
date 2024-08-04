package org.example.mazebank

import javafx.application.Application
import javafx.stage.Stage
import org.example.mazebank.views.ViewFactory

class App : Application() {

    override fun start(stage: Stage) {
        ViewFactory.showLoginWindow()
    }
}

fun main() {
    Application.launch(App::class.java)
}
