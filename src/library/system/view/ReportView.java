/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.system.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import library.system.dao.BookDao;
import library.system.dao.BookcategoryDao;
import library.system.dao.CheckinoutDao;
import library.system.dao.ClientDao;
import library.system.dao.ExportPDF;
import library.system.dao.MyExportClass;
import library.system.model.Checkinout;

/**
 *
 * @nadine
 */
public class ReportView extends javax.swing.JInternalFrame {
    String paneres = null;
    /**
     * Creates new form ReportView
     */
    public ReportView() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        checkout = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        date2 = new com.toedter.calendar.JDateChooser();
        text = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmb = new javax.swing.JComboBox<>();
        date1 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        sach = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        checkin = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        buttonGroup1.add(checkout);
        checkout.setText("Check Out");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });

        jLabel7.setText("Operation Category");

        jLabel1.setText("Search by");

        jLabel5.setText("To");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(date1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addComponent(text))
                    .addGap(32, 32, 32)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addGap(28, 28, 28)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(date2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addComponent(cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CLIENT ID", "CLIENT NAME", "BOOK TITLE", "BOOK CATEGORY", "DATE" }));
        jComboBox1.setBorder(null);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        sach.setText("Search");
        sach.setAlignmentY(0.0F);
        sach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sachActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Button", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton2.setText("Print");

        jButton3.setText("Export PDF");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Export Excel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Close");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        buttonGroup1.add(checkin);
        checkin.setText("Check In");
        checkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(checkin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addComponent(checkout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(checkin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(sach, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
        paneres=pane();
    }//GEN-LAST:event_checkoutActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if(jComboBox1.getSelectedItem().toString().equals("BOOK CATEGORY")){
            addData();
            cmb.setEnabled(true);
            text.setEnabled(false);
            date1.setEnabled(false);
            date2.setEnabled(false);
        }
        else if(jComboBox1.getSelectedItem().toString().equals("CLIENT ID"))
        {
            text.setEnabled(true);
            cmb.setEnabled(false);
            date1.setEnabled(false);
            date2.setEnabled(false);
        }
        else if(jComboBox1.getSelectedItem().toString().equals("CLIENT NAME"))
        {
            text.setEnabled(true);
            cmb.setEnabled(false);
            date1.setEnabled(false);
            date2.setEnabled(false);
        }
        else if(jComboBox1.getSelectedItem().toString().equals("BOOK ID"))
        {
            text.setEnabled(true);
            cmb.setEnabled(false);
            date1.setEnabled(false);
            date2.setEnabled(false);
        }
        else if(jComboBox1.getSelectedItem().toString().equals("BOOK TITLE"))
        {
            text.setEnabled(true);
            cmb.setEnabled(false);
            date1.setEnabled(false);
            date2.setEnabled(false);
        }
        else if(jComboBox1.getSelectedItem().toString().equals("DATE"))
        {
            date1.setEnabled(true);
            date2.setEnabled(true);
            cmb.setEditable(false);
            text.setEditable(false);
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void sachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sachActionPerformed
        if(checkin.isSelected() || checkout.isSelected()){
            if(jComboBox1.getSelectedItem().toString().equals("BOOK CATEGORY")){
                if(cmb.getSelectedItem()!=null)
                reportByCategory(cmb.getSelectedItem().toString());
            }
            else if(jComboBox1.getSelectedItem().toString().equals("CLIENT ID"))
            {
                if(text.getText()!=null)
                reportByClientId(text.getText());
            }
            else if(jComboBox1.getSelectedItem().toString().equals("CLIENT NAME"))
            {
                if(text.getText()!=null)
                reportByClientName(text.getText());
            }
            else if(jComboBox1.getSelectedItem().toString().equals("BOOK TITLE"))
        {
            if(text.getText()!=null)
                reportByBookTitle(text.getText());
        }
            else if(jComboBox1.getSelectedItem().toString().equals("DATE"))
            {
                if(date1.getDate()!=null || date2.getDate()!=null)
                reportByDate(new Date(date1.getDate().getTime()),new Date(date2.getDate().getTime()));
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select Operation !!");
        }
    }//GEN-LAST:event_sachActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ExportPDF pdf = new ExportPDF();
        pdf.exportPdfData(table);
        JOptionPane.showMessageDialog(this, "The Data Exported to PDF Successfully !!!");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MyExportClass m = new MyExportClass();
        m.export(table,"operation");
        JOptionPane.showMessageDialog(this, "The Data Exported to Excel Successfully !!!");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void checkinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinActionPerformed
        paneres=null;
    }//GEN-LAST:event_checkinActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton checkin;
    private javax.swing.JRadioButton checkout;
    private javax.swing.JComboBox<String> cmb;
    private com.toedter.calendar.JDateChooser date1;
    private com.toedter.calendar.JDateChooser date2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sach;
    private javax.swing.JTable table;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables

        public void reportByCategory(String category){
        ClientDao cdao = new ClientDao();
        BookDao bdao = new BookDao();
        Object[] colnames = {"OPERATION NUM.","CLIENT NAME","BOOK NAME","TAKEN/RETURNED DATE","OPERATION CAT.","STATUS"};
        DefaultTableModel tm = (DefaultTableModel) table.getModel();
        tm.setRowCount(0);
        tm.setColumnIdentifiers(colnames);
        CheckinoutDao ckdao =  new CheckinoutDao();
        List<Object[]> operations = ckdao.getReportOfDataCategory(cmb.getSelectedItem().toString(), checkin.isSelected()?"CHECK IN":"CHECK OUT");
        for(Object[] c:operations){
            String[] dat = {c[0].toString(),cdao.getClientName(c[1].toString()).toString(),bdao.getName(c[2].toString()),new SimpleDateFormat("dd-MM-yyyy").format((Date) c[3]),c[4].toString(),c[5].toString()};
            
            if("All".equals(paneres) || paneres==null){
                tm.addRow(dat);
            }
            else if(paneres.equals(c[5].toString())){
                tm.addRow(dat);
            }
            
            
        }
        table.setModel(tm);
    }
    
     public void reportByClientName(String cname){
         CheckinoutDao ckdao =  new CheckinoutDao();
         ClientDao cdao = new ClientDao();
         BookDao bdao = new BookDao();
        List<Checkinout> operations = ckdao.getReportOfData("client",cdao.getRegno(text.getText()), checkin.isSelected()?"CHECK IN":"CHECK OUT");
        DefaultTableModel tm = (DefaultTableModel) table.getModel();
        tm.setRowCount(0);
        String[] colnames = {"OPERATION NUM.","CLIENT NAME","BOOK NAME","TAKEN/RETURNED DATE","OPERATION CAT.","STATUS"}; 
        tm.setColumnIdentifiers(colnames);
        for(Checkinout c:operations){
            String obj[] ={c.getOpnumber(),cdao.getClientName(c.getClient().getRegno()).toString(),bdao.getName(c.getBook().getBookid()),new SimpleDateFormat("dd-MM-yyyy").format(c.getDatetime()),c.getOperationcategory(),c.getStatus()};  
            if("All".equals(paneres) || paneres==null){
                tm.addRow(obj);
            }
            else if(paneres.equals(c.getStatus())){
                tm.addRow(obj);
            }  
        }
        table.setModel(tm);
    }
    public void reportByClientId(String cid){
        CheckinoutDao ckdao =  new CheckinoutDao();
        ClientDao cdao = new ClientDao();
        BookDao bdao = new BookDao();
        List<Checkinout> operations = ckdao.getReportOfData("client",text.getText(), checkin.isSelected()?"CHECK IN":"CHECK OUT");
        DefaultTableModel tm = (DefaultTableModel) table.getModel();
        tm.setRowCount(0);
        String[] colnames = {"OPERATION NUM.","CLIENT NAME","BOOK NAME","TAKEN/RETURNED DATE","OPERATION CAT.","STATUS"}; 
        tm.setColumnIdentifiers(colnames);
        for(Checkinout c:operations){
            String obj[] ={c.getOpnumber(),cdao.getClientName(c.getClient().getRegno()).toString(),bdao.getName(c.getBook().getBookid()),new SimpleDateFormat("dd-MM-yyyy").format(c.getDatetime()),c.getOperationcategory(),c.getStatus()};  
            if("All".equals(paneres) || paneres==null){
                tm.addRow(obj);
            }
            else if(paneres.equals(c.getStatus())){
                tm.addRow(obj);
            }
        }
        table.setModel(tm);
    }
    public void reportByBookTitle(String title){
        CheckinoutDao ckdao =  new CheckinoutDao();
        ClientDao cdao = new ClientDao();
        BookDao bdao = new BookDao();
        List<Checkinout> operations = ckdao.getReportOfData("book",ckdao.getId("Book", "title", text.getText(), "bookid"), checkin.isSelected()?"CHECK IN":"CHECK OUT");
        DefaultTableModel tm = (DefaultTableModel) table.getModel();
        tm.setRowCount(0);
        String[] colnames = {"OPERATION NUM.","CLIENT NAME","BOOK NAME","TAKEN/RETURNED DATE","OPERATION CAT.","STATUS"}; 
        tm.setColumnIdentifiers(colnames);
        for(Checkinout c:operations){
            String obj[] ={c.getOpnumber(),cdao.getClientName(c.getClient().getRegno()),bdao.getName(c.getBook().getBookid()),new SimpleDateFormat("dd-MM-yyyy").format(c.getDatetime()),c.getOperationcategory(),c.getStatus()};  
            if("All".equals(paneres) || paneres==null){
                tm.addRow(obj);
            }
            else if(paneres.equals(c.getStatus())){
                tm.addRow(obj);
            }
        }
        table.setModel(tm);
    }
    public void reportByDate(Date date1,Date date2){
        CheckinoutDao ckdao =  new CheckinoutDao();
         ClientDao cdao = new ClientDao();
        BookDao bdao = new BookDao();
        List<Checkinout> operations = ckdao.getReportOfDataDate(date1,date2, checkin.isSelected()?"CHECK IN":"CHECK OUT");
        DefaultTableModel tm = (DefaultTableModel) table.getModel();
        tm.setRowCount(0);
        String[] colnames = {"OPERATION NUM.","CLIENT NAME","BOOK NAME","TAKEN/RETURNED DATE","OPERATION CAT.","STATUS"}; 
        tm.setColumnIdentifiers(colnames);
        for(Checkinout c:operations){
            String obj[] ={c.getOpnumber(),cdao.getClientName(c.getClient().getRegno()).toString(),bdao.getName(c.getBook().getBookid()),new SimpleDateFormat("dd-MM-yyyy").format(c.getDatetime()),c.getOperationcategory(),c.getStatus()};  
            if("All".equals(paneres) || paneres==null){
                tm.addRow(obj);
            }
            else if(paneres.equals(c.getStatus())){
                tm.addRow(obj);
            }
        }
        table.setModel(tm);
    }
    public String pane(){
        final JPanel pa =  new JPanel();
        final JRadioButton r1 = new JRadioButton("Have");
        final JRadioButton r2 = new JRadioButton("Returned");
        final JRadioButton r3 = new JRadioButton("All");
        ButtonGroup g1 = new ButtonGroup();
        g1.add(r3);
        g1.add(r2);
        g1.add(r1);
        pa.add(r1);
        pa.add(r2);
        pa.add(r3);
        JOptionPane.showMessageDialog(cmb, pa);
        return r1.isSelected()?"Have":r2.isSelected()?"Returned":r3.isSelected()?"All":null;
    }
    public void addData(){
        BookcategoryDao bcdao = new BookcategoryDao();
        List<String> catnames  = bcdao.categorynames();
        cmb.removeAllItems();
        for(String b:catnames){
            cmb.addItem(b);
        }
    }
}
