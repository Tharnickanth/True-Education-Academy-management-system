/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import ExceptionModels.AddressEmpty;
import ExceptionModels.DateOfBirthEmpty;
import ExceptionModels.DistrictEmpty;
import ExceptionModels.FirstNameEmpty;
import ExceptionModels.GenderEmpty;
import ExceptionModels.LastNameEmpty;
import ExceptionModels.NICNumberEmpty;
import ExceptionModels.StudentIDEmpty;
import Models.Student;
import Models.UndergraduateStudent;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Tharnickanth
 */
public class EntrollUndergraduateStudentUI extends javax.swing.JFrame {

    String Gender, Program, Program1;

    public EntrollUndergraduateStudentUI() {
        initComponents();
        ShowUndergraduateStudent();

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    public ArrayList<UndergraduateStudent> StudentList() {

        ArrayList<UndergraduateStudent> undergraduateStudentList = new ArrayList();

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=tharni12";
            Connection con = DriverManager.getConnection(url);
            String query1 = "Select * from UnderGraduateStudentInformatation";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            UndergraduateStudent undergraduateStudent;
            while (rs.next()) {

                undergraduateStudent = new UndergraduateStudent(rs.getString("FirstName"), rs.getString("LastName"), rs.getString("Address"), rs.getString("District"), rs.getString("DOB"), rs.getString("NIC"), rs.getString("Gender"), rs.getString("Email"), rs.getString("Telephone"), rs.getString("SID"), rs.getString("Program"));
                undergraduateStudentList.add(undergraduateStudent);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return undergraduateStudentList;
    }

    public void ShowUndergraduateStudent() {
        ArrayList<UndergraduateStudent> StudentList1 = StudentList();
        DefaultTableModel model = (DefaultTableModel) UndergraduateStudenttable.getModel();
        Object[] Column = new Object[11];

        for (int x = 0; x < StudentList1.size(); x++) {
            Column[0] = StudentList1.get(x).StudentID;
            Column[1] = StudentList1.get(x).FirstName;
            Column[2] = StudentList1.get(x).LastName;
            Column[3] = StudentList1.get(x).Address;
            Column[4] = StudentList1.get(x).District;
            Column[5] = StudentList1.get(x).DOB;
            Column[6] = StudentList1.get(x).NIC;
            Column[7] = StudentList1.get(x).Gender;
            Column[8] = StudentList1.get(x).Email;
            Column[9] = StudentList1.get(x).TelephoneNo;
            Column[10] = StudentList1.get(x).Program;
            model.addRow(Column);

        }
    }

    public void clearData() {
        txtFirstName.setText("");
        txtLastName.setText("");
        txtAddress.setText("");
        txtDistrict.setText("");
        txtNIC.setText("");
        txtSID.setText("");
        txtEmail.setText("");
        txtTelephone.setText("");
        buttonGroup1.clearSelection();
        comProgram.setSelectedIndex(0);
        DateDOB.setCalendar(null);
        txtSearch.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtNIC = new javax.swing.JTextField();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        txtEmail = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        txtSID = new javax.swing.JTextField();
        comProgram = new javax.swing.JComboBox<>();
        DateDOB = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        UndergraduateStudenttable = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        txtDistrict = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(49, 169, 234));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Undergraduate Student Information");

        jLabel3.setText("First Name :");

        jLabel4.setText("Last Name :");

        jLabel5.setText("Address :");

        jLabel6.setText("Date of Birth :");

        jLabel7.setText("NIC Number :");

        jLabel8.setText("Gender :");

        jLabel9.setText("E-mail :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Course Informatation");

        jLabel11.setText("Telephone :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Personal Informatation");

        jLabel2.setText("Student ID :");

        jLabel13.setText("Program :");

        buttonGroup1.add(Male);
        Male.setText("Male");

        buttonGroup1.add(Female);
        Female.setText("Female");

        comProgram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSc (Hons) Computer Science", "BSc (Hons) Computer Networking", "BA (Hons) Business Administration", "BSc (Hons) Human Resources", "BSc(Hons) Electronic & Electrical Engineering" }));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel14.setText("Student ID / NIC :");

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        UndergraduateStudenttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SID", "First Name", "Last Name", "Address", "District", "Date of Birth", "NIC", "Gender", "E-mail", "Telephone ", "Program"
            }
        ));
        UndergraduateStudenttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UndergraduateStudenttableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(UndergraduateStudenttable);

        jLabel15.setText("District :");

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Log off");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel15))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Male)
                                        .addGap(18, 18, 18)
                                        .addComponent(Female))
                                    .addComponent(txtLastName)
                                    .addComponent(txtAddress)
                                    .addComponent(txtNIC)
                                    .addComponent(txtEmail)
                                    .addComponent(txtTelephone)
                                    .addComponent(txtFirstName)
                                    .addComponent(txtDistrict)
                                    .addComponent(DateDOB, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel13))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtSID)
                                        .addComponent(comProgram, 0, 260, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4))))
                            .addComponent(jButton6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 418, Short.MAX_VALUE)
                                .addComponent(jButton7)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jLabel1)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(DateDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(Male)
                                    .addComponent(Female)))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(comProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        LoginUI login = new LoginUI();
        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        EntrollStudentHomeUI esh = new EntrollStudentHomeUI();
        esh.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void UndergraduateStudenttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UndergraduateStudenttableMouseClicked

        int i = UndergraduateStudenttable.getSelectedRow();
        TableModel modle = UndergraduateStudenttable.getModel();
        txtSID.setText(modle.getValueAt(i, 0).toString());
        txtFirstName.setText(modle.getValueAt(i, 1).toString());
        txtLastName.setText(modle.getValueAt(i, 2).toString());
        txtAddress.setText(modle.getValueAt(i, 3).toString());
        txtDistrict.setText(modle.getValueAt(i, 4).toString());
        try {
            int srow = UndergraduateStudenttable.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) modle.getValueAt(i, 5));
            DateDOB.setDate(date);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        txtNIC.setText(modle.getValueAt(i, 6).toString());
        String sex = modle.getValueAt(i, 7).toString();
        if (sex.equals("Male")) {
            Male.setSelected(true);
        }
        if (sex.equals("Female")) {
            Female.setSelected(true);
        }
        txtEmail.setText(modle.getValueAt(i, 8).toString());
        txtTelephone.setText(modle.getValueAt(i, 9).toString());
        String Prg = modle.getValueAt(i, 10).toString();
        switch (Prg) {
            case "BSc (Hons) Computer Science":
            comProgram.setSelectedIndex(0);
            break;
            case "BSc (Hons) Computer Networking":
            comProgram.setSelectedIndex(1);
            break;
            case "BA (Hons) Business Administration":
            comProgram.setSelectedIndex(2);
            break;
            case "BSc (Hons) Human Resources":
            comProgram.setSelectedIndex(3);
            break;
            case "BSc(Hons) Electronic & Electrical Engineering":
            comProgram.setSelectedIndex(4);
            break;

        }

    }//GEN-LAST:event_UndergraduateStudenttableMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=tharni12";
            Connection con = DriverManager.getConnection(url);
            String query = "Select * from UnderGraduateStudentInformatation where SID=? or NIC=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txtSearch.getText());
            pst.setString(2, txtSearch.getText());
            ResultSet rs = pst.executeQuery();
            UndergraduateStudent ugs;
            while (rs.next()) {
                ugs = new UndergraduateStudent(rs.getString("FirstName"), rs.getString("LastName"), rs.getString("Address"), rs.getString("District"), rs.getString("DOB"), rs.getString("NIC"), rs.getString("Gender"), rs.getString("Email"), rs.getString("Telephone"), rs.getString("SID"), rs.getString("Program"));
                txtFirstName.setText(ugs.FirstName);
                txtLastName.setText(ugs.LastName);
                txtAddress.setText(ugs.Address);
                txtDistrict.setText(ugs.District);
                txtEmail.setText(ugs.Email);
                txtNIC.setText(ugs.NIC);
                txtSID.setText(ugs.StudentID);
                txtTelephone.setText(ugs.TelephoneNo);

                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(ugs.DOB);
                DateDOB.setDate(date);

                if (ugs.Gender.equals("Male")) {
                    Male.setSelected(true);
                }
                if (ugs.Gender.equals("Female")) {
                    Female.setSelected(true);
                }
                String Prg = ugs.Program;
                switch (Prg) {
                    case "BSc (Hons) Computer Science":
                    comProgram.setSelectedIndex(0);
                    break;
                    case "BSc (Hons) Computer Networking":
                    comProgram.setSelectedIndex(1);
                    break;
                    case "BA (Hons) Business Administration":
                    comProgram.setSelectedIndex(2);
                    break;
                    case "BSc (Hons) Human Resources":
                    comProgram.setSelectedIndex(3);
                    break;
                    case "BSc(Hons) Electronic & Electrical Engineering":
                    comProgram.setSelectedIndex(4);
                    break;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=tharni12";
            Connection con = DriverManager.getConnection(url);
            String query = "delete UnderGraduateStudentInformatation where SID=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txtSID.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) UndergraduateStudenttable.getModel();
            model.setRowCount(0);
            ShowUndergraduateStudent();
            clearData();
            JOptionPane.showMessageDialog(rootPane, "Delete Sucessfully!!!", "Message", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=tharni12";
            Connection con = DriverManager.getConnection(url);
            String query = "update UnderGraduateStudentInformatation set FirstName=?,LastName=?,Address=?,District=?,DOB=?,NIC=?,Gender=?,Email=?,Program=?,Telephone=? where SID=?";
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(11, txtSID.getText());
            pst.setString(1, txtFirstName.getText());
            pst.setString(2, txtLastName.getText());
            pst.setString(3, txtAddress.getText());
            pst.setString(4, txtDistrict.getText());
            if (txtFirstName.getText().equals("")) {
                throw new FirstNameEmpty();
            } else if (txtLastName.getText().equals("")) {
                throw new LastNameEmpty();
            } else if (txtAddress.getText().equals("")) {
                throw new AddressEmpty();
            } else if (txtDistrict.getText().equals("")) {
                throw new DistrictEmpty();
            }

            if (DateDOB.getDate() == null) {
                throw new DateOfBirthEmpty();
            } else {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(DateDOB.getDate());
                pst.setString(5, date);
            }
            pst.setString(6, txtNIC.getText());
            if (txtNIC.getText().equals("")) {
                throw new NICNumberEmpty();
            }

            if (buttonGroup1.getSelection() == null) {
                throw new GenderEmpty();
            } else {
                if (Male.isSelected()) {
                    Gender = "Male";
                }
                if (Female.isSelected()) {
                    Gender = "Female";
                }
            }

            pst.setString(7, Gender);
            pst.setString(8, txtEmail.getText());
            Program = comProgram.getSelectedItem().toString();
            pst.setString(9, Program);
            pst.setString(10, txtTelephone.getText());
            if (txtSID.getText().equals("")) {
                throw new StudentIDEmpty();
            }
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) UndergraduateStudenttable.getModel();
            model.setRowCount(0);
            ShowUndergraduateStudent();
            clearData();
            JOptionPane.showMessageDialog(rootPane, "Update Sucessfully!!!", "Message", 1);

        } catch (ClassNotFoundException e1) {
            JOptionPane.showMessageDialog(null, e1);
        } catch (SQLException e2) {
            JOptionPane.showMessageDialog(null, e2);
        } catch (FirstNameEmpty e3) {
            JOptionPane.showMessageDialog(rootPane, e3.getMessage(), "Message", 2);
        } catch (LastNameEmpty e4) {
            JOptionPane.showMessageDialog(rootPane, e4.getMessage(), "Message", 2);
        } catch (AddressEmpty e5) {
            JOptionPane.showMessageDialog(rootPane, e5.getMessage(), "Message", 2);
        } catch (DistrictEmpty e6) {
            JOptionPane.showMessageDialog(rootPane, e6.getMessage(), "Message", 2);
        } catch (DateOfBirthEmpty e7) {
            JOptionPane.showMessageDialog(rootPane, e7.getMessage(), "Message", 2);
        } catch (NICNumberEmpty e8) {
            JOptionPane.showMessageDialog(rootPane, e8.getMessage(), "Message", 2);
        } catch (GenderEmpty e9) {
            JOptionPane.showMessageDialog(rootPane, e9.getMessage(), "Message", 2);
        } catch (StudentIDEmpty e10) {
            JOptionPane.showMessageDialog(rootPane, e10.getMessage(), "Message", 2);

    }//GEN-LAST:event_jButton3ActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clearData();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=tharni12";
            Connection con = DriverManager.getConnection(url);
            String query = "insert into UnderGraduateStudentInformatation(SID,FirstName,LastName,Address,District,DOB,NIC,Gender,Email,Program,Telephone) values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txtSID.getText());
            pst.setString(2, txtFirstName.getText());
            pst.setString(3, txtLastName.getText());
            pst.setString(4, txtAddress.getText());
            pst.setString(5, txtDistrict.getText());
            if (txtFirstName.getText().equals("")) {
                throw new FirstNameEmpty();
            } else if (txtLastName.getText().equals("")) {
                throw new LastNameEmpty();
            } else if (txtAddress.getText().equals("")) {
                throw new AddressEmpty();
            } else if (txtDistrict.getText().equals("")) {
                throw new DistrictEmpty();
            }
            if (DateDOB.getDate() == null) {
                throw new DateOfBirthEmpty();
            } else {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(DateDOB.getDate());
                pst.setString(6, date);
            }
            pst.setString(7, txtNIC.getText());
            if (txtNIC.getText().equals("")) {
                throw new NICNumberEmpty();
            }
            if (buttonGroup1.getSelection() == null) {
                throw new GenderEmpty();
            } else {
                if (Male.isSelected()) {
                    Gender = "Male";
                }
                if (Female.isSelected()) {
                    Gender = "Female";
                }
                pst.setString(8, Gender);

            }
            pst.setString(9, txtEmail.getText());
            Program = comProgram.getSelectedItem().toString();
            pst.setString(10, Program);
            pst.setString(11, txtTelephone.getText());

            if (txtSID.getText().equals("")) {
                throw new StudentIDEmpty();
            }

            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) UndergraduateStudenttable.getModel();
            model.setRowCount(0);
            ShowUndergraduateStudent();
            clearData();
            JOptionPane.showMessageDialog(rootPane, "Inserted Sucessfully!!!", "Message", 1);

        } catch (ClassNotFoundException e1) {
            JOptionPane.showMessageDialog(null, e1);
        } catch (SQLException e2) {
            JOptionPane.showMessageDialog(null, e2);
        } catch (FirstNameEmpty e3) {
            JOptionPane.showMessageDialog(rootPane, e3.getMessage(), "Message", 2);
        } catch (LastNameEmpty e4) {
            JOptionPane.showMessageDialog(rootPane, e4.getMessage(), "Message", 2);
        } catch (AddressEmpty e5) {
            JOptionPane.showMessageDialog(rootPane, e5.getMessage(), "Message", 2);
        } catch (DistrictEmpty e6) {
            JOptionPane.showMessageDialog(rootPane, e6.getMessage(), "Message", 2);
        } catch (DateOfBirthEmpty e7) {
            JOptionPane.showMessageDialog(rootPane, e7.getMessage(), "Message", 2);
        } catch (NICNumberEmpty e8) {
            JOptionPane.showMessageDialog(rootPane, e8.getMessage(), "Message", 2);
        } catch (GenderEmpty e9) {
            JOptionPane.showMessageDialog(rootPane, e9.getMessage(), "Message", 2);
        } catch (StudentIDEmpty e10) {
            JOptionPane.showMessageDialog(rootPane, e10.getMessage(), "Message", 2);
        }
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
            java.util.logging.Logger.getLogger(EntrollUndergraduateStudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntrollUndergraduateStudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntrollUndergraduateStudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntrollUndergraduateStudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntrollUndergraduateStudentUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateDOB;
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JTable UndergraduateStudenttable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comProgram;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDistrict;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtSID;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTelephone;
    // End of variables declaration//GEN-END:variables

}
