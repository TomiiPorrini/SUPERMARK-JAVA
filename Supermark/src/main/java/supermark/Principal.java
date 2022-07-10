package supermark;

import java.util.Scanner;
import javax.security.auth.x500.X500Principal;

public class Principal{
//Todos los menus serán realizados de manera recursiva. Para que asi pueda ahorrarse memoria y algunos pasos
//que podrian desordenar y complejizar la lectura del codigo.
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
        System.out.println("4 -> Ver listado de productos seleccionados de un usuario.");
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
                //producto.CargarProducto();
                menu_admin(x);
                break;
            case 2:
                // Hacer acciones necesarias.
                System.out.println("Ingrese el nombre del producto a modificar: ");
                String nombreProd = input.nextLine();
                System.out.println("Ingrese el nuevo precio: ");
                double precioProd = input.nextDouble();
                System.out.println("Ingrese el stock a sumar: ");
                int stockProd = input.nextInt();
                ModiProd(nombreProd, precioProd, stockProd);
                menu_admin(x);
                break;
            case 3:
                // Hacer acciones necesarias.
                //se utiliza, de la clase comprobante, el metodo listaUsuario_Compra(), que nos devuelve que usuarios realizaron al  menos una compra.
                ListaUsua_Compr();
                menu_admin(x);
                break;
            case 4:
                // Hacer acciones necesarias.
                System.out.println("Ingrese el nombre del usuario que quiere obtener datos.: ");
                String nombreUser = input.nextLine();
                //se utiliza el metodo listaProdSelected(), de la clase Comprobante
                //para obtener todos los productos seleccionados por tal usuario.
                ListaProdSelected(nombreUser);
                menu_admin(x);
                break;
            default:
                System.out.println("Opcion incorrecta, volviendo al menú.");
                menu_admin(x);
                break;
        }
        input.close();
    }

    public static Localidad generarLoc(){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre de su provincia: ");
        String provincia = input.nextLine();

        System.out.println("Ingrese el nombre de su departamento: ");
        String departamento = input.nextLine();

        System.out.println("Ingrese el nombre de su ciudad: ");
        String ciudad = input.nextLine();

        Localidad localidad = new Localidad(provincia, departamento, ciudad);
        input.close();
        return localidad;
    }

    public static Domicilio generarDom(){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la primer calle: ");
        String calle1 = input.nextLine();

        System.out.println("Ingrese el nombre de la segunda calle: ");
        String calle2 = input.nextLine();

        System.out.println("Ingrese el numero de casa: ");
        int numero = input.nextInt();

        System.out.println("Ingrese el nombre de la ruta: ");
        String ruta = input.nextLine();

        System.out.println("Ingrese el kilometro: ");
        int km = input.nextInt();

        System.out.println("Si vive en un departamento, ingrese el numero de departamento. Si no es asi, ingrese 0: ");
        int depNumero = input.nextInt();

        System.out.println("Ingrese el piso, si no vive en un depto, ingrese 0: ");
        int piso = input.nextInt();

        Localidad localidad = generarLoc();
        
        Domicilio domicilio = new Domicilio(calle1, calle2, numero, ruta, km, depNumero, piso, localidad);

        input.close();

        return domicilio;
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

                Usuario usuario = new Usuario();
                
                System.out.println("Ingrese su Nombre: ");
                String nombre = input.nextLine();

                System.out.println("Ingrese su Apellido: ");
                String apellido = input.nextLine();

                System.out.println("Ingrese su mail: ");
                String mail = input.nextLine();

                System.out.println("Ingrese su contraseña: ");
                String contrasenia = input.nextLine();

                System.out.println("Ingrese su dni: ");
                String dni = input.nextLine();

                Domicilio domicilio = generarDom();

                usuario.registrarse(nombre, apellido, mail, dni, contrasenia, domicilio);
                
                menu_cliente(usuario);
                break;
            case 1:
                //pedimos datos de usuario para el login
                System.out.println("Ingrese su mail: ");
                mail = input.nextLine();
                System.out.println("Ingrese su contraseña: ");
                contrasenia = input.nextLine();

                usuario = funlogin(mail, contrasenia); //ingresa usuario

                //comprobamos si es un admin o no.
                if (usuario.getIsAdmin()){
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