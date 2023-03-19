package ui;
import java.util.Scanner;
import model.Usuario;

/* Definición de los arreglos, variables de entrada/salida, acumuladores, contadores y variables de control de los ciclos:
 * 
 * Entradas:
 * - option (int): opcion que permite al usuario escoger el metodo deseado en el menu.
 * - nombreUsuario (String): Nombre del usuario registrado. 
 * - cedulaUsuario (String): Numero de cedula del usuario registrado.
 * - nombreGasto (String): Nombre del gasto a registrar.
 * - precioGasto (double): Precio del gasto a registrar
 * 
 * Variables de Control:
 * - usuario (Usuario): objeto de tipo Usuario que sera el controlador de la clase Sistema.
 * - usuarioRegistrado (boolean): Variable que controla que el usuario se haya registrado antes de utilizar otro metodo.
 * - gastoRegistraddo (boolean): Variable que controla que el usuario haya registrado un gasto antes de utulizar un metodo vinculado a algun gasto.
 * 
 * 
 */


public class Sistema {

        private static Scanner input = new Scanner(System.in);
        private static Usuario usuario;
        private static boolean usuarioRegistrado = false;
        private static boolean gastoRegistrado = false;
        
    public static void main(String[] args){
        int option = 0;
        while(option != 5){ 
            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n", "SISTEMA DE AHORRO, INGRESE VALOR", "1. Registrar Usuario","2. Registrar gasto", "3. Total gastos", "4. Gasto Promedio", "5. Salir");
            option = input.nextInt();
            switch(option){
                case 1: 
                registrarUsuario();
                break;
                case 2: 
                if(usuarioRegistrado == false){
                    System.out.println("Tiene que registrarse primero!!!!!!!!!!!!!!");
                    registrarUsuario();
                }
                registrarGasto();
                break;
                case 3: 
                if(usuarioRegistrado == false){
                    System.out.println("Tiene que registrarse primero!!!!!!!!!!");
                    main(args);
                }
                if(gastoRegistrado == false){
                    System.out.println("tiene que agregar un gasto primero!!!!!!!!!!!!!");
                    main(args);
                }
                totalGastos();
                break;
                case 4: 
                if(usuarioRegistrado == false){
                    System.out.println("Tiene que registrarse primero!!!!!!!!!!");
                    main(args);
                }
                if(gastoRegistrado == false){
                    System.out.println("tiene que agregar un gasto primero!!!!!!!!!!");
                    main(args);
                }
                promedioGasto();
                break;
                case 5: 
                System.out.println("Gracias");
                break;
            }
        }
        input.close();
    }


    public static void registrarUsuario(){

        String nombreUsuario;
        String cedulaUsuario;

        System.out.println("ingrese nombre de usuario");
        input.nextLine();
        nombreUsuario = input.nextLine();

        System.out.println("Ingrese cedula de usuario");
        cedulaUsuario = input.next();

        usuario = new Usuario(nombreUsuario, cedulaUsuario);
        usuarioRegistrado = true;
        System.out.println("Usuario registrado");
        System.out.println("");

    }

    public static void registrarGasto(){

        String nombreGasto;
        double precioGasto;

        System.out.println("ingrese nombre gasto");
        input.nextLine();
        nombreGasto = input.nextLine();

        System.out.println("Ingrese costo gasto $");
        precioGasto = input.nextDouble();


        usuario.agregarGasto(nombreGasto, precioGasto);
        gastoRegistrado = true;
        System.out.println("Gasto registrado");
        System.out.println("");

    }

    public static void totalGastos(){

        usuario.mostrarGastos();
        System.out.println("");

    }

    public static void promedioGasto(){

        usuario.promediarGastos();
        System.out.println("");
    }


}

