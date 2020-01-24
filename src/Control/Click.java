package Control;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Presentation.SaidWindow;

public class Click implements ActionListener {
	
SaidWindow s;
	public void actionPerformed(ActionEvent e) {
		//System.out.println("Hello Said");
		if (s.login.getText().equals("said") & s.pw.getText().equals("abdo")) 
		{			
		
			s.msg.setText("Succes");
			s.msg.setForeground(Color.GREEN);
			
		}
		else {
			s.msg.setForeground(Color.RED);
			s.msg.setText("Failed");
		}
		
	}
	
	public Click (SaidWindow f) {
		s=f;
	}
}
	


