package H2DEFENSA;

import java.util.Scanner;

public class H2Main3 {
    public static void main(String [] args) {
        Scanner leer = new Scanner(System.in);

        String nombreDep, nombreProv;
        int d, p, nDepartamentos = 2, nProvincias = 2;

        Departamento[] departamentos = new Departamento[100];

        for (d = 0; d < nDepartamentos; d = d + 1) {
            System.out.println("Ingrese el nombre del departamento " + (d + 1) + ": ");
            nombreDep = leer.next();
            Provincia[] provincias = new Provincia[100];
            for (p = 0; p < nProvincias; p = p + 1) {
                System.out.println("Ingrese el nombre de la provincia " + (p + 1) + ": ");
                nombreProv = leer.next();

                Provincia prov = new Provincia();
                prov.setNombreProvincia(nombreProv);
                provincias[p] = prov;

            }
            Departamento Dep = new Departamento();
            Dep.setNombreDepartamento(nombreDep);
            Dep.setNoProvincias(nProvincias);
            departamentos[d] = Dep;
        }
        Pais Pa = new Pais("Bolivia", nDepartamentos, departamentos);
        Pa.setNoDepartamentos(nDepartamentos);

        Pa.mostrarPais();
    }
}
