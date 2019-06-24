import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import juego.MineCraft;
import vista.PantallaInicio;


public class Aplicacion extends Application  {

	//Definición de constantes
	static final String TITULO_JUEGO = "AlgoMineCraft";
	static final int DIMENSION_LARGO_VERTICAL_JUEGO = 640;
	static final int DIMENSION_LARGO_HORIZONTALL_JUEGO = 1160;
	
	public static void main(String[] args) {
        launch(args);
	}

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle(TITULO_JUEGO);

        MineCraft mineCraft = new MineCraft();  // Crea el modelo

        PantallaInicio pantallaInicio = new PantallaInicio(stage, mineCraft);
        Scene escenaInicial = new Scene(pantallaInicio, DIMENSION_LARGO_HORIZONTALL_JUEGO, DIMENSION_LARGO_VERTICAL_JUEGO);
        stage.setScene(escenaInicial);
        stage.show();

    }

}
