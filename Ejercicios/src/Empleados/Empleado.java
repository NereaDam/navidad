package Empleados;

public abstract class Empleado {

    private String nombre;
    private String dni;
    private double salarioBase;

    public Empleado(String nombre,String dni, double salarioBase){
        this.nombre=nombre;
        this.dni=dni;
        this.salarioBase=salarioBase;
    }


    public Empleado(){}

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract void calcularSalario();

    //Metodo mostrara datos
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Dni: ").append(dni).append("\n");
        sb.append("Salario Base: ").append(salarioBase).append("\n");


        return sb.toString();
    }
}
