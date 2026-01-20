package Empleados;

public class EmpleadoFijo extends Empleado {

    private int antiguedad;
    private double plusFijo;


    public EmpleadoFijo(String nombre, String dni, double salarioBase,int antiguedad,double plusFijo) {
        super(nombre, dni, salarioBase);
        this.antiguedad=antiguedad;
        this.plusFijo=plusFijo;
    }


    public int getAntiguedad() {
        return antiguedad;
    }

    public double getPlusFijo() {
        return plusFijo;
    }


    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setPlusFijo(double plusFijo) {
        this.plusFijo = plusFijo;
    }



    @Override
    public void calcularSalario() {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();


        sb.append("==Empleado Fijo==");
        sb.append(super.toString()).append("\n");
        sb.append("Antiguedad: ").append(antiguedad).append("\n");
        sb.append("Plus Fijo: ").append(plusFijo).append("\n");

        return sb.toString();
    }
}
