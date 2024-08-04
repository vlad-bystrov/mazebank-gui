package org.example.mazebank.controllers.client

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Button
import java.net.URL
import java.util.*

class ClientMenuController : Initializable {

    @FXML
    lateinit var dashboardBtn: Button

    @FXML
    lateinit var transactionsBtn: Button

    @FXML
    lateinit var accountsBtn: Button

    @FXML
    lateinit var profileBtn: Button

    @FXML
    lateinit var logoutBtn: Button

    override fun initialize(location: URL?, resources: ResourceBundle?) {
        //
    }
}
