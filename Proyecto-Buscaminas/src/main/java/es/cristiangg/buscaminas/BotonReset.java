package es.cristiangg.buscaminas;

import javafx.scene.control.Button;


public class BotonReset {
    GenerarMinas minas = new GenerarMinas();
    Button boton = new Button("Reset");
    
// creamos el boton y lo colocamos en las siguientes posiciones
    public void crearBoton(){
        boton.setMinWidth(100);
        boton.setMaxWidth(100);
        boton.setMinHeight(50);
        boton.setMaxHeight(50);
        boton.setTranslateY(10);
        boton.setTranslateX(100);
    }
                
}

