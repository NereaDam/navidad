package Medicos;

public abstract class Medico {

    private String nombre;
    private int edad;
    private boolean sexo; //true Femenino, false Masculino
    private double horas;
    private double salarioHora;

    public Medico(String nombre,int edad,boolean sexo,double horas,double salarioHora){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.horas=horas;
        this.salarioHora=salarioHora;
    }

    public Medico(){}

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public double getHoras() {
        return horas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }



    public abstract void calcularSalario();

    //Metodo Mostrar Datos
    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("==MEDICO==\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Edad: ").append(edad).append("\n");
        sb.append("Sexo: ").append(sexo).append("\n");
        sb.append("Horas: ").append(horas).append("\n");
        sb.append("Salario Hora: ").append(salarioHora).append("\n");
        return sb.toString();
    }
}
