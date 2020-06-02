package capa_Datos;

import TListas.*;

/*1.	Elaborar un programa orientado a objetos en 3 capas aplicando Listas
 Dinámicas que lea los datos de N docentes de una universidad siendo: nombre,
 edad, sexo, nivel de estudios (Puede ser: título, maestría, doctorado),
 tiempo en la docencia (expresada en años), carrera profesional en la que
 dicta (Puede ser: Ing. De Sistemas, Ing. Electrónica, Medicina Humana,
 Ing. Civil).
Reportar:
a.	Número de docentes por nivel de estudios.
b.	Mostrar los docentes dada la carrera profesional.
c.	Qué docente con doctorado, tiene el mayor tiempo en la docencia.
d.	Cuál es el promedio de edad de los docentes en cada carrera profesional.
*/

public class ListaDocentes {

    private static TLista objetos = new TListaDin();

    public static void adicionar(Object C) {
        objetos.Adicionar(C);
    }

    public static TLista consultar() {
        return objetos;
    }

}
