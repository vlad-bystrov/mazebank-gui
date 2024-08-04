package org.example.mazebank.controllers.client

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.ListView
import javafx.scene.control.TextArea
import javafx.scene.control.TextField
import javafx.scene.text.Text
import java.net.URL
import java.util.*

class DashboardController : Initializable {

    @FXML
    lateinit var userNameLbl: Text

    @FXML
    lateinit var loginDateLbl: Label

    @FXML
    lateinit var checkingBalanceLbl: Label

    @FXML
    lateinit var checkingAccountNumberLbl: Label

    @FXML
    lateinit var savingsBalanceLbl: Label

    @FXML
    lateinit var savingsAccountNumberLbl: Label

    @FXML
    lateinit var totalIncomeLbl: Label

    @FXML
    lateinit var totalExpensesLbl: Label

    @FXML
    lateinit var transactionsListView: ListView<String>

    @FXML
    lateinit var sendToPayeeAddressField: TextField

    @FXML
    lateinit var sendToAmountField: TextField

    @FXML
    lateinit var sendToMessageField: TextArea

    @FXML
    lateinit var sendToBtn: Button

    override fun initialize(location: URL?, resources: ResourceBundle?) {
        //
    }
}
