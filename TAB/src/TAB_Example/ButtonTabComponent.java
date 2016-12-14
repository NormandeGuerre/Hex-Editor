package TAB_Example;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.*;
 
/**
 * Component to be used as tabComponent;
 * Contains a JLabel to show the text and 
 * a JButton to close the tab it belongs to 
 */
// public class ButtonTabComponent extends JPanel implements ActionListener {
public class ButtonTabComponent extends JPanel {
    private final JTabbedPane pane;

    public ButtonTabComponent(final JTabbedPane pane) {
        super(new FlowLayout(FlowLayout.LEFT, 0, 0));
        if (pane == null) {
            throw new NullPointerException("TabbedPane is null");
        }
        this.pane = pane;
		initButtonTabComponent();
	}

    //public ButtonTabComponent(final JTabbedPane pane) {
    private void initButtonTabComponent() {
        //unset default FlowLayout' gaps
       /**
		* super(new FlowLayout(FlowLayout.LEFT, 0, 0));
        if (pane == null) {
            throw new NullPointerException("TabbedPane is null");
        }
        this.pane = pane;
		*/

        setOpaque(false);
         
        //make JLabel read titles from JTabbedPane
        JLabel label = new JLabel() {
			@Override
            public String getText() {
                int i = pane.indexOfTabComponent(ButtonTabComponent.this);
                if (i != -1) {
                    return pane.getTitleAt(i);
                }
                return null;
            }
        };
         
        add(label);
        //add more space between the label and the button
        label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        //tab button
        JButton button = new TabButton();
        add(button);
        //add more space to the top of the component
        setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
		addMouseListener(buttonMouseListener);
		//addActionListener(this);
    }
    
		private class TabButton extends JButton implements ActionListener {
        public TabButton() {
			initTabButton();
		}
		
		private void initTabButton() {
            int size = 17;
            setPreferredSize(new Dimension(size, size));
            setToolTipText("close this tab");
            //Make the button looks the same for all Laf's
            setUI(new BasicButtonUI());
            //Make it transparent
            setContentAreaFilled(false);
            //No need to be focusable
            setFocusable(false);
            setBorder(BorderFactory.createEtchedBorder());
            setBorderPainted(false);
            //Making nice rollover effect
            //we use the same listener for all buttons
            addMouseListener(buttonMouseListener);
            setRolloverEnabled(true);
            //Close the proper tab by clicking the button
            addActionListener(this);
        }
 
		@Override
        public void actionPerformed(ActionEvent e) {
            int i = pane.indexOfTabComponent(ButtonTabComponent.this);
            if (i != -1) {
                pane.remove(i);
            }
        }
 
        //we don't want to update UI for this button
		@Override
        public void updateUI() {
        }
 
        //paint the cross
		@Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g.create();
            //shift the image for pressed buttons
            if (getModel().isPressed()) {
                g2.translate(1, 1);
            }
            g2.setStroke(new BasicStroke(2));
            g2.setColor(Color.BLACK);
            if (getModel().isRollover()) {
                g2.setColor(Color.MAGENTA);
            }
            int delta = 6;
            g2.drawLine(delta, delta, getWidth() - delta - 1, getHeight() - delta - 1);
            g2.drawLine(getWidth() - delta - 1, delta, delta, getHeight() - delta - 1);
            g2.dispose();
        }
    }

	private void checkIt(Component theComponent) {
		if (theComponent instanceof TAB_Example.ButtonTabComponent ) {
			System.out.print("Whoo Hoo  IT WORKED !!!:   It is a ButtonTabComponent      " );
			int i;
			i = pane.indexOfTabComponent(ButtonTabComponent.this);
			 System.out.println("Here is the tab number :" + i + "\n");
			}	
		if (theComponent instanceof TAB_Example.ButtonTabComponent.TabButton ) {
			System.out.print("Hot Damn !   It is a TabButton   ");
			int j;
			j = pane.indexOfTabComponent(ButtonTabComponent.this);
			 System.out.println("Here is the tab number :" + j + "\n");
			}	
	}
 
    private final MouseListener buttonMouseListener = new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e){
			int i;
			if (e.getComponent() instanceof TAB_Example.ButtonTabComponent ) {
				i = pane.indexOfTabComponent(ButtonTabComponent.this);
			 	pane.setSelectedIndex(i);
			}	
		}
		
		@Override
        public void mouseEntered(MouseEvent e) {
            Component component = e.getComponent();
			//checkIt(component);
			
			if (component instanceof AbstractButton) {
                AbstractButton button = (AbstractButton) component;
                button.setBorderPainted(true);
            }
        }
 
		@Override
        public void mouseExited(MouseEvent e) {
            Component component = e.getComponent();

            if (component instanceof AbstractButton) {
                AbstractButton button = (AbstractButton) component;
                button.setBorderPainted(false);
            }
        }
    };
}