/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.Event;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tharnickanth
 */
public class ViewEventUI extends javax.swing.JFrame {

    /**
     * Creates new form ViewEventUI
     */
    public ViewEventUI() {
        initComponents();
        ShowEvent1();
        ShowEvent2();
        Toolkit toolkit = getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
    }
    public ArrayList<Event> EventList1() {

        ArrayList<Event> eventList = new ArrayList();

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=tharni12";
            Connection con = DriverManager.getConnection(url);
            String query1 = "Select * from EventInformatation where Description like 'Special Event'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Event event;
            while (rs.next()) {

                event = new Event(rs.getString("ename"),rs.getString("eID"),rs.getString("Description"),rs.getString("Message"),rs.getString("EventDate"),rs.getString("sTime"),rs.getString("eTime"),rs.getString("Venue"));
                eventList.add(event);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return eventList;
    }
    public void ShowEvent1() {
        ArrayList<Event> EventList1 = EventList1();
        DefaultTableModel model = (DefaultTableModel) EventTable3.getModel();
        Object[] Column = new Object[8];

        for (int x = 0; x < EventList1.size(); x++) {
            Column[0] = EventList1.get(x).eID;
            Column[1] = EventList1.get(x).ename;
            Column[2] = EventList1.get(x).Description;
            Column[3] = EventList1.get(x).Message;
            Column[4] = EventList1.get(x).Eventdate;
            Column[5] = EventList1.get(x).StartTime;
            Column[6] = EventList1.get(x).EndTime;
            Column[7] = EventList1.get(x).Venue;
            model.addRow(Column);
        }
    }
    
     public ArrayList<Event> EventList2() {

        ArrayList<Event> eventList = new ArrayList();

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=tharni12";
            Connection con = DriverManager.getConnection(url);
            String query1 = "Select * from EventInformatation where Description like 'Culture Event'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Event event;
            while (rs.next()) {

                event = new Event(rs.getString("ename"),rs.getString("eID"),rs.getString("Description"),rs.getString("Message"),rs.getString("EventDate"),rs.getString("sTime"),rs.getString("eTime"),rs.getString("Venue"));
                eventList.add(event);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return eventList;
    }
    public void ShowEvent2() {
        ArrayList<Event> EventList1 = EventList2();
        DefaultTableModel model = (DefaultTableModel) EventTable1.getModel();
        Object[] Column = new Object[8];

        for (int x = 0; x < EventList1.size(); x++) {
            Column[0] = EventList1.get(x).eID;
            Column[1] = EventList1.get(x).ename;
            Column[2] = EventList1.get(x).Description;
            Column[3] = EventList1.get(x).Message;
            Column[4] = EventList1.get(x).Eventdate;
            Column[5] = EventList1.get(x).StartTime;
            Column[6] = EventList1.get(x).EndTime;
            Column[7] = EventList1.get(x).Venue;
            model.addRow(Column);
        }
    }
    public ArrayList<Event> EventList3() {

        ArrayList<Event> eventList = new ArrayList();

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=tharni12";
            Connection con = DriverManager.getConnection(url);
            String query1 = "Select * from EventInformatation where Description like 'Organization Event'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Event event;
            while (rs.next()) {

                event = new Event(rs.getString("ename"),rs.getString("eID"),rs.getString("Description"),rs.getString("Message"),rs.getString("EventDate"),rs.getString("sTime"),rs.getString("eTime"),rs.getString("Venue"));
                eventList.add(event);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return eventList;
    }
    public void ShowEvent3() {
        ArrayList<Event> EventList1 = EventList3();
        DefaultTableModel model = (DefaultTableModel) EventTable2.getModel();
        Object[] Column = new Object[8];

        for (int x = 0; x < EventList1.size(); x++) {
            Column[0] = EventList1.get(x).eID;
            Column[1] = EventList1.get(x).ename;
            Column[2] = EventList1.get(x).Description;
            Column[3] = EventList1.get(x).Message;
            Column[4] = EventList1.get(x).Eventdate;
            Column[5] = EventList1.get(x).StartTime;
            Column[6] = EventList1.get(x).EndTime;
            Column[7] = EventList1.get(x).Venue;
            model.addRow(Column);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        EventTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EventTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        EventTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(49, 169, 234));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Event Details");

        EventTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EID", "Event Name", "Description", "Message", "Date", "Start Time", "End Time", "Venue"
            }
        ));
        jScrollPane2.setViewportView(EventTable1);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Log off");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Culture Event :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Organization Event :");

        EventTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EID", "Event Name", "Description", "Message", "Date", "Start Time", "End Time", "Venue"
            }
        ));
        jScrollPane1.setViewportView(EventTable2);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText(" Special Event :");

        EventTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EID", "Event Name", "Description", "Message", "Date", "Start Time", "End Time", "Venue"
            }
        ));
        jScrollPane3.setViewportView(EventTable3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(320, 320, 320)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 366, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LoginUI login = new LoginUI();
        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HomeUI home = new HomeUI();
        home.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewEventUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEventUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEventUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEventUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEventUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EventTable1;
    private javax.swing.JTable EventTable2;
    private javax.swing.JTable EventTable3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
