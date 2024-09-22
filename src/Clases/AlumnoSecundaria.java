package Clases;

import Interfaces.IAlumno;
import Interfaces.IEvaluable;

import java.util.Arrays;

public class AlumnoSecundaria extends Persona implements IEvaluable, IAlumno {
    private boolean mayorDeEdad;
    private int[] notas = new int[10];

    public AlumnoSecundaria(String nombre, String apellido, String dni, boolean mayorDeEdad, int[] notas) {
        super(nombre, apellido, dni);
        this.mayorDeEdad = mayorDeEdad;
        this.notas = notas;
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

    public boolean isMayorDeEdad() {
        return mayorDeEdad;
    }

    public void setMayorDeEdad(boolean mayorDeEdad) {
        this.mayorDeEdad = mayorDeEdad;
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
                "mayorDeEdad=" + mayorDeEdad + '\n' +
                "notas=" + Arrays.toString(notas);
    }
}
