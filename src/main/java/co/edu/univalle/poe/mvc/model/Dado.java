package co.edu.univalle.poe.mvc.model;

import java.util.Random;

/*
Clase que representa un dado de seis caras y genera
un número aleatorio de uno a seis cada vez que el usuario
lo requiera.
*/
public class Dado {
    private final int NUMERO_CARAS = 6;
    private Random random;

    public Dado() {
        random = new Random();
    }

    public int lanzar() {
        return random.nextInt(NUMERO_CARAS) + 1;
    }
}
