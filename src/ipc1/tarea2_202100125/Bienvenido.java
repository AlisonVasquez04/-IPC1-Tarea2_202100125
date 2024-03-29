/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ipc1.tarea2_202100125;

/**
 *
 * @author Lenovo
 */
public class Bienvenido extends javax.swing.JFrame {

   String nombre;
   Usuario_Tarea2 usuarios[];
   
   //Constructor
    public Bienvenido(String nombre, Usuario_Tarea2 usuarios[]) {
       this.nombre = nombre;  
       this.usuarios = usuarios;
        initComponents();
        Nombre.setText(this.nombre);
        this.setLocationRelativeTo(null);
       
    }
//Informacion de la tabla 
    public void datos(){
        //Matriz de los usuarios
        String matriz [][] = new String[usuarios.length][3];
        for(int i=0;i<usuarios.length;i++){
            if(usuarios[i]!=null){
                matriz[i][0]=String.valueOf(usuarios[i].getDpi());
                matriz[i][1]=usuarios[i].getNombre();
               matriz[i][2]=usuarios[i].getApellido();
               }
        }
        tabla.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String []{
                    "DPI", "Nombre", "Apellido"
                }
            
        ));
 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(579, 470));
        setPreferredSize(new java.awt.Dimension(579, 470));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 70, 60));

        jLabel3.setFont(new java.awt.Font("Bauhaus 93", 0, 36)); // NOI18N
        jLabel3.setText("¡Bienvenido!");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 230, 40));

        Nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 210, 20));

        tabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DPI", "Nombre", "Apellido"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 480, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipc1/tarea2_202100125/imagen/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
  //  public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
 //           for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
 //               if ("Nimbus".equals(info.getName())) {
 //                   javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
    //            }
    //        }
   //     } catch (ClassNotFoundException ex) {
    //        java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
   //     } catch (InstantiationException ex) {
   //         java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
   //     } catch (IllegalAccessException ex) {
  //          java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  //      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
  //          java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
   //     }
        //</editor-fold>

        /* Create and display the form */
     //   java.awt.EventQueue.invokeLater(new Runnable() {
      //      public void run() {
      //          new Bienvenido().setVisible(true);
       //     }
      //  });
  //  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
