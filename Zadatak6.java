package edunova;

import javax.swing.JOptionPane;

public class Zadatak6 {
	
	// za unesena dva cijela broja ispišite apsolutnu vrijednost
	// njihove razlike
	
	
	public static void main (String[]args) {
		
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesite cijeli prvi broj"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("Unesite cijeli drugi broj"));
		
		int k = (Math.abs(i-j) );
		
		
		System.out.println("Apsolutna vrijednost razlike brojeva " + i + "," + j +" iznosi " + k  );
				
		
		
		
	}

}
