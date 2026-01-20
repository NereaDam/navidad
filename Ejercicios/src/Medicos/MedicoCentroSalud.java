package Medicos;

public class MedicoCentroSalud extends Medico{

    private String identificador;
    private String nombreCentro;
    private String domicilio;
    private String localidad;


    public MedicoCentroSalud(String nombre,int edad, boolean sexo, double horas, double salarioHora,String identificador,String nombreCentro,String domicilio){
        super(nombre,edad,sexo,horas,salarioHora);
        this.identificador=identificador;
        this.nombreCentro=nombreCentro;
        this.domicilio=domicilio;
        this.localidad=localidad;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }


    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public void calcularSalario() {
        //segun las horas trabajadas
    }

    //metodo mostrar datos
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Identificador: ").append(identificador).append("\n");
        sb.append("Nombre Centro: ").append(nombreCentro).append("\n");
        sb.append("Domicilio: ").append(domicilio).append("\n");
        sb.append("Localidad: ").append(localidad).append("\n");

        return sb.toString();
    }
}
