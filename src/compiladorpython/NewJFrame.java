/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package compiladorpython;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import org.python.util.PythonInterpreter;
/**
 *
 * @author chris
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        jPanel2.setOpaque(false);
        jPanel1.setOpaque(false);
        jPanel3.setOpaque(false);
        jPanel4.setOpaque(false);
        
                    jComboBox1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    String item = (String) jComboBox1.getSelectedItem();
                    switch (item) {
                    case " Palabras reservadas de python":
                    jTextArea1.setText("");
                    palabrareservada();
                    break;
                    case " Operadores aritmeticos de python":
                    jTextArea1.setText("");
                    operadoresarit();
                    break;
                    case " Operadores lógicos de python":
                    jTextArea1.setText("");
                    operadoreslogic();
                    break;
                    case " Operadores de asignación de python":
                    jTextArea1.setText("");
                    oasig();
                    break;
                    case " Operadores relacionales de python":
                    jTextArea1.setText("");
                    operatorsrelacionales();
                    break;
                    }
                    }
                    });  
}

    public void Compilator(){
    PythonInterpreter interpreter = new PythonInterpreter();
    String salida = "";
    
    // Obtiene la salida del PythonInterpreter
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    interpreter.setOut(new PrintStream(outputStream));
    interpreter.exec(jTextArea2.getText());
    
    // Convierte la salida a una cadena y agrégala a jTextArea1
    salida = outputStream.toString();
    jTextArea1.append(salida);
    }
    /**/
    public void palabrareservada(){
    String[] reservedWords = new String[]{"False", "None", "True", "and", "as", "assert", "async", "await","break", "class", "continue", "def", "del", "elif", "else", "except","finally", "for", "from", "global", "if", "import", "in", "is", "lambda","nonlocal", "not", "or", "pass", "raise", "return", "try", "while", "with", "yield","abs", "all", "any", "bin", "bool", "bytearray", "bytes", "callable", "chr", "classmethod","compile", "complex", "delattr", "dict", "dir", "divmod", "enumerate", "eval", "exec", "filter","float", "format", "frozenset", "getattr", "globals", "hasattr", "hash", "help", "hex", "id", "input", "int", "isinstance", "issubclass", "iter", "len", "list", "locals", "map", "max", "memoryview","min", "next", "object", "oct", "open", "ord", "pow", "print", "property", "range", "repr", "reversed","round", "set", "setattr", "slice", "sorted", "staticmethod", "str", "sum", "super", "tuple", "type", "vars","zip"};
    for (String reservedWord : reservedWords) { jTextArea1.append(reservedWord + "\n"); }
    }
    /**/
    public void operadoresarit(){
    String[] arithmeticOperators = new String[]{"+", "-", "*", "/", "%", "**","<<", ">>", ">>>", "++", "--" };
    for (String arithmeticOperator : arithmeticOperators) { jTextArea1.append(arithmeticOperator + "\n"); }    }
    /**/
    public void operadoreslogic(){
    String[] logicalOperators = new String[]{"&&", "||", "!", "==", "!=", ">", "<", ">=", "<="
    };
    for (String logicalOperator : logicalOperators) { jTextArea1.append(logicalOperator + "\n");}    }
    /**/
    public void oasig(){
    String[] assignmentOperators = new String[]{"=","+=","-=","*=","/=","%=","**=","<<=",">>=",">>>=" };
    for (String assignmentOperator : assignmentOperators) { jTextArea1.append(assignmentOperator + "\n");}    }
   /**/
    public void operatorsrelacionales(){ String[] relationalOperators = new String[]{    "==", "!=", ">", "<", ">=", "<=" };
    for (String relationalOperator : relationalOperators) { jTextArea1.append(relationalOperator + "\n"); }  }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   public int borderRadius = 10;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new compiladorpython.NewClass();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        int borderRadius = 10;
        jPanel2 = new compiladorpython.NewClass();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new compiladorpython.NewClass();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel2.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INGRESAR");

        jLabel3.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SALIDA");

        jPanel2.setBackground(new java.awt.Color(0, 255, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        jPanel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel4.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ANALISAR");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setMinimumSize(new java.awt.Dimension(102, 23));
        jPanel3.setPreferredSize(new java.awt.Dimension(102, 23));

        jLabel5.setFont(new java.awt.Font("HP Simplified Jpan", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("RUN");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "palabra reservada", "operadores aritmeticos", "operadores lógicos", "operadores de asignación", "operadores relacional", " " }));

        jLabel1.setFont(new java.awt.Font("Astronauta Script", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Compilador python");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(214, 214, 214)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3))
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel2))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        analisar();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        jTextArea1.setText("");
        Compilator();
    }//GEN-LAST:event_jLabel5MouseClicked
    /*
    ESTE ES EL CODIGO QUE ANALIZA 
    */
    public void analisar(){
    String codigo = jTextArea2.getText();
    String[] reservedWords = new String[]{"False", "None", "True", "and", "as", "assert", "async", "await","break", "class", "continue", "def", "del", "elif", "else", "except",
    "finally", "for", "from", "global", "if", "import", "in", "is", "lambda","nonlocal", "not", "or", "pass", "raise", "return", "try", "while", "with", "yield","abs", "all", "any", "bin", "bool", "bytearray", "bytes", "callable", "chr", "classmethod","compile", "complex", "delattr", "dict", "dir", "divmod", "enumerate", "eval", "exec", "filter",
    "float", "format", "frozenset", "getattr", "globals", "hasattr", "hash", "help", "hex", "id","input", "int", "isinstance", "issubclass", "iter", "len", "list", "locals", "map", "max", "memoryview",
    "min", "next", "object", "oct", "open", "ord", "pow", "print", "property", "range", "repr", "reversed","round", "set", "setattr", "slice", "sorted", "staticmethod", "str", "sum", "super", "tuple", "type", "vars",
    "zip"};
    String[] arithmeticOperators = new String[]{"+", "-", "*", "/", "%", "**","<<", ">>", ">>>", "++", "--"};
    String[] logicalOperators = new String[]{ "&&", "||", "!", "==","!=", ">", "<", ">=", "<="};
    String[] assignmentOperators = new String[]{"=","+=","-=","*=","/=","%=","**=","<<=",">>=",">>>="};
    String[] relationalOperators = new String[]{"==", "!=", ">", "<", ">=", "<=" };
    String[] nums = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
    String[] simbolos = new String[]{",", "{", "}", "(", ")", "'", "/", ":", ";","-",".", ""+'"'+"", " ", "[", "]","|","@", "$", "#","&", "!", "¡"};
    
    Set<String> reservedWordsSet = new HashSet<>(Arrays.asList(reservedWords));
    Set<String> arithmeticOperatorsSet = new HashSet<>(Arrays.asList(arithmeticOperators));
    Set<String> logicalOperatorsSet = new HashSet<>(Arrays.asList(logicalOperators));
    Set<String> assignmentOperatorsSet = new HashSet<>(Arrays.asList(assignmentOperators));
    Set<String> relationalOperatorsSet = new HashSet<>(Arrays.asList(relationalOperators));
    Set<String> simbolosSet = new HashSet<>(Arrays.asList(simbolos));
    Set<String> numsSet = new HashSet<>(Arrays.asList(nums));


StringTokenizer tokenizer = new StringTokenizer(codigo, " ,(){}'./'\':;-+=[]@$#!¡"+'"',true);
    while (tokenizer.hasMoreTokens()) {
    String token = tokenizer.nextToken();
    if (reservedWordsSet.contains(token)) {
    jTextArea1.append(token + " palabra reservada\n");
    }
    else if (arithmeticOperatorsSet.contains(token)) {
    jTextArea1.append(token + " ...Es un operador aritmético\n");
    }
    else if (logicalOperatorsSet.contains(token)) {
    jTextArea1.append(token + " ...Es operador lógico\n");
    }
    else if (assignmentOperatorsSet.contains(token)) {
    jTextArea1.append(token + " ...Es operador de asignación\n");
    }
    else if (relationalOperatorsSet.contains(token)) {
    jTextArea1.append(token + " ...Es operador relacional de python\n");
    }
    else if (numsSet.contains(token)) {
    jTextArea1.append(token + " ...Es un número\n");
    }
    else if (simbolosSet.contains(token)) {
    jTextArea1.append(token + " ...Es un simbolo\n");
    }
    else {
    jTextArea1.append(token + " ...Es una letra o palabra\n");
    }}}
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
