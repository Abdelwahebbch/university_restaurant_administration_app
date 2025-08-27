package com.wahat.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class SettingsController {

    @FXML
    private VBox autoBackupSettingsVBox;

    @FXML
    private Spinner<?> autoSaveIntervalSpinner;

    @FXML
    private ComboBox<?> backupFrequencyComboBox;

    @FXML
    private TextField backupLocationField;

    @FXML
    private Button browseButton;

    @FXML
    private CheckBox enableAutoBackupCheckbox;

    @FXML
    private CheckBox enableNotificationsCheckbox;

    @FXML
    private ComboBox<?> languageComboBox;

    @FXML
    private Button resetSettingsButton;

    @FXML
    private Button saveSettingsButton;

    @FXML
    private ComboBox<?> themeComboBox;

    @FXML
    void handleBrowseButton(ActionEvent event) {

    }

    @FXML
    void handleCreateBackupNow(ActionEvent event) {

    }

    @FXML
    void handleResetSettings(ActionEvent event) {

    }

    @FXML
    void handleSaveSettings(ActionEvent event) {

    }

}
