/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

import NUMERO.Numero;
import java.io.IOException;

/**
 *
 * @author dam
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Parking artesano;
        int opcion;
       Numero n = new Numero();
        artesano = new Parking(5);//Crea Array. [100]/[X]
        artesano.inicializarPlazas();
        menu();
        
        opcion = n.pedirNumero("", 1, 4);
        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    artesano.entrada();
                    break;
                case 2:
                    artesano.salida();
                    break;
                case 3:
                    artesano.estadoParking();
                    break;
            }
            menu();
        opcion=n.pedirNumero("", 1, 4);
        }
        artesano.estadoParking();
    
       
        
    
        
    }
    

    public static void menu() {
        System.out.println("------------------");
        System.out.println("1.Entrada");
        System.out.println("2.Salida");
        System.out.println("3.Estado");
        System.out.println("4.Fin");
        System.out.println("Pulse opción");
        System.out.println("------------------");
    }
}

