package com.info;

import com.info.servicio.Menu.menu;
import com.info.servicio.Menu.impl.menuImpl;
import com.info.bootstrap.BootstrapData;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        BootstrapData.initEquipos();
        menu Menu = new menuImpl();
        Menu.menuPrincipal(); 
     }
}
