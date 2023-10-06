/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_06.entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Curso {
    
    private String nombre;
    private String codigo;
    private Integer creditos;
    private Profesor[] profesores;
    private Estudiante[] estudiantes;

    public Curso(){
        this.estudiantes = new Estudiante[40];
        this.profesores = new Profesor[2];
    }
    
    public Curso(String nombre, String codigo, Integer creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.estudiantes = new Estudiante[40];
        this.profesores = new Profesor[2];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    public String getTexto(){
        return "Cod: " + getCodigo() + 
               "\t\t||Nombre: " + getNombre() + 
               "\t\t||Créditos: " + getCreditos();
    }
    
    public void agregarEstudiante(Estudiante estudiante){
        
        for (int i = 0; i < 30; i++) {
            if(estudiantes[i]==null){
                estudiantes[i]=estudiante;       
                return;
            }
        }
        
        
    }
    
    public void agregarProfesor(Profesor profesor){
        
        if(profesores[0]==null){
            profesores[0]=profesor;
        }else if(profesores[1]==null){
            profesores[1]=profesor;
        }else{
            JOptionPane.showMessageDialog(null, "Este curso ya ha llegado al "
                    + "limite de profesores",
                    "Agregar Profesor", JOptionPane.INFORMATION_MESSAGE); 
        }
        
    }
}
