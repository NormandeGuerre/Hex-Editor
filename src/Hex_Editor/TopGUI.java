/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hex_Editor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author ima
 */
public class TopGUI extends javax.swing.JFrame {
	private static javax.swing.JFrame frame;

	/**
	 * Creates new form TopGUI
	 */
	public TopGUI() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        toolConversionTable2 = new Hex_Editor.ToolConversionTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Load_Text = new javax.swing.JMenuItem();
        Load_JTable = new javax.swing.JMenuItem();
        save = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Hex Editor");
        setLocation(new java.awt.Point(100, 50));
        setMinimumSize(new java.awt.Dimension(1250, 1000));
        setPreferredSize(new java.awt.Dimension(1250, 1000));

        jToolBar1.setBackground(java.awt.Color.cyan);
        jToolBar1.setRollover(true);

        jButton1.setText("jButton1");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.setBackground(java.awt.Color.orange);
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(800, 600));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);
        getContentPane().add(toolConversionTable2, java.awt.BorderLayout.SOUTH);

        jMenu1.setText("File");

        Load_Text.setText("Open File");
        Load_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load_TextActionPerformed(evt);
            }
        });
        jMenu1.add(Load_Text);

        Load_JTable.setText("Open JTable");
        Load_JTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load_JTableActionPerformed(evt);
            }
        });
        jMenu1.add(Load_JTable);
        jMenu1.add(save);

        jMenuItem1.setText("Save");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Save As");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Revert");
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem4.setText("Close");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Quit");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setEnabled(false);

        jMenuItem6.setText("Undo");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Redo");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Cut");
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Copy");
        jMenu2.add(jMenuItem9);

        jMenuItem10.setText("Paste");
        jMenu2.add(jMenuItem10);

        jMenuItem11.setText("Delete");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem12.setText("Select All");
        jMenu2.add(jMenuItem12);

        jMenuItem13.setText("Select Range");
        jMenu2.add(jMenuItem13);

        jMenuItem14.setText("Preferences");
        jMenu2.add(jMenuItem14);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("View");
        jMenu3.setEnabled(false);

        jMenuItem15.setText("Layouts");
        jMenu3.add(jMenuItem15);

        jMenuItem16.setText("ToolBar");
        jMenu3.add(jMenuItem16);

        jMenu7.setText("Status Bar");
        jMenu3.add(jMenu7);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Search");
        jMenu4.setEnabled(false);

        jMenuItem18.setText("Find");
        jMenu4.add(jMenuItem18);

        jMenuItem19.setText("Find Next");
        jMenu4.add(jMenuItem19);

        jMenuItem20.setText("Find Previous");
        jMenu4.add(jMenuItem20);

        jMenuItem21.setText("Find & Replace");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem21);

        jMenuItem22.setText("Goto Offset");
        jMenu4.add(jMenuItem22);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Tools");
        jMenu5.setEnabled(false);

        jMenuItem23.setText("Bitwise Operation");
        jMenu5.add(jMenuItem23);

        jMenuItem24.setText("Conversion Table");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem24);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Help");
        jMenu6.setEnabled(false);

        jMenuItem25.setText("Contents");
        jMenu6.add(jMenuItem25);

        jMenuItem26.setText("About");
        jMenu6.add(jMenuItem26);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ScrolledText myScrolledText = new ScrolledText();
		int i = jTabbedPane1.getTabCount();
		String title = "Tab " + i;	
		jTabbedPane1.add(title, myScrolledText);
		jTabbedPane1.setTabComponentAt(i, new ButtonTabComponent(jTabbedPane1));
		jTabbedPane1.setSelectedIndex(i);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Load_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load_TextActionPerformed
        ScrolledText myScrolledText = new ScrolledText();
		int returnVal = jFileChooser1.showOpenDialog(this.jTabbedPane1);
  		if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser1.getSelectedFile();
			String fullPath = jFileChooser1.getSelectedFile().getAbsolutePath();
            //System.out.println("Opening: " + file.getName() + "." + "\n");
			try { 
				System.out.println("Here it is :" + jFileChooser1.getSelectedFile().getAbsolutePath());
				String contents = new String(Files.readAllBytes(Paths.get(fullPath)));
				
				int i = jTabbedPane1.getTabCount();
				Hex_Editor.ScrolledText.jTextArea1.setText(contents);
				jTabbedPane1.add(file.getName(), myScrolledText );
				jTabbedPane1.setTabComponentAt(i, new ButtonTabComponent(jTabbedPane1));
				jTabbedPane1.setSelectedIndex(i);
			} catch (IOException ex) {
				Logger.getLogger(TopGUI.class.getName()).log(Level.SEVERE, null, ex);
			}
        } else {
            System.out.println("Open command cancelled by user." + "\n");
        }
		
    }//GEN-LAST:event_Load_TextActionPerformed

    private void Load_JTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load_JTableActionPerformed
		MyTable mt = new MyTable();
		int returnVal = jFileChooser1.showOpenDialog(this.jTabbedPane1);
  		if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser1.getSelectedFile();
			String fullPath = jFileChooser1.getSelectedFile().getAbsolutePath();
			try { 
				//String contents = new String(Files.readAllBytes(Paths.get(fullPath)));
				LinkedList<Integer> contents = new LinkedList<>();
				FileInputStream in = new FileInputStream("/home/ima/Desktop/Hex_example_data");

				int c;
				while ((c = in.read()) != -1)  {
					contents.add(c);
				}
				//System.out.format("%5d  The character is %c The int value of the character is %5d  The hex string is   %s %n", cnt, c, c, Integer.toHexString(c));
				
				
				int i = jTabbedPane1.getTabCount();
				//Hex_Editor.ScrolledText.jTextArea1.setText(contents);
				// Here is where I add the JTable to the Tabbed Panel
				MyTable.loadTable1(contents, 17);
				jTabbedPane1.add(file.getName(), MyTable.jsp);
				jTabbedPane1.setTabComponentAt(i, new ButtonTabComponent(jTabbedPane1));
				jTabbedPane1.setSelectedIndex(i);
        }	catch (IOException ex) {
				Logger.getLogger(TopGUI.class.getName()).log(Level.SEVERE, null, ex);
			}
            System.out.println("Open command cancelled by user." + "\n");
        }// TODO add your handling code here:
    }//GEN-LAST:event_Load_JTableActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem24ActionPerformed

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
 			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
/*			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
*/
			
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(TopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				frame = new TopGUI();
				frame.setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Load_JTable;
    private javax.swing.JMenuItem Load_Text;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPopupMenu.Separator save;
    private Hex_Editor.ToolConversionTable toolConversionTable2;
    // End of variables declaration//GEN-END:variables
}