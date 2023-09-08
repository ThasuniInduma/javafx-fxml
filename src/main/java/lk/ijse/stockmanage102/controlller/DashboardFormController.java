package lk.ijse.stockmanage102.controlller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController {
    public AnchorPane rootNode;
    public AnchorPane node;

    @FXML
    void btnItemOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/Item_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage primaryStage = (Stage) this.rootNode.getScene().getWindow();

        primaryStage.setScene(scene);
        primaryStage.setTitle("Item Manage");
        primaryStage.centerOnScreen();

    }

    @FXML
    void btnCustomerOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = new Stage();

        stage.setScene(scene);
        stage.setTitle("Customer Manage");
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    void btnSupplierOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/supplier_form.fxml"));

        this.node.getChildren().clear();
        this.node.getChildren().add(root);
    }

}
