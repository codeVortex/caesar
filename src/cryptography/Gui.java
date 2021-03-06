package cryptography;

/** @author Athanasios Kontis */

import java.awt.event.KeyEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Athanasios Kontis
 */
public class Gui extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Gui
     */
    public Gui() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        controlsPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        shiftTextField = new javax.swing.JTextField();
        shiftSlider = new javax.swing.JSlider();
        rememberCaseCheckBox = new javax.swing.JCheckBox();
        ClearTextButton = new javax.swing.JButton();
        areasPanel = new javax.swing.JPanel();
        inputScroller = new javax.swing.JScrollPane();
        inputArea = new javax.swing.JTextArea();
        outputScroller = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cryptography - Caesar Cipher");
        setLocationByPlatform(true);

        jLabel3.setLabelFor(shiftTextField);
        jLabel3.setText("Shift value");

        shiftTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        shiftTextField.setToolTipText("Allows the user to type in the desired shift value.");
        shiftTextField.setMaximumSize(new java.awt.Dimension(3, 1));
        shiftTextField.setName(""); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, shiftSlider, org.jdesktop.beansbinding.ELProperty.create("${value}"), shiftTextField, org.jdesktop.beansbinding.BeanProperty.create("text"), "");
        bindingGroup.addBinding(binding);

        shiftTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftTextFieldActionPerformed(evt);
            }
        });
        shiftTextField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                PropertyChangeHandler(evt);
            }
        });
        shiftTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                shiftTextFieldKeyTyped(evt);
            }
        });

        shiftSlider.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        shiftSlider.setMajorTickSpacing(5);
        shiftSlider.setMaximum(25);
        shiftSlider.setMinorTickSpacing(1);
        shiftSlider.setPaintLabels(true);
        shiftSlider.setPaintTicks(true);
        shiftSlider.setSnapToTicks(true);
        shiftSlider.setToolTipText("Provides granular control over shift values.");
        shiftSlider.setValue(0);
        shiftSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        shiftSlider.setName(""); // NOI18N
        shiftSlider.setValueIsAdjusting(true);
        shiftSlider.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                shiftSliderMouseWheelMoved(evt);
            }
        });
        shiftSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                shiftSliderStateChanged(evt);
            }
        });
        shiftSlider.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                PropertyChangeHandler(evt);
            }
        });

        rememberCaseCheckBox.setText("Remember case ?");
        rememberCaseCheckBox.setToolTipText("Opts to remember the case of input characters rendering the output case-sensitive.");
        rememberCaseCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rememberCaseCheckBoxItemStateChanged(evt);
            }
        });

        ClearTextButton.setText("Clear text");
        ClearTextButton.setToolTipText("Clears the text in both the input and the output area.");
        ClearTextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearTextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlsPanelLayout = new javax.swing.GroupLayout(controlsPanel);
        controlsPanel.setLayout(controlsPanelLayout);
        controlsPanelLayout.setHorizontalGroup(
            controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shiftSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(controlsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(shiftTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rememberCaseCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addComponent(ClearTextButton)))
                .addContainerGap())
        );
        controlsPanelLayout.setVerticalGroup(
            controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(shiftTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rememberCaseCheckBox)
                    .addComponent(ClearTextButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shiftSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        shiftTextField.getAccessibleContext().setAccessibleName("");

        inputScroller.setMinimumSize(new java.awt.Dimension(50, 50));
        inputScroller.setPreferredSize(new java.awt.Dimension(150, 250));

        inputArea.setColumns(20);
        inputArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputArea.setLineWrap(true);
        inputArea.setRows(5);
        inputArea.setTabSize(4);
        inputArea.setToolTipText("Here you can enter the text that is going to be processed.");
        inputArea.setWrapStyleWord(true);
        inputArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Area"));
        inputArea.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                inputAreaInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        inputArea.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                inputAreaPropertyChange(evt);
            }
        });
        inputArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputAreaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputAreaKeyTyped(evt);
            }
        });
        inputScroller.setViewportView(inputArea);

        outputArea.setEditable(false);
        outputArea.setColumns(20);
        outputArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        outputArea.setLineWrap(true);
        outputArea.setRows(5);
        outputArea.setTabSize(4);
        outputArea.setToolTipText("This holds the result of the processed input text.");
        outputArea.setWrapStyleWord(true);
        outputArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Output Area", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));
        outputArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        outputArea.setSelectionColor(new java.awt.Color(0, 153, 153));
        outputArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                outputAreaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                outputAreaFocusLost(evt);
            }
        });
        outputScroller.setViewportView(outputArea);

        javax.swing.GroupLayout areasPanelLayout = new javax.swing.GroupLayout(areasPanel);
        areasPanel.setLayout(areasPanelLayout);
        areasPanelLayout.setHorizontalGroup(
            areasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputScroller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outputScroller))
                .addContainerGap())
        );
        areasPanelLayout.setVerticalGroup(
            areasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputScroller, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputScroller, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(areasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(controlsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(areasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shiftSliderMouseWheelMoved(MouseWheelEvent evt) {//GEN-FIRST:event_shiftSliderMouseWheelMoved
        int curShift = shiftSlider.getValue(), newShift=0;
        if (evt.getWheelRotation() > 0 && curShift > 0) {
            newShift = curShift - 1;
            shiftSlider.setValue(newShift);
            shiftTextField.setText(String.valueOf(newShift));
            updateOutputArea();
        }
        else if (evt.getWheelRotation() < 0 && curShift < CaesarCipher.TOTAL_ALPHABET_LETTERS-1){
            newShift = curShift + 1;
            shiftSlider.setValue(newShift);
            shiftTextField.setText(String.valueOf(newShift));
            updateOutputArea();
        }
    }//GEN-LAST:event_shiftSliderMouseWheelMoved

    private void shiftTextFieldKeyTyped(KeyEvent evt) {//GEN-FIRST:event_shiftTextFieldKeyTyped
        if (!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_shiftTextFieldKeyTyped

    private void shiftTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftTextFieldActionPerformed
        String newShiftString = shiftTextField.getText();
        try {
            int newShift = Integer.parseInt(newShiftString);
            if (newShift >=0 && newShift < CaesarCipher.TOTAL_ALPHABET_LETTERS) {
                shiftSlider.setValue(newShift);
                updateOutputArea();
            }
            else {
                shiftTextField.setText(String.valueOf(shiftSlider.getValue()));
            }
        }
        catch (NumberFormatException numberFormatException){
            shiftTextField.setText(String.valueOf(shiftSlider.getValue()));
        }
    }//GEN-LAST:event_shiftTextFieldActionPerformed

    private void inputAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputAreaKeyPressed
        // Checks for specific key strokes and acts accordingly:
        switch (evt.getKeyCode())
        {
            case KeyEvent.VK_BACK_SPACE:
                String text = outputArea.getText();
                try {
                    outputArea.setText(outputArea.getText(0, text.length()-1));
                }
                catch (BadLocationException ex) {
                    evt.consume();
                }
                break;
        }
    }//GEN-LAST:event_inputAreaKeyPressed

    private void inputAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputAreaKeyTyped
        // Encrypts chars typed into input area
        char typedChar = evt.getKeyChar();
        if (Character.isIdentifierIgnorable(typedChar))
            evt.consume();
        else {
            String text = outputArea.getText();
            outputArea.setText(text + CaesarCipher.encryptChar(
                    typedChar,
                    shiftSlider.getValue(),
                    rememberCaseCheckBox.isSelected()));
        }
    }//GEN-LAST:event_inputAreaKeyTyped

    private void ClearTextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearTextButtonActionPerformed
        // clears both input and output areas:
        inputArea.setText("");
        outputArea.setText("");
    }//GEN-LAST:event_ClearTextButtonActionPerformed

    private void inputAreaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_inputAreaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAreaPropertyChange

    private void rememberCaseCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rememberCaseCheckBoxItemStateChanged
        updateOutputArea();
    }//GEN-LAST:event_rememberCaseCheckBoxItemStateChanged

    private void outputAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_outputAreaFocusGained
        outputArea.selectAll();
    }//GEN-LAST:event_outputAreaFocusGained

    private void outputAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_outputAreaFocusLost
        outputArea.select(0, 0);
    }//GEN-LAST:event_outputAreaFocusLost

    private void PropertyChangeHandler(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_PropertyChangeHandler
        // TODO add your handling code here:
            if ("text".equals(evt.getPropertyName()) || "value".equals(evt.getPropertyName()))
                updateOutputArea();
    }//GEN-LAST:event_PropertyChangeHandler

    private void shiftSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_shiftSliderStateChanged
        // TODO add your handling code here:
        updateOutputArea();
    }//GEN-LAST:event_shiftSliderStateChanged

    private void inputAreaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_inputAreaInputMethodTextChanged
        updateOutputArea();
    }//GEN-LAST:event_inputAreaInputMethodTextChanged

    private void updateOutputArea () {
        outputArea.setText(CaesarCipher.encryptString( inputArea.getText(), shiftSlider.getValue(), rememberCaseCheckBox.isSelected()));
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton ClearTextButton;
    javax.swing.JPanel areasPanel;
    javax.swing.JPanel controlsPanel;
    javax.swing.JTextArea inputArea;
    javax.swing.JScrollPane inputScroller;
    javax.swing.JLabel jLabel3;
    javax.swing.JTextArea outputArea;
    javax.swing.JScrollPane outputScroller;
    javax.swing.JCheckBox rememberCaseCheckBox;
    javax.swing.JSlider shiftSlider;
    javax.swing.JTextField shiftTextField;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
