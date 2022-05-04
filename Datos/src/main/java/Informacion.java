/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mendo
 */
public class Informacion {
    String nombre;
    String carrera;
    String materia;
    
    
public Informacion (String nombre, String carrera, String materia){
    
    this.nombre = nombre;
    this.carrera = carrera;
    this.materia = materia;
    
}
    public String getNombre(){
        return "El nombre es :" + nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }
    public String getCarrera(){
        return "La carrera es :" + carrera;
    }
    public void setCarrera(){
        this.carrera = carrera;
    }
    public String getMateria(){
        return "La materia es " + materia;
    }
    public void setMateria(){
        this.materia = materia;
    }
    
}
