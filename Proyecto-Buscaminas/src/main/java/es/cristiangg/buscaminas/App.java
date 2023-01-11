package es.cristiangg.buscaminas;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    BorderPane paneRoot;
    short X = 0;
    short Y = 0;
   
   
    @Override
    public void start(Stage stage) {
        
         
    // tamaño de la pantalla
        short tamXPantalla = 640;
        short tamYPantalla = 650;
       
        paneRoot = new BorderPane();
        var scene = new Scene(paneRoot, tamXPantalla, tamYPantalla);
        stage.setScene(scene);
        stage.show();
   
    //Llamar a pantalla el apartado de generar minas    
        GenerarMinas buscaminas = new GenerarMinas();
        buscaminas.mostrarTableroConsola();        
        buscaminas.hayMina(3 ,3);
        System.out.println(" " + buscaminas);
        
    // llamar a pantalla las tapas del tablero       
        TapasTablero tapastablero = new TapasTablero();
        tapastablero.mostrarTapasConsola();
        
    // llamar a pantalla tablero       
        Tablero tablero = new Tablero(buscaminas, tapastablero);
        paneRoot.setCenter(tablero);
        paneRoot.setTop(new PanelMensaje());
        paneRoot.setBottom(new PanelResultado());
        
    // colocamos en pantalla el boton de reset        
        HBox paneScores = new HBox();
        BotonReset reset = new BotonReset();
        paneScores.getChildren().add(reset.boton);
        reset.crearBoton();
        paneRoot.getChildren().add(paneScores);
                
    }

    public static void main(String[] args) {
        launch();
    }

}


