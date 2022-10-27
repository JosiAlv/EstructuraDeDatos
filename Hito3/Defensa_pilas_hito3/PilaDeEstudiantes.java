package Defensa_pilas_hito3;

public class PilaDeEstudiantes {

    private int max;
    private int tope;
    private Estudiante[] Estudiantes;


    public PilaDeEstudiantes(int max) {
        this.tope = 0;
        this.max = max;
        this.Estudiantes = new Estudiante[this.max + 1];
    }
    public boolean esVacio () {
        if (tope == 0) {
            return true;
        } else {
            return false;
        }

    }
    public boolean esLleno () {
        if (tope == max) {
            return true;
        } else {
            return false;
        }


    }
    public int nroElem () {
        return this.tope;
    }
    public void adicionar (Estudiante nuevoEstudiante) {
        if (this.esLleno() == false) {
            this.tope = this.tope + 1;
            this.Estudiantes[this.tope] = nuevoEstudiante;
        } else {
            System.out.println("La pila de estudiantes está llena");
        }
    }
    public Estudiante eliminar () {
        Estudiante elementoEliminado = null;

        if (!this.esVacio()) {
            elementoEliminado = (this.Estudiantes[this.tope]);
            this.tope = this.tope - 1;
        } else {
            System.out.println("La pila de estudiantes está vacia");
        }
        return elementoEliminado;
    }
    public void llenar () {


    }
    public void mostrar () {
        Estudiante elem = null;
        if (esVacio())
            System.out.println("Pila Vacia");
        else {
            System.out.println("\nDatos de la Pila de estudiantes");
            System.out.println("\n");
            PilaDeEstudiantes aux = new PilaDeEstudiantes(this.max);
            while (!esVacio()) {
                elem = this.eliminar();
                aux.adicionar (elem);
                elem.mostrarEstudiante();
            }
            vaciar(aux);
        }

    }
    public void vaciar (PilaDeEstudiantes pila) {
        while (!pila.esVacio())
            adicionar(pila.eliminar());
    }
}
