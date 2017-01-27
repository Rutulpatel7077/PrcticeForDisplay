
package f16s3oct13;

import java.awt.Font;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author jwright
 */
public class FXExperiment extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label enterSizeLabel = new Label("Enter table size");   
        
        HBox entryLayout = new HBox();
        entryLayout.setSpacing(10); //put 10 pixels 
        entryLayout.getChildren().add(enterSizeLabel);
        
        //add a text field to get the user information
        TextField tableSize = new TextField();
        entryLayout.getChildren().add(tableSize);

        
        Button btn = new Button();
        btn.setText("Generate Times Table");
        btn.setOnAction(e -> 
        {
            //convert the String into an integer
            try{
                int maxTableSize = Integer.parseInt(tableSize.getText());
                showTimesTable(maxTableSize);
            }
            catch (NumberFormatException exception)
            {
                System.out.println(exception);
            }
        });
        
        VBox verticalLayout = new VBox();
        verticalLayout.setPadding(new Insets(10,10,10,10));
        verticalLayout.setSpacing(10);
        
        verticalLayout.getChildren().addAll(entryLayout, btn);
        
        Scene scene = new Scene(verticalLayout, 400, 250);
        
        primaryStage.setTitle("My first GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }   //end of start method
    
    
    /**
     * This method will create a times table in the console
     */
    public void showTimesTable(int tableSize)
    {
        for (int row =1; row <= tableSize; row++)
        {
            for (int column = 1; column <= tableSize; column++)
            {
                System.out.printf("%4d",row*column);
            }    
            System.out.println();
        }
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
