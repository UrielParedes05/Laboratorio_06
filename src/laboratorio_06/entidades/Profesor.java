/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_06.entidades;

import java.util.List;

/**
 *
 * @author HP
 */
public class Profesor {
    private String nombre;
    private List<Curso> cursos;

    public Profesor() {
    }

    public Profesor(String nombre, List<Curso> cursos) {
        this.nombre = nombre;
        this.cursos = cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Curso curso) {
        this.cursos.add(curso);
    }
    
    public String getTexto(){
        return "\t\t||Nombre: " + getNombre();
    }
}
