package COD.soluciones.coches.controller;


import COD.soluciones.coches.model.Coche;


/**
 * Interfaz Observer
 */
public interface Observer {
    // metodo que se ejecutará cuando el objeto observado cambie
    void update(Coche arg);
}