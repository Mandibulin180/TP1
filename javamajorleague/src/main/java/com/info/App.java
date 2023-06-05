package com.info;

import com.info.bootstrap.BootstrapData;
import com.info.servicio.Menu.menu;
import com.info.servicio.Menu.impl.menuImpl;
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        BootstrapData.initEquipos();
        menu Menu = new menuImpl();
        Menu.menuPrincipal(); 
     }
}
