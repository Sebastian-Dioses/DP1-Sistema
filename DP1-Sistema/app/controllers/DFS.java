package controllers;

/**
 * Created by GUERRA on 31/10/2016.
 */
import java.io.FileNotFoundException;

/**
 *
 * @author JoseLuis
 */
public class DFS {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws FileNotFoundException {


        GestorCiudades gestor = new GestorCiudades("Extras/_plan_vuelo.txt", "Extras/_aeropuertos.OACI.txt", "Extras/_husos_horarios.txt");
        gestor.asignarPedidos("Extras/_pedidos_N.txt");
        gestor.imprimirCiudades();

    }

}