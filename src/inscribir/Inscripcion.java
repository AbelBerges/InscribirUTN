/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inscribir;

/**
 *
 * @author kalema
 */
public class Inscripcion {
    private Alumno elAlumno;
    private Materia laMateria;
    
    public Inscripcion(){}

    public Inscripcion(Alumno elAlumno, Materia laMateria) {
        this.elAlumno = elAlumno;
        this.laMateria = laMateria;
    }

    public Alumno getElAlumno() {
        return elAlumno;
    }

    public void setElAlumno(Alumno elAlumno) {
        this.elAlumno = elAlumno;
    }

    public Materia getLaMateria() {
        return laMateria;
    }

    public void setLaMateria(Materia laMateria) {
        this.laMateria = laMateria;
    }
    
    public boolean aprobada(Materia laCorrelativa){
        
        return laCorrelativa.getNota()>=7;
    }
}
