package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TestJavaFX extends Application {

   public TestJavaFX() {
      // Construtor padrão
   }

   @Override
   public void start(Stage primaryStage) {
      // Criar um rótulo com o texto "JavaFX está funcionando!"
      Label label = new Label("JavaFX está funcionando!");
      
      // Criar um StackPane (layout) e adicionar o rótulo ao layout
      StackPane root = new StackPane();
      root.getChildren().add(label);
      
      // Criar a cena, definir o tamanho e adicionar o layout (StackPane)
      Scene scene = new Scene(root, 300, 200);
      
      // Configurar o palco principal (janela), título e cena
      primaryStage.setTitle("Teste JavaFX");
      primaryStage.setScene(scene);
      
      // Exibir a janela
      primaryStage.show();
   }

   public static void main(String[] args) {
      // Iniciar a aplicação JavaFX
      launch(args);
   }
}
