/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

/**
 *
 * @author 33407.joan23
 */
public class Alumno {
private String nombre;   
private String apellido;

private float notamatematicas;
private float notaedfisica;
private float notacatalan;
private float notamedia;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, float notamatematicas, float notaedfisica, float notacatalan) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notamatematicas = notamatematicas;
        this.notaedfisica = notaedfisica;
        this.notacatalan = notacatalan;
    }
//Recuperar datos
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public float getNotamatematicas() {
        return notamatematicas;
    }

    public float getNotaedfisica() {
        return notaedfisica;
    }

    public float getNotacatalan() {
        return notacatalan;
    }

    public float getNotamedia() {
        return notamedia;
    }
//introducir informacion
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNotamatematicas(float notamatematicas) {
        this.notamatematicas = notamatematicas;
    }

    public void setNotaedfisica(float notaedfisica) {
        this.notaedfisica = notaedfisica;
    }

    public void setNotacatalan(float notacatalan) {
        this.notacatalan = notacatalan;
    }
    
    public float notamedia(float nota1, float nota2, float nota3){

        return (nota1+nota2+nota3)/3 ;
    }
    public float notamaxima(float nota1, float nota2, float nota3){
    
    float mayor = Math.max(nota1, nota2);
    float mayor2 = Math.max(mayor,nota3);
    return Math.max(mayor,nota3);
    }

}
