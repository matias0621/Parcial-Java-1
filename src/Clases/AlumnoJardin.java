package Clases;

import Enums.TipoDeJardin;
import Interfaces.IAlumno;
import Interfaces.IAlumnoJardin;

public class AlumnoJardin extends Persona implements IAlumno, IAlumnoJardin {
    private TipoDeJardin tipoDeJardin;

    public AlumnoJardin(String nombre, String apellido, String dni, TipoDeJardin tipoDeJardin) {
        super(nombre, apellido, dni);
        this.tipoDeJardin = tipoDeJardin;
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
    public void cambiarPaniales(){
        System.out.println(getNombre() + " " + getApellido() + " le cambiaron los pañales");
    }

    @Override
    public void darAlmuerzo(){
        System.out.println(getNombre() + " " + getApellido() + " le dan el almuerzo");
    }

    @Override
    public String toString() {
        return super.toString() +
                "tipoDeJardin=" + tipoDeJardin +
                '}';
    }

    public TipoDeJardin getTipoDeJardin() {
        return tipoDeJardin;
    }

    public void setTipoDeJardin(TipoDeJardin tipoDeJardin) {
        this.tipoDeJardin = tipoDeJardin;
    }
}
