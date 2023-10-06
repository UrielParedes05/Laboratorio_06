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
public class Estudiante {
    private List<Curso> cursos;
    private String codigo;
    private String nombre;

    public Estudiante() {
    }

    public Estudiante(List<Curso> cursos, String codigo, String nombre) {
        this.cursos = cursos;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTexto(){
        return "Cod: " + getCodigo() + 
               "\t\t||Nombre: " + getNombre();
    }
    
}
