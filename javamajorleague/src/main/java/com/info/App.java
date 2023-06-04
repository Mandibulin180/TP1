package com.info;
import com.info.servicio.Menu.menu;
import com.info.servicio.Menu.impl.menuImpl;


/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        menu Menu = new menuImpl();
        Menu.menuPrincipal();
    }
}
