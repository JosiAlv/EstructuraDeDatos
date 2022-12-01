package Colas.ColaDeNumeros;

public class Main {
    public static void main(String [] args) {
        int i;
        Numeros Num = new Numeros(100);
        Num.adicionar(10);
        Num.adicionar(5);
        Num.adicionar(50);
        Num.adicionar(37);
        Num.adicionar(10);
        Num.adicionar(50);
        //Num.mostrar();
        //mostrarNumeroMenor(Num);
       // moverMenorValor(Num);
       // moverMayorValor(Num);
        EliminarRepetidos(Num);
    }
    public static int mostrarNumeroMenor(Numeros cola) {
        Numeros aux = new Numeros(10);
        int Menor = cola.eliminar();
        int Valor;
        aux.adicionar(Menor);
        while (!cola.esVacia()) {
            Valor = cola.eliminar();
            if (Valor < Menor) {
                Menor = Valor;
            }
            aux.adicionar(Valor);
        }
        cola.vaciar(aux);
        //System.out.println("El numero menor de la cola es: " + Menor);
        return Menor;
    }

    public static void moverMenorValor(Numeros cola){
        int valorMenor = mostrarNumeroMenor(cola);
        int valorEliminado;

        System.out.println("Menor valor: " + valorMenor);
        Numeros aux = new Numeros(100);
        while (!cola.esVacia()) {
            valorEliminado = cola.eliminar();
            if (valorMenor != valorEliminado){
                aux.adicionar(valorEliminado);
            }
        }
        cola.adicionar(valorMenor);
        cola.vaciar(aux);
        cola.mostrar();
    }
    public static int mostrarNumeroMayor(Numeros cola) {
        Numeros aux = new Numeros(10);
        int Mayor = cola.eliminar();
        int Valor;
        aux.adicionar(Mayor);
        while (!cola.esVacia()) {
            Valor = cola.eliminar();
            if (Valor > Mayor) {
                Mayor = Valor;
            }
            aux.adicionar(Valor);
        }
        cola.vaciar(aux);
        return Mayor;
    }

    public static void moverMayorValor(Numeros cola) {
        int valorMayor = mostrarNumeroMayor(cola);
        int valorEliminado;

        System.out.println("Mayor valor: " + valorMayor);
        Numeros aux = new Numeros(100);
        while (!cola.esVacia()) {
            valorEliminado = cola.eliminar();
            if (valorMayor != valorEliminado) {
                aux.adicionar(valorEliminado);
            }
        }
        cola.vaciar(aux);
        cola.adicionar(valorMayor);
        cola.mostrar();
    }

    public static void EliminarRepetidos(Numeros cola) {
        int elemento = cola.eliminar();
        int elemigual;
        int h;
        Numeros aux = new Numeros(100);
        while (!cola.esVacia()) {
            elemigual = cola.eliminar();
            if (elemento != elemigual) {
                aux.adicionar(elemigual);
                elemento = elemigual;
            } else {
                elemento = cola.eliminar();
            }
        }

        cola.vaciar(aux);
        cola.mostrar();
    }
}
