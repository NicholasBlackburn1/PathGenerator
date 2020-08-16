
package org.usfirst.frc.team5740.gui;

import org.usfirst.frc.team5740.Main;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class ExportPageController {
    private Stage stage = new Stage();
    private StartMain mainpage = new StartMain();
    @FXML
    private Button save;

    @FXML
    private CheckBox display_waypoint_graph;

    @FXML // fx:id="gen_code"
    private CheckBox gen_csv; // Value injected by FXMLLoader

    @FXML
    private Button exit;

    @FXML // fx:id="graph_name"
    private TextArea csv_location; // Value injected by FXMLLoader

    public void initialize() {

        // generates csv file Action
        gen_csv.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(final ActionEvent event) {
                if (!gen_csv.isSelected()) {
                    // TODO: add csv Generation Function with waypoints and alll maths
                    Main.logger.info("Setting -> Generating Csv to true");

                }

            }

        });

        // Generates Java code to Read the sv
        save.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(final ActionEvent event) {
                if (!save.isPressed()) {
                    Main.logger.info("Settings -> Save Settings to true");

                }

            }

        });

        display_waypoint_graph.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(final ActionEvent event) {
                if (!gen_csv.isSelected()) {
                    // TODO: add csv Generation Function with waypoints and alll maths
                    Main.logger.info("Setting -> Enableing Display of graph");

                }

            }

        });
        exit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(final ActionEvent event) {
                if (!exit.isPressed()) {
                    Main.logger.info("Going back to main");
                    try {
                        mainpage.start(stage);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                  } 

              }

          });

          // Generates Java code to Read the sv
    }   
    
}