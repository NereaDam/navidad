package P1;

import java.util.Random;

public class Triangulo {

    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;

    public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3){
        this.vertice1=vertice1;
        this.vertice2=vertice2;
        this.vertice3=vertice3;
    }

    public Triangulo(){
        vertice1= new Punto();
        vertice2= new Punto();
        vertice3= new Punto();
    }
    public Triangulo(double x1,double y1,double x2, double y2, double x3,double y3){
        Random random = new Random();
        //que inicialice los 3 atributos?? los vertices?
        vertice1=new Punto(x1,y1);
        vertice2=new Punto(x2,y2);
        vertice3=new Punto(x3,y3);

    }

    public Punto getVertice1() {
        return vertice1;
    }



    public Punto getVertice2() {
        return vertice2;
    }

    public Punto getVertice3() {
        return vertice3;
    }

    public double calcularDistanciaDesde(Punto valor){
        double distancia = Math.sqrt(Math.pow(valor.getInicio() - vertice1.getInicio(),2)+Math.pow(valor.getFin() - vertice1.getFin(),2));

        return distancia;

    }

    public double calcularArea(){
        double area= 0.5*((vertice1.getInicio()*(vertice2.getFin()-vertice3.getFin()))+(vertice2.getInicio()*(vertice3.getFin()-vertice1.getFin()))+(vertice3.getInicio()*(vertice1.getFin()-vertice2.getFin())));
        return area;
    }

    public double calcularPerimetro(){
        double ladoA=Math.sqrt(Math.pow(vertice3.getInicio()-vertice2.getInicio(),2)+ Math.pow(vertice3.getFin()-vertice2.getFin(),2));
        double ladoB=Math.sqrt(Math.pow(vertice3.getInicio()-vertice1.getInicio(),2)+ Math.pow(vertice3.getFin()-vertice1.getFin(),2));
        double ladoC=Math.sqrt(Math.pow(vertice2.getInicio()-vertice1.getInicio(),2)+ Math.pow(vertice2.getFin()-vertice1.getFin(),2));
        double perimetro=ladoA+ladoB+ladoC;
        return perimetro;
    }


}
