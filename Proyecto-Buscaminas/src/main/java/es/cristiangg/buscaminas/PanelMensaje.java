package es.cristiangg.buscaminas;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

// titulo del juego
public class PanelMensaje extends StackPane {
    
    static Label Titulo = new Label();

  
    public PanelMensaje(){
        
        this.getChildren().add(Titulo);
        this.setMinHeight(100);
        Titulo.setText("BUSCAMINAS");

    }
    
}
