package tipcalculatorfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jwright
 */
public class TipCalculatorFX extends Application {
    TextField mealAmount, tipPercentageAmount, tipAmount;
    Label errorLabel;
    
    
    @Override
    public void start(Stage primaryStage) {
        //Set up the grid for adding the labels and fields
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        grid.setHgap(10);
        errorLabel = new Label();

        
        //Fields for entering the meal amount (including validation fields)
        Label mealAmountLabel = new Label("Enter Meal Amount");
        mealAmount = new TextField();
        mealAmount.setPromptText("Meal amount");
        mealAmount.textProperty().addListener((observable, oldValue, newValue) -> doubleFieldValidator(mealAmount));
        GridPane.setConstraints(mealAmountLabel, 0, 0);
        GridPane.setConstraints(mealAmount, 1, 0);
        
        
        //Fields for entering the tip percentage
        Label tipPercentage = new Label("Tip Percentage");
        tipPercentageAmount = new TextField();
        tipPercentageAmount.setPromptText("Tip %");
        tipPercentageAmount.textProperty().addListener((observable, oldValue, newValue) -> doubleFieldValidator(tipPercentageAmount));  //this triggers an event for every change in the text field
        GridPane.setConstraints(tipPercentage, 0, 1);
        GridPane.setConstraints(tipPercentageAmount, 1, 1);
        
        
        //Fields for showing the result
        Label tipDollarAmountLabel = new Label("Tip Amount");
        tipAmount = new TextField();
        tipAmount.setEditable(false);
        GridPane.setConstraints(tipDollarAmountLabel, 0, 2);
        GridPane.setConstraints(tipAmount, 1, 2);
        
        
        //Add a button to calculate the tip
        Button calculateButton = new Button("Calculate");
        calculateButton.setOnAction(e -> setTipAmount());
        calculateButton.defaultButtonProperty().bind(calculateButton.focusedProperty()); //this binds the enter key to button, so you can tab and not use the mouse to select the calculate buttton
        GridPane.setConstraints(calculateButton, 1, 3);
        
        //Add fields to the GUI
        VBox vBox = new VBox(10);
        grid.getChildren().addAll(mealAmountLabel,mealAmount,tipPercentage,tipPercentageAmount);
        grid.getChildren().addAll(tipDollarAmountLabel, tipAmount, calculateButton);
        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.getChildren().addAll(grid, errorLabel);
        
        Scene scene = new Scene(vBox, 400, 250);
        scene.getStylesheets().add(getClass().getResource("layout.css").toExternalForm());  //This calls the CSS
        primaryStage.setTitle("Tip Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public void doubleFieldValidator(TextField inputField)
    {
        System.out.print("Validation was performed for " + inputField.toString());
        try
        {
            Double.parseDouble(inputField.getText());
            inputField.getStyleClass().remove("error");  //this calls the css file to clear the red border
            errorLabel.setText("");
        }
        catch (NumberFormatException e)
        {
            inputField.getStyleClass().add("error");        //this calls the css file and restyles the TextField with red
            errorLabel.setText("Red fields must have numbers only.");
        }        
    }
    
    public void setTipAmount()
    {
        double mealAmount, tipPercentage, tipAmount;
        
        //get the data from the user input fields
        try
        {
            mealAmount = Double.parseDouble(this.mealAmount.getText());
            tipPercentage = Double.parseDouble(this.tipPercentageAmount.getText());
            tipPercentage = tipPercentage/100;
            tipAmount = mealAmount * tipPercentage;
            
            this.tipAmount.setText(String.format("$%.2f", tipAmount));
        }
        catch (NumberFormatException e)
        {
            errorLabel.setText("Red fields must have numbers only.");
        }
        
        
        
      
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
