package Clases;

import Enums.TipoDeJardin;

import java.util.*;

public class GestionDeColegio {
    private Map<String, ArrayList<Persona>> alumnado = new HashMap();

    public void Main(){
        // Alumno 1
        int[] notasAlumno1 = {7, 8, 6, 9, 5, 10, 7, 8, 6, 9};

        // Alumno 2
        int[] notasAlumno2 = {6, 7, 5, 8, 6, 9, 7, 10, 6, 8};

        // Alumno 3
        int[] notasAlumno3 = {9, 8, 7, 6, 8, 7, 9, 10, 7, 8};

        // Alumno 4
        int[] notasAlumno4 = {8, 9, 7, 8, 6, 10, 8, 7, 9, 10};

        // Alumno 5
        int[] notasAlumno5 = {5, 6, 7, 8, 9, 10, 6, 7, 8, 9};

        // Alumno 6
        int[] notasAlumno6 = {10, 9, 8, 7, 6, 9, 10, 8, 7, 6};

        // Alumno 7
        int[] notasAlumno7 = {7, 6, 8, 9, 10, 8, 7, 6, 9, 8};

        // Alumno 8
        int[] notasAlumno8 = {6, 7, 8, 9, 5, 10, 9, 8, 7, 9};

        int ejercicio = 0;
        int control = 1;
        Scanner sc = new Scanner(System.in);



        while (control == 1){
            System.out.println("Que datos de los alumnos quieres ejecutar");
            System.out.println("1- Jardin");
            System.out.println("2- Primaria");
            System.out.println("3- Secundaria");
            ejercicio = sc.nextInt();
            switch (ejercicio){
                case 1:
                    AlumnoJardin alumnoJardin = new AlumnoJardin("Eric", "Baron", "6482", TipoDeJardin.MATERNAL);
                    AlumnoJardin alumnoJardin1 = new AlumnoJardin("Lola", "Argento", "1785", TipoDeJardin.PREESCOLAR);

                    alumnoJardin.darDeAlta();
                    alumnoJardin.darDeBaja();
                    alumnoJardin.cambiarPaniales();
                    System.out.print(alumnoJardin.toString());
                    alumnoJardin.darAlmuerzo();

                    alumnoJardin1.darDeAlta();
                    alumnoJardin1.darDeBaja();
                    alumnoJardin1.cambiarPaniales();
                    System.out.print(alumnoJardin1.toString());
                    alumnoJardin1.darAlmuerzo();

                    if (alumnado.containsKey("Jardin")){
                        alumnado.get("Jardin").add(alumnoJardin1);
                        alumnado.get("Jardin").add(alumnoJardin);
                    }
                    else {
                        ArrayList<Persona> listaAlumnos = new ArrayList();
                        listaAlumnos.add(alumnoJardin1);
                        listaAlumnos.add(alumnoJardin);
                        alumnado.put("Jardin", listaAlumnos);
                    }
                    break;
                case 2:
                    AlumnoPrimaria alumnoPrimaria = new AlumnoPrimaria("Javier", "Hernandez", "6512", notasAlumno5);
                    AlumnoPrimaria alumnoPrimaria1 = new AlumnoPrimaria("Pepe", "Argento", "3167", notasAlumno6);

                    alumnoPrimaria.darDeAlta();
                    alumnoPrimaria.darDeBaja();
                    alumnoPrimaria.mostrarNotas();
                    System.out.print(alumnoPrimaria.toString());
                    alumnoPrimaria.cargarNotas(notasAlumno7);
                    alumnoPrimaria.mostrarNotas();
                    System.out.println("Cantidad de alumnos: " + alumnoPrimaria.getCantidadDeAlumno());

                    alumnoPrimaria1.darDeAlta();
                    alumnoPrimaria1.darDeBaja();
                    alumnoPrimaria1.mostrarNotas();
                    System.out.print(alumnoPrimaria1.toString());
                    alumnoPrimaria1.cargarNotas(notasAlumno8);
                    alumnoPrimaria1.mostrarNotas();
                    System.out.println("Cantidad de alumnos: " + alumnoPrimaria1.getCantidadDeAlumno());

                    if (alumnado.containsKey("Primaria")){
                        alumnado.get("Primaria").add(alumnoPrimaria1);
                        alumnado.get("Primaria").add(alumnoPrimaria);
                    }
                    else {
                        ArrayList<Persona> listaAlumnos = new ArrayList();
                        listaAlumnos.add(alumnoPrimaria);
                        listaAlumnos.add(alumnoPrimaria1);
                        alumnado.put("Primaria", listaAlumnos);
                    }

                    break;
                case 3:
                    AlumnoSecundaria alumnoSecundaria = new AlumnoSecundaria("Maria", "Perez", "1325", true, notasAlumno1);
                    AlumnoSecundaria alumnoSecundaria1 = new AlumnoSecundaria("Pedro", "Suarez", "8745", false, notasAlumno2);

                    alumnoSecundaria.darDeAlta();
                    alumnoSecundaria.darDeBaja();
                    alumnoSecundaria.mostrarNotas();
                    System.out.println(alumnoSecundaria.getNombre() + " " + alumnoSecundaria.getApellido() + " Es o no mayor edad " + alumnoSecundaria.isMayorDeEdad());
                    alumnoSecundaria.cargarNotas(notasAlumno3);
                    alumnoSecundaria.mostrarNotas();

                    alumnoSecundaria1.darDeBaja();
                    alumnoSecundaria1.darDeAlta();
                    alumnoSecundaria1.mostrarNotas();
                    System.out.println(alumnoSecundaria1.getNombre() + " " + alumnoSecundaria1.getApellido() + " Es o no mayor edad " + alumnoSecundaria1.isMayorDeEdad());
                    alumnoSecundaria1.cargarNotas(notasAlumno4);
                    alumnoSecundaria1.mostrarNotas();

                    if (alumnado.containsKey("Secundaria")){
                        alumnado.get("Secundaria").add(alumnoSecundaria1);
                        alumnado.get("Secundaria").add(alumnoSecundaria);
                    }
                    else {
                        ArrayList<Persona> listaAlumnos = new ArrayList();
                        listaAlumnos.add(alumnoSecundaria1);
                        listaAlumnos.add(alumnoSecundaria);
                        alumnado.put("Jardin", listaAlumnos);
                    }
                    break;
                default:
                    System.out.println("Ingrese un numero basico");
                    break;
            }

            System.out.println("quieres seguir?");
            System.out.println("1- si");
            System.out.println("0- no");
            control = sc.nextInt();
        }

        System.out.println(recorrerMap());
    }

    public int recorrerMap() {
        Iterator it = alumnado.entrySet().iterator();
        int cantidadDeAlumnosPrimaria = 0;

        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();

            // Verificar si la clave es "Primaria"
            if ("Primaria".equals(pair.getKey())) {
                // Acceder al ArrayList correspondiente a la clave
                ArrayList<Persona> listaAlumnos = (ArrayList<Persona>) pair.getValue();
                // Incrementar la cantidad por el tamaño de la lista
                cantidadDeAlumnosPrimaria += listaAlumnos.size();
            }

            System.out.println(pair.getKey() + " " + pair.getValue());
        }

        return cantidadDeAlumnosPrimaria;
    }


}
