package Hex_Editor;

import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class MyTable {
	public static  DefaultTableModel        model;
	public static  DefaultTableCellRenderer evencenterRenderer;
	public static  DefaultTableCellRenderer oddcenterRenderer;
	public static  JTable                   table;
	public static  JScrollPane				jsp;
	
	public MyTable(){
		init_table();
	}
	
	private void init_table(){
		model              = new DefaultTableModel(0,17);
		evencenterRenderer = new DefaultTableCellRenderer();
		oddcenterRenderer  = new DefaultTableCellRenderer();
		table              = new JTable(model);
		jsp                = new JScrollPane(table);
		
		table.setShowGrid(false);
		table.setTableHeader(null);
		table.setEnabled(true);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setFont(new Font("MonoSpace", Font.BOLD, 14));
		table.setCellSelectionEnabled(true);
		jsp.addComponentListener( CL() );
		jsp.setBorder(null);
		
		evencenterRenderer.setHorizontalAlignment( SwingConstants.CENTER );
		evencenterRenderer.setBackground(Color.yellow);
		evencenterRenderer.setForeground(Color.red);
		oddcenterRenderer.setHorizontalAlignment( SwingConstants.CENTER );
		oddcenterRenderer.setBackground(Color.white);
		
		setupTable(17);
/*        table.getColumnModel().getColumn(0).setMinWidth(80);
		table.getColumnModel().setColumnMargin(20);
		for (int i = 1; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setMinWidth(40);
			if (i%2 == 0) {
				table.getColumnModel().getColumn(i).setCellRenderer( evencenterRenderer );
			} else {
				table.getColumnModel().getColumn(i).setCellRenderer( oddcenterRenderer );
			}
		}

		ArrayList<Integer> anArray;
		anArray = initTable(17000);
		setupTable(17);
		loadTable(anArray,17);
*/
	}
	
	private ArrayList<Integer> initTable(int numofElements) {
		ArrayList<Integer> theArray1 = new ArrayList<>(numofElements);
		for (int index = 0; index < numofElements; index++) {
			theArray1.add(index, index);
		}
		return theArray1;
	}
	
	
	private void setupTable(int numofColumns) {
		
		MyTable.model.setColumnCount(numofColumns);
		MyTable.model.setRowCount(0);
		MyTable.model.fireTableStructureChanged();
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		//table.getColumnModel().getColumn(0).setMinWidth(80);
		for (int i = 1; i < table.getColumnCount(); i++) {
			//table.getColumnModel().getColumn(i).setMinWidth(20);
			table.getColumnModel().getColumn(i).setPreferredWidth(40);
			if (i%2 == 0) {
				table.getColumnModel().getColumn(i).setCellRenderer( evencenterRenderer );
			} else {
				table.getColumnModel().getColumn(i).setCellRenderer( oddcenterRenderer );
			}
		}
	}
	
	private static void loadTable2(ArrayList<String> myArray, int numColumns){
		ArrayList<String> theArray2 = new ArrayList<>(numColumns);
		String tmpStr;
		int j1 = 1;
		int cnt = 0;
		theArray2.add(0, "YYYY");
		while (cnt < myArray.size()){
			if (j1 < numColumns) {
				//tmpStr = String.format("%s", myArray.get(cnt));
				//theArray2.add(j1, tmpStr);
				theArray2.add(j1, myArray.get(cnt));
			} else {
				model.addRow(theArray2.toArray());
				j1 = 1;
				theArray2.clear();
				theArray2.add(0, "YYYY");
				//tmpStr = String.format("%s", myArray.get(cnt));
				//theArray2.add(j1, tmpStr);
				theArray2.add(j1, myArray.get(cnt));
			}
			j1++;
			cnt++;
		}
		model.addRow(theArray2.toArray());
	}

	
	protected static void loadTable1(LinkedList<Integer> myArray, int numColumns){
		ArrayList<String> theArray2 = new ArrayList<>(numColumns);
		String tmpStr;
		int j1 = 1;
		int cnt = 0;
		theArray2.add(0, "XXXX");
		while (cnt < myArray.size()){
			if (j1 < numColumns) {
				//tmpStr = (String.format("%s", Integer.toHexString((char)myArray.charAt(cnt)).toUpperCase()));
				tmpStr = Integer.toHexString(myArray.get(cnt)).toUpperCase();
				if (tmpStr.length() < 2){ tmpStr= "0" + tmpStr; }
				theArray2.add(j1, tmpStr);
			} else {
				model.addRow(theArray2.toArray());
				j1 = 1;
				theArray2.clear();
				theArray2.add(0, "XXXX");
				//tmpStr = (String.format("%s", Integer.toHexString((int) (myArray.charAt(cnt))).toUpperCase()));
				tmpStr = Integer.toHexString(myArray.get(cnt)).toUpperCase();
				if (tmpStr.length() < 2){ tmpStr= "0" + tmpStr; }
				//tmpStr = String.format("%s", ((Character) (myArray.charAt(cnt))).toString());
				theArray2.add(j1, tmpStr);
			}
			j1++;
			cnt++;
		}
		model.addRow(theArray2.toArray());
	}

	
	private static void loadTable(ArrayList<Integer> myArray, int numColumns){
		ArrayList<Integer> theArray2 = new ArrayList<>(numColumns);
		int j1 = 1;
		int cnt = 0;
		theArray2.add(0, -1);
		while (cnt < myArray.size()){
			if (j1 < numColumns) {
				theArray2.add(j1, myArray.get(cnt));
			} else {
				model.addRow(theArray2.toArray());
				j1 = 1;
				theArray2.clear();
				theArray2.add(0, -1);
				theArray2.add(j1, myArray.get(cnt));
			}
			j1++;
			cnt++;
		}
		model.addRow(theArray2.toArray());
	}
	
	private static ArrayList<String> getTableData(){
		Vector myVector = model.getDataVector();
		int myrows      = model.getRowCount();
		int mycolumns   = model.getColumnCount();
		String myString;
		
		ArrayList<String>  myArray = new ArrayList<>(myrows*mycolumns);
		
		for (int i = 0; i< myrows; i++){
			for(int k = 1; k < mycolumns; k++){
				if (null != ( ((Vector) myVector.get(i)).get(k))){
					myString =  ((Vector) myVector.get(i)).get(k).toString();
					myArray.add(myString);
				}
			}
		}
		return myArray;
	}
	
	public CompList CL() {
		return new CompList();
	}
	
	private class CompList implements ComponentListener {
		
		public CompList() {
		}
		
		@Override
		public void componentHidden(ComponentEvent e) {
		}
		
		@Override
		public void componentMoved(ComponentEvent e) {
		}
		
		@Override
		public void componentResized(ComponentEvent e) {
			int currentVertScrollBarWidth =  jsp.getVerticalScrollBar().getSize().width;
			int currentColumnCount        =  table.getColumnModel().getColumnCount();
			int totalColumnWidth          =  table.getColumnModel().getTotalColumnWidth();
			int columnWidth               =  totalColumnWidth / currentColumnCount;
			int newColumnCount            =  (jsp.getSize().width - currentVertScrollBarWidth) / columnWidth;
			if (currentColumnCount != newColumnCount) {
				ArrayList<String> anArray = getTableData();
				setupTable(newColumnCount);
				//loadTable(anArray, newColumnCount);
				loadTable2(anArray, newColumnCount);
			}
		}
		
		public void componentShown(ComponentEvent e) {
		}
	}
}
