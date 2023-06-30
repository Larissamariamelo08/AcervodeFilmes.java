package com.example.trabalho_poo_javafx.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class LoginController {

    @FXML
    private VBox Pag;

    @FXML
    private AnchorPane pn_PainelPrincipal;

    @FXML
    private MenuBar br_Menu;

    @FXML
    private TextField txt_Email;

    @FXML
    private Label lbl_TituloPagina;

    @FXML
    private Label lbl_email;

    @FXML
    private TextField txt_Senha;

    @FXML
    private Label lbl_Senha;

    @FXML
    private Button btn_Login;

    @FXML
    private Button btn_Voltar;

    //REMOVER lblTeste"n"
    @FXML
    private Label lblTeste1;

    @FXML
    private Label lblTeste2;

   // APLICAR CLASSE CADASTRO
    public void Acao_btn(ActionEvent event)
    {
        if (event.getSource() == btn_Login )
        {
            lblTeste1.setText(txt_Email.getText());
            lblTeste2.setText(txt_Senha.getText());

        }


    }






}
