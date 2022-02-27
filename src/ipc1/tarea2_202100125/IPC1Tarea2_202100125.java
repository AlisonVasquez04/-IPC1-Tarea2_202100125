/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipc1.tarea2_202100125;



public class IPC1Tarea2_202100125 {

    
    
    
    public static void main(String[] args) {
       
        Usuario_Tarea2[] usuarios= new Usuario_Tarea2[50];
        //usuario por defecto, administrador
        usuarios[0]=new Usuario_Tarea2(0,"Administrador","Administrador","123","Administrador");
        Login login =new Login(usuarios);
        login.setVisible(true);
        
    }
    
}
