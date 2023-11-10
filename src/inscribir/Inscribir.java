/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inscribir;

/**
 *
 * @author kalema
 */
public class Inscribir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Materia miCorrelativa = new Materia("Análisis Matemático I", 1, false, 6);
        Materia laCursada = new Materia("Análisis Matemático II", 2, true, 0);
        Alumno elAlumno = new Alumno("Pepe", "Grillo", 22);
        Inscripcion laInscripcion = new Inscripcion(elAlumno, laCursada);
        boolean aprobo = false;
        boolean chequearCorrelativa = laCursada.isTieneCorrelativa();
        if (chequearCorrelativa) {
            aprobo = laInscripcion.aprobada(miCorrelativa);
            if (aprobo) {
                laInscripcion.setElAlumno(elAlumno);
                laInscripcion.setLaMateria(laCursada);
            } else {
                System.out.println("No se puede inscribir porque debe la CORRELATIVA");
            }
        } else {
            laInscripcion.setElAlumno(elAlumno);
            laInscripcion.setLaMateria(miCorrelativa);
        }

        //Muestro los datos de la inscripción
        if (aprobo) {
            System.out.println("Los datos de la Inscripción son: ");
            System.out.println("Nombre y apellido de el Alumno/a " + laInscripcion.getElAlumno().toString());
            System.out.println("La materia inscripta es " + laInscripcion.getLaMateria().getNombreMat());
        }

    }

}
