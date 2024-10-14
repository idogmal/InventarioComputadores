package view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Computer;
import model.DatabaseHelper;

public class InventoryApp extends Application {

    private DatabaseHelper dbHelper = new DatabaseHelper();

    @Override
    public void start(Stage primaryStage) {
        // Chamar o método para criar a tabela no banco de dados (se não existir)
        dbHelper.createTable();

        // Criar os campos de entrada (TextFields) para os dados do computador
        TextField tagField = new TextField();
        tagField.setPromptText("Etiqueta TI/Patrimônio");

        TextField serialNumberField = new TextField();
        serialNumberField.setPromptText("Número de Série");

        TextField modelField = new TextField();
        modelField.setPromptText("Modelo do Computador");

        TextField brandField = new TextField();
        brandField.setPromptText("Marca");

        TextField stateField = new TextField();
        stateField.setPromptText("Estado (Em uso, Manutenção)");

        TextField userNameField = new TextField();
        userNameField.setPromptText("Nome de Usuário na Rede");

        TextField windowsVersionField = new TextField();
        windowsVersionField.setPromptText("Versão do Windows");

        TextField officeVersionField = new TextField();
        officeVersionField.setPromptText("Versão do Office");

        TextField locationField = new TextField();
        locationField.setPromptText("Unidade de Localização");

        TextField purchaseDateField = new TextField();
        purchaseDateField.setPromptText("Data de Aquisição");

        // Criar um botão para salvar os dados do computador
        Button saveButton = new Button("Salvar Computador");
        saveButton.setOnAction(e -> {
            // Ao clicar no botão, capturar os dados e inserir no banco de dados
            Computer computer = new Computer(
                    tagField.getText(),
                    serialNumberField.getText(),
                    modelField.getText(),
                    brandField.getText(),
                    stateField.getText(),
                    userNameField.getText(),
                    windowsVersionField.getText(),
                    officeVersionField.getText(),
                    locationField.getText(),
                    purchaseDateField.getText()
            );

            dbHelper.insertComputer(computer);
            clearFields(tagField, serialNumberField, modelField, brandField, stateField, userNameField, windowsVersionField, officeVersionField, locationField, purchaseDateField);
            System.out.println("Computador salvo com sucesso!");
        });

        // Layout usando GridPane
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Adicionar os campos de entrada ao layout (GridPane)
        gridPane.add(new Label("Etiqueta TI/Patrimônio:"), 0, 0);
        gridPane.add(tagField, 1, 0);

        gridPane.add(new Label("Número de Série:"), 0, 1);
        gridPane.add(serialNumberField, 1, 1);

        gridPane.add(new Label("Modelo:"), 0, 2);
        gridPane.add(modelField, 1, 2);

        gridPane.add(new Label("Marca:"), 0, 3);
        gridPane.add(brandField, 1, 3);

        gridPane.add(new Label("Estado:"), 0, 4);
        gridPane.add(stateField, 1, 4);

        gridPane.add(new Label("Nome de Usuário:"), 0, 5);
        gridPane.add(userNameField, 1, 5);

        gridPane.add(new Label("Versão do Windows:"), 0, 6);
        gridPane.add(windowsVersionField, 1, 6);

        gridPane.add(new Label("Versão do Office:"), 0, 7);
        gridPane.add(officeVersionField, 1, 7);

        gridPane.add(new Label("Localização:"), 0, 8);
        gridPane.add(locationField, 1, 8);

        gridPane.add(new Label("Data de Aquisição:"), 0, 9);
        gridPane.add(purchaseDateField, 1, 9);

        // Adicionar o botão de salvar ao layout
        gridPane.add(saveButton, 1, 10);

        // Layout principal
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().add(gridPane);

        // Configurar a cena
        Scene scene = new Scene(layout, 600, 400);

        // Configurar o palco
        primaryStage.setTitle("Cadastro de Computadores");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método para limpar os campos de texto após salvar
    private void clearFields(TextField... fields) {
        for (TextField field : fields) {
            field.clear();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
