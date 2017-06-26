package da;

public class ListaDoble {

    private Nodo cabeza;
    private int size;

    int cont1 = 0;//Contador Jug España
    int cont2 = 0;//Contador Jug Chile

    public ListaDoble() {
        this.cabeza = null;
        this.size = 0;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * <h1>estaVacio</h1>
     * Si cabeza = null Lista se encuentra vacia.
     *
     * @return cabeza == null
     */
    public boolean estaVacio() {
        return cabeza == null;
    }

    public int size() {
        return size;
    }

    /**
     * <h1> agregar</h1>
     * Agrega los jugadores a la lista. Verifica si la lista se encuentra vacia.
     * Sino añade al jugador despues del ultimo ingresado.
     *
     * @param edad
     * @param nombre
     * @param seleccion
     * @param posicion
     * @param convocado 
     * @param marca 
     * @return boolean con el resultado de la operacion.
     */
    public boolean agregar(int edad, String nombre, String seleccion, String posicion, boolean convocado, String marca) {
        Jugador miJugador = new Jugador(edad, nombre, seleccion, posicion, convocado, marca);                  //Crea la instancia de un jugador.
        Nodo nuevo = new Nodo(miJugador);                                                               //Crea un nuevo nodo con los datos del jugador.

        if (null == cabeza) {   //Si la lista esta vacía.
            if (seleccion.equalsIgnoreCase("España")) {
                cont1++;
            } else if (seleccion.equalsIgnoreCase("Chile")) {
                cont2++;
            } else if (!seleccion.equalsIgnoreCase("España") || !seleccion.equalsIgnoreCase("Chile")) {
                System.err.println("No se pueden añadir jugadores a países diferentes de España o Chile.");
                return false;
            }
            cabeza = nuevo; //Agrega al primer Jugador.
        } else {
            Nodo aux = cabeza;
            while (aux.getSiguiente() != null) { //Recorre la lista hasta el final
                aux = aux.getSiguiente();        //Avanza en la lista posicion a posicion.
            }
            if (seleccion.equalsIgnoreCase("España")) {
                cont1++;
            } else if (seleccion.equalsIgnoreCase("Chile")) {
                cont2++;
            } else if (!seleccion.equalsIgnoreCase("España") || !seleccion.equalsIgnoreCase("Chile")) { //Valida la insercion de jugadores a los paises correspondientes.
                System.err.println("No se pueden añadir jugadores a países diferentes de España o Chile.");
                return false;
            }
            if (cont1 <= 11 && seleccion.equalsIgnoreCase("España") || cont2 <= 23 && seleccion.equalsIgnoreCase("Chile")) { //Valida la cantidad de jugadores añadidos en cada equipo.
                aux.setSiguiente(nuevo);
                nuevo.setAnterior(aux);
            } else {
                System.err.println("No se pueden convocar más jugadores.");
                return false;
            }
        }
        size++;
        return true;
    }

    /**
     * <h1> agregarAlInicio </h1>
     * Añade el jugador al inicio de la lista.
     *
     * @param edad
     * @param nombre
     * @param seleccion
     * @param posicion
     * @param convocado
     * @param marca
     * @return boolean con el resultado de la operacion.
     */
    public boolean agregarAlInicio(int edad, String nombre, String seleccion, String posicion, boolean convocado, String marca) {
        Jugador miJugador = new Jugador(edad, nombre, seleccion, posicion, convocado, marca);
        Nodo nuevo = new Nodo(miJugador);
        if (estaVacio()) { //Si la lista esta vacía.
            if (seleccion.equalsIgnoreCase("España")) {
                cont1++;
            } else if (seleccion.equalsIgnoreCase("Chile")) {
                cont2++;
            } else if (!seleccion.equalsIgnoreCase("España") || !seleccion.equalsIgnoreCase("Chile")) {
                System.err.println("No se pueden añadir jugadores a países diferentes de España o Chile.");
                return false;
            }
            cabeza = nuevo;
        } else { //Agrega el nuevo Nodo al inicio de la lista.
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
        }
        size++;
        return true;
    }

    /**
     * <h1> agregarPorEdad </h1>
     * Verifica si la lista se encuentra vacia de ser asi lo añade al jugador al
     * inicio. Sino verifica si la edad del jugador que se desea ingresar es
     * menor que la del jugador inicial. Sino recorre la lista y verifica si el
     * jugador que se desea ingresar es menor que el siguiente. De ser asi lo
     * añade antes del mismo, sino lo añade despues.
     *
     * @param edad
     * @param nombre
     * @param seleccion
     * @param posicion
     * @param convocado
     */
    public void agregarPorEdad(int edad, String nombre, String seleccion, String posicion, boolean convocado) {
        Jugador miJugador = new Jugador(edad, nombre, seleccion, posicion, convocado);
        Nodo nuevo = new Nodo(miJugador);
        if (estaVacio()) {                                                      //Verifica si esta vacio. De ser asi lo añade.   
            agregarAlInicio(edad, nombre, seleccion, posicion, convocado, null);
        } else if (miJugador.getEdad() < cabeza.getDatos().getEdad()) {         //Verifica si el jugador es menor que el primero en la lista. De ser asi lo añade.
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
            size++;
        } else {
            Nodo aux = cabeza;
            Nodo aux2 = cabeza.getSiguiente();
            while (aux2 != null) {
                if (miJugador.getEdad() < aux2.getDatos().getEdad()) {          //Verifica si es menor que el siguiente de ser asi termina el ciclo.        
                    break;
                }
                aux = aux2;
                aux2 = aux2.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());                             //Lo añade.    
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
            size++;
        }
    }
    
    /**
     * <h1>agregarPorPosicion</h1>
     * Verifica si el jugador es un Portero de ser asi lo añade al inicio. Sino
     * verifica si el jugador es un defensa, mediocampista o delantero y lo
     * añade como corresponde.
     *
     * @param edad
     * @param nombre
     * @param seleccion
     * @param posicion
     * @param convocado
     * @param marca
     */
    public void agregarPorPosicion(int edad, String nombre, String seleccion, String posicion, boolean convocado, String marca) {
        Jugador miJugador = new Jugador(edad, nombre, seleccion, posicion, convocado, marca);
        Nodo nuevo = new Nodo(miJugador);
        if (estaVacio()) {                                                      //Verifica si esta vacio. De ser asi lo añade.   
            agregarAlInicio(edad, nombre, seleccion, posicion, convocado, null);
        } else if (convertirInt(posicion) < convertirInt(cabeza.getDatos().getPosicion())) {//Verifica si el jugador es de una posicion "menor" que el primero en la lista. De ser asi lo añade.
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
            size++;
        } else {
            Nodo aux = cabeza;
            Nodo aux2 = cabeza.getSiguiente();
            while (aux2 != null) {
                if (convertirInt(posicion) < convertirInt(aux2.getDatos().getPosicion())) { //Verifica si el jugador es de una posicion "menor" que el siguiente de ser asi termina el ciclo.        
                    break;
                }
                aux = aux2;
                aux2 = aux2.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());                             //Lo añade.    
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
            size++;
        }
    }
   
    public int convertirInt(String posicion) {
        int pos = 0;
        switch (posicion) {
            case "Portero":
                pos = 0;
                break;
            case "Defensa":
                pos = 1;
                break;
            case "Mediocampista":
                pos = 2;
                break;
            case "Delantero":
                pos = 3;
                break;
        }  
        return pos;
    }                        

    /**
     * <h1> imprimirAlineacion</h1>
     * Verifica que la formacion corresponda a 11 jugadores, tenga 1 portero y
     * no mas de 5 defensas, mediocampista o delanteros. Recorre la lista hasta
     * que encuentre el jugador que se ocupa para cada posicion. Y añade al
     * String el nombre del jugador.
     *
     * @param portero
     * @param defensa
     * @param medio
     * @param delantero
     * @return String con la alineacion que corresponde.
     */
    public String imprimirAlineacion(int portero, int defensa, int medio, int delantero) {
        int formacion = portero + defensa + medio + delantero;
        String alineacion;

        if (formacion > 11 || formacion < 11) {
            alineacion = "La lista debe tener 11 jugadores.";
        } else if (portero > 1) {
            alineacion = "Solo puede haber un portero dentro del terreno de juego.";
        } else if (portero < 1) {
            alineacion = "Debe tener al menos un portero.";
        } else if (defensa > 5 || medio > 5 || delantero > 5) {
            alineacion = "Solo pueden haber 5 un maximo de 5 por posicion.";
        } else if (defensa < 1 || medio < 1 || delantero < 1) {
            alineacion = "Debe haber minimo un jugador por posicion.";
        } else {
            Nodo aux = cabeza;
            while (!aux.getDatos().getPosicion().equalsIgnoreCase("Portero")) {    //Si encuentra un portero lo añade a la Alineacion.
                aux = aux.getSiguiente();
            }
            alineacion = " Formacion del Equipo: " + defensa + " - " + medio + " - " + delantero + "\n" + "                   " + aux.getDatos().getNombre() + "\n"; //Añade nombre al String
            int cont = 0;
            aux = cabeza;
            while (aux.getSiguiente() != null) {
                while (cont < defensa) {                                                //Hasta que añada la cantidad de defensas solicitados.
                    if (!aux.getDatos().getPosicion().equalsIgnoreCase("Defensa")) {    //Si encuentra un defensa.
                        break;
                    }
                    alineacion += " " + aux.getDatos().getNombre();                    //Añade nombre al String.
                    aux = aux.getSiguiente();
                    cont++;
                }
                aux = aux.getSiguiente();
            }
            alineacion += "\n";
            cont = 0;
            aux = cabeza;

            while (aux.getSiguiente() != null) {
                while (cont < medio) {                                                      //Hasta que añada la cantidad de medios solicitados.
                    if (!aux.getDatos().getPosicion().equalsIgnoreCase("Mediocampista")) {  //Si encuentra un mediocampista.
                        break;
                    }
                    alineacion += " " + aux.getDatos().getNombre();                        //Añade nombre al String.
                    aux = aux.getSiguiente();
                    cont++;
                }
                aux = aux.getSiguiente();
            }
            alineacion += "\n";
            cont = 0;
            aux = cabeza;

            while (aux.getSiguiente() != null) {
                while (cont < delantero) {                                              //Hasta que añada la cantidad de delanteros solicitados.
                    if (!aux.getDatos().getPosicion().equalsIgnoreCase("Delantero")) {  //Si encuentra un Delantero.
                        break;
                    }
                    alineacion += " " + aux.getDatos().getNombre();                     //Añade Nombre al String.
                    aux = aux.getSiguiente();
                    cont++;
                }
                aux = aux.getSiguiente();
            }
        }
        return alineacion + "\n";
    }

    /**
     * <h1>listaChileTitulares</h1>
     * Recorre la lista y añade los jugadores que tengan el booleano convocado =
     * true y que pertenezcan a la seleccion Chilena.
     *
     * @param lista
     * @return ListaDoble con los jugadores titulares.
     */
    public ListaDoble listaChileTitulares(ListaDoble lista) {
        ListaDoble listaOrdenada = new ListaDoble();
        Nodo aux = lista.cabeza;

        while (aux.getSiguiente() != null) {
            Jugador miJugador = new Jugador(aux.getDatos().getEdad(), aux.getDatos().getNombre(), aux.getDatos().getSeleccion(), 
                                            aux.getDatos().getPosicion(), aux.getDatos().isConvocados(), aux.getDatos().getMarca());
            if (aux.getDatos().isConvocados() == true && aux.getDatos().getSeleccion().equalsIgnoreCase("Chile")) {
                listaOrdenada.agregarPorEdad(miJugador.getEdad(), miJugador.getNombre(), miJugador.getSeleccion(), miJugador.getPosicion(), miJugador.isConvocados());
            }
            aux = aux.getSiguiente();
        }
        return listaOrdenada;
    }

    /**
     * <h1>listaChileConvocados</h1>
     * Recorre la lista y añade los jugadores pertenicientes a la seleccion
     * Chilena.
     *
     * @param lista
     * @return ListaDoble con todos los jugadores de Chile que fueron
     * convocados.
     */
    public ListaDoble listaChileConvocados(ListaDoble lista) {
        ListaDoble listaOrdenada = new ListaDoble();
        Nodo aux = lista.getCabeza();
        while (aux.getSiguiente() != null) {
            Jugador miJugador = new Jugador(aux.getDatos().getEdad(), aux.getDatos().getNombre(), aux.getDatos().getSeleccion(), 
                                            aux.getDatos().getPosicion(), aux.getDatos().isConvocados(), aux.getDatos().getMarca());
            if (aux.getDatos().getSeleccion().equalsIgnoreCase("Chile")) {
                listaOrdenada.agregar(miJugador.getEdad(), miJugador.getNombre(), miJugador.getSeleccion(), miJugador.getPosicion(), miJugador.isConvocados(),miJugador.getMarca());
            }
            aux = aux.getSiguiente();
        }
        return listaOrdenada;
    }

    /**
     * <h1>listaEspaña</h1>
     * Recorre la lista y añade los jugadores pertenicientes a la seleccion
     * Española.
     *
     * @param lista
     * @return ListaDoble con todos los jugadores de España.
     */
    public ListaDoble listaEspaña(ListaDoble lista) {
        ListaDoble listaOrdenada = new ListaDoble();
        
        Nodo aux = lista.getCabeza();
        while (aux.getSiguiente() != null) {
            Jugador miJugador = new Jugador(aux.getDatos().getEdad(), aux.getDatos().getNombre(), aux.getDatos().getSeleccion(), 
                                            aux.getDatos().getPosicion(), aux.getDatos().isConvocados(), aux.getDatos().getMarca());
            if (aux.getDatos().isConvocados() == true && aux.getDatos().getSeleccion().equalsIgnoreCase("España")) {
                listaOrdenada.agregarPorPosicion(miJugador.getEdad(), miJugador.getNombre(), miJugador.getSeleccion(), 
                                                 miJugador.getPosicion(), miJugador.isConvocados(), miJugador.getMarca());
            }
            aux = aux.getSiguiente();
        }
        return listaOrdenada;
    }

    /**
     * <h1>eliminar</h1>
     * Recorre la lista y verifica si el nombre del jugador que se desea
     * eliminar se encuentra en la cabeza, de ser asi se elimina el jugador,
     * caso contrario se sigue recorriendo la lista hasta encontrarlo y
     * eliminarlo. Si el dato se encuentra en la ultima posicion de la lista se
     * elimina la conexion que tenia el anterior con el mismo. Si el dato no se
     * encuentra se termina la busqueda.
     *
     * @param dato
     * @return boolean con el resultado de la operacion.
     */
    public boolean eliminar(String dato) {
        Nodo aux = cabeza;
        int cont = 1;
        while (aux.getSiguiente() != null) {
            if (aux.getDatos().getNombre().equalsIgnoreCase(dato) && aux == cabeza) {   //Se verifica si el dato se encuentra en la cabeza.
                if (aux.getDatos().getSeleccion().equalsIgnoreCase("España")) {
                    cont1--;
                } else if (aux.getDatos().getSeleccion().equalsIgnoreCase("Chile")) {
                    cont2--;
                }
                cabeza = cabeza.getSiguiente();                                     //Se elimina la conexion que tenia el primer Jugagor con el segundo y se reduce el tamaño de la lista.
                size--;
                break;
            } else if (aux.getDatos().getNombre().equalsIgnoreCase(dato)) {         //Se elimina la conexion que tenia el Jugador anterior y se le dice cual va a ser el jugador siguiente.
                if (aux.getDatos().getSeleccion().equalsIgnoreCase("España")) {
                    cont1--;
                } else if (aux.getDatos().getSeleccion().equalsIgnoreCase("Chile")) {
                    cont2--;
                }
                aux.getAnterior().setSiguiente(aux.getSiguiente());
                aux.getSiguiente().setAnterior(aux.getAnterior());
                size--;
                break;
            } else if (!aux.getDatos().getNombre().equalsIgnoreCase(dato) && cont == size) {    //No se encontro el dato en la lista.
                System.err.println("El Jugador que desea borrar no se encuentra en la lista.");
                return false;
            }
            aux = aux.getSiguiente();
            cont++;
        }
        Nodo aux2 = cabeza;
        while (aux2.getSiguiente() != null) { //Recorre la lista
            aux2 = aux2.getSiguiente();
        }
        if (aux2.getDatos().getNombre().equalsIgnoreCase(dato)) {   //En caso de ser el ULTIMO NODO. Se le dice al Jugador anterior que el nodo siguiente es un nulo es decir termina la lista.
            if (aux.getDatos().getSeleccion().equalsIgnoreCase("España")) {
                cont1--;
            } else if (aux.getDatos().getSeleccion().equalsIgnoreCase("Chile")) {
                cont2--;
            }
            aux2.setSiguiente(null);
            size--;
        }
        return true;
    }
    /**
     * <h1>imprimirMarca</h1>
     * Recorre la lista y añade los jugadores al String para ser mostrados. Ademas de incluirle la marca.
     * @return String que contiene la lista de los jugadores con la marca respectiva.
     */
    public String imprimirMarca() {
        StringBuilder builder = new StringBuilder();
        builder.append(" - ");

        Nodo aux = cabeza;
        int cont = 0;

        while (cont < size) {
            builder.append(aux.getDatos().getNombre()).append(" / ").append(aux.getDatos().getEdad()).append(" / ").append(aux.getDatos().getSeleccion()).
                           append(" / ").append(aux.getDatos().getPosicion()).append(" / ").append("Marca a: ").append(aux.getDatos().getMarca()).append(" \n");
            builder.append(" - ");
            ++cont;
            aux = aux.getSiguiente();
        }
        builder.append("\n");
        return builder.toString();
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" - ");

        Nodo aux = cabeza;
        int cont = 0;

        while (cont < size) {
            builder.append(aux.getDatos().getNombre()).append(" / ").append(aux.getDatos().getEdad()).append(" / ").append(aux.getDatos().getSeleccion()).
                           append(" / ").append(aux.getDatos().getPosicion()).append(" / ").append(" \n");
            builder.append(" - ");
            ++cont;
            aux = aux.getSiguiente();
        }
        builder.append("\n");
        return builder.toString();
    }
}
