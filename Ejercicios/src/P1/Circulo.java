package P1;

import java.util.Random;

public class Circulo {

    private Punto centro;
    private double radio;

    public Circulo(Punto centro,double radio){
        this.centro=centro;
        this.radio=radio;

    }

    public Circulo(){
        Random random = new Random();
        centro= new Punto();
        radio= random.nextDouble(20);

    }

    public Circulo(Punto centro,double radio,double total){
        centro=new Punto();
        radio=5.0;

    }

    public Punto getCentro() {
        return centro;
    }

    public double getRadio() {
        return radio;
    }

    public double  calcularDistanciaDesde(Punto valor1){
        double distancia= Math.sqrt(Math.pow(valor1.getInicio() - centro.getInicio(),2)+Math.pow(valor1.getFin() - centro.getFin(),2));

        return distancia;

    }

    public double cacularArea(){
        double area=Math.PI*Math.pow(radio,2);
        return area;
    }

    public double calcularPerimetro(){
        double perimetro=2*Math.PI*radio;
        return perimetro;
    }

}
