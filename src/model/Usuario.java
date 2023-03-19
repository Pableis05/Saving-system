package model;

/*Atributos:
 * - nombre(String): Nombre del usuario.
 * - cedula(String): Numero de cedula del usuario.
 * - gastos[] (arreglo): Arreglo en donde se almacenan los gastos de cada usuario.
 * 
 * Contadores:
 * - Contador(int): Controla la cantidad de gastos que tiene cada usuario y avisar de llegada al limite.
 * Acumuladores:
 * - aux(double): Acumula la suma de los costos de todos los gastos del usuario.
 * 
 */

public class Usuario {

     //Atributos
    private String nombre;
    private String cedula;
    private Gasto gastos[];
    

    //metodos

    public Usuario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        gastos = new Gasto[10];
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCedula() {
        return cedula;
    }


    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    private int contador = 0;
    public void agregarGasto(String name, double precio){
        if(contador < 10){ 
            gastos[contador] = new Gasto(name, precio);    
            contador++;
        }
        else{
            System.out.println("Gasto no incluido, capacidad de gastos alcanzada");
        }
    
    }

    public void mostrarGastos(){
        double aux = 0; 
        for (int i = 0; i < contador; i++) {
            System.out.println((i+1) + ".gasto");
            System.out.println(gastos[i].getNombreGasto());
            System.out.println("$"+gastos[i].getCostoGasto());
            System.out.println("--------------------------------");
            aux += gastos[i].getCostoGasto();
        }
        System.out.println("El total de gastos es de: $"+aux);
        
    }

    public void promediarGastos(){
        double aux = 0;
        for (int i = 0; i < contador; i++) {
            aux += gastos[i].getCostoGasto();
        }
        System.out.println("El promedio por gasto es de: $" +aux/(contador));
    }

    
}
