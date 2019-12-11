package edunova;

import javax.swing.JOptionPane;

public class Zadatak7 {
	
	// Za dvije točke u prostoru koordinatnog sustava 
	// izračunajte udaljenost
	
	public static void main(String[] args) {
		
		double udaljenost;
		
		int x1=Integer.parseInt(JOptionPane.showInputDialog("Unesite točku x1"));
		int y1=Integer.parseInt(JOptionPane.showInputDialog("Unesite točku y1"));
		int x2=Integer.parseInt(JOptionPane.showInputDialog("Unesite točku x2"));
		int y2=Integer.parseInt(JOptionPane.showInputDialog("Unesite točku y2"));
		
		udaljenost = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		
		System.out.println("Udaljenost točaka "+"("+x1+","+y1+"),"+"("+x2+","+y2+") u korinatnom sustavu iznosi " + udaljenost
			);
		
		
		
		
		
		
		
		
		
		
		
	}

}
