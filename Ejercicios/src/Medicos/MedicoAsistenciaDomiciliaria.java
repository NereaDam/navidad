package Medicos;

import java.util.Arrays;

public class MedicoAsistenciaDomiciliaria extends Medico {

    private double[] kmVisitas;
    private double tarifaKm;

    public MedicoAsistenciaDomiciliaria(String nombre, int edad, boolean sexo, double horas, double salarioHora, double[] kmVisitas, double tarifaKm) {
        super(nombre, edad, sexo, horas, salarioHora);
        this.kmVisitas = kmVisitas;
        this.tarifaKm = tarifaKm;
    }

    public double[] getKmVisitas() {
        return kmVisitas;
    }

    public double getTarifaKm() {
        return tarifaKm;
    }

    public void setTarifaKm(double tarifaKm) {
        this.tarifaKm = tarifaKm;
    }

    public void setKmVisitas(double[] kmVisitas) {
        this.kmVisitas = kmVisitas;
    }

    @Override
    public void calcularSalario() {
        //salario ppormhoras + kilometraje de visitas
    }

    //metodo mostrar datos
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Km Visitas: ").append(Arrays.toString(kmVisitas)).append("\n");
        sb.append("Tarifa Km : ").append(tarifaKm).append("\n");
        return sb.toString();
    }
}
