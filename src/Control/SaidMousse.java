package Control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Presentation.SaidWindow;

public class SaidMousse implements MouseListener {
SaidWindow s;
	public SaidMousse(SaidWindow e) {
	// TODO Auto-generated constructor stub
		s=e;
}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(s.login.getText().equals("Tape your Login"))
		s.login.setText(null);
		 
			
	}

	@Override
	public void mouseEntered(MouseEvent e) {

		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

		
	}


