package org.example.mazebank.controllers

import javafx.event.EventHandler
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Button
import javafx.scene.control.ChoiceBox
import javafx.scene.control.Label
import javafx.scene.control.PasswordField
import javafx.scene.control.TextField
import javafx.stage.Stage
import org.example.mazebank.views.ViewFactory
import java.net.URL
import java.util.*

class LoginController : Initializable {

    @FXML
    lateinit var accountSelectorCb: ChoiceBox<String>

    @FXML
    lateinit var payeeAddressLbl: Label

    @FXML
    lateinit var payeeAddressField: TextField

    @FXML
    lateinit var passwordField: PasswordField

    @FXML
    lateinit var loginBtn: Button

    @FXML
    lateinit var errorLbl: Label

    override fun initialize(location: URL?, resources: ResourceBundle?) {
        errorLbl.isVisible = false

        loginBtn.onAction = EventHandler {
            val stage = loginBtn.scene.window as Stage
            ViewFactory.closeWindow(stage)
            ViewFactory.showClientWindow()
        }
    }
}
