package es.cristiangg.buscaminas;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tapas extends Group {
    
    double posX;
    double posY;
    
    public Tapas() {
        Rectangle bloques = new Rectangle (49, 47);
        bloques.setX(0);
        bloques.setY(0);
        bloques.setStroke(Color.RED);

        
        this.getChildren().addAll(bloques);
    }

    void setFill(Color TRANSPARENT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

