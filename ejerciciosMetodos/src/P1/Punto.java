package P1;

import java.util.Random;
import java.util.Scanner;

public class Punto {
    private double inicio;
    private double fin;

    public Punto(double inicio, double fin){
        this.inicio=inicio;
        this.fin=fin;

    }

    public Punto(){
        Random random = new Random();
        inicio= random.nextDouble(0.0,100.0);
        fin= random.nextDouble(0.0,100.0);
    }

    public double getInicio() {
        return inicio;
    }

    public double getFin() {
        return fin;
    }

    public double  calcularDistanciaDesde(Punto valor){
        double distancia = Math.sqrt(Math.pow(valor.inicio-inicio,2)+Math.pow(valor.fin-fin,2));

        return distancia;
    }

}
