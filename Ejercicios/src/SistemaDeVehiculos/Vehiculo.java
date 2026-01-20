package SistemaDeVehiculos;

public abstract class Vehiculo {
     private String matricula;
     private String marca;
     private String modelo;

    public Vehiculo(String matricula,String marca, String modelo){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;

    }
    public Vehiculo(){}

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public abstract void calcularConsumo();

    //metodo mostrar datos
    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();

        sb.append("Matricula: ").append(matricula).append("\n");
        sb.append("Marca: ").append(marca).append("\n");
        sb.append("Modelo: ").append(modelo).append("\n");
        return sb.toString();
    }
}
