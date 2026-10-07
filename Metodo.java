import java.util.Queue;
import java.util.Scanner;

public class Metodo {
    public Queue<ObjCliente> LLenarCola(Queue<ObjCliente> cola, Scanner sc) {
        int opt = 1;
        while (opt == 1) {
            ObjCliente o = new ObjCliente();
            System.out.println("Ingrese el id del cliente: ");
            o.setId(sc.nextInt());
            System.out.println("Ingrese el numero de caja: ");
            o.setCaja(sc.nextInt());
            System.out.println("Ingrese el estado del cliente: ");
            o.setEstado(sc.nextInt());
            System.out.println("Ingrese el nombre del cliente: ");
            o.setNombre(sc.next());
            System.out.println("Ingrese el motivo de la visita del cliente: ");
            o.setMotivo(sc.next());
            o.setEstado(1);
            cola.offer(o);
            System.out.println("\n__________________________");
            

            System.out.println("Desea agregar otro cliente? (1=Si / 2=No)");
            opt = sc.nextInt();
        }
         return cola;
    }
   
    public Queue<ObjCliente>MostrarCola(Queue<ObjCliente> cola) {
        for (ObjCliente o : cola) {
            System.out.println("Id: " + o.getId());
            System.out.println("Caja: " + o.getCaja());
            System.out.println("Estado: " + o.getEstado());
            System.out.println("Nombre: " + o.getNombre());
            System.out.println("Motivo: " + o.getMotivo());
            System.out.println("-----------------------------");
        }
        return cola;
    }
    public Queue<ObjCliente> AtenderCliente(Queue<ObjCliente> cola) {
        if (!cola.isEmpty()) {
            ObjCliente o = cola.poll();
            o.setEstado(2);
            System.out.println("Cliente atendido: " + o.getNombre()+" con id: " + o.getId());
        }
        return cola;
    }

    public String estadoCliente(int e) {
        if(e == 1) {
            return "En espera";
        } else if (e == 2) {
            return "Atendido";
        } else {
            return "Abonado ";
        }
    }

    public Queue<ObjCliente> AbonarCliente(Queue<ObjCliente> cola, Scanner sc) {
        System.out.println("Abonando cliente con id: ");
        int id = sc.nextInt();
        for (ObjCliente o : cola) {
            if (o.getId() == id && o.getEstado() == 1) {
                o.setEstado(3);
                cola.remove(o);
                System.out.println("Cliente abonado: " + o.getNombre()+" con id: " + o.getId());
                break;
            }
        }
        return cola;
    }

    public Queue<ObjCliente> MostrarColaAbonados(Queue<ObjCliente> cola) {
        for (ObjCliente o : cola) {
            if (o.getEstado() == 3) {
                System.out.println("Id: " + o.getId());
                System.out.println("Caja: " + o.getCaja());
                System.out.println("Estado: " + o.getEstado());
                System.out.println("Nombre: " + o.getNombre());
                System.out.println("Motivo: " + o.getMotivo());
                System.out.println("-----------------------------");
            }
        }
        return cola;
    }

    public Queue<ObjCliente>CambiarDeCaja(Queue<ObjCliente> cola, Scanner sc) {
        System.out.println("Ingrese el id del cliente a cambiar de caja: ");
        int id = sc.nextInt();
        for (ObjCliente o : cola) {
            if (o.getId() == id && o.getEstado() == 1) {
                System.out.println("Nueva Caja: ");
                int nuevaCaja = sc.nextInt();
                o.setCaja(nuevaCaja);
                System.out.println("Cliente " + o.getNombre() + " con id: " + o.getId() + " ha sido cambiado a la caja: " + o.getCaja());
                break;
            }
            
            
        }
        return cola;
    }

    














}
