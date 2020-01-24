package Control;

	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;

	import Presentation.SaidWindow;

	public class SaidMousse2 implements MouseListener {
	
SaidWindow s;
	public SaidMousse2 (SaidWindow e) {
		// TODO Auto-generated constructor stub
			s=e;
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

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(s.pw.getText().equals("Tape your password"))
			s.pw.setText("");

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

	}


