import java.awt.Canvas;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		exec(4);
	}	
	
	public static void exec(int exercicio) {
		JFrame frame = new JFrame("Aulas Malopes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		Canvas canvas = new Canvas();
		frame.add(canvas);
		Aula aula = null;		
		
		switch(exercicio) {
			case 1:		
				frame.setVisible(true);	
				sleep(100);
				aula = new Aula(canvas);
				aula.exercicio1();
				break;
			case 2:		
				frame.setVisible(true);	
				sleep(100);
				aula = new Aula(canvas);
				aula.exercicio2();
				break;
			case 3:				
				frame.setVisible(true);	
				sleep(100);
				aula = new Aula(canvas);
				aula.exercicio3();
			break;
			case 4:
				aula = new Aula(canvas);
				aula.exercicio4(frame);
		}
	}
	
	static void sleep(int t) {
		try {
			Thread.sleep(t);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
