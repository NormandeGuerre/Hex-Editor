/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Hex_Editor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author ima
 */
public class NewClass {
	private javax.swing.JFileChooser jFileChooser1;
	
	
	public NewClass() {
		jFileChooser1 = new JFileChooser();
		int returnVal = jFileChooser1.showOpenDialog(null);
		int cnt = 0;
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = jFileChooser1.getSelectedFile();
			String fullPath = jFileChooser1.getSelectedFile().getAbsolutePath();
			try (FileInputStream in = new FileInputStream("/home/ima/Desktop/Hex_example_data")) {
				int c;
				
				while (((c = in.read()) != -1) && (cnt < 48)) {
				System.out.format("%5d  The character is %c The int value of the character is %5d  The hex string is   %s %n", cnt, c, c, Integer.toHexString(c));
				cnt ++;
				//	out.write(c);
				}
			} catch (IOException ex) {
			}
				
		} else {
			System.out.println("Open command cancelled by user." + "\n");
		}
	}
	
	
	public static void main(String args[]) {
		new NewClass();
	}
}