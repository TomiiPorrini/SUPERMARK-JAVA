package supermark;

import java.util.Scanner;

public class Principal{

    public void menu_cliente() {
        Scanner input = new Scanner(System.in);

        System.out.println("Seleccione una opcion: ");
        // opciones de menu
        System.out.println("**************************");
        System.out.println("1 -> Registrarse.");
        System.out.println("2 -> Iniciar Sesión.");
        System.out.println("3 -> Seleccionar productos a comprar.");
        System.out.println("4 -> Ver carrito.");
        System.out.println("5 -> Confirmar compra.");
        System.out.println("0 -> Salir del menú.");
        System.out.println("**************************");
        // terminan las opciones. se captura la seleccion e ingresa al menu.
        int opc = input.nextInt();
        switch (opc) {
            case 0:
                // Este es el unico caso en el que no se vuelve a llamar a menu_cliente()
                // ya que necesitamos finalice.
                break;
            case 1:
                // Hacer acciones necesarias para registrar usuario.
                menu_cliente();
                break;
            case 2:
                // Hacer acciones necesarias para inicio de sesion.
                menu_cliente(); //Esta llamada es para que sea recursivo.
                break;
            case 3:
                // Hacer acciones necesarias para seleccionar productos.
                menu_cliente();
                break;
            case 4:
                // Hacer acciones necesarias para ver carrito.
                menu_cliente();
                break;
            case 5:
                // Hacer acciones necesarias para confirmar compra.
                menu_cliente();
                break;
            default:
                System.out.println("Opcion incorrecta.");
                menu_cliente();
                break;
        }
        input.close();
    }
    public void menu_admin() {
        Scanner input = new Scanner(System.in);

        System.out.println("Seleccione una opcion: ");
        // opciones de menu
        System.out.println("**************************");
        System.out.println("1 -> Cargar Productos.");
        System.out.println("2 -> Modificar datos de productos cargados.");
        System.out.println("3 -> Ver todos los usuarios que realizaron compras.");
        System.out.println("4 -> Ver listado de productos seleccionados por el usuario.");
        System.out.println("0 -> Salir.");
        System.out.println("**************************");
        // terminan las opciones. se captura la seleccion e ingresa al menu.
        int opc = input.nextInt();
        switch (opc) {
            case 0:
                // Este es el unico caso en el que no se vuelve a llamar a menu_admin()
                // ya que necesitamos finalice.
                break;
            case 1:
                // Hacer acciones necesarias.
                menu_admin();
                break;
            case 2:
                // Hacer acciones necesarias.
                menu_admin(); //Esta llamada es para que sea recursivo.
                break;
            case 3:
                // Hacer acciones necesarias.
                menu_admin();
                break;
            case 4:
                // Hacer acciones necesarias.
                menu_admin();
                break;
            default:
                System.out.println("Opcion incorrecta.");
                menu_admin();
                break;
        }
        input.close();
    }
    public static void main(String[] args) {

    }
}
