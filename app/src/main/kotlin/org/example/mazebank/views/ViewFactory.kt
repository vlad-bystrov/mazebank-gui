package org.example.mazebank.views

import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.layout.AnchorPane
import javafx.scene.layout.BorderPane
import javafx.scene.layout.Pane
import javafx.stage.Stage

object ViewFactory {

    private const val LOGIN_FXML = "/fxml/Login.fxml"
    private const val CLIENT_FXML = "/fxml/client/Client.fxml"
    private const val CLIENT_DASHBOARD_FXML = "/fxml/client/Dashboard.fxml"

    private val dashboardView: AnchorPane by lazy {
        loadFxmlView(CLIENT_DASHBOARD_FXML)
    }

    fun showLoginWindow() {
        val view: AnchorPane = loadFxmlView(LOGIN_FXML)
        showWindow(view, "Maze Bank: Login")
    }

    fun showClientWindow() {
        val view: BorderPane = loadFxmlView(CLIENT_FXML)
        showWindow(view, "Maze Bank: Client")
    }

    fun closeWindow(stage: Stage) {
        stage.close()
    }

    private fun <T : Pane> loadFxmlView(path: String): T =
        FXMLLoader(javaClass.getResource(path)).load()

    private fun showWindow(root: Parent, windowTitle: String, resizable: Boolean = false) {
        Stage().run {
            scene = Scene(root)
            title = windowTitle
            isResizable = resizable
            show()
        }
    }
}
