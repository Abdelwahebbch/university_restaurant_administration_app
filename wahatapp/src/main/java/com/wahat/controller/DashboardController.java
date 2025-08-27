package com.wahat.controller;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class DashboardController {

    @FXML
    private TableColumn<?, ?> categoryColumn;

    @FXML
    private PieChart categoryPieChart;

    @FXML
    private TableColumn<?, ?> lowMedicationColumn;

    @FXML
    private TableColumn<?, ?> lowQuantityColumn;

    @FXML
    private TableView<?> lowStockTable;

    @FXML
    private BarChart<?, ?> salesBarChart;

    @FXML
    private Label totalPrescriptionsLabel;

    @FXML
    private Label totalSalesLabel;

}
