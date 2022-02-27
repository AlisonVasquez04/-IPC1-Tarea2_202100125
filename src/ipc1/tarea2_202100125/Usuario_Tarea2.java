/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1.tarea2_202100125;

/**
 *
 * @author Lenovo
 */
public class Usuario_Tarea2 {
    int dpi; //Variable del DPI del usuario 
    String nombre; //Variable del nombre del usuario 
    String apellido; //Variable del apellido del usuario 
    int rol; // 0=administrador o 1= usuario 
    String password; // contraseña del usuario
    String user; //usuario 
    //Contructor 
  Usuario_Tarea2(int dpi, String nombre,String apellido, String password, String user){
        this.dpi= dpi;
        this.nombre= nombre; 
        this.apellido= apellido;
        this.password = password;
        this.user= user;
    }
//Get and set

    
     

    

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    
    
   
   
    
}
