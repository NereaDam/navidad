package SistemaDeVehiculos;

public class Moto extends Vehiculo{

    private int cilindrada;
    private double consumoKm;

    public Moto(String matricula, String marca, String modelo,int cilindrada,double consumoKm) {
        super(matricula, marca, modelo);
        this.cilindrada=cilindrada;
        this.consumoKm=consumoKm;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public double getConsumoKm() {
        return consumoKm;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
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
        sb.append("==Moto==\n");
        sb.append(super.toString()).append("\n");
        sb.append("Cilindada: ").append(cilindrada).append("\n");
        sb.append("Consumo de Km: ").append(consumoKm).append("\n");

        return sb.toString();
    }
}
