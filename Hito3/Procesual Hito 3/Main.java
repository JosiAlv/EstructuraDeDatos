package Hito3.PilaDeClientes;

public class Main {
    public static void main(String [] args) {
        Cliente cli1 = new Cliente("Emma","Stone", 33,"Estados Unidos", "Femenino");
        Cliente cli2 = new Cliente("Adolf","Hitler", 56,"Alemania", "Masculino");
        Cliente cli3 = new Cliente("Alejandra","Maine", 19,"Estados Unidos", "Femenino");
        Cliente cli4 = new Cliente("Josef","Stalin", 74,"Rusia", "Masculino");
        Cliente cli5 = new Cliente("Natalia","Poklonskaya", 42,"Rusia", "Femenino");


        PilaCliente pila = new PilaCliente(100);
        pila.adicionar(cli1);
        pila.adicionar(cli2);
        pila.adicionar(cli3);
        pila.adicionar(cli4);
        pila.adicionar(cli5);
        //pila.mostrar();
        //mayoresCiertasEdad(pila, 40);
        //kEsimoPosicion(pila, 3);
        //asignaDireccion(pila, "Canada");
        reordenaPila(pila);

    }
    //Determinar cuantos clientes son mayores a 20 años
    public static void mayoresCiertasEdad(PilaCliente pila, int edadMayor) {
        PilaCliente aux = new PilaCliente(10);
        int MayoresXEdad = 0;
        Cliente Valorextraido = null;
        while (pila.esVacio() == false) {
            Valorextraido = pila.eliminar();
            if (Valorextraido.getEdad() > edadMayor) {
                MayoresXEdad = MayoresXEdad + 1;
            }
            aux.adicionar(Valorextraido);
        }
        System.out.println("\nLa cantidad de clientes con mas de " + edadMayor +" son: " + MayoresXEdad);

    }

    public static void kEsimoPosicion(PilaCliente pila, int valorTope)  {
        PilaCliente aux = new PilaCliente(10);
        Cliente valor = null;

        while (pila.esVacio() == false) {
            if (pila.nroElem() !=  valorTope) {
                aux.adicionar(pila.eliminar());
            } else {
                valor = pila.eliminar();
            }
        }
        pila.vaciar(aux);
        pila.adicionar(valor);
        pila.mostrar();
    }
    public static void asignaDireccion(PilaCliente pila, String nuevaDireccion) {
        PilaCliente aux = new PilaCliente(10);
        Cliente valor = null;
        while (!pila.esVacio()) {
            valor = pila.eliminar();
            if (valor.getGenero() == "Femenino") {
                valor.setDireccion(nuevaDireccion);
                aux.adicionar(valor);
            } else {;
                aux.adicionar(valor);
            }

        }
        pila.vaciar(aux);
        pila.adicionar(valor);
        pila.mostrar();
    }

    public static void reordenaPila(PilaCliente pila) {
        PilaCliente aux1 = new PilaCliente(10);
        PilaCliente aux2 = new PilaCliente(10);
        Cliente valor = null;

        while (!pila.esVacio()) {
            valor = pila.eliminar();
            if (valor.getGenero() != "Femenino") {
                aux1.adicionar(valor);

            } else {
                aux2.adicionar(valor);
            }
        }
        pila.vaciar(aux1);
        pila.vaciar(aux2);
        pila.mostrar();
    }
}
