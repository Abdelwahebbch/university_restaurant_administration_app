package com.pharmacy.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class InventoryController {

    @FXML
    private Button addButton;

    @FXML
    private TableColumn<?, ?> category;

    @FXML
    private ComboBox<?> categoryComboBox;

    @FXML
    private Button deleteButton;

    @FXML
    private TableColumn<?, ?> exp;

    @FXML
    private DatePicker expiryDatePicker;

    @FXML
    private TableView<?> medicationTable;

    @FXML
    private TableColumn<?, ?> name;

    @FXML
    private TextField nameField;

    @FXML
    private TableColumn<?, ?> price;

    @FXML
    private TextField priceField;

    @FXML
    private TableColumn<?, ?> quantity;

    @FXML
    private TextField quantityField;

    @FXML
    private TextField searchField;

    @FXML
    private Button updateButton;

    @FXML
    void handleAddMedication(ActionEvent event) {

    }

    @FXML
    void handleDeleteMedication(ActionEvent event) {

    }

    @FXML
    void handleMedicationSelection(MouseEvent event) {

    }

    @FXML
    void handleSearchMedication(ActionEvent event) {

    }

    @FXML
    void handleUpdateMedication(ActionEvent event) {

    }

}
