
package GUI;

import Retaurant.*;
import Robots.RobotBasic;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class RobotsPanel extends javax.swing.JPanel {
    
    Food selectedFood = null;
    RobotBasic robotSelected = Kitchen.cutter; 
    int indexSelectedRobot = 0;
    JLabel cutterImage = new JLabel();
    JLabel coockerImage = new JLabel();
    JLabel magnusImage = new JLabel();
    String serveMessage;
    
    public RobotsPanel() {
        
        initComponents();
        setRobotImage(cutterJPane, cutterImage, "images/cutter.png" );     
        setRobotImage(coockerJPane, coockerImage, "images/coocker.png" );
        setRobotImage(magnusJPane, magnusImage, "images/magnus.png" );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coockingFoodsBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        newFoodName = new javax.swing.JTextField();
        addFoodButton = new javax.swing.JButton();
        batteryLvlBar = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lastOperationLabel = new javax.swing.JLabel();
        isCuttedTxt = new javax.swing.JLabel();
        isCuckedText = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rechargeButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        coockerJPane = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        coockerSlider = new javax.swing.JSlider();
        coockerTxt = new javax.swing.JLabel();
        coockerButton = new javax.swing.JButton();
        magnusJPane = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        magnusSliderCook = new javax.swing.JSlider();
        magnusTxtCook = new javax.swing.JLabel();
        magnusCook = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        magnusSliderCut = new javax.swing.JSlider();
        magnusTxtCut = new javax.swing.JLabel();
        magnusCut = new javax.swing.JButton();
        serve = new javax.swing.JButton();
        cutterJPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cutterSlider = new javax.swing.JSlider();
        cutterTxt = new javax.swing.JLabel();
        cutterButton = new javax.swing.JButton();
        robotNameTxt = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        coockingFoodsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coockingFoodsBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione un platillo:");

        jLabel3.setText("Agragar nuevo platillo:");

        newFoodName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        addFoodButton.setText("Agregar");
        addFoodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFoodButtonActionPerformed(evt);
            }
        });

        batteryLvlBar.setMaximum(10);

        jLabel4.setText("Nivel de batería:");

        jLabel6.setText("La comida esta cocida?");

        jLabel7.setText("Los ingredientes estan cortados?");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel8.setText("Robot:");

        jLabel9.setText("Última operación:");

        lastOperationLabel.setText(" ");
        lastOperationLabel.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Comida Info:");

        rechargeButton.setText("Recargar");
        rechargeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechargeButtonActionPerformed(evt);
            }
        });

        jTabbedPane2.setToolTipText("");
        jTabbedPane2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane2StateChanged(evt);
            }
        });

        coockerJPane.setBackground(new java.awt.Color(204, 204, 204));
        coockerJPane.setPreferredSize(new java.awt.Dimension(435, 375));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setText("Cocinar a");

        coockerSlider.setBackground(new java.awt.Color(255, 0, 51));
        coockerSlider.setForeground(new java.awt.Color(255, 0, 0));
        coockerSlider.setToolTipText("Ajuste temperatura");
        coockerSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                coockerSliderStateChanged(evt);
            }
        });

        coockerTxt.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        coockerTxt.setText("50 °C");
        coockerTxt.setToolTipText("");

        coockerButton.setText("Cocinar");
        coockerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coockerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout coockerJPaneLayout = new javax.swing.GroupLayout(coockerJPane);
        coockerJPane.setLayout(coockerJPaneLayout);
        coockerJPaneLayout.setHorizontalGroup(
            coockerJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coockerJPaneLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coockerSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coockerTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coockerButton)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        coockerJPaneLayout.setVerticalGroup(
            coockerJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coockerJPaneLayout.createSequentialGroup()
                .addContainerGap(305, Short.MAX_VALUE)
                .addGroup(coockerJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coockerJPaneLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coockerJPaneLayout.createSequentialGroup()
                        .addGroup(coockerJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coockerTxt)
                            .addComponent(coockerButton))
                        .addGap(8, 8, 8))
                    .addComponent(coockerSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        jTabbedPane2.addTab("Cocinero", coockerJPane);

        magnusJPane.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel11.setText("Cocinar a");

        magnusSliderCook.setBackground(new java.awt.Color(255, 0, 51));
        magnusSliderCook.setForeground(new java.awt.Color(255, 0, 0));
        magnusSliderCook.setToolTipText("Ajuste temperatura");
        magnusSliderCook.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                magnusSliderCookStateChanged(evt);
            }
        });

        magnusTxtCook.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        magnusTxtCook.setText("50 °C");
        magnusTxtCook.setToolTipText("");

        magnusCook.setText("Cocinar");
        magnusCook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magnusCookActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel13.setText("Cortar en ");

        magnusSliderCut.setBackground(new java.awt.Color(255, 0, 51));
        magnusSliderCut.setForeground(new java.awt.Color(255, 0, 0));
        magnusSliderCut.setMaximum(10);
        magnusSliderCut.setToolTipText("Ajuste pedazos");
        magnusSliderCut.setValue(5);
        magnusSliderCut.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                magnusSliderCutStateChanged(evt);
            }
        });

        magnusTxtCut.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        magnusTxtCut.setText("5 pedazos");

        magnusCut.setText("Cortar");
        magnusCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magnusCutActionPerformed(evt);
            }
        });

        serve.setText("Servir plato");
        serve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout magnusJPaneLayout = new javax.swing.GroupLayout(magnusJPane);
        magnusJPane.setLayout(magnusJPaneLayout);
        magnusJPaneLayout.setHorizontalGroup(
            magnusJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(magnusJPaneLayout.createSequentialGroup()
                .addGroup(magnusJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(magnusJPaneLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(magnusSliderCook, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(magnusTxtCook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(magnusCook))
                    .addGroup(magnusJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(magnusJPaneLayout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(magnusSliderCut, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(magnusTxtCut)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(magnusCut))
                        .addGroup(magnusJPaneLayout.createSequentialGroup()
                            .addGap(183, 183, 183)
                            .addComponent(serve))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        magnusJPaneLayout.setVerticalGroup(
            magnusJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, magnusJPaneLayout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addGroup(magnusJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, magnusJPaneLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, magnusJPaneLayout.createSequentialGroup()
                        .addGroup(magnusJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(magnusTxtCut)
                            .addComponent(magnusCut))
                        .addGap(8, 8, 8))
                    .addComponent(magnusSliderCut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(magnusJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, magnusJPaneLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, magnusJPaneLayout.createSequentialGroup()
                        .addGroup(magnusJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(magnusTxtCook)
                            .addComponent(magnusCook))
                        .addGap(8, 8, 8))
                    .addComponent(magnusSliderCook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serve)
                .addGap(12, 12, 12))
        );

        jTabbedPane2.addTab("Magnus", magnusJPane);

        cutterJPane.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Cortar en ");

        cutterSlider.setBackground(new java.awt.Color(255, 0, 51));
        cutterSlider.setForeground(new java.awt.Color(255, 0, 0));
        cutterSlider.setMaximum(10);
        cutterSlider.setToolTipText("Ajuste pedazos");
        cutterSlider.setValue(5);
        cutterSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cutterSliderStateChanged(evt);
            }
        });

        cutterTxt.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cutterTxt.setText("5 pedazos");

        cutterButton.setText("Cortar");
        cutterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cutterJPaneLayout = new javax.swing.GroupLayout(cutterJPane);
        cutterJPane.setLayout(cutterJPaneLayout);
        cutterJPaneLayout.setHorizontalGroup(
            cutterJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cutterJPaneLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cutterSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cutterTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cutterButton)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        cutterJPaneLayout.setVerticalGroup(
            cutterJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cutterJPaneLayout.createSequentialGroup()
                .addContainerGap(307, Short.MAX_VALUE)
                .addGroup(cutterJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cutterJPaneLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cutterJPaneLayout.createSequentialGroup()
                        .addGroup(cutterJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cutterTxt)
                            .addComponent(cutterButton))
                        .addGap(8, 8, 8))
                    .addComponent(cutterSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        jTabbedPane2.addTab("Cutter", cutterJPane);

        robotNameTxt.setText("jLabel10");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel14.setText("Selecciona un Robot");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(71, 71, 71)
                                    .addComponent(rechargeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lastOperationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(batteryLvlBar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(robotNameTxt))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(isCuckedText)
                                            .addComponent(isCuttedTxt)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(coockingFoodsBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(newFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)
                                        .addComponent(addFoodButton)))))
                        .addGap(45, 45, 45))))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel14)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(newFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addFoodButton))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(coockingFoodsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(isCuttedTxt))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(isCuckedText))
                                .addGap(49, 49, 49)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(robotNameTxt))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(lastOperationLabel)))
                                    .addComponent(batteryLvlBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(rechargeButton))))
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("Magnus");
    }// </editor-fold>//GEN-END:initComponents

    private void coockingFoodsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coockingFoodsBoxActionPerformed
        if(coockingFoodsBox.getSelectedIndex() != -1){
            selectedFood = Kitchen.getFood(coockingFoodsBox.getSelectedIndex());
            foodState();
        }else{
            isCuckedText.setText("");
            isCuttedTxt.setText("");
        }
    }//GEN-LAST:event_coockingFoodsBoxActionPerformed

    private void addFoodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFoodButtonActionPerformed
        addFood();
    }//GEN-LAST:event_addFoodButtonActionPerformed
    
    private void rechargeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechargeButtonActionPerformed
        robotSelected.recharge();
        robotState(robotSelected);
    }//GEN-LAST:event_rechargeButtonActionPerformed

    private void cutterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutterButtonActionPerformed
        Kitchen.cutter.cut(selectedFood, cutterSlider.getValue());
        robotState(robotSelected);
        foodState();
    }//GEN-LAST:event_cutterButtonActionPerformed

    private void jTabbedPane2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane2StateChanged
        // TODO add your handling code here:
        indexSelectedRobot = jTabbedPane2.getSelectedIndex();
        switch(indexSelectedRobot){
            case 0 :robotSelected = Kitchen.coocker;
                    break;
            case 1 :robotSelected = Kitchen.magnus;
                    break;
            case 2 :robotSelected = Kitchen.cutter;
                    break;
        }
        robotState(robotSelected);
    }//GEN-LAST:event_jTabbedPane2StateChanged

    private void cutterSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cutterSliderStateChanged
        cutterTxt.setText(cutterSlider.getValue()+" pedazos");
    }//GEN-LAST:event_cutterSliderStateChanged

    private void coockerSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_coockerSliderStateChanged
        coockerTxt.setText(coockerSlider.getValue()+" °C");
    }//GEN-LAST:event_coockerSliderStateChanged

    private void coockerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coockerButtonActionPerformed
        Kitchen.coocker.setTemperature(selectedFood, coockerSlider.getValue());
        robotState(robotSelected);
        foodState();
    }//GEN-LAST:event_coockerButtonActionPerformed

    private void magnusSliderCookStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_magnusSliderCookStateChanged
        magnusTxtCook.setText(magnusSliderCook.getValue()+" °C");
    }//GEN-LAST:event_magnusSliderCookStateChanged

    private void magnusCookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magnusCookActionPerformed
        Kitchen.magnus.setTemperature(selectedFood, magnusSliderCook.getValue());
        robotState(robotSelected);
        foodState();
    }//GEN-LAST:event_magnusCookActionPerformed

    private void magnusSliderCutStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_magnusSliderCutStateChanged
        magnusTxtCut.setText(magnusSliderCut.getValue()+" pedazos");
    }//GEN-LAST:event_magnusSliderCutStateChanged

    private void magnusCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magnusCutActionPerformed
        Kitchen.magnus.cut(selectedFood, magnusSliderCut.getValue());
        robotState(robotSelected);
        foodState();
    }//GEN-LAST:event_magnusCutActionPerformed

    private void serveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serveActionPerformed
         if(selectedFood != null){
            if(selectedFood.isCooked())
                serveMessage = "Comida servida, perfecto !! :D";
            else{
                serveMessage = "Serviste la comida cruda ! :(";
                if(!selectedFood.isCutted())
                    serveMessage = "Serviste la comida cruda y sin cortar :C";
            }

            JOptionPane.showMessageDialog(null, serveMessage);
            Kitchen.removeFood(coockingFoodsBox.getSelectedIndex());
            fillCoockingFoods();
            if(Kitchen.coockingFoods.isEmpty()){
                selectedFood = null;
            }
            else{
                selectedFood = Kitchen.getFood(0);
                coockingFoodsBox.setSelectedIndex(0);
            }
         }else
             JOptionPane.showMessageDialog(null, "No hay comida seleccionada !");
    }//GEN-LAST:event_serveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFoodButton;
    private javax.swing.JProgressBar batteryLvlBar;
    private javax.swing.JButton coockerButton;
    private javax.swing.JPanel coockerJPane;
    private javax.swing.JSlider coockerSlider;
    private javax.swing.JLabel coockerTxt;
    private javax.swing.JComboBox<String> coockingFoodsBox;
    private javax.swing.JButton cutterButton;
    private javax.swing.JPanel cutterJPane;
    private javax.swing.JSlider cutterSlider;
    private javax.swing.JLabel cutterTxt;
    private javax.swing.JLabel isCuckedText;
    private javax.swing.JLabel isCuttedTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lastOperationLabel;
    private javax.swing.JButton magnusCook;
    private javax.swing.JButton magnusCut;
    private javax.swing.JPanel magnusJPane;
    private javax.swing.JSlider magnusSliderCook;
    private javax.swing.JSlider magnusSliderCut;
    private javax.swing.JLabel magnusTxtCook;
    private javax.swing.JLabel magnusTxtCut;
    private javax.swing.JTextField newFoodName;
    private javax.swing.JButton rechargeButton;
    private javax.swing.JLabel robotNameTxt;
    private javax.swing.JButton serve;
    // End of variables declaration//GEN-END:variables

    public ImageIcon getImageAtSizeOf(String dir, JLabel label){
        
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(dir));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
        return new ImageIcon(dimg);
    }

    private void setRobotImage(JPanel robotPane, JLabel robotImage, String dir){
    
        robotImage.setBounds (10, 0, 475, 250);
        robotImage.setIcon(getImageAtSizeOf(dir, robotImage));
        robotPane.add(robotImage);
    
    }
    
    private void addFood(){
        String name = newFoodName.getText();
        
        if(name.isBlank())
            JOptionPane.showMessageDialog(null, "Ingrese un nombre valido");
        else{
            Food f = new Food(name);
            Kitchen.coockingFoods.add(f);
            newFoodName.setText("");
            fillCoockingFoods();
        }
    }
    
    private void foodState(){
    
        if(selectedFood != null){
            if(selectedFood.isCooked())
                isCuckedText.setText("Sí !");
            else
                isCuckedText.setText("No !");


            if(selectedFood.isCutted())
                isCuttedTxt.setText("Sí !");
            else
                isCuttedTxt.setText("No !");
        }
        
    }
    
    //Para todos los robots
    private void robotState(RobotBasic robot){
    
        lastOperationLabel.setText(robot.getLastOperation());
        batteryLvlBar.setValue(robot.getBatteryLvl());
        robotNameTxt.setText(robot.getName());
        
    }
    
    private void fillCoockingFoods(){
        int i = 0;
        coockingFoodsBox.removeAllItems();
        Kitchen.coockingFoods.forEach((f) -> {
            coockingFoodsBox.addItem(f.getName());
        });
    
    }

}
