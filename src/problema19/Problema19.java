/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema19;
import java.util.*;
/**
 *
 * @author jaime
 */
public class Problema19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,o;
        a=solicitarDato();
        o=operacion(a);  //se solicitan datos
        mensajeSalida();  // se hace la operacion
        
    }
    public static double solicitarDato(){
        int n;
        Scanner teclado= new Scanner (System.in);
        System.out.println("Introduce un angulo entre 1° y 360°: ");
        n= teclado.nextInt();
        return n;
    }
    public static double operacion(double a){
        double b = Math.toRadians(a);   //se hace la funcion de radianes para sacar el cos,sin,tan.
        System.out.println("El seno de " + a + "° es " + Math.sin(b) + "°");
        System.out.println("El coseno de " + a + "° es " + Math.cos(b) + "°");
        System.out.println("La tangente de " + a + "° es " + Math.tan(b) + "°");
        return b;
    }
    public static void mensajeSalida(){
        System.out.println("Gracias por usar el programa"); //se agradece
        System.exit(0);//Sale del programa
     }
}

