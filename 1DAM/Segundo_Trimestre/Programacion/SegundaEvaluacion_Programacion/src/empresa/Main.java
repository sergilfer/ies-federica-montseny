package empresa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    //metodo que pide un numero
    private static int getNumber() {
        Integer number = null;
        while (number == null) {
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("debe introducir un numero");
            }
        }
        return number;
    }

    //metodo que pide un numero que sea positivo
    private static int getPositiveNumber(){
        System.out.println("introduce un numero mayor que 0");
        int number = scanner.nextInt();
        while (number < 1){
            System.out.println("debe introducir un numero mayor que 0");
            number = scanner.nextInt();
        }
        return number;
    }

    private static Employee employeeData(){
        System.out.println("introduzca el nombre");
        String name = scanner.next();
        System.out.println("introduzca los apellidos");
        String surname = scanner.next();
        System.out.println("introduzca el nif");
        String nif = scanner.next();
        System.out.println("introduzca el cargo");
        String rol = scanner.next();
        System.out.println("introduzca el codigo postal");
         int cp = scanner.nextInt();
         return new Employee(name,surname,nif,rol,cp);
    }
    private static Employee [] getEmployee(){
        System.out.println("cuantos empleados tiene el departamento");
        int number = getPositiveNumber();
        Employee [] employees = new Employee[number];
        for (int i = 0 ; i < employees.length ; i++){
            employees[i] = employeeData();
        }
        return employees;
    }
    private static Department departmentData(){
        System.out.println("introduzca el nombre del departamento");
        String departmentName = scanner.next();
        scanner.nextLine();
        Employee [] employees = getEmployee();
        return new Department(departmentName,employees);
    }
    public static void main(String[] args) {

    }
}
