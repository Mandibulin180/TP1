package com.info.servicio.Entrenador.impl;

import com.info.domain.Entrenador;
import com.info.servicio.Entrenador.EntrenadorService;
import com.info.servicio.entrada.console.inputService;

public class EntrenadorServiceImpl implements EntrenadorService {
    
    public static void main(String[] args) {
        // esta declaracion de service, guardarla en una variable y luego asignarla al objeto
        EntrenadorService entrenadorayuda = new EntrenadorServiceImpl();
        Entrenador entrenador = entrenadorayuda.crearEntrenador();
        System.out.println(entrenador.getNombre());
        System.out.println(entrenador.getApellido());
        System.out.println(entrenador.getEdad());
        

    } 

    
    @Override
    public Entrenador crearEntrenador(){
        Entrenador entrenador = new Entrenador();
        System.out.println("AHORA SE INGRESARA EL ENTRENADOR");
        inputService.getScanner().nextLine();
        System.out.print("INGRESE NOMBRE DEL ENTRENADOR: ");
        entrenador.setNombre(inputService.getScanner().nextLine());
        System.out.print("INGRESE APELLIDO DEL ENTRENADOR: ");
        entrenador.setApellido(inputService.getScanner().nextLine());
        System.out.print("INGRESE EDAD DEL ENTRENADOR: ");
        entrenador.setEdad(inputService.getScanner().nextInt());

        return entrenador;
    }
}
