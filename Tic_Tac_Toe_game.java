
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Anand Kumar
 */
public class Tic_Tac_Toe_game extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount =  0;
    private int oCount = 0;
    boolean checker;
    
    public Tic_Tac_Toe_game() {
        initComponents();
    }
    
    private void gameScore(){
        playerx.setText(String.valueOf(xCount));
        playero.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player(){
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else 
            {
            startGame = "X";
        }
    }
    
    private void winningGame()
    {
        String b1 = tic1.getText();
        String b2 = tic2.getText();
        String b3 = tic3.getText();
        String b4 = tic4.getText();
        String b5 = tic5.getText();
        String b6 = tic6.getText();
        String b7 = tic7.getText();
        String b8 = tic8.getText();
        String b9 = tic9.getText();
        
        if(b1 == ("X") && b2 == ("X")  && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this," Player X ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            tic1.setBackground(Color.ORANGE);
            tic2.setBackground(Color.ORANGE);
            tic3.setBackground(Color.ORANGE);
            xCount++;
            gameScore();
        }
        if(b4 == ("X") && b5 == ("X")  && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this," Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            tic4.setBackground(Color.CYAN);
            tic5.setBackground(Color.CYAN);
            tic6.setBackground(Color.CYAN);
            xCount++;
            gameScore();
        }
        
        if(b7 == ("X") && b8 == ("X")  && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this," Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            tic7.setBackground(Color.GREEN);
            tic8.setBackground(Color.GREEN);
            tic9.setBackground(Color.GREEN);
            xCount++;
            gameScore();
        }
        
        
        if(b7 == ("O") && b8 == ("O")  && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this," Player O Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            tic7.setBackground(Color.GREEN);
            tic8.setBackground(Color.GREEN);
            tic9.setBackground(Color.GREEN);
            oCount++;
            gameScore();
        }
        if(b1 == ("X") && b4 == ("X")  && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this," Player X Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            tic1.setBackground(Color.MAGENTA);
            tic4.setBackground(Color.MAGENTA);
            tic7.setBackground(Color.MAGENTA);
            xCount++;
            gameScore();
        }
        
        if(b2 == ("X") && b5 == ("X")  && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this," Player X Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            tic2.setBackground(Color.PINK);
            tic5.setBackground(Color.PINK);
            tic8.setBackground(Color.PINK);
            xCount++;
            gameScore();
        }
        
        if(b3 == ("X") && b6 == ("X")  && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this," Player X Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            tic3.setBackground(Color.MAGENTA);
            tic6.setBackground(Color.MAGENTA);
            tic9.setBackground(Color.MAGENTA);
            xCount++;
            gameScore();
        }
        if(b1 == ("X") && b5 == ("X")  && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this," Player X Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            tic1.setBackground(Color.PINK);
            tic5.setBackground(Color.PINK);
            tic9.setBackground(Color.PINK);
            xCount++;
            gameScore();
        }
        
        if(b3 == ("X") && b5 == ("X")  && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this," Player X Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            tic3.setBackground(Color.CYAN);
            tic5.setBackground(Color.CYAN);
            tic7.setBackground(Color.CYAN);
            xCount++;
            gameScore();
        }
        
        
        if(b1 == ("O") && b2 == ("O")  && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this," Player O Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            tic1.setBackground(Color.PINK);
            tic2.setBackground(Color.PINK);
            tic3.setBackground(Color.PINK);
            oCount++;
            gameScore();
        }
        if(b4 == ("O") && b5 == ("O")  && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this," Player O Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            tic4.setBackground(Color.YELLOW);
            tic5.setBackground(Color.YELLOW);
            tic6.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
        }
        if(b1 == ("O") && b4 == ("O")  && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this," Player O Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            tic1.setBackground(Color.MAGENTA);
            tic4.setBackground(Color.MAGENTA);
            tic7.setBackground(Color.MAGENTA);
            oCount++;
            gameScore();
        }
        if(b2 == ("O") && b5 == ("O")  && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this," Player O Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            tic2.setBackground(Color.PINK);
            tic5.setBackground(Color.PINK);
            tic8.setBackground(Color.PINK);
            xCount++;
            gameScore();
        }
        if(b3 == ("O") && b6 == ("O")  && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this," Player O Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            tic3.setBackground(Color.MAGENTA);
            tic6.setBackground(Color.MAGENTA);
            tic9.setBackground(Color.MAGENTA);
            oCount++;
            gameScore();
        }
        if(b1 == ("O") && b5 == ("O")  && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this," Player O Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            tic1.setBackground(Color.YELLOW);
            tic5.setBackground(Color.YELLOW);
            tic9.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
        }
        if(b3 == ("O") && b5 == ("O")  && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this," Player O Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            tic3.setBackground(Color.PINK);
            tic5.setBackground(Color.PINK);
            tic7.setBackground(Color.PINK);
            oCount++;
            gameScore();
        }
    }


                         
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tic1 = new javax.swing.JButton();
        tic2 = new javax.swing.JButton();
        tic3 = new javax.swing.JButton();
        tic5 = new javax.swing.JButton();
        tic4 = new javax.swing.JButton();
        tic6 = new javax.swing.JButton();
        tic8 = new javax.swing.JButton();
        tic7 = new javax.swing.JButton();
        tic9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        playerx = new javax.swing.JButton();
        playero = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tic1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic1ActionPerformed(evt);
            }
        });

        tic2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic2ActionPerformed(evt);
            }
        });

        tic3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic3ActionPerformed(evt);
            }
        });

        tic5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic5ActionPerformed(evt);
            }
        });

        tic4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic4ActionPerformed(evt);
            }
        });

        tic6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic6ActionPerformed(evt);
            }
        });

        tic8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic8ActionPerformed(evt);
            }
        });

        tic7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic7ActionPerformed(evt);
            }
        });

        tic9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Player X");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Player O");

        reset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        playerx.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        playerx.setText("0");

        playero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        playero.setText("0");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("New Game");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setText("TIC-TAC-TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tic1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tic2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tic4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tic5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tic6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tic3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tic7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tic8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tic9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(playero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerx, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(101, 101, 101))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tic1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tic2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tic3, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tic4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tic5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tic6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tic9, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(tic8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tic7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playerx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void tic3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        tic3.setText(startGame);
       if(startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
       }
       choose_a_Player();
       winningGame();
    }                                    

    private void tic4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        tic4.setText(startGame);
       if(startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
       }
       choose_a_Player();
       winningGame();
    }                                    
    
    private JFrame frame;
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }                                    

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {                                      
        tic1.setEnabled(true);
        tic2.setEnabled(true);
        tic3.setEnabled(true);
        tic4.setEnabled(true);
        tic5.setEnabled(true);
        tic6.setEnabled(true);
        tic7.setEnabled(true);
        tic8.setEnabled(true);
        tic9.setEnabled(true);
        
        tic1.setText("");
        tic2.setText("");
        tic3.setText("");
        tic4.setText("");
        tic5.setText("");
        tic6.setText("");
        tic7.setText("");
        tic8.setText("");
        tic9.setText("");
        
        tic1.setBackground(Color.LIGHT_GRAY);
        tic2.setBackground(Color.LIGHT_GRAY);
        tic3.setBackground(Color.LIGHT_GRAY);
        tic4.setBackground(Color.LIGHT_GRAY);
        tic5.setBackground(Color.LIGHT_GRAY);
        tic6.setBackground(Color.LIGHT_GRAY);
        tic7.setBackground(Color.LIGHT_GRAY);
        tic8.setBackground(Color.LIGHT_GRAY);
        tic9.setBackground(Color.LIGHT_GRAY);
    }                                     

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        tic1.setEnabled(true);
        tic2.setEnabled(true);
        tic3.setEnabled(true);
        tic4.setEnabled(true);
        tic5.setEnabled(true);
        tic6.setEnabled(true);
        tic7.setEnabled(true);
        tic8.setEnabled(true);
        tic9.setEnabled(true);
        
        playerx.setText("0");
        playero.setText("0");
        
        tic1.setText("");
        tic2.setText("");
        tic3.setText("");
        tic4.setText("");
        tic5.setText("");
        tic6.setText("");
        tic7.setText("");
        tic8.setText("");
        tic9.setText("");
        
        tic1.setBackground(Color.LIGHT_GRAY);
        tic2.setBackground(Color.LIGHT_GRAY);
        tic3.setBackground(Color.LIGHT_GRAY);
        tic4.setBackground(Color.LIGHT_GRAY);
        tic5.setBackground(Color.LIGHT_GRAY);
        tic6.setBackground(Color.LIGHT_GRAY);
        tic7.setBackground(Color.LIGHT_GRAY);
        tic8.setBackground(Color.LIGHT_GRAY);
        tic9.setBackground(Color.LIGHT_GRAY);
    }                                        

    private void tic1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        tic1.setText(startGame);
       if(startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
       }
       choose_a_Player();
       winningGame();
    }                                    

    private void tic2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        tic2.setText(startGame);
       if(startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
       }
       choose_a_Player();
       winningGame();
    }                                    

    private void tic5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        tic5.setText(startGame);
       if(startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
       }
       choose_a_Player();
       winningGame();
    }                                    

    private void tic6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        tic6.setText(startGame);
       if(startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
       }
       choose_a_Player();
       winningGame();
    }                                    

    private void tic7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        tic7.setText(startGame);
       if(startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
       }
       choose_a_Player();
       winningGame();
    }                                    

    private void tic8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        tic8.setText(startGame);
       if(startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
       }
       choose_a_Player();
       winningGame();
    }                                    

    private void tic9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        tic9.setText(startGame);
       if(startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
       }
       choose_a_Player();
       winningGame();
    }                                    

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
            java.util.logging.Logger.getLogger(Tic_Tac_Toe_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic_Tac_Toe_game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton playero;
    private javax.swing.JButton playerx;
    private javax.swing.JButton reset;
    private javax.swing.JButton tic1;
    private javax.swing.JButton tic2;
    private javax.swing.JButton tic3;
    private javax.swing.JButton tic4;
    private javax.swing.JButton tic5;
    private javax.swing.JButton tic6;
    private javax.swing.JButton tic7;
    private javax.swing.JButton tic8;
    private javax.swing.JButton tic9;
    // End of variables declaration                   
}
