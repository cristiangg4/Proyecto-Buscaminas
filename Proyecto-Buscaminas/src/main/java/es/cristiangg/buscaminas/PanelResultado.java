package es.cristiangg.buscaminas;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

// aqui creamos el panel del resultado del juego
public class PanelResultado extends StackPane {
        
    static Label labelResultado = new Label();
    final static byte TIEMPO_MENSAJE = 5; //duracion del tiempo por pantalla
    
    // aqui creamos el panel
    public PanelResultado() {
        this.getChildren().add(labelResultado);
        this.setMinHeight(100);
    } 
    
    // aqui lo creamos para mostrarlo despues por pantalla en el tablero
    public static void mostrarMensaje(String mensaje) {
        labelResultado.setText(mensaje);
        Timeline timelineMensaje = new Timeline(
            new KeyFrame(Duration.seconds(TIEMPO_MENSAJE), (ActionEvent t) -> { //aqui cogemos el tiempo que hemos dado anteriormente
                labelResultado.setText("");
        })
        );
        timelineMensaje.setCycleCount(1);
        timelineMensaje.play();
    }
    
    
}

