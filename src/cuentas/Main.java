/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package cuentas;


public class Main {

    public static void main(String[] args) {
        operativa_cuenta(0, 2300);
        operativa_cuenta(1, 695);
    }

    private static void operativa_cuenta(int operacion, float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        // Accedemos al saldo con el método getter correspondiente
        // saldoActual = cuenta1.estado();
        saldoActual = cuenta1.getSaldo();
        System.out.println("El saldo actual es"+ saldoActual );

        if (operacion == 0) {
            try {
                cuenta1.retirar(cantidad);
            } catch (Exception e) {
                System.out.print("Fallo al retirar");
            }
        } else {
            try {
                System.out.println("Ingreso en cuenta");
                cuenta1.ingresar(cantidad);
            } catch (Exception e) {
                System.out.print("Fallo al ingresar");
            }
        }
    }
    
}
