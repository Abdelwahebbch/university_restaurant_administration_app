package com.wahat.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.wahat.util.SceneSwitcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class PrimaryStageController implements Initializable {

  @FXML
  private Button LogoutButton;

  @FXML
  private AnchorPane MainScene;

  @FXML
  private Button dashboardButton;

  @FXML
  private Button inventoryButton;

  @FXML
  private Button patientsButton;

  @FXML
  private Button salesButton;

  @FXML
  private Button settingsButton;

  @FXML
  void handleAddStudentButton(ActionEvent event) {
    SceneSwitcher.setContent(MainScene, "/fxml/Modification/AddStudentScene.fxml");
  }

  @FXML
  void handleDashboardButton(ActionEvent event) {
    SceneSwitcher.setContent(MainScene, "/fxml/Affichage/Dashboard.fxml");
  }

  @FXML
  void handleLogoutButton(ActionEvent event) {

  }

  @FXML
  void handleRechargeButton(ActionEvent event) {

    SceneSwitcher.setContent(MainScene, "/fxml/Modification/SalesScene.fxml");
  }

  @FXML
  void handleSettingsButton(ActionEvent event) {
    SceneSwitcher.setContent(MainScene, "/fxml/Affichage/Settings.fxml");
  }

  @FXML
  void handleStudentListButton(ActionEvent event) {
    SceneSwitcher.setContent(MainScene, "/fxml/Affichage/StudentsListScene.fxml");
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    SceneSwitcher.setContent(MainScene, "/fxml/Affichage/Dashboard.fxml");
  }

}
