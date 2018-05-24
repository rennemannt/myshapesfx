package org.rennemann.myshapesfx;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLController implements Initializable {

    @FXML
    private VBox mainVbox;

    @FXML
    private Button squareButton;

    @FXML
    private Button circleButton;

    @FXML
    private Button triangleButton;

    @FXML
    private FlowPane shapesFlowPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {


        squareButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                //clears the shapesFlowPane stack
                shapesFlowPane.getChildren().clear();

                //creates rectangle, text, and a StackPane
                Rectangle rect = new Rectangle(200, 200, Paint.valueOf("Blue"));
                Text rectangleText = new Text("Square");
                rectangleText.setFont(new Font("Arial",40));
                StackPane rectangleStack = new StackPane();

                //adds rectangle and text to rectangleStack as children
                rectangleStack.getChildren().addAll(rect, rectangleText);

                //adds rectangleStack as a child of shapesFlowPane
                shapesFlowPane.getChildren().add(rectangleStack);

            }

        });


        circleButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                //clears the shapesFlowPane stack
                shapesFlowPane.getChildren().clear();

                //creates circle, text, and StackPane
                Circle circ = new Circle(100, Paint.valueOf("Blue"));
                Text circleText = new Text("Circle");
                circleText.setFont(new Font("Arial",40));
                StackPane circleStack = new StackPane();

                //adds circle and text to circleStack as children
                circleStack.getChildren().addAll(circ,circleText);

                //adds circleStack as a child of shapesFlowPane
                shapesFlowPane.getChildren().add(circleStack);

            }

        });

        triangleButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                //clears the shapesFlowPane stack
                shapesFlowPane.getChildren().clear();

                //This is the placeholder text
                Text circleText = new Text("This is not the shape you are looking for...");
                circleText.setFont(new Font("Arial",30));

                //adds circleStack as a child of shapesFlowPane
                shapesFlowPane.getChildren().add(circleText);

            }

        });

    }
}
