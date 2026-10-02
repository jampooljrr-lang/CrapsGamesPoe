package co.edu.univalle.poe.mvc.model;

import java.until,random;

/*
clase que representa un dado de seis caras y genera
un numero aleatorio de uno a seis cada vez que eel usuario
lo requiera
*/
public class Dado {
    private final int NUMERO_CARAS = 6
    private Random random;

    public Dado(){
        random = new random();
    }

    public int lanzar(){
        Random random = new Random();
        return  random.nextInt(bound: NUMERO_CARAS)+1
    }
}
