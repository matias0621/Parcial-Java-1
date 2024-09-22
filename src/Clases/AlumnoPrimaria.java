package Clases;

import Interfaces.IAlumno;
import Interfaces.IEvaluable;

import java.util.Arrays;

public class AlumnoPrimaria extends Persona implements IEvaluable, IAlumno {
    private static int cantidadDeAlumno;
    private int[] notas = new int[10];

    public AlumnoPrimaria(String nombre, String apellido, String dni, int[] notas) {
        super(nombre, apellido, dni);
        this.notas = notas;
        ++cantidadDeAlumno;
        setCantidadDeAlumno(cantidadDeAlumno);
    }

    @Override
    public void darDeBaja(){
        System.out.println(getNombre() + " " + getApellido() + " se dio de baja");
    }

    @Override
    public void darDeAlta(){
        System.out.println(getNombre() + " " + getApellido() + " se dio de alta");
    }

    @Override
    public void cargarNotas(int [] notas) {
        this.notas = notas;
    }

    @Override
    public void mostrarNotas() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + i + ": " + notas[i]);
        }
    }

    public static int getCantidadDeAlumno() {
        return cantidadDeAlumno;
    }

    public static void setCantidadDeAlumno(int cantidadDeAlumno) {
        AlumnoPrimaria.cantidadDeAlumno = cantidadDeAlumno;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "notas=" + Arrays.toString(notas);
    }
}
