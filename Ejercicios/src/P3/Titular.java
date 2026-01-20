package P3;

import java.util.Random;

public class Titular {
    private  String nombre;
    private  String apellido;
    private int edad;

    public Titular(String nombre,String apellido, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    public Titular(){
        Random random = new Random();
        nombre=Constantes.NOMBRES[random.nextInt(0,7)];
        apellido=Constantes.APELLIDOS[random.nextInt(0,6)];
        edad= random.nextInt(16,80);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Apellido: ").append(apellido).append("\n");
        sb.append("Edad: ").append(edad);
        return sb.toString();
    }
}
