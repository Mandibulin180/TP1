package com.info.domain;

public class Entrenador extends Persona {
    private int edad;

    public Entrenador(){}
    public Entrenador(String nombre,String apellido,Integer edad){
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return  "Entrenador: "+
                "\nNombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nEdad: "+edad;
    }
}
