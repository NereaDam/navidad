package P2;

public class Alumno {

    private Asignatura A;
    private Asignatura B;
    private Asignatura C;

    public Alumno(Asignatura A, Asignatura B, Asignatura C){
        this.A=A;
        this.B=B;
        this.C=C;
    }

    public Alumno(int num1, int num2, int num3){
        A=new Asignatura(num1);
        B=new Asignatura(num2);
        C=new Asignatura(num3);

    }

    public Asignatura getA() {
        return A;
    }

    public Asignatura getB() {
        return B;
    }

    public Asignatura getC() {
        return C;
    }
}
