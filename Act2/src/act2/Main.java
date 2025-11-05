import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Etiquetas
        Label lblNombre = new Label("Nombre:");
        Label lblApellidos = new Label("Apellidos:");

        // Campos de texto con valores por defecto
        TextField txtNombre = new TextField("TuNombre");
        TextField txtApellidos = new TextField("TusApellidos");

        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(lblNombre, txtNombre, lblApellidos, txtApellidos);

        root.setStyle("-fx-background-color: lightblue;");

        Scene scene = new Scene(root, 300, 200, Color.LIGHTBLUE);

        primaryStage.setTitle("Formulario de Datos Personales");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
