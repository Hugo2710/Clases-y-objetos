/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.y.objetos;
import Cuentas.CClientes;
import java.util.Scanner;

/**
 *
 * @author jutsu
 */
public class ClasesYObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CClientes cliente = new CClientes();
        Scanner teclado = new Scanner (System.in);
        //variables
        double deposito;
        double retiro;
        int num = 0;
        
        System.out.println( "Seleccione una opcion \n" + "l.Deposito \n" + "2.Retiro \n" + "3.Consulta de saldo \n" + "4.Ingresar nuevo usuario" );
        teclado.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("Introduzca el valor a depositar: ");
                deposito = teclado.nextInt();
                String mensaje;
                mensaje = "El total del deposito es: " + deposito;
                System.out.println(mensaje);
            case 2:
                System.out.println("Introduzca el valor a retirar: ");
                retiro = teclado.nextInt();
                String mensaje2;
                mensaje2 = "El total del retiro es: " + retiro ;
                System.out.println(mensaje2);
            case 3:  
                mensaje 3= System.out.println("El saldo actual es:" + CClientes.contSaldo);
            case 4:
                System.out.println("Ingrese nuevo usuario");
                Cliente.setNombre(nombre = teclado.next());
            default:
                System.out.println("Opcion no valida");
                break;
            
    }
    }   
}
