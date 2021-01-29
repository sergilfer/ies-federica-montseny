package Banco;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    private static void menu(String banco) {
        System.out.println("*******************************MENU*******************************");
        System.out.println("Hola, bienvenido al sistema de tu: " + banco + ".");
        System.out.println("1. Para mostrar nombre, apelidos y NIF de los clientes.");
        System.out.println("2. Para mostrar la informacion de las cuentas de un clientes.");
        System.out.println("3. Para mostrar la informacion de una cuenta de un cliente.");
        System.out.println("4. Para ingresar dinero en la cuenta de un cliente.");
        System.out.println("5. Para sacar dinero de la cuenta de un cliente.");
        System.out.println("6. Realizar un traspaso entre las cuentas de un mismo cliente.");
        System.out.println("7. Realizar una transferencia entre dos cuentas de dos clientes");
        System.out.println("8. Para imprimir los datos del cliente que tiene una cuenta.");
        System.out.println("9. Para realizar una transferencia entre dos cuentas.");
        System.out.println("0. Salir");
        System.out.println("******************************************************************");

    }

    private static Cuenta pideCuenta() {
        System.out.println("introduce un numero de cuenta");
        String number = scan.nextLine();
        scan.next();
        System.out.println("introduce el saldo disponible");
        Double saldo = scan.nextDouble();
        scan.nextLine();

        return new Cuenta(number, saldo);
    }

    private static Cuenta[] pideCuentas() {
        System.out.println("introduce numero de cuentas");
        int cantidad = scan.nextInt();

        while (cantidad < 1) {
            System.out.println("la cantidad debe ser mayor que 0");
            cantidad = scan.nextInt();
            scan.nextLine();
        }
        Cuenta[] cuentas = new Cuenta[cantidad];

        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i] = pideCuenta();
        }
        return cuentas;
    }

    private static Cliente pideCliente() {
        System.out.println("introduce nombre del cliente");
        String nombre = scan.nextLine();
        System.out.println("introduce primer apellido");
        String apellido1 = scan.nextLine();
        System.out.println("introduce segundo apellido");
        String apellido2 = scan.nextLine();
        System.out.println("introduce el NIF del cliente");
        String NIF = scan.nextLine();
        Cuenta[] cuentas = pideCuentas();

        return new Cliente(nombre, apellido1, apellido2, NIF, cuentas);
    }

    private static Cliente[] pideClientes() {
        System.out.println("introduce cuantos clientes hay en el banco");
        int cantidad = scan.nextInt();
        scan.nextLine();
        Cliente[] clientes = new Cliente[cantidad];

        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = pideCliente();
        }
        return clientes;
    }

    private static Banco pideBanco() {
        System.out.println("introduce el nombre del banco");
        String nombre = scan.nextLine();
        Cliente[] clientes = pideClientes();

        return new Banco(nombre, clientes);
    }

    private static int operacion(String banco) {
        menu(banco);
        int op = scan.nextInt();
        scan.nextLine();

        while (op < 1 || op > 9) {
            System.out.println("operacion invalida");
            menu(banco);
            op = scan.nextInt();
            scan.nextLine();
        }
        return op;
    }

    public static void main(String[] args) {
        Banco banco = pideBanco();
        int op = 0;
        String dni, numeroCuenta, origen, destino, dniOrigen, dniDestino;
        double dinero;
        do {


            op = operacion(banco.getNombre());

            switch (op) {
                case 0:
                    System.out.println("ha finalizado con exito");
                    break;
                case 1:
                    banco.infoClientes();
                    break;
                case 2:
                    System.out.println("introduce el dni del cliente");
                    dni = scan.nextLine();
                    banco.imprimirClientes(dni);
                    break;
                case 3:
                    System.out.println("introduce el dni del cliente");
                    dni = scan.nextLine();
                    System.out.println("introduce el numero de cuenta");
                    numeroCuenta = scan.nextLine();
                    banco.imprimeCuentaCliente(dni, numeroCuenta);
                    break;
                case 4:
                    System.out.println("introduce el dni del cliente");
                    dni = scan.nextLine();
                    System.out.println("introduce el numero de cuenta");
                    numeroCuenta = scan.nextLine();
                    System.out.println("introduce cuanta cantidad va a ingresar");
                    dinero = scan.nextDouble();
                    banco.ingresaDinero(numeroCuenta, dni, dinero);
                    break;
                case 5:
                    System.out.println("introduce el dni del cliente");
                    dni = scan.nextLine();
                    System.out.println("introduce el numero de cuenta");
                    numeroCuenta = scan.nextLine();
                    System.out.println("introduce cuanta cantidad va a ingresar");
                    dinero = scan.nextDouble();
                    banco.sacarDinero(dni, numeroCuenta, dinero);
                    break;
                case 6:
                    System.out.println("introduce el dni");
                    dniOrigen = scan.nextLine();
                    System.out.println("introduce el numero de cuenta origen");
                    origen = scan.nextLine();
                    System.out.println("introduce el numero de cuenta destino");
                    destino = scan.nextLine();
                    System.out.println("introduce la cantidad a transferir");
                    dinero = scan.nextDouble();
                    banco.traspasoDiner(origen, destino, dniOrigen, dinero);
                    break;
                case 7:
                    System.out.println("introduce el dni de origen");
                    dniOrigen = scan.nextLine();
                    System.out.println("introduce el dni de destino");
                    dniDestino = scan.nextLine();
                    System.out.println("introduce el numero de cuenta origen");
                    origen = scan.nextLine();
                    System.out.println("introduce el numero de cuenta destino");
                    destino = scan.nextLine();
                    System.out.println("introduce la cantidad a transferir");
                    dinero = scan.nextDouble();
                    banco.transferenciaDinero(dniOrigen, origen, dniDestino, destino, dinero);
                    break;
                case 8:
                    System.out.println("introduce el numero de cuenta");
                    numeroCuenta = scan.nextLine();
                    banco.printInfoClienteyCuenta(numeroCuenta);
                    break;
                case 9:
                    System.out.println("introduce el numero de cuenta origen");
                    origen = scan.nextLine();
                    System.out.println("introduce el numero de cuenta destino");
                    destino = scan.nextLine();
                    System.out.println("introduce la cantidad a transferir");
                    dinero = scan.nextDouble();
                    banco.tranferenciaCuentas(origen, destino, dinero);
                    break;
                default:
                    System.out.println("ha introducido una opcion invalida");
            }
        }while(op< 10);
    }
}
