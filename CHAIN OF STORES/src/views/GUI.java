package views;


import java.util.Scanner;

public class GUI {

    Scanner sc = new Scanner(System.in);

    public GUI() {
    }

    String menuForStore = """
            1. Agregar producto
            2. Ver articulo
            3. Ver todos los articulos
            4. Ver valor del inventario
            5. Registrar la venta de un articulo
            6. Volver al menu principal""";
    String mainMenu = """
            Diguite una opcion... (1,2)
            1. Crear nuevo almacen
            2. valor total del inventario de la cadena
            3. Entrar a una tienda
            4. Salir""";
    String waterMark = "CARLOS LOZANO 10/05/2022 © UPTC";


    public void showMenu() {
        System.out.println(mainMenu);
    }
    public void printWaterMark(){
        System.out.println(waterMark);
    }

    public int getOption(){
        return Integer.parseInt(sc.nextLine());
    }

    public void printMenuForStore( ) {
        System.out.println(menuForStore);
    }

    public String getMessage() {
        return sc.nextLine();
    }

    public void printMessage(String s) {
        System.out.println(s);
    }
}