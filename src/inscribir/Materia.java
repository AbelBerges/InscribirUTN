/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inscribir;

/**
 *
 * @author kalema
 */
public class Materia {
    private String nombreMat;
    private int nivel;
    //private Materia correlativa;
    private boolean tieneCorrelativa;
    private double nota;
            
    public Materia(){}
    
    public Materia(String nombreMat, int nivel, boolean tieneCorrelativa, double nota){
        this.nombreMat = nombreMat;
        this.nivel = nivel;
        this.tieneCorrelativa = tieneCorrelativa;
        this.nota = nota;
    }

    public String getNombreMat() {
        return nombreMat;
    }

    public void setNombreMat(String nombreMat) {
        this.nombreMat = nombreMat;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean isTieneCorrelativa() {
        return tieneCorrelativa;
    }

    public void setTieneCorrelativa(boolean tieneCorrelativa) {
        this.tieneCorrelativa = tieneCorrelativa;
    }
    
    public double getNota(){
        return nota;
    }
    
    public void setNota(double nota){
        this.nota = nota;
    }
    
}
