package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField passwordField;

    @FXML
    private TextField userNameField;

    @FXML
    private Button loginLoginBtn;

    @FXML
    private Button loginSigupBtn;

    @FXML
    void loginBtn(ActionEvent event) {
        String loginUsername = userNameField.getText().trim();
        String loginPass = passwordField.getText().trim();

        if (!loginUsername.equals("") || !loginPass.equals("")) {
            loginUser(loginUsername, loginPass);

        } else {
            System.out.println("Empty field");
        }

        loginLoginBtn.getScene().getWindow().hide();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view/existingUser.fxml"));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Application");
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void loginUser(String loginUsername, String loginPass) {

    }

    @FXML
    void signUpBtn(ActionEvent event) {

        System.out.println("SignUp");
        loginSigupBtn.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view/SignUp.fxml"));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Sign Up page");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void initialize() {

    }

}
