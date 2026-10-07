import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        Metodo m = new Metodo();
        Queue<ObjCliente> cola = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while(opcion != 6) {
            System.out.println("Supermercado Tutu:");
            System.out.print("Ingrese una opcion: ");
            System.out.println("\n__________________________");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Mostrar fila de clientes");
            System.out.println("3. Atender cliente");
            System.out.println("4. Abonar cliente");
            System.out.println("5. Cambiar de Caja");
            System.out.println("6. Salir");
            
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    cola = m.LLenarCola(cola, sc);
                    break;
                case 2:
                    cola = m.MostrarCola(cola);
                    break;
                case 3:
                    cola = m.AtenderCliente(cola);
                    break;
                case 4:
                    cola = m.AbonarCliente(cola, sc);
                    break;
                case 5:
                    cola = m.CambiarDeCaja(cola, sc);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                                    
                default:
                    System.out.println("Opcion invalida, intente de nuevo.");
            }
        }
    }


        
}
