package es.cristiangg.buscaminas;

public class TapasTablero {
   
    short tamXTapas;
    short tamYTapas;
    final char liso = '-';
    char[][] tableroTapa;
    char[][] tapaslevantadas;
    final char bomba1 = '*';

    public TapasTablero() {

    tamXTapas = 10;
    tamYTapas = 10;
   
    // generamos las tapas de la segunda vuelta
    
        tableroTapa = new char[tamXTapas][tamYTapas];
        for (int x = 0; x <tamXTapas; x++) {
            for (int y = 0; y < tamYTapas; y++) {
                tableroTapa[x][y] = liso;
            }
        }
    }
    
    // mostramos en consola la tapas nuevas de la segunda vuelta
   
    public void mostrarTapasConsola() {
        for(int y=0; y<tamYTapas; y++) {
            for(int x=0; x<tamXTapas; x++) {
               
                System.out.print(tableroTapa[x][y]);
            }
            System.out.println();
        }    
        System.out.println();

//        levantadas((int) cordX1 ,(int) cordY1);
    }

// aqui colocamos cuando levantemos en tablero la posicion colocar un * como que esta levantada
    
    public void levantadas (short cordX1, short cordY1){
       
        tableroTapa [cordX1][cordY1] =  bomba1;
            System.out.println("levantada");
       
    }
}
