package Defensa_pilas_hito3;

public class Main {
    public static void main(String [] args) {
        Estudiante est1 = new Estudiante("William","Barra", 33,"El Alto", 62, "6778933LP");
        Estudiante est2 = new Estudiante("Adolf","Hitler", 56,"Santa Cruz", 74, "6661234SC");
        Estudiante est3 = new Estudiante("Josef","Stalin", 74,"La Paz", 69, "1234666LP");
        Estudiante est4 = new Estudiante("Alejandra","Maine", 19,"Tarija", 79, "67544433TJ");
        Estudiante est5 = new Estudiante("Nikola","Tesla", 86,"El Alto", 96, "5547547SC");

        PilaDeEstudiantes pila = new PilaDeEstudiantes(10);
        pila.adicionar(est1);
        pila.adicionar(est2);
        pila.adicionar(est3);
        pila.adicionar(est4);
        pila.adicionar(est5);
        //pila.mostrar();
        //Aprobados(pila, 51, "El Alto");
        //kEsimoPosicion(pila, 2);
        moverPosicion(pila, 1);
        //AprobadosElAlto(pila, "El Alto");
        //reordenaPila(pila);

    }
    //Determinar cuantos estudiantes aprobaron de la sede EL ALto aprobaron
    public static void Aprobados(PilaDeEstudiantes pila, int NotaAprobada, String sede) {
        PilaDeEstudiantes aux = new PilaDeEstudiantes(10);
        int estAprobados = 0;
        Estudiante Valorextraido = null;
        while (pila.esVacio() == false) {
            Valorextraido = pila.eliminar();
            if (Valorextraido.getSede() == sede & Valorextraido.getNotaFinal() >= NotaAprobada) {
                    estAprobados = estAprobados + 1;
            }
            aux.adicionar(Valorextraido);
        }
        System.out.println("\nLa cantidad de estudiantes aprobados de El Alto son: " + estAprobados);
    }

    public static void kEsimoPosicion(PilaDeEstudiantes pila, int valorTope)  {
        PilaDeEstudiantes aux = new PilaDeEstudiantes(10);
        Estudiante valor = null;
        if (valorTope < pila.nroElem()) {
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
        } else {
            System.out.println("No se puede mover porque el valor de Tope es mayor");
        }

    }
    public static void moverPosicion(PilaDeEstudiantes pila, int valorTope) {
        PilaDeEstudiantes aux = new PilaDeEstudiantes(10);
        Estudiante valor = pila.eliminar();
        Estudiante valor2 = null;

        if (valorTope < pila.nroElem()) {

            while (pila.esVacio() == false) {
                valor2 = pila.eliminar();
                if (valor.getNotaFinal() < valor2.getNotaFinal()) {
                    valor = valor2;
                } aux.adicionar(valor);
                while (valor2 == valor) {
                    valor = pila.eliminar();
                }
            }
        }
        pila.vaciar(aux);
        pila.adicionar(valor2);
        pila.mostrar();

    }
    public static void AprobadosElAlto(PilaDeEstudiantes pila , String sede) {
        PilaDeEstudiantes aux = new PilaDeEstudiantes(10);
        PilaDeEstudiantes aux2 = new PilaDeEstudiantes(10);
        Estudiante Valorextraido = null;
        while (pila.esVacio() == false) {
            Valorextraido = pila.eliminar();
            if (Valorextraido.getSede() == sede & Valorextraido.getNotaFinal() >= 51) {
                aux.adicionar(Valorextraido);
            }
                aux2.adicionar(Valorextraido);
        }
        System.out.println("\nLa cantidad de estudiantes aprobados de El Alto son: ");
        pila.vaciar(aux2);
        pila.mostrar();
        aux.mostrar();
    }

}
