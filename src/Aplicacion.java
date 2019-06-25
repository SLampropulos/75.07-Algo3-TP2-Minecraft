import javafx.application.Application;
import javafx.stage.Stage;
import juego.MineCraft;
import vista.EscenaJuego;
import vista.PantallaInicio;

public class Aplicacion extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		stage.setTitle("AlgoMineCraft");

		MineCraft mineCraft = new MineCraft(); // Crea el modelo

		PantallaInicio pantallaInicio = new PantallaInicio(stage, mineCraft, 1160, 680);
		EscenaJuego escenaInicial = new EscenaJuego(pantallaInicio);
		stage.setScene(escenaInicial);
		stage.show();
	}

}
