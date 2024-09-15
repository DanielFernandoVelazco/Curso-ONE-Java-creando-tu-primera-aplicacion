import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion = 0;
        double transaccion = 0;
        double saldo = 18520;

        System.out.println("""

                ********************************************

                Nombre del cliente: David Gonzalez
                Tipo de cuenta: Cuenta Corriente
                Saldo Disponible: """ + saldo + "$" + """


                ********************************************
                """);

        while (opcion != 9) {

            System.out.println("""

                    *** Escribe el numero de la opcion deseada ***

                    1 - Consultar Saldo
                    2 - Retirar Dinero
                    3 - Depositar Dinero
                    9 - Salir

                    """);

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("\nSaldo disponible es de: " + saldo + "$");
                    break;

                case 2:
                    System.out.println("\n¿Cual es el monto que deseas retirar?");
                    transaccion = teclado.nextDouble();

                    if (transaccion > saldo) {
                        System.out.println("""

                                Se ha producido el siguiente error
                                *** Saldo es insuficiente ***

                                Intenta Nuevamente
                                """);
                    } else {
                        saldo -= transaccion;
                        System.out.println("""
                                *** Su Retiro Fue Exitoso ***

                                Su nuevo saldo es de: """ + saldo + "$" + """
                                \n
                                *** Gracias Por Preferirnos  ***
                                """);
                    }
                    break;

                case 3:
                    System.out.println("\n¿Cual es el monto que deseas depositar?");
                    transaccion = teclado.nextDouble();
                    saldo += transaccion;
                    System.out.println("""
                            *** Su Deposito Fue Exitoso ***

                            Su nuevo saldo es de: """ + saldo + "$" + """
                            \n
                            *** Gracias Por Preferirnos  ***
                            """);
                    break;
            }
        }

        System.out.println("""

                Finalizando el programa
                Gracias por usar nuestros servicios
                """);

        teclado.close();
    }
}