/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package CI;

import java.awt.Component;
import java.awt.Container;

/**
 *
 * @author ima
 */
public class findComponents {
static int j = 0;

	//public ArrayList <Component> findComponents (final Container c) {
	public findComponents () {
	}
	
	public void findAndPrint (final Container c) {
		Component[] comps;
		comps = c.getComponents();
		for (Component comp : comps) {
			for (int i = 0; i < j; i++){
				System.out.print("    ");
			}
			if (null == comp.getName()) {
				System.out.println(comp.getClass() );
			} else {
				System.out.println(comp.getClass() + "         " + comp.getName());
			}
			if (comp instanceof Container) {
				j ++;
				findAndPrint((Container) comp);
				j--;
			}
		}
	}
}