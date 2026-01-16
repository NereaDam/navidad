package P2;

public class Practica5b {
    static void main() {

        Asignatura asignatura1 = new Asignatura(1);
        Asignatura asignatura2 = new Asignatura(2);
        Asignatura asignatura3 = new Asignatura(3);

        Alumno alumno= new Alumno(asignatura1,asignatura2,asignatura3);

        Profesor profesor=new Profesor();
        profesor.ponerNotas(alumno);


        System.out.println("Media Alumno: " +profesor.calcularMedia(alumno));

    }
}
