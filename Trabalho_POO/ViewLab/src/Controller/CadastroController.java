package com.example.trabalho_poo_javafx.Controller;


//IMPORTAR CADASTRO DE MODEL
import com.example.trabalho_poo_javafx.Model.Cadastro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;



public class CadastroController {

        @FXML
        private AnchorPane pn_Principal;

        @FXML
        private TextField txt_Nome;

        @FXML
        private TextField txt_Cpf;

        @FXML
        private TextField txt_Num_Cartao;

        @FXML
        private TextField txt_Email;

        @FXML
        private TextField txt_Senha;

        @FXML
        private TextField txt_Idade;

        @FXML
        private Label lbl_TextoCadastro;

        @FXML
        private Label lbl_Nome;

        @FXML
        private Label lbl_Cpf;

        @FXML
        private Label lbl_Num_Cartao;

        @FXML
        private Label lbl_Idade;

        @FXML
        private Label lbl_Senha;

        @FXML
        private Label lbl_Email;

        @FXML
        private Button btn_Salvar;




        //ESTRUTURAR CLASSE CADASTRO PARA CRIAR OBJETO
        public void Salvarbtn(ActionEvent event)
        {
            if(event.getSource() == btn_Salvar)
            {

                    System.out.println("teste");



            }



        }





    }






