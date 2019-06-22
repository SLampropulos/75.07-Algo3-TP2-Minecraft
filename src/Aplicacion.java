import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import juego.MineCraft;
import vista.PantallaInicio;


public class Aplicacion extends Application  {

	public static void main(String[] args) {
        launch(args);
	}

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("AlgoMineCraft");

        MineCraft mineCraft = new MineCraft();  // Crea el modelo

        PantallaInicio pantallaInicio = new PantallaInicio(stage, mineCraft);
        Scene escenaInicial = new Scene(pantallaInicio, 1160, 640);
        stage.setScene(escenaInicial);
        stage.show();

    }

}
