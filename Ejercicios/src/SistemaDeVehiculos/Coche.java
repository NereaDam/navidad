package SistemaDeVehiculos;

public class Coche extends Vehiculo{

    private int numeroPuertas;
    private double consumoKm;


    public Coche(String matricula, String marca, String modelo,int numeroPuertas, double consumoKm) {
        super(matricula, marca, modelo);
        this.numeroPuertas=numeroPuertas;
        this.consumoKm=consumoKm;
    }


    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public double getConsumoKm() {
        return consumoKm;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setConsumoKm(double consumoKm) {
        this.consumoKm = consumoKm;
    }

    @Override
    public void calcularConsumo() {

    }


    @Override
    public String toString() {

        StringBuilder sb= new StringBuilder();
        sb.append("==Coche==\n");
        sb.append(super.toString()).append("\n");
        sb.append("Numero de Puertas: ").append(numeroPuertas).append("\n");
        sb.append("Condumo de Km: ").append(consumoKm).append("\n");

        return sb.toString();
    }
}
