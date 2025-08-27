package com.wahat.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class UserManagementController {

    @FXML
    private Label customerNameLabel;

    @FXML
    private Label customerPhoneLabel;

    @FXML
    private TextField discountField;

    @FXML
    private TableColumn<?, ?> productCategoryColumn;

    @FXML
    private TableColumn<?, ?> productCodeColumn;

    @FXML
    private TableColumn<?, ?> productNameColumn;

    @FXML
    private TableColumn<?, ?> productPriceColumn;

    @FXML
    private TableColumn<?, ?> productStockColumn;

    @FXML
    private TableView<?> productsTable;

    @FXML
    private TextField searchField;

    @FXML
    private TextField searchProductField;

    @FXML
    private ComboBox<?> searchResult;

    @FXML
    private Label totalLabel;

    @FXML
    void handleClearCart(ActionEvent event) {

    }

    @FXML
    void handleNewCustomer(ActionEvent event) {

    }

    @FXML
    void handleProcessPayment(ActionEvent event) {

    }

    @FXML
    void handleResultSelection(ActionEvent event) {

    }

    @FXML
    void handleSearchCustomer(ActionEvent event) {

    }

    @FXML
    void handleSearchProduct(ActionEvent event) {

    }

}
