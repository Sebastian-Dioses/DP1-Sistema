package model;

/**
 * Created by GUERRA on 31/10/2016.
 */

import java.util.ArrayList;

public class ConjRutas {
    public ArrayList<Ruta> vuelos = new ArrayList<>();
    public int tiempo=0;
    ConjRutas(){

    }
    public ConjRutas(Ruta vuel, int tiemp){
        vuelos.add(vuel);
        tiempo=tiemp;
    }

    public ConjRutas(Ruta vuel1, Ruta vuel2,int tiemp){
        vuelos.add(vuel1);
        vuelos.add(vuel2);
        tiempo=tiemp;
    }
    public void print(){
        //for(int i=0;i<vuelos.size();i++){
        //System.out.print(vuelos.get(i).getAeroOrig().getCodAeropuerto()+"-"+
        //              vuelos.get(i).getAeroFin().getCodAeropuerto()+"/");
        //}
        System.out.println(" Tiempo: "+tiempo);
    }
}

