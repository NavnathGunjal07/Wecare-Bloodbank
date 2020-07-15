package blood.bank.management.system;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MainForm extends javax.swing.JFrame {
    private Connection connection = null;
    private static String Userid ="0";
    public void setId(String id)
    {
        Userid =id;
    }
    public static String getId()
    {
        return Userid;
    }
    public MainForm() {
        initComponents();
        
        ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getResource("BLOOD.jpg")));
        Image img = icon.getImage();
        Image newImage = img.getScaledInstance(Homeimage.getWidth(),Homeimage.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon newImageIcon = new ImageIcon(newImage);
        Homeimage.setIcon(newImageIcon);
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Homeimage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Registersubmit = new javax.swing.JButton();
        Registercancel = new javax.swing.JButton();
        Registerid = new javax.swing.JTextField();
        Registerpassword = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Loginsubmit = new javax.swing.JButton();
        Logincancel = new javax.swing.JButton();
        Loginpassword = new javax.swing.JPasswordField();
        Loginid = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Logincombobox = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Adminsubmit = new javax.swing.JButton();
        Admincancel = new javax.swing.JButton();
        Adminpassword1 = new javax.swing.JPasswordField();
        Adminname1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Inquirysubmit = new javax.swing.JButton();
        Inquirycancel = new javax.swing.JButton();
        Inquiryid = new javax.swing.JTextField();
        Inquirycontactno = new javax.swing.JTextField();
        Inquiryemail = new javax.swing.JTextField();
        Inquiryname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Inquiry = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        Feedbackcancel = new javax.swing.JButton();
        Feedbacksubmit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Feedback = new javax.swing.JTextArea();
        Feedbackemail = new javax.swing.JTextField();
        Feedbackid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 204));

        jLabel1.setBackground(new java.awt.Color(51, 255, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("                          Blood  Donation Management System");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Homeimage, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Homeimage, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Home", jPanel1);

        jPanel2.setBackground(new java.awt.Color(51, 255, 204));

        jLabel2.setBackground(new java.awt.Color(255, 255, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Enter Your ID");

        jLabel3.setBackground(new java.awt.Color(255, 255, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Enter Your Password");

        Registersubmit.setBackground(new java.awt.Color(255, 255, 0));
        Registersubmit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Registersubmit.setText("Submit");
        Registersubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistersubmitActionPerformed(evt);
            }
        });

        Registercancel.setBackground(new java.awt.Color(255, 255, 0));
        Registercancel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Registercancel.setText("Cancel");

        Registerid.setBackground(new java.awt.Color(255, 255, 0));
        Registerid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        Registerpassword.setBackground(new java.awt.Color(255, 255, 0));
        Registerpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterpasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(Registersubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Registerid, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Registerpassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(Registercancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(129, 129, 129))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Registerid, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(Registerpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(90, 90, 90)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Registersubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Registercancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(103, 103, 103))
        );

        jTabbedPane1.addTab("Register", jPanel2);

        jPanel3.setBackground(new java.awt.Color(51, 255, 204));

        jLabel4.setBackground(java.awt.Color.red);
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Login As");

        jLabel5.setBackground(java.awt.Color.red);
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Enter Your Password");

        Loginsubmit.setBackground(java.awt.Color.red);
        Loginsubmit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Loginsubmit.setText("Submit");
        Loginsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginsubmitActionPerformed(evt);
            }
        });

        Logincancel.setBackground(java.awt.Color.red);
        Logincancel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Logincancel.setText("Cancel");

        Loginpassword.setBackground(java.awt.Color.yellow);
        Loginpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginpasswordActionPerformed(evt);
            }
        });

        Loginid.setBackground(java.awt.Color.yellow);
        Loginid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Loginid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginidActionPerformed(evt);
            }
        });

        jLabel12.setBackground(java.awt.Color.red);
        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Enter Your ID");

        Logincombobox.setBackground(java.awt.Color.yellow);
        Logincombobox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Logincombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Donar" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(Loginsubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(86, 86, 86)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Loginid, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Loginpassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(Logincancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Logincombobox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(129, 129, 129))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Loginid, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(Loginpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logincombobox)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(74, 74, 74)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Loginsubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Logincancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62))
        );

        jTabbedPane1.addTab("Login", jPanel3);

        jPanel4.setBackground(new java.awt.Color(51, 255, 204));

        jLabel6.setBackground(java.awt.Color.red);
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Enter Admin Name");

        jLabel7.setBackground(java.awt.Color.red);
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Enter Admin Password");

        Adminsubmit.setBackground(java.awt.Color.red);
        Adminsubmit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Adminsubmit.setText("Submit");
        Adminsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminsubmitActionPerformed(evt);
            }
        });

        Admincancel.setBackground(java.awt.Color.red);
        Admincancel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Admincancel.setText("Cancel");
        Admincancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmincancelActionPerformed(evt);
            }
        });

        Adminpassword1.setBackground(java.awt.Color.yellow);
        Adminpassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adminpassword1ActionPerformed(evt);
            }
        });

        Adminname1.setBackground(java.awt.Color.yellow);
        Adminname1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Adminname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adminname1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Adminsubmit)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
                .addGap(86, 86, 86)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Adminname1)
                        .addComponent(Adminpassword1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                    .addComponent(Admincancel))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Adminname1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Adminpassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Adminsubmit)
                    .addComponent(Admincancel))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Admin", jPanel4);

        jPanel5.setBackground(new java.awt.Color(51, 255, 204));

        jLabel8.setBackground(java.awt.Color.red);
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Enter Your ID");

        jLabel9.setBackground(java.awt.Color.red);
        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Enter Your Name");

        Inquirysubmit.setBackground(java.awt.Color.red);
        Inquirysubmit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Inquirysubmit.setText("Submit");
        Inquirysubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InquirysubmitActionPerformed(evt);
            }
        });

        Inquirycancel.setBackground(java.awt.Color.red);
        Inquirycancel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Inquirycancel.setText("Cancel");

        Inquiryid.setBackground(new java.awt.Color(255, 255, 0));
        Inquiryid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        Inquirycontactno.setBackground(new java.awt.Color(255, 255, 0));
        Inquirycontactno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        Inquiryemail.setBackground(new java.awt.Color(255, 255, 0));
        Inquiryemail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        Inquiryname.setBackground(new java.awt.Color(255, 255, 0));
        Inquiryname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Inquiryname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InquirynameActionPerformed(evt);
            }
        });

        jLabel13.setBackground(java.awt.Color.red);
        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Enter Your Conatact no.");

        jLabel14.setBackground(java.awt.Color.red);
        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Enter Your Email");

        jLabel15.setBackground(java.awt.Color.red);
        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Enter Your Inquiry");

        Inquiry.setBackground(new java.awt.Color(255, 255, 0));
        Inquiry.setColumns(20);
        Inquiry.setRows(5);
        jScrollPane1.setViewportView(Inquiry);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(Inquirysubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)))
                .addGap(80, 80, 80)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Inquiryid)
                    .addComponent(Inquiryname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(Inquirycancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Inquiryemail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Inquirycontactno))
                .addGap(129, 129, 129))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(Inquiryid, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(Inquiryname, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Inquiryemail)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(Inquirycontactno)))))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70))
                    .addComponent(jScrollPane1))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Inquirycancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Inquirysubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Inquiry Form", jPanel5);

        jPanel6.setBackground(new java.awt.Color(51, 255, 204));

        Feedbackcancel.setBackground(java.awt.Color.red);
        Feedbackcancel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Feedbackcancel.setText("Cancel");

        Feedbacksubmit.setBackground(java.awt.Color.red);
        Feedbacksubmit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Feedbacksubmit.setText("Submit");
        Feedbacksubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeedbacksubmitActionPerformed(evt);
            }
        });

        Feedback.setBackground(new java.awt.Color(255, 255, 0));
        Feedback.setColumns(20);
        Feedback.setRows(5);
        jScrollPane2.setViewportView(Feedback);

        Feedbackemail.setBackground(new java.awt.Color(255, 255, 0));
        Feedbackemail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        Feedbackid.setBackground(new java.awt.Color(255, 255, 0));
        Feedbackid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel10.setBackground(java.awt.Color.red);
        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Enter Your ID");

        jLabel16.setBackground(java.awt.Color.red);
        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Enter Your Email");

        jLabel18.setBackground(java.awt.Color.red);
        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Enter Your FeedBack");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(Feedbacksubmit)
                        .addGap(221, 221, 221)
                        .addComponent(Feedbackcancel))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Feedbackid, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Feedbackemail))))
                .addGap(129, 129, 129))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Feedbackid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Feedbackemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Feedbacksubmit)
                    .addComponent(Feedbackcancel))
                .addGap(54, 54, 54))
        );

        jTabbedPane1.addTab("FeedBack Form", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 0));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 204));
        jLabel11.setText("     Devloped By: ");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 255));
        jLabel17.setText("1) Mr. Navnath Gunjal");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 255));
        jLabel19.setText("2) Mr. Aniket Taskar ");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("             Shri Sai Baba Institue Of Engineering And Allied Sciences");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 204));
        jLabel21.setText("Under Guidence Of Prof. Dange Sir");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(210, 210, 210))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel11))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel21)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("About", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterpasswordActionPerformed

    private void LoginpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginpasswordActionPerformed

    private void Adminpassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adminpassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Adminpassword1ActionPerformed

    private void InquirynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InquirynameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InquirynameActionPerformed

    private void RegistersubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistersubmitActionPerformed
        if(Registerid.getText().equals("")||Registerpassword.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Fill All The Information");
        }
        try {
            connection = DatabaseConnection.dataBaseconnection();
        } catch (InstantiationException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
        {
            setId(Registerid.getText());
            Statement st = connection.createStatement();
            String query ="insert into userregistration values('"+Integer.parseInt(Registerid.getText())+"','"+Registerpassword.getText()+"')";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Submited To Database");
        this.hide();
        new UserRgistration().show();
        }catch(HeadlessException | NumberFormatException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }finally
                {
                    try
        {
            connection.close();
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
                }
    }//GEN-LAST:event_RegistersubmitActionPerformed

    private void InquirysubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InquirysubmitActionPerformed
         try{
          connection = DatabaseConnection.dataBaseconnection();
     }catch(Exception ex)
     {
         JOptionPane.showMessageDialog(null,ex.getMessage());
     }
        try
        {
            Statement st = connection.createStatement();
            String query ="insert into inquiryform values('"+Integer.parseInt(Inquiryid.getText())+"','"+Inquiryname.getText()+"','"+Inquiryemail.getText()+"','"+Inquirycontactno.getText()+"','"+Inquiry.getText()+"')";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Submited To Admin Your Inquiry Will Process Soon.");
        }catch(HeadlessException | NumberFormatException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }finally
                {
                    try
        {
            connection.close();
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
                }
    }//GEN-LAST:event_InquirysubmitActionPerformed

    private void FeedbacksubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedbacksubmitActionPerformed
        try{
          connection = DatabaseConnection.dataBaseconnection();
     }catch(Exception ex)
     {
         JOptionPane.showMessageDialog(null,ex.getMessage());
     }
        try
        {
            Statement st = connection.createStatement();
            String query ="insert into feedback values('"+Integer.parseInt(Feedbackid.getText())+"','"+Feedbackemail.getText()+"','"+Feedback.getText()+"')";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Your FeedBack Is Submited To Admin ");
        }catch(HeadlessException | NumberFormatException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }finally
                {
                    try
        {
            connection.close();
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
                }
    }//GEN-LAST:event_FeedbacksubmitActionPerformed

    private void LoginidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginidActionPerformed

    private void LoginsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginsubmitActionPerformed
       try{
          connection = DatabaseConnection.dataBaseconnection();
     }catch(Exception ex)
     {
         JOptionPane.showMessageDialog(null,ex.getMessage());
     }
        try
        {
            Statement st = connection.createStatement();
            String query ="select id from userregistration where id ='"+Loginid.getText()+"'and password='"+Loginpassword.getText()+"'";
           ResultSet rs = st.executeQuery(query);
           if(rs.next())
           {
               try{
               setId(Loginid.getText());
               if(Logincombobox.getSelectedIndex()==1)
               {
                   dispose();
                 new BloodDoanar().show();
               }
               if(Logincombobox.getSelectedIndex()==0)
               {
                   dispose();
                   new PatientDetails().show();
               }
               }
               catch(Exception ex1)
               {
                   JOptionPane.showMessageDialog(null,ex1.getMessage());
               }
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Un-Authorized Access Please Enter Correct Id And password");
           }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }finally
                {
                    try
        {
            connection.close();
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
                }
    }//GEN-LAST:event_LoginsubmitActionPerformed

    private void AdminsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminsubmitActionPerformed
         try{
          connection = DatabaseConnection.dataBaseconnection();
     }catch(Exception ex)
     {
         JOptionPane.showMessageDialog(null,ex.getMessage());
     }
        try
        {
            Statement st3 = connection.createStatement();
            String query3 ="select name from admin where name='"+Adminname1.getText()+"' and password = '"+Adminpassword1.getText()+"'";
            ResultSet rs3 = st3.executeQuery(query3);
             if(rs3.next())
           {
              this.hide();
              new Admin().show();
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Un-Authorized Access Please Enter Correct Name And password");
           }
         
           } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
                {
                    try
        {
            connection.close();
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
                }
    }//GEN-LAST:event_AdminsubmitActionPerformed

    private void AdmincancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmincancelActionPerformed
        dispose();
        new MainForm().show();
    }//GEN-LAST:event_AdmincancelActionPerformed

    private void Adminname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adminname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Adminname1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admincancel;
    private javax.swing.JTextField Adminname1;
    private javax.swing.JPasswordField Adminpassword1;
    private javax.swing.JButton Adminsubmit;
    private javax.swing.JTextArea Feedback;
    private javax.swing.JButton Feedbackcancel;
    private javax.swing.JTextField Feedbackemail;
    private javax.swing.JTextField Feedbackid;
    private javax.swing.JButton Feedbacksubmit;
    private javax.swing.JLabel Homeimage;
    private javax.swing.JTextArea Inquiry;
    private javax.swing.JButton Inquirycancel;
    private javax.swing.JTextField Inquirycontactno;
    private javax.swing.JTextField Inquiryemail;
    private javax.swing.JTextField Inquiryid;
    private javax.swing.JTextField Inquiryname;
    private javax.swing.JButton Inquirysubmit;
    private javax.swing.JButton Logincancel;
    private javax.swing.JComboBox<String> Logincombobox;
    private javax.swing.JTextField Loginid;
    private javax.swing.JPasswordField Loginpassword;
    private javax.swing.JButton Loginsubmit;
    private javax.swing.JButton Registercancel;
    private javax.swing.JTextField Registerid;
    private javax.swing.JPasswordField Registerpassword;
    private javax.swing.JButton Registersubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
