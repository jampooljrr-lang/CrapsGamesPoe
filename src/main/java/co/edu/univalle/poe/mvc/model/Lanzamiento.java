package co.edu.univalle.poe.mvc.model;

public class Lanzamiento {
    private int ValorDado1;
    private int ValorDado2;

    public Lanzamiento(int valor ValorDado1, int Valordado2){
        this.ValorDado1 = ValorDado1;
        this.ValorDado2 = Valordado2;
    }

    public int CalculaSuma(){
        return ValorDado1 + ValorDado2
    }
    public int getValorDado1(){
     return ValorDado1;
    }

    public int getValorDado2(){
        return ValorDado2;
    }
}
