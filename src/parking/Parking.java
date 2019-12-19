/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

/**
 *
 * @author dam
 */
public class Parking {
    String[]plazas;
    public Parking(){
        plazas=new String[100];//Establece el numero de plazas del parking(100).
    }
    public Parking(int numeroPlazas){
        plazas=new String[numeroPlazas];//Establece el numero de elementos a un numero determinado(INT numeroPlazas).   
    //No es necesario, pero es conveniente para probar el programa con menos numeros.
        
    }
    public void inicializarPlazas(){//for recorre todos los elementos.Hasta que la condición=false.
        //iguala el estado de todas las plazas a Libre.
        for(int nplaza=0;nplaza<plazas.length;nplaza++){//nplaza solo existe en esta iteración ya que solo esta definido aqui.
            plazas[nplaza]="Libre";
        }
        
    }
    public void estadoParking(){//Display de las plazas libres/ocupadas.
        int nplaza;
        plazas[1]="Ocupado";//Establece un valor en una posicion(1).
        System.out.println("Nºplaza Estado");
        for(nplaza=0;nplaza<plazas.length;nplaza++){
            System.out.println(nplaza+"-"+plazas[nplaza]);
        }
        
        
    }
    /**
     * BusquedaSecuencial. encuentra el primer valor igual a libre 
     * @return posicion donde se encuentra el primer valorigual a libre,-1 en caso de contrario
     */
    public int busquedaSecuencial(){
        int plaza=0;
        boolean encontrado;
        int nplaza=0;
        encontrado=false;
        while(!encontrado&&nplaza<plazas.length){
            if(plazas[nplaza].equalsIgnoreCase("Libre")){
                encontrado=true;
            }
            else{
                nplaza++;
            }
        }
        if(!encontrado){
            nplaza=-1;
        }
        return plaza;
    }
    public void entrada(){
        int nplaza;
        nplaza=busquedaSecuencial();
        if (nplaza==-1){
            System.out.println("Parking completo");
        }
        else{
            plazas[nplaza]="Ocupado";
            System.out.println("La plaza asignada es:"+nplaza);
        }
    }
}

