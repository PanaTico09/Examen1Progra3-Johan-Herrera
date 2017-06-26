package examenprogra3;

import da.ListaDoble;

public class ExamenProgra3 {

    public static void main(String[] args) {
        ListaDoble jugadores = new ListaDoble();
        /*  Crea y añade los jugadores jugadores de Chile y los titulares de España.   */
        jugadores.agregar(27, "Claudio Bravo", "Chile", "Portero", true, null); //1c
        jugadores.agregar(29, "Iker Casillas", "España", "Portero", true, null); //1
        jugadores.agregar(27, "Waldo Ponce", "Chile", "Defensa", true, null);   //2c
        jugadores.agregar(23, "Gerard Piqué", "España", "Defensa", true, "Jean Beausejour"); //2
        jugadores.agregar(22, "Gary Medel", "Chile", "Defensa", true, null); //3c
        jugadores.agregar(32, "Charles Puyol", "España", "Defensa", true, "Mark Gonzales"); //3
        jugadores.agregar(21, "Mauricio Isla", "Chile", "Defensa", true, null);//4c
        jugadores.agregar(32, "Joan Capdevila", "España", "Defensa", true, "Alexis Sanchez");//4
        jugadores.agregar(24, "Gonzalo Jara", "Chile", "Defensa", true, null);//5c
        jugadores.agregar(24, "Sergio Ramos", "España", "Defensa", true, "Alexis Sanchez");//5
        jugadores.agregar(23, "Arturo Vidal", "Chile", "Mediocampista", true, null);//6c
        jugadores.agregar(26, "Andres Iniesta", "España", "Mediocampista", true, "Marco Estrada");//6
        jugadores.agregar(26, "Jorge Valdivia", "Chile", "Mediocampista", false, null);//7c
        jugadores.agregar(30, "Xavi Hernandez", "España", "Mediocampista", true, "Gonzalo Jara");//7
        jugadores.agregar(27, "Marco Estrada", "Chile", "Mediocampista", true, null);//8c
        jugadores.agregar(28, "Xabi Alonso", "España", "Mediocampista", true, "Waldo Ponce");//8
        jugadores.agregar(21, "Alexis Sanchez", "Chile", "Delantero", true, null);//9c
        jugadores.agregar(21, "Sergio Busquets", "España", "Mediocampista", true,"Marco Estrada");//9
        jugadores.agregar(25, "Mark Gonzalez", "Chile", "Mediocampista", true, null);//10c
        jugadores.agregar(28, "David Villa", "España", "Delantero", true,"Gary Medel");//10
        jugadores.agregar(26, "Jean Beausejour", "Chile", "Delantero", true, null);//11c
        jugadores.agregar(26, "Fernando Torres", "España", "Delantero", true, "Mauricio Isla");//11
        jugadores.agregar(28, "Rodrigo Millar", "Chile", "Mediocampista", false, null);//12c
        jugadores.agregar(24, "Fabian Orellana", "Chile", "Delantero", false, null);//13c
        jugadores.agregar(29, "Esteban Paredes", "Chile", "Delantero", false, null);//14c
        jugadores.agregar(26, "Miguel Pinto", "Chile", "Portero", false, null);//15c
        jugadores.agregar(27, "Luis Marin", "Chile", "Portero", false, null);//16c
        jugadores.agregar(28, "Ismael Fuentes", "Chile", "Defensa", false, null);//17c
        jugadores.agregar(31, "Pablo Contreras", "Chile", "Defensa", false, null);
        jugadores.agregar(27, "Gonzalo Fierro", "Chile", "Mediocampista", false, null);
        jugadores.agregar(30, "Rodrigo Tello", "Chile", "Mediocampista", false, null);
        jugadores.agregar(29, "Humberto Suazo", "Chile", "Delantero", true, null);
        jugadores.agregar(23, "Carlos Carmona", "Chile", "Mediocampista", false, null);
        jugadores.agregar(24, "Matias Fernandez", "Chile", "Mediocampista", false, null);

        /* Crea la lista de jugadores titulares y los ordena por la edad de forma ascendente.*/
        ListaDoble titularesPorEdad = jugadores.listaChileTitulares(jugadores);
        /* Crea la lista de los Jugadores de Chile. */
        ListaDoble jugadoresChile = jugadores.listaChileConvocados(jugadores);
        /* Crea la lista de los Jugadores españoles ordenados por posicion.*/
        ListaDoble ordenadoporPosicion = jugadores.listaEspaña(jugadores);

        System.out.println("Lista de Jugadores: \n" + jugadores.toString());

        System.out.println("Lista de Titulares Ordenada por Edad (Con Suazo) \n" + "Equipo de Chile: \n" + titularesPorEdad.toString());

        /* Elimina a SUAZO DE LOS CONVOCADOS por LESION.*/
        jugadores.eliminar("Humberto Suazo");
        jugadoresChile.eliminar("Humberto Suazo");
        titularesPorEdad.eliminar("Humberto Suazo");

        /* JUGADOR SOLICITADO POR LESION DE SUAZO */
        jugadores.agregar(27, "Mauricio Pinilla", "Chile", "Delantero", true, null);
        jugadoresChile.agregarPorEdad(27, "Mauricio Pinilla", "Chile", "Delantero", true);
        titularesPorEdad.agregarPorEdad(27, "Mauricio Pinilla", "Chile", "Delantero", true);

        System.out.println("Lista de Titulares Ordenada por Edad (Entra Pinilla)\n" + "Equipo de Chile: \n" + titularesPorEdad.toString());
        
        System.out.println(jugadoresChile.imprimirAlineacion(1, 4, 3, 3));

        System.out.println("Lista de Titulares Ordenada por Posicion \n" + "Equipo de España: \n" + ordenadoporPosicion.imprimirMarca());

        System.out.println("Tamaño de la lista de jugadores: " + jugadores.size());

        System.out.println("Tamaño de la lista ordenada de Chile: " + titularesPorEdad.size());

        System.out.println("Tamaño de la lista ordenada de España: " + ordenadoporPosicion.size());

    }
}
