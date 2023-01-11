package es.cristiangg.buscaminas;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class Tablero extends GridPane{
    
    // variables creadas en la zona tablero
    GenerarMinas buscaminas;
    static final double TAM_FICHA = 50;
    char [][] TapaMinas;
    Bombas bombas;
    boolean perdido;
    char[][] click;
    char[][] matrizMinas;
    int filaX;
    int columnaY;
    int contador = 0;  
    Tapas [][] tapastablero = new Tapas[10][10]; //
    
    
    public Tablero(GenerarMinas buscaminas, TapasTablero tapasTablero) {
        // ajusta el tamaños de las fichas al tamaño del tablero
        this.buscaminas = buscaminas;
        this.setBackground(new Background(
            new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        this.setMinWidth((TAM_FICHA+1) * buscaminas.tamXTablero);
        this.setMinHeight((TAM_FICHA+1) * (buscaminas.tamYTablero + 1));
        this.setMaxWidth((TAM_FICHA+1) * buscaminas.tamXTablero);
        this.setMaxHeight((TAM_FICHA+1) * (buscaminas.tamYTablero + 1)); 
            

    //creamos por consola el segundo mapa y colocamos una tapa o tapa y bomba donde corresponda   
        for(int x=0; x<10; x++) {
            for(int y=0; y<10; y++) {
                if (buscaminas.tablero [x][y] == (char)'.'){
                    Tapas tapa = new Tapas();
                    this.add(tapa, x, y); 
                    tapastablero [x][y] = tapa;

                }
                if (buscaminas.tablero [x][y] == (char) '&'){
                    Bombas bomba = new Bombas();
                    Tapas tapa = new Tapas();
                    this.add(bomba, x, y);
                    this.add(tapa, x, y);
                    tapastablero [x][y] = tapa;                    
                }

            }
        }

// creamos la parte de cuando hacemos click
        this.setOnMouseClicked((event) -> {
            filaX = (int)(event.getX() / 50);
            columnaY = (int)(event.getY() / 50);
            System.out.println("X " + filaX);
            System.out.println("Y " + columnaY);
            tapasTablero.levantadas((short) filaX,(short) columnaY);
            tapasTablero.mostrarTapasConsola();
            tapastablero [filaX][columnaY].setVisible(false);

        // mostramos por pantalla los siguientes datos
            if (buscaminas.tablero [filaX][columnaY] == (char) '&'){ // si clicamos en & nos muestra el siguiente mensaje de eliminado
                this.setMinHeight(200);
                PanelResultado.mostrarMensaje("¡¡ELIMINADO!!");
            }
            if (buscaminas.tablero [filaX][columnaY] == (char) '.'){ // si clicamos en un . nos suma 1 mas a la variable contador
                contador ++ ;
            } 
            if (contador == 10) { // cuando la variable llegue a 10 nos muestra el siguiente mensaje
                this.setMinHeight(200);
                PanelResultado.mostrarMensaje("¡¡HAS GANADO!!");
            }
            
        });       

    }
}
