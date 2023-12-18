package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SignUpController {

    // DatabaseController databaseController = new DatabaseController();
    // static private DatabaseController databaseController;
    // DBHandler dbHandler = new DBHandler();

    @FXML
    private TextField cpassTxt;

    @FXML
    private Button signUpBtn;

    @FXML
    private TextField emailTxt;

    @FXML
    private TextField firstNameTxt;

    @FXML
    private TextField lastNameTxt;

    @FXML
    private TextField passTxt;

    @FXML
    private TextField userNameTxt;

    // private void signUp() {
    // try {
    // // dbHandler.readFromDB();
    // System.out.println("SuccessFull");
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // }

    @FXML
    void termsCheckBtn(ActionEvent event) {

    }

    @FXML
    void initialize() {
        // DBHandler dbHandler = new DBHandler();
        signUpBtn.setOnAction(event -> {
            // try {
            // // String firstname = firstNameTxt.getText().trim();
            // // String lastname = lastNameTxt.getText().trim();
            // // String username = userNameTxt.getText().trim();
            // // String email = emailTxt.getText().trim();
            // // String pass = passTxt.getText().trim();
            // // String cpass = cpassTxt.getText().trim();

            // // DBHandler.writeToDB(firstname, lastname, username, email, pass);
            // // loginSigupBtn.getScene().getWindow().hide();
            // } catch (SQLException e) {
            // throw new RuntimeException(e);
            // }
        });

    }
}
