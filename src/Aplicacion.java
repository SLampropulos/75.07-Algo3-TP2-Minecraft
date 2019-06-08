

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vista.ContenedorPrincipal;


public class Aplicacion extends Application  {

	public static void main(String[] args) {
        launch(args);
	}

    @Override
    public void start(final Stage stage) throws Exception {

        stage.setTitle("AlgoMineCraft");

//        // Crea el modelo

        ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(stage);
        Scene escenaJuego = new Scene(contenedorPrincipal, 1160, 640);
        stage.setScene(escenaJuego);

        stage.show();

    }

}
