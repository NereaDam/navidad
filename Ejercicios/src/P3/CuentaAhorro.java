package P3;

import java.util.Scanner;

public class CuentaAhorro extends CuentaCorriente{

    private double interes;



    public CuentaAhorro(Titular titular, String numeroCuenta, double saldo,double interes) {
        super(titular, numeroCuenta, saldo);
        this.interes=interes;
    }

    public CuentaAhorro(Titular titular,String numeroCuenta,double interes) {
        super(titular, numeroCuenta);

        setSaldo(15.3);
    }
    public CuentaAhorro(Titular titular,String numeroCuenta) {
        super(titular, numeroCuenta);
        setSaldo(15.3);
        interes=2.5;
    }



    public double getInteres() {
        return interes;
    }

    public double calcularInteres(){
        Scanner read = new Scanner(System.in);
        System.out.println("Inserta el interes");
        double num=read.nextInt();

        double total=getSaldo()*num;
        System.out.println("Total: " +getSaldo()+ " x " + num + " = " + total);
        return total;
    }


}
