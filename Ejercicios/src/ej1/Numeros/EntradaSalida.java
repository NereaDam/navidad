package ej1.Numeros;

import java.util.Scanner;

public class EntradaSalida {

    /**
     * Este es el menu principal con las opciones
     */
    public static int MenuPrincipalOpciones(){
        int opcion;
        Scanner read = new Scanner(System.in);

        imprimir("Inserte la opcion que desee:\n" +
                  "1. Numeros segun divisores\n" +
                  "2. Numeros segun representacion Binaria\n"+
                  "3. Numeros segun du forma\n"+
                  "4. Numeros segun su relacion con otros numeros\n"+
                  "5. (Numeros) Tipos de curiosos\n"+
                  "6. Salir\n");
        opcion=read.nextInt();

        return opcion;
    }

    /**
     * este es el switch case del menu principal
     */
    public static void menuPrincipalSwitch(){


        int opcion;
        do {
            opcion =MenuPrincipalOpciones();
            switch (opcion){
                case 1:
                    menuDivisoresSwitch();
                    break;
                case 2:
                    menuSwitchBinario();
                    break;
                case 3:
                    menuSwitchSegunSuForma();
                    break;
                case 4:
                    menuSwitchRelacionOtrosNumeros();
                    break;
                case 5:
                    menuSwitchTipoDeCuriosos();

                    break;
                case 6:
                    imprimir("Hasta Luego! :D");
                    break;
                default:
                    imprimir("opcion incorrecta");

            }
        }while(opcion !=6);

    }

    /**
     * este es el menu de la opcion 1 del menu principal(numeros segun divisores)
     * @return
     */
    public static int menuDivisoresOpciones(){
        Scanner read = new Scanner(System.in);

            imprimir("Elige una opcion: \n"+
                    "1. número perfecto.\n" +
                    "2. número primo\n" +
                    "3. Número compuesto.\n" +
                    "4. número abundante.\n" +
                    "5. número defectuoso.\n" +
                    "6. Salir.\n");


        return read.nextInt();
    }

    /**
     * este es el switch case del menu de la opcion 1 (numero segun divisores)
     */
    public static void menuDivisoresSwitch() {

        int opcion;
        do {
            opcion = menuDivisoresOpciones();
            switch (opcion) {
                case 1:
                    imprimir("==Numero perfecto==\n");
                    break;
                case 2:
                    imprimir("==Numero primo==\n");
                    break;
                case 3:
                    imprimir("==Numero compuesto==\n");

                    break;
                case 4:
                    imprimir("==Numero abundante==\n");

                    break;
                case 5:
                    imprimir("==Numero defectuoso==\n");

                    break;
                case 6:
                    imprimir("Hasta Luego! :D");
                    break;
                default:
                    imprimir("opcion incorrecta\n");
            }
        }while (opcion!=6);

    }

    /**
     * este es el menu de la opcion 2 del menu principal (numeros segun representacion binaria)
     * @return
     */
    public static int menuRepresentacionBinaria(){
        Scanner read = new Scanner(System.in);

            imprimir("Elige una opcion: \n"+
                    "1. número odioso.\n" +
                    "2. número malvado\n" +
                    "3. Salir.\n");
            return read.nextInt();



    }

    /**
     * este es el switch case de la opcion 2 del menu principal (numeros segun la representacion binaria)
     */
    public static void menuSwitchBinario(){

        int opcion;
        do {
            opcion=menuRepresentacionBinaria();
            switch (opcion){
                case 1:
                    imprimir("==Odioso==");
                    break;
                case 2:
                    imprimir("==Malvado==");
                    break;
                case 3:
                    imprimir("Adios!\n");
                    break;
                default:
                    imprimir("opcion erronea. :(");
            }

        }while (opcion!=3);
    }

    /**
     * este es el menu de la opcion 3 del menu principal (numeros segun su forma)
     */
    public static int menuSegunSuForma(){
        Scanner read = new Scanner(System.in);

            imprimir("Elige una opcion: \n"+
                    "1. número capicua (palindromo).\n" +
                    "2. numero narcisita (o de Armstrong)\n"+
                    "3. numero perfecto digital.\n" +
                    "4. Salir.\n");

       return read.nextInt();

    }

    /**
     * este es el switch case de la opcion 3 del menu principal (numeros segun su forma)
     */

    public static void menuSwitchSegunSuForma(){

        int opcion;
        do {
            opcion=menuSegunSuForma();
            switch (opcion){
                case 1:
                    imprimir("==Numero Capicua (palindromo)==");

                    break;
                case 2:
                    imprimir("==Numero Narcisista (o de Armstrong)==");

                    break;
                case 3:
                    imprimir("==Numero Perfecto Digital==");

                    break;
                case 4:
                    imprimir("Adios! :D");
                    break;
                default:
                    imprimir("opcion incorrecta. :(");
            }

        }while (opcion!=4);
    }

    /**
     * este es el menu de la opcion 4 del menu principal (numeros segun su relacion con otros numeros)
     */
    public static int menuRelacionOtrosNumeros(){
        Scanner read = new Scanner(System.in);

            imprimir("Elige una opcion: \n"+
                "1. número sociable.\n" +
                "2. numero amigo.)\n"+
                "3. numero enemigo.\n" +
                "4. Salir.\n");

        return read.nextInt();
    }

    /**
     * este es el switch case de la opcion 4 del menu principal (Numeros segun su relacion con otros numeros)
     */

    public static void menuSwitchRelacionOtrosNumeros(){
        int opcion;
        do {
            opcion=menuRelacionOtrosNumeros();
            switch (opcion){
                case 1:
                    imprimir("==Numero Sociable==");

                    break;
                case 2:
                    imprimir("==Numero Amigo==");

                    break;
                case 3:
                    imprimir("==Numero Enemigo==");

                    break;
                case 4:
                    imprimir("Adios! :D");
                    break;
                default:
                    imprimir("opcion incorrecta. :(");
            }


        }while (opcion!=4);
    }



    /**
     * este es el menu de la opcion 5 del menu principal (numeros- Tipos de curiosos)
     */
    public static int menuTiposDeCuriosos(){
        Scanner read = new Scanner(System.in);

            imprimir("Elige una opcion: \n"+
                    "1. número feliz.\n" +
                    "2. numero triste\n"+
                    "3. numero poderoso.\n" +
                    "4. numero de Fermat.\n" +
                    "5. numero de Mersenne.\n" +
                    "6. numero figurado (triangulares, cuadrados, pentagonales).\n" +
                    "7. Salir.\n");
             return read.nextInt();


    }

    /**
     * Este es el switch case de la opcion 5 del menu principal (numeros- Tipos de curiosos)
     */

    public static void menuSwitchTipoDeCuriosos(){
        int opcion;
        do {
            opcion=menuTiposDeCuriosos();
            switch (opcion) {
                case 1:
                    imprimir("==Numero Feliz==\n");
                    break;
                case 2:
                    imprimir("==Numero Triste==\n");
                    break;
                case 3:
                    imprimir("==Numero Poderoso==\n");

                    break;
                case 4:
                    imprimir("==Numero de Fermat==\n");

                    break;
                case 5:
                    imprimir("==Numero de Mersenne==\n");

                    break;
                case 6:
                    imprimir("==Numero Figurado (Triangulares, Cuadrados, Pentagonales).==");
                    break;
                case 7:
                    imprimir("Hasta Luego! :D");
                    break;
                default:
                    imprimir("opcion incorrecta\n");
            }


        }while(opcion!=7);
    }

    /**
     * este metodo imprime con salto de linea
     * @param frase
     */
    public static void imprimir(String frase){
        System.out.println(frase);
    }

    /**
     * este metodo imprime sin salto de linea
     * @param frase
     */
    public static void imprimirSinSalto(String frase){
        System.out.print(frase);
    }

    /**
     * este metodo imprime formateado
     * @param frase
     */
    public static void imprimirFormat(String frase){
        System.out.printf(frase);
    }

}
