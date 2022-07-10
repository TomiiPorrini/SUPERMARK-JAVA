package supermark;

import java.util.Scanner;
import javax.security.auth.x500.X500Principal;

public class Principal{

    public static void menu_cliente(Usuario x) {
        Scanner input = new Scanner(System.in);
        System.out.println("Seleccione una opcion: ");
        // opciones de menu
        System.out.println("****************************************");
        System.out.println("1 -> Seleccionar productos a comprar.");
        System.out.println("2 -> Ver carrito.");
        System.out.println("3 -> Confirmar compra.");
        System.out.println("0 -> Cerrar Sesion.");
        System.out.println("****************************************");
        // terminan las opciones. se captura la seleccion e ingresa al menu.
        int opc = input.nextInt();
        switch (opc) {
            case 0:
                // Este es el unico caso en el que no se vuelve a llamar a menu_cliente()
                // ya que necesitamos finalice.
                System.out.println("Hasta luego, muchas gracias!");
                break;
            case 1:
                // Hacer acciones necesarias para seleccionar productos.
                //deberiamos hacer una funcion que nos envie todos los productos con un formato, quiza de tabla.
                PENDIENTE: ListarProductos().
                //seleccionar productos por medio del nombre.
                //array para guardar cada seleccion
                //controlar los stocks de los productos al seleccionar.
                //controlar el TOTAL de los productos seleccionados, menos que 30.

                menu_cliente(x);
                break;
            case 2:
                // Hacer acciones necesarias para ver carrito.
                //hacer esto
                // Detalle.ListaProd();
                menu_cliente(x);
                break;
            case 3:
                // Hacer acciones necesarias para confirmar compra.
                //prints
                Comprobante comprobante = Comprobante(tipo, fecha, total, x, TarjetaCredito, detalle);
                comprobante.ValidarCompra(x);
                menu_cliente(x);
                break;
            default:
                System.out.println("Opcion incorrecta.");
                menu_cliente(x);
                break;
        }
        input.close();
    }

    public static void menu_admin(Usuario x) {
        Scanner input = new Scanner(System.in);

        System.out.println("Seleccione una opcion: ");
        // opciones de menu
        System.out.println("**************************************************************");
        System.out.println("1 -> Cargar Productos.");
        System.out.println("2 -> Modificar datos de productos cargados.");
        System.out.println("3 -> Ver todos los usuarios que realizaron compras.");
        System.out.println("4 -> Ver listado de productos seleccionados por el usuario.");
        System.out.println("0 -> Salir.");
        System.out.println("**************************************************************");
        // terminan las opciones. se captura la seleccion e ingresa al menu.
        int opc = input.nextInt();
        switch (opc) {
            case 0:
                // Este es el unico caso en el que no se vuelve a llamar a menu_admin()
                // ya que necesitamos finalice.
                System.out.println("Muchas gracias, hasta la proxima!");
                break;
            case 1:
                // Hacer acciones necesarias.
                //producto.CargarProducto()
                menu_admin(x);
                break;
            case 2:
                // Hacer acciones necesarias.
                //producto.ModiProd(id o nombre del producto)
                menu_admin(x);
                break;
            case 3:
                // Hacer acciones necesarias.
                //Comprobante.ListaUsua_Compr()
                menu_admin(x);
                break;
            case 4:
                // Hacer acciones necesarias.
                // Usuario.ListaProdSelected()
                menu_admin(x);
                break;
            default:
                System.out.println("Opcion incorrecta.");
                menu_admin(x);
                break;
        }
        input.close();
    }

    public static void menu_gral(){
        //basicamente, ingresa sesion una persona, si tiene cuenta... Entonces preguntamos si es admin, si lo es le tiramos el menu admin
        //si no lo es, entonces tiramos menu de cliente

        //Si no tiene cuenta, hacemos que cree una, y tiramos directamente el menu cliente. porque no va a ser un admin, ya que estos son hardcodeados
        //Si ingresa una opcion distinta a 0 o 1, entonces directamente despedimos.

        Scanner input = new Scanner(System.in);

        System.out.println("Si usted tiene una cuenta, presione 1");
        System.out.println("Si no es asi, presione 0");
        System.out.println("Respuesta: ");
        int opc = input.nextInt();
        switch(opc){
            case 0:
                //registrar usuario. luego de eso, menu de cliente.
                //porque de por si va a ser un cliente. no puede ser un admin.

                //pedir mas datos
                System.out.println("Ingrese su mail: ");
                String mail = input.nextLine();
                System.out.println("Ingrese su contraseña: ");
                String contrasenia = input.nextLine();

                Usuario usuario = registrarse(nombre, apellido, mail, dni, contrasenia, domicilio);
                menu_cliente(usuario);
                break;
            case 1:
                //pedimos datos de usuario para el login
                System.out.println("Ingrese su mail: ");
                String mail = input.nextLine();
                System.out.println("Ingrese su contraseña: ");
                String contrasenia = input.nextLine();

                Usuario usuario = funlogin(mail, contrasenia); //ingresa usuario

                //comprobamos si es un admin o no.
                if (usuario.getIsAdmin() == 1){
                    menu_admin(usuario);
                }
                else{
                    menu_cliente(usuario);
                }
                break;
            default:
                System.out.println("Opcion incorrecta. Vuelva a ingresar los datos.");
                menu_gral();
                break;
        }
    }

    public static void main(String[] args) {
        menu_gral();
    }
}