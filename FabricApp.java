/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coding;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 Program Name: FabricApp.java
 Programmer's Name: Robert Kieca
 Program Description: Connect to the database and allow users to
 add/update/delete Customer's Order and save it to database
 */
public class FabricApp extends javax.swing.JFrame {

    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;

    public FabricApp() {
        setResizable(false);
        setTitle("Robert Kieca's Fabric App");
        initComponents();
        con = JavaConnect.ConnectDB();
        showTable();
    }

    private void showTable() {
        try {
            String sql = "SELECT Customer.ID AS 'ORDER NUMBER', Customer.NAME, "
                    + "CONCAT(Order.FABRIC, ' ', Order.COLOR) AS 'DESCRIPTION', "
                    + "Order.TOTAL AS 'TOTAL COST' FROM CIS355A_4053.Customer "
                    + "INNER JOIN CIS355A_4053.Order ON Customer.ID=Order.ID "
                    + "ORDER BY Customer.ID";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            tblData.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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

        paneMain = new javax.swing.JSplitPane();
        paneTop = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        paneBottom = new javax.swing.JSplitPane();
        paneLeft = new javax.swing.JPanel();
        lblLeft = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblNum = new javax.swing.JLabel();
        lblStreet = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblZip = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        cbState = new javax.swing.JComboBox();
        paneRight = new javax.swing.JPanel();
        lblRight = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblFabric = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblYards = new javax.swing.JLabel();
        lblSH = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtYards = new javax.swing.JTextField();
        txtSH = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        cbFabric = new javax.swing.JComboBox();
        cbColor = new javax.swing.JComboBox();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        paneMain.setDividerLocation(260);
        paneMain.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        paneMain.setEnabled(false);
        paneMain.setOpaque(true);
        paneMain.setPreferredSize(new java.awt.Dimension(880, 680));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblData.getTableHeader().setReorderingAllowed(false);
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        paneTop.setViewportView(tblData);

        paneMain.setTopComponent(paneTop);

        paneBottom.setDividerLocation(420);
        paneBottom.setEnabled(false);

        lblLeft.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblLeft.setText("CUSTOMER INFORMATION:");

        lblName.setText("Name:");

        lblNum.setText("House Num:");

        lblStreet.setText("Street:");

        lblCity.setText("City:");

        lblState.setText("State:");

        lblZip.setText("Zip Code:");

        lblPhone.setText("Telephone:");

        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumEvent(evt);
            }
        });

        txtZip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumEvent(evt);
            }
        });

        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneEvent(evt);
            }
        });

        cbState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));

        javax.swing.GroupLayout paneLeftLayout = new javax.swing.GroupLayout(paneLeft);
        paneLeft.setLayout(paneLeftLayout);
        paneLeftLayout.setHorizontalGroup(
            paneLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLeftLayout.createSequentialGroup()
                .addGroup(paneLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneLeftLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblLeft))
                    .addGroup(paneLeftLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(paneLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNum)
                            .addGroup(paneLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblZip)
                                .addComponent(lblPhone)
                                .addComponent(lblState)
                                .addComponent(lblCity)
                                .addComponent(lblStreet))
                            .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(paneLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtNum, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtStreet, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtZip, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(cbState, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        paneLeftLayout.setVerticalGroup(
            paneLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(paneLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(paneLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNum)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(paneLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreet)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(paneLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(paneLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState)
                    .addComponent(cbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(paneLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZip)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(paneLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        paneBottom.setLeftComponent(paneLeft);

        lblRight.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblRight.setText("CUSTOMER'S ORDER:");
        lblRight.setToolTipText("");

        lblID.setText("Order Number:");

        lblFabric.setText("Fabric:");

        lblColor.setText("Color:");

        lblYards.setText("Yards:");

        lblSH.setText("Ship/Hand:");
        lblSH.setToolTipText("");

        lblTotal.setText("Total:");

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtID.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        txtYards.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDecimalEvent(evt);
            }
        });

        txtSH.setToolTipText("");
        txtSH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDecimalEvent(evt);
            }
        });

        txtTotal.setEditable(false);

        cbFabric.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bazaar", "Blane", "Cordella", "Fusion", "Locke", "Nyoko", "Tanglewood" }));

        cbColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Black", "Blue", "Gray", "Green", "Red", "White", "Yellow" }));

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneRightLayout = new javax.swing.GroupLayout(paneRight);
        paneRight.setLayout(paneRightLayout);
        paneRightLayout.setHorizontalGroup(
            paneRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneRightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRight)
                .addGap(94, 94, 94))
            .addGroup(paneRightLayout.createSequentialGroup()
                .addGroup(paneRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneRightLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(paneRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTotal)
                            .addComponent(lblFabric)
                            .addComponent(lblID)
                            .addComponent(lblColor)
                            .addComponent(lblYards)
                            .addComponent(lblSH))
                        .addGap(18, 18, 18)
                        .addGroup(paneRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(txtYards)
                                .addComponent(txtSH)
                                .addComponent(txtTotal)
                                .addComponent(cbColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cbFabric, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paneRightLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        paneRightLayout.setVerticalGroup(
            paneRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneRightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRight, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(paneRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(paneRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFabric)
                    .addComponent(cbFabric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(paneRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(cbColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(paneRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYards)
                    .addComponent(txtYards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(paneRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSH)
                    .addComponent(txtSH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(paneRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paneRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        paneBottom.setRightComponent(paneRight);

        paneMain.setRightComponent(paneBottom);

        menuFile.setText("FILE");

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuFile.add(menuExit);

        jMenuBar.add(menuFile);

        menuHelp.setText("HELP");

        menuAbout.setText("About");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        menuHelp.add(menuAbout);

        jMenuBar.add(menuHelp);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneMain, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(890, 690));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        try {
            int row = tblData.getSelectedRow();
            String click = (tblData.getModel().getValueAt(row, 0).toString());

            String sql = "SELECT *"
                    + " FROM CIS355A_4053.Customer INNER JOIN CIS355A_4053.Order"
                    + " ON Customer.ID=Order.ID where Customer.ID='" + click + "' ";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                String add1 = rs.getString("ID");
                txtID.setText(add1);

                String add2 = rs.getString("NAME");
                txtName.setText(add2);

                String add3 = rs.getString("NUM");
                txtNum.setText(add3);

                String add4 = rs.getString("STREET");
                txtStreet.setText(add4);

                String add5 = rs.getString("CITY");
                txtCity.setText(add5);

                String add6 = rs.getString("STATE");
                cbState.setSelectedItem(add6);

                String add7 = rs.getString("ZIP");
                txtZip.setText(add7);

                String add8 = rs.getString("PHONE");
                txtPhone.setText(add8);

                String add9 = rs.getString("FABRIC");
                cbFabric.setSelectedItem(add9);

                String add10 = rs.getString("COLOR");
                cbColor.setSelectedItem(add10);

                String add11 = rs.getString("YARDS");
                txtYards.setText(add11);

                String add12 = rs.getString("SHIP_HAND");
                txtSH.setText(add12);

                String add13 = rs.getString("TOTAL");
                txtTotal.setText(add13);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tblDataMouseClicked

    private void txtNumEvent(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumEvent
        char c = evt.getKeyChar();
        if (!(c >= '0' && c <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumEvent

    private void txtPhoneEvent(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneEvent
        char c = evt.getKeyChar();
        if (!(c >= '0' && c <= '9' || c == '-')) {
            evt.consume();
        }    
    }//GEN-LAST:event_txtPhoneEvent

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if ("".equals(txtID.getText())) {
            JOptionPane.showMessageDialog(null, "Cannot update without an Order Number!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(txtYards.getText()) || "".equals(txtSH.getText())) {
            JOptionPane.showMessageDialog(null, "Cannot update without Yards and Ship/Hand!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int result = JOptionPane.showConfirmDialog(null, "Do you want to UPDATE this Order Number?", "Confirm Update",
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                String fv = (String) cbFabric.getSelectedItem();
                double yv = Double.parseDouble(txtYards.getText());
                double shv = Double.parseDouble(txtSH.getText());

                String id = txtID.getText();
                String n = txtName.getText();
                String num = txtNum.getText();
                String s = txtStreet.getText();
                String city = txtCity.getText();
                String st = (String) cbState.getSelectedItem();
                String z = txtZip.getText();
                String p = txtPhone.getText();

                String f = (String) cbFabric.getSelectedItem();
                String c = (String) cbColor.getSelectedItem();
                String y = txtYards.getText();
                String sh = txtSH.getText();

                String total = Double.toString(Calculate.calcTotal(fv, yv, shv));
                txtTotal.setText("$" + total);
                String t = txtTotal.getText();

                try {
                    String sql = "update CIS355A_4053.Customer set NAME ='" + n + "' , NUM ='" + num + "' , STREET ='" + s + "' , CITY ='"
                            + city + "' , STATE ='" + st + "' , ZIP ='" + z + "' , PHONE ='" + p + "' where ID = '" + id + "'";
                    ps = con.prepareStatement(sql);
                    ps.execute();

                    String sql2 = "update CIS355A_4053.Order set FABRIC ='" + f
                            + "' , COLOR ='" + c + "' , YARDS ='" + y + "' , SHIP_HAND ='"
                            + sh + "', TOTAL ='" + t + "' where ID = '" + id + "'";
                    ps = con.prepareStatement(sql2);
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "Customer's Order updated!");

                    txtID.setText("");
                    txtName.setText("");
                    txtNum.setText("");
                    txtStreet.setText("");
                    txtCity.setText("");
                    cbState.setSelectedItem("Alabama");
                    txtZip.setText("");
                    txtPhone.setText("");
                    cbFabric.setSelectedItem("Bazaar");
                    cbColor.setSelectedItem("Black");
                    txtYards.setText("");
                    txtSH.setText("");
                    txtTotal.setText("");
                    showTable();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        if ("".equals(txtName.getText().trim().equals("")) || "".equals(txtYards.getText()) || "".equals(txtSH.getText())) {
            JOptionPane.showMessageDialog(null, "Cannot add without Name, Yards, and Ship/Hand!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int result = JOptionPane.showConfirmDialog(null, "Do you want to create an Order?", "Confirm Add",
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {

                String f = (String) cbFabric.getSelectedItem();
                double y = Double.parseDouble(txtYards.getText());
                double sh = Double.parseDouble(txtSH.getText());
                String total = Double.toString(Calculate.calcTotal(f, y, sh));
                txtTotal.setText("$" + total);

                try {
                    String sql1 = "Insert into CIS355A_4053.Customer (NAME, NUM, STREET, CITY, STATE, ZIP, PHONE) values (?,?,?,?,?,?,?)";
                    String sql2 = "Insert into CIS355A_4053.Order (FABRIC, COLOR, YARDS, SHIP_HAND, TOTAL) values (?,?,?,?,?)";
                    ps = con.prepareStatement(sql1);
                    ps.setString(1, txtName.getText());
                    ps.setString(2, txtNum.getText());
                    ps.setString(3, txtStreet.getText());
                    ps.setString(4, txtCity.getText());
                    ps.setString(5, (String) cbState.getSelectedItem());
                    ps.setString(6, txtZip.getText());
                    ps.setString(7, txtPhone.getText());
                    ps.execute();
                    ps = con.prepareStatement(sql2);
                    ps.setString(1, (String) cbFabric.getSelectedItem());
                    ps.setString(2, (String) cbColor.getSelectedItem());
                    ps.setString(3, txtYards.getText());
                    ps.setString(4, txtSH.getText());
                    ps.setString(5, txtTotal.getText());
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "Customer's order added!");

                    txtID.setText("");
                    txtName.setText("");
                    txtNum.setText("");
                    txtStreet.setText("");
                    txtCity.setText("");
                    cbState.setSelectedItem("Alabama");
                    txtZip.setText("");
                    txtPhone.setText("");
                    cbFabric.setSelectedItem("Bazaar");
                    cbColor.setSelectedItem("Black");
                    txtYards.setText("");
                    txtSH.setText("");
                    txtTotal.setText("");
                    showTable();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if ("".equals(txtID.getText())) {
            JOptionPane.showMessageDialog(null, "Cannot delete without an Order Number!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int result = JOptionPane.showConfirmDialog(null, "Do you want to DELETE this Order Number?", "Confirm Delete",
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                try {
                    String sql1 = "Delete from CIS355A_4053.Customer where ID=?";
                    ps = con.prepareStatement(sql1);
                    ps.setString(1, txtID.getText());
                    ps.execute();
                    String sql2 = "Delete from CIS355A_4053.Order where ID=?";
                    ps = con.prepareStatement(sql2);
                    ps.setString(1, txtID.getText());
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "Customer's Order deleted");

                    txtID.setText("");
                    txtName.setText("");
                    txtNum.setText("");
                    txtStreet.setText("");
                    txtCity.setText("");
                    cbState.setSelectedItem("Alabama");
                    txtZip.setText("");
                    txtPhone.setText("");
                    cbFabric.setSelectedItem("Bazaar");
                    cbColor.setSelectedItem("Black");
                    txtYards.setText("");
                    txtSH.setText("");
                    txtTotal.setText("");
                    showTable();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        if ("".equals(txtID.getText())) {
            JOptionPane.showMessageDialog(null, "Cannot clear without an Order Number!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            txtID.setText("");
            txtName.setText("");
            txtNum.setText("");
            txtStreet.setText("");
            txtCity.setText("");
            cbState.setSelectedItem("Alabama");
            txtZip.setText("");
            txtPhone.setText("");
            cbFabric.setSelectedItem("Bazaar");
            cbColor.setSelectedItem("Black");
            txtYards.setText("");
            txtSH.setText("");
            txtTotal.setText("");
        }
    }//GEN-LAST:event_btnClearActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Do you want to exit this application?", "Confirm Exit",
                JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            try {
                rs.close();
                ps.close();
                con.close();
                System.exit(0);
            } catch (SQLException ex) {
                Logger.getLogger(FabricApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        JOptionPane.showMessageDialog(null, "This is Robert Kieca's Fabric Application."
                + "\nCreated on April 27th, 2015 for CIS355A class at DeVry University.",
                "About", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_menuAboutActionPerformed

    private void txtDecimalEvent(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDecimalEvent
        char c = evt.getKeyChar();
        if (!(c >= '0' && c <= '9' || c == '.')) {
            evt.consume();
        }   
    }//GEN-LAST:event_txtDecimalEvent

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(JFabricApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JFabricApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JFabricApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JFabricApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FabricApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cbColor;
    private javax.swing.JComboBox cbFabric;
    private javax.swing.JComboBox cbState;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblFabric;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLeft;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblRight;
    private javax.swing.JLabel lblSH;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblYards;
    private javax.swing.JLabel lblZip;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JSplitPane paneBottom;
    private javax.swing.JPanel paneLeft;
    private javax.swing.JSplitPane paneMain;
    private javax.swing.JPanel paneRight;
    private javax.swing.JScrollPane paneTop;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSH;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtYards;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
