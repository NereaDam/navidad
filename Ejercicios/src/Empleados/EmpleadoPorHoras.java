package Empleados;

public class EmpleadoPorHoras extends Empleado{

    private double horasTrabajadas;
    private double precioHora;

    public EmpleadoPorHoras(String nombre, String dni, double salarioBase,double horasTrabajadas,double precioHora) {
        super(nombre, dni, salarioBase);
        this.horasTrabajadas=horasTrabajadas;
        this.precioHora=precioHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    @Override
    public void calcularSalario() {

    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("==Empleado por Horas==\n");
        sb.append(super.toString()).append("\n");
        sb.append("Horas Trabajadas: ").append(horasTrabajadas).append("\n");
        sb.append("Precio Hora: ").append(precioHora).append("\n");
        return sb.toString();
    }
}
