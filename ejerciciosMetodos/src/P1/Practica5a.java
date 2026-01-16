package P1;

public class Practica5a {
    static void main() {
        Punto punto1 = new Punto(5.0,3.1);
        Punto punto2=new Punto(2.5,9.6);
        Triangulo triangulo= new Triangulo();
        Circulo circulo=new Circulo();

        System.out.println("Distancia de un punto a otro: "+punto1.calcularDistanciaDesde(punto2));
        System.out.println("Area Circulo: "+circulo.cacularArea());
        System.out.println("Perimetro circulo: "+circulo.calcularPerimetro());
        System.out.println("Distancia : "+ circulo.calcularDistanciaDesde(punto2));
        System.out.println("Area triangulo: "+ triangulo.calcularArea());
        System.out.println("Perimetro triangulo: "+ triangulo.calcularPerimetro());
        System.out.println("Distancia: "+ triangulo.calcularDistanciaDesde(punto1));

    }
}
