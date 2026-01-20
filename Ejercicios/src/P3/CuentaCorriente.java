package P3;

import java.util.Scanner;

public class CuentaCorriente {
    private Titular titular;
    private String numeroCuenta;
    private double saldo;


    public CuentaCorriente(Titular titular, String numeroCuenta,double saldo){
       this.titular=titular;
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;

    }

    public CuentaCorriente(Titular titular,String numeroCuenta){
        this.titular=titular;
        this.numeroCuenta=numeroCuenta;
        saldo=15.3;

    }



    public Titular getTitular() {
        return titular;
    }


    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double ingresar(){
        Scanner read = new Scanner(System.in);
        System.out.println("Inserta cuanto dinero quieres ingresar");
        double ingresar=read.nextDouble();
        double total= saldo+ingresar;
        System.out.println("Total: " +saldo+ " + " + ingresar + " = " + total);
        return total;
    }

    public double reintegro(){
        Scanner read = new Scanner(System.in);
        System.out.println("Inserta cuanto dinero quieres retirar");
        double retirar=read.nextDouble();
        double total= saldo-retirar;
        System.out.println("Total= " + saldo + " - " + retirar + " = " + total);

        return total;
    }

    public void datosCuenta(){
        System.out.println("Numero cuenta:" + numeroCuenta);
        System.out.println("Saldo:" + saldo);

    }

    public boolean compararCuentas(String numeroCuenta2){
        if (numeroCuenta.compareToIgnoreCase(numeroCuenta2)==0) {
            System.out.println("Las cuentas son iguales");
            return true;
        }else{
            System.out.println("Las cuentas no son iguales");
            return false;
            }
    }




}
