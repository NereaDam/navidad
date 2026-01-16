package P3;

public class Practica6 {
    static void main() {


        Titular titular1 = new Titular();
        Titular titular2=new Titular("Leo","Martin",17);

        CuentaCorriente cuentaCorriente1=new CuentaCorriente(titular1,"ES1524002",2000);
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente(titular2,"ES2541007");
        CuentaAhorro cuentaAhorro1 = new CuentaAhorro(titular1,"ES1524002",2);
        CuentaAhorro cuentaAhorro2 = new CuentaAhorro(titular2,"ES2541007");

        System.out.println(titular1);
        cuentaCorriente1.datosCuenta();
        cuentaCorriente1.ingresar();
        cuentaAhorro1.calcularInteres();

        System.out.println("\n============================================================================\n");
        System.out.println(titular2);
        cuentaAhorro2.datosCuenta();
        cuentaCorriente2.compararCuentas(cuentaCorriente1.getNumeroCuenta());
        cuentaAhorro2.reintegro();










    }
}
