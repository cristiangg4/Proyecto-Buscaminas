
package es.cristiangg.buscaminas;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;


public class Bombas extends Group {
    
    Pane root = new Pane();

    static final double TAM_FICHA = 40;
  
    public Bombas (){
        
    // creamos el circulo exterior de la bomba
        Circle fichaExterior = new Circle();
        fichaExterior.setRadius(TAM_FICHA / 2);
        fichaExterior.setCenterX(0);
        fichaExterior.setCenterY(0);
        fichaExterior.setFill(Color.GREY);
    
    // creamos el circulo interior de la bomba
        Circle fichaInterior = new Circle();
        fichaInterior.setRadius(TAM_FICHA / 2 - 5);
        fichaInterior.setCenterX(0);
        fichaInterior.setCenterY(0);
        fichaInterior.setFill(Color.BLACK);
    
    // creamos la mecha de la bomba
        Line mecha = new Line(15, -20, 5 ,-15);
        mecha.setStroke(Color.GREY);
        mecha.setStrokeWidth(4);
    
    // agrupamos las tres cosas juntas
        this.getChildren().addAll(fichaExterior, fichaInterior, mecha);
    }
        
}
