/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redes2.pkg0;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Desktop
 */
public class PantallaPrincipal extends javax.swing.JFrame {
    
    int cont = 0;
    int i = 0;
    ConexionBD con = new ConexionBD();
    Connection cn = con.conexion();
    
    Calendar fecha1 = Calendar.getInstance();
    Calendar fecha2 = Calendar.getInstance();
    Calendar fecha3 = Calendar.getInstance();
    
    LinkedList<Integer> IDEstanque = new LinkedList();
    LinkedList<Integer> IDRecarga = new LinkedList();
    LinkedList<Date> Fecha = new LinkedList();
    //LinkedList<String> Fecha = new LinkedList();
    LinkedList<Integer> porcentajeInicial = new LinkedList();
    LinkedList<Float> porcentajeFinal = new LinkedList();
    LinkedList<Float> litrosTotales = new LinkedList();
    LinkedList<Float> consumoPromDiario = new LinkedList();
    
    LinkedList<Date> FechaTemp = new LinkedList();
    LinkedList<Float> tempMin = new LinkedList();

 

    
    
    public PantallaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        Mostrar = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbComuna = new javax.swing.JComboBox<>();
        cmbCondominio = new javax.swing.JComboBox<>();
        cmbEstanque = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        btnConsulta = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCalculo = new javax.swing.JTable();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));

        Mostrar.setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Desktop\\Pictures\\1.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(393, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        Mostrar.addTab("PantallaPrincipal", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 0));

        jLabel3.setText("Por Comuna");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Seleccione los parametros para mostrar:");

        jLabel4.setText("Por Condominio");

        jLabel5.setText("Por Estanque");

        cmbComuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODAS" }));
        cmbComuna.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbComunaItemStateChanged(evt);
            }
        });

        cmbCondominio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS" }));

        cmbEstanque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS" }));

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        btnConsulta.setText("Consulta");
        btnConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConsulta)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(26, 26, 26)
                                    .addComponent(cmbComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(182, 182, 182)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(143, 143, 143)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmbEstanque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 263, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(cmbComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEstanque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Mostrar.addTab("Mostrar Datos", jPanel2);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        tablaCalculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaCalculo);

        btnCalcular.setText("Calcular");
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnCalcular)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        Mostrar.addTab("Calcular Datos", jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mostrar)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addComponent(Mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbComunaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbComunaItemStateChanged
        
    }//GEN-LAST:event_cmbComunaItemStateChanged

    private void btnConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaMouseClicked
        
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Nº");
        datos.addColumn("Comuna");
        datos.addColumn("Condominio");
        datos.addColumn("ID Estanque");
        datos.addColumn("ID Recarga");
        datos.addColumn("% Inicial");
        datos.addColumn("% Final");
        datos.addColumn("Litros Cargados");
        datos.addColumn("Total Litros");
        datos.addColumn("Fecha Recarga");
        
        //datos.addColumn("Consumo Diario");
        
        tablaDatos.setModel(datos);

        String sqlTodo = "SELECT\n" +
                        "NEURO.CONDOMINIO.COMUNARESPONSABLE,\n" +
                        "NEURO.CONDOMINIO.NOMBRECONDOMINIO,\n" +
                        "NEURO.ESTANQUE.ID_ESTANQUE,\n" +
                        "NEURO.RECARGA.ID_RECARGA,\n" +
                        "NEURO.RECARGA.PORCENTAJEINICIAL,\n" +
                        "NEURO.RECARGA.PORCENTAJEFINAL,\n" +
                        "NEURO.RECARGA.LITROSCARGADOS,\n" +
                        "NEURO.RECARGA.TOTALLITROS,\n" +
                        "NEURO.RECARGA.FECHA\n" +
                        "FROM\n" +
                        "NEURO.CONDOMINIO\n" +
                        "INNER JOIN NEURO.ESTANQUE ON NEURO.CONDOMINIO.ID_CONDOMINIO = NEURO.ESTANQUE.CONDOMINIO_ID_CONDOMINIO\n" +
                        "INNER JOIN NEURO.RECARGA ON NEURO.ESTANQUE.ID_ESTANQUE = NEURO.RECARGA.ESTANQUE_ID_ESTANQUE\n" +
                        "ORDER BY\n" +
                        "NEURO.RECARGA.ESTANQUE_ID_ESTANQUE ASC, \n" +
                        "NEURO.RECARGA.FECHA ASC";
        
        System.out.println("SQL TODO!!: "+sqlTodo);
        
        String datosComuna[] = new String [10];
        Statement st;
        String textcont = "";

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sqlTodo);
            
            while (rs.next()){
                
                textcont = Integer.toString(cont);
                datosComuna[0]= textcont;           //Nº
                datosComuna[1]=rs.getString(1);     //Comuna
                datosComuna[2]=rs.getString(2);     //Condominio
                datosComuna[3]=rs.getString(3);     //ID Estanque
                datosComuna[4]=rs.getString(4);     //ID Recarga
                datosComuna[5]=rs.getString(5);     //% Inicial
                datosComuna[6]=rs.getString(6);     //% Final
                datosComuna[7]=rs.getString(7);     //Litros Cargados
                datosComuna[8]=rs.getString(8);     //Litros Totales
                datosComuna[9]=rs.getString(9);     //Fecha Recarga
                datos.addRow(datosComuna);
                
                IDEstanque.add(Integer.parseInt(rs.getString(3)));
                IDRecarga.add(Integer.parseInt(rs.getString(4)));
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Fecha.add(format.parse(rs.getString(9)));
                //Fecha.add(rs.getString(9));
                porcentajeInicial.add(Integer.parseInt(rs.getString(5)));
                porcentajeFinal.add(Float.parseFloat(rs.getString(6)));
                litrosTotales.add(Float.parseFloat(rs.getString(8)));
                
                //System.out.println(IDEstanque.get(cont)+" | "+Fecha.get(cont)); //<--FUNCIONA!!!
                cont++;
            }
            tablaDatos.setModel(datos);
            
        } catch (SQLException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) { //EXCEPTION PARA LA FECHA  
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
        String sqlTemp = "SELECT\n" +
                        "NEURO.TEMPERATURA.FECHA,\n" +
                        "NEURO.TEMPERATURA.TEMPMINIMA\n" +
                        "FROM\n" +
                        "NEURO.TEMPERATURA";

        try {
            st = cn.createStatement();
            
            ResultSet rs = st.executeQuery(sqlTemp);
            
            while (rs.next()){
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                FechaTemp.add(format.parse(rs.getString(1)));
                tempMin.add(Float.parseFloat(rs.getString(2)));
            }
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConsultaMouseClicked

    private void btnCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseClicked
        long mill1 = 0;
        long mill2 = 0;   
        long daydiff = 0;
        long diff =0;
        String textaux = "";
        int aux = 0;
        float difporcentaje = 0;
        int cpd = 0;
        float litrosInicial = 0;
        float litrosConsumidos = 0;
        float consProm = 0;
        int largo = 0;
        
        

        
        DefaultTableModel calculo = new DefaultTableModel();
        
        calculo.addColumn("Nº");
        calculo.addColumn("ID Estanque");
        calculo.addColumn("ID Recarga");
        calculo.addColumn("Fecha Recarga");
        calculo.addColumn("% Inicial");
        calculo.addColumn("% Final");
        calculo.addColumn("Litros Totales");
        calculo.addColumn("Consumo Promedio Diario");
        //calculo.addColumn("% Actual");
        //calculo.addColumn("");
        
        tablaCalculo.setModel(calculo);
        String datosCalculo[] = new String [8];
        
        if ((IDEstanque.size() == IDRecarga.size()) == (Fecha.size() == porcentajeInicial.size()) == (porcentajeFinal.size() == litrosTotales.size())){
            System.out.println("\n \n SIZE: "+IDEstanque.size());
            
            
            while (aux < IDEstanque.size()){
                
               System.out.println("Entra al WHILE");
               // System.out.print("\nID ESTANQUE= "+IDEstanque.get(aux));
               if(aux==IDEstanque.size()){
                   System.out.println("Entra al primer IF");
                   
               }else{
                   
                System.out.println("Entra al primer Else del IF");
                if((Objects.equals(IDEstanque.get(aux), IDEstanque.get(aux+1)))){ //si se cumple, entonces calcular diferencia de fechas

                    System.out.println("\n ID Estanque Aux: "+aux+", Aux+1: "+(aux+1));
                    
                    fecha1.setTime(Fecha.get(aux));
                    fecha2.setTime(Fecha.get(aux+1));
                    mill1 = fecha1.getTimeInMillis();
                    mill2 = fecha2.getTimeInMillis();
                    diff = mill2 - mill1;
                    daydiff = diff / (86400000);
                    int lng = (int) daydiff;
                    if(lng == 0){
                        lng=1;
                    }

                    difporcentaje = (porcentajeFinal.get(aux) - porcentajeInicial.get(aux+1));
                     System.out.println("difporcentaje: "+difporcentaje);
      
                    litrosInicial = ((porcentajeInicial.get(aux+1)*litrosTotales.get(aux+1))/(porcentajeFinal.get(aux+1)));
                     System.out.println("litrosInicial: "+litrosInicial);
                    
                    litrosConsumidos = (litrosTotales.get(aux) - (litrosInicial));
                     System.out.println("litrosConsumidos: "+litrosConsumidos);
                     
                    consProm = (litrosConsumidos/lng);
                    System.out.println("Consumo promedio: "+consProm);
                    consumoPromDiario.add(consProm);

                   System.out.println("LA DIFERENCIA DE DIAS ES DE: "+daydiff+"\n");
                   int p = 0;
                   int h = aux;
                   float porConsDiario = 0;
                   
                   porConsDiario = (difporcentaje/daydiff);
                   fecha3.setTime(Fecha.get(aux));
                   
                   while (p < daydiff){
                        aux++;
                       
                        fecha3.add(Calendar.DAY_OF_YEAR, p); //SE VAN AGREGANDO LOS DIAS QUE CORRESPONDE SUMAR (P)
                        
                        IDEstanque.add(aux, IDEstanque.get(h));
                        IDRecarga.add(aux, IDRecarga.get(h));
                        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                        Fecha.add(aux, fecha3.getTime());
                        porcentajeInicial.add(aux, 0);

                        porcentajeFinal.add(aux, (porcentajeFinal.get(aux-1) - porConsDiario));
                        
                        litrosTotales.add(aux, (litrosTotales.get(aux-1) - consumoPromDiario.get(h)));
                        consumoPromDiario.add(aux, consumoPromDiario.get(h));
                        
                       p++;
                   }
                   
                   aux++;

                }else{
                   System.out.println("\n Son estanques diferentes!\n");
                   System.out.println("\n ID Estanque Aux: "+aux+", Aux+1: "+(aux+1));
                   System.out.println("ID Estamque (aux): "+IDEstanque.get(aux)+" ID Estanque (aux+1)"+ IDEstanque.get(aux+1));
                   consumoPromDiario.add(consProm);
                   //CDI++;
                   //DensInicial.add(Densidad.get(aux+1));
                   aux++;
                }
                }
               
               /*System.out.println("\n AUX: "+aux);
               System.out.println("ID Estanque: "+IDEstanque.get(aux));
               System.out.println("ID Recarga: "+IDRecarga.get(aux));
               System.out.println("Fecha: "+Fecha.get(aux));
               System.out.println("%Inicial: "+porcentajeInicial.get(aux));
               
                System.out.println("\n--------------");
               System.out.println("TAMAÑO CONSUMOPROMDIARIO: "+consumoPromDiario.size());
               System.out.println("aux: "+aux);
               System.out.println("--------------\n");*/
               
                textaux = Integer.toString(aux);
                datosCalculo[0] = textaux;
                datosCalculo[1] = Integer.toString(IDEstanque.get(aux));
                datosCalculo[2] = Integer.toString(IDRecarga.get(aux));
                Format formatter = new SimpleDateFormat("yyyy-MM-dd");
                datosCalculo[3] = formatter.format(Fecha.get(aux));
                
                datosCalculo[4] = Integer.toString(porcentajeInicial.get(aux));
                datosCalculo[5] = Float.toString(porcentajeFinal.get(aux));
                datosCalculo[6] = Float.toString(litrosTotales.get(aux));
                datosCalculo[7] = Float.toString(consumoPromDiario.get(aux));
                
                calculo.addRow(datosCalculo);
                
                
            }
            tablaCalculo.setModel(calculo);
            
        }else{
            System.out.println("LAS CAGAS SON DIFERENTES");
        }

        /*
        ¡¡¡¡¡¡PARA HACER!!!!!!!
        CALCULAR DENTRO DEL PROGRAMA LA CANTIDAD DE LITROS TOTALES, NO SACARLOS DESDE LA BD
        Y FALTA QUE AGRAGAR TODOS LOS DIAS INTERMEDIOS, LUEGO AGREGAR LA TEMPERATURA CORRESPONDIENTE A ESOS DIAS
        */
        
    }//GEN-LAST:event_btnCalcularMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Mostrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JComboBox<String> cmbComuna;
    private javax.swing.JComboBox<String> cmbCondominio;
    private javax.swing.JComboBox<String> cmbEstanque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaCalculo;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
