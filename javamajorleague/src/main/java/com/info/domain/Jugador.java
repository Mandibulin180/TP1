package com.info.domain;

import java.util.UUID;

public class Jugador extends Persona {
    private UUID identificador;
    private Float altura;
    private String posicionQueJuega;
    private Integer cantidadDeGoles;
    private Integer cantidadDePartidos;
    private Boolean esCapitan;
    private Integer dorsal;
    private Equipo equipo;

    public Jugador(){}
    public Jugador(String nombre,String apellido,Float altura, String posicionQuejuega, Integer cantidadDeGoles,Integer cantidadDePartidos,Boolean esCapitan,Integer dorsal, Equipo equipo){
        setIdentificador(UUID.randomUUID());
        setNombre(nombre);
        setApellido(apellido);
        setAltura(altura);
        setEsCapitan(esCapitan);
        setPosicionQueJuega(posicionQuejuega);
        setCantidadDeGoles(cantidadDeGoles);
        setCantidadDePartidos(cantidadDePartidos);
        setDorsal(dorsal);
        setEquipo(equipo);
        if(equipo!=null){
            equipo.getJugadores().add(this);
        }
    }
    @Override
    public String toString() {
        return  "\nJUGADOR"+
                "\n NOMBRE: "+getNombre()+
                "\n APELLIDO: "+getApellido()+
                "\n ALTURA: "+altura+
                "\n POSICION EN LA QUE JUEGA: "+posicionQueJuega+
                "\n CANTIDAD DE GOLES ANOTADOS: "+cantidadDeGoles+
                "\n CANTIDAD DE PARTIDOS JUGADOS: "+cantidadDePartidos+
                "\n DORSAL: "+dorsal+
                "\n ES CAPITAN ?: "+esCapitan+
                "\n EQUIPO: "+equipo.getNombre();
    }


    public void setAltura(Float altura) {
        this.altura = altura;
    }
    public void setCantidadDeGoles(Integer cantidadDeGoles) {
        this.cantidadDeGoles = cantidadDeGoles;
    }
    public void setCantidadDePartidos(Integer cantidadDePartidos) {
        this.cantidadDePartidos = cantidadDePartidos;
    }
    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    public void setEsCapitan(Boolean esCapitan) {
        this.esCapitan = esCapitan;
    }
    public void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }
    public void setPosicionQueJuega(String posicionQueJuega) {
        this.posicionQueJuega = posicionQueJuega;
    }
    public Float getAltura() {
        return altura;
    }
    public Integer getCantidadDeGoles() {
        return cantidadDeGoles;
    }
    public Integer getCantidadDePartidos() {
        return cantidadDePartidos;
    }
    public Integer getDorsal() {
        return dorsal;
    }
    public Equipo getEquipo() {
        return equipo;
    }
    public Boolean getEsCapitan() {
        return esCapitan;
    }
    public UUID getIdentificador() {
        return identificador;
    }
    public String getPosicionQueJuega() {
        return posicionQueJuega;
    }
}
