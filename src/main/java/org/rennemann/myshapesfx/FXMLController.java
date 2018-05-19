package org.rennemann.myshapesfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

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
                Rectangle rect = new Rectangle(100, 100, Paint.valueOf("Blue"));
                shapesFlowPane.getChildren().add(rect);
            }
            
        });
    }
}
