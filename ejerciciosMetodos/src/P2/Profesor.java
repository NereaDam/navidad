package P2;

import java.util.Random;

public class Profesor {

    public void ponerNotas(Alumno alumno){
        alumno.getA().setCalificacion(Math.random()*10);
        alumno.getB().setCalificacion(Math.random()*10);
        alumno.getC().setCalificacion(Math.random()*10);

    }

    public double calcularMedia(Alumno alumno){
         double media=(alumno.getA().getCalificacion()+alumno.getB().getCalificacion()+alumno.getC().getCalificacion())/3;

        return media;
    }

}
