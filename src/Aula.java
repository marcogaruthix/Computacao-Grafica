import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;

public class Aula extends Canvas {
	private static final long serialVersionUID = 1L;
	public Canvas canvas;
	public Graphics g;
	
	public Aula(Canvas c) {
		this.canvas = c;
		setBackground(Color.white);
		this.g = this.canvas.getGraphics();
		if(g == null)	return;
		g.setColor(Color.blue);
	}
	
	public void exercicio1() { 
		desenharQuadrado( 50, 50, 150, 100 );
		desenharCirculo(300, 50, 100, 100);
		desenharCirculo(325, 75, 50, 50);
	}
	
	public void exercicio2() {
		Dimension d = this.canvas.getSize();
		g.drawLine(0, 0, d.width, d.height);	
	}
	
	public void exercicio3() {
		desenharTriangulo(100, 100, 50);
	}
	
	public void exercicio4(JFrame frame) {
		frame.add(new CvTriangles());
		frame.setVisible(true);
	}
	
	public void exercicio5() {
		
	}
	
	public void desenharTriangulo( int x, int y, int w ) {
		int h = (int)Math.round(Math.sqrt(3)) * w/2;
		
		Point sudeste = new Point(x, y);
		Point sudoeste = new Point(x + w, y);
		Point topo = new Point(x + ( w / 2 ), h);
		
		g.drawLine(sudeste.x, sudeste.y, sudoeste.x, sudoeste.y);
		g.drawLine(sudeste.x, sudeste.y, topo.x, topo.y);
		g.drawLine(sudoeste.x, sudoeste.y, topo.x, topo.y);
	}
	
	public void desenharQuadrado( int x, int y, int w , int h ) {
		Point nordeste = new Point( x, y );
		Point noroeste = new Point( x + w, y );
		Point sudeste = new Point( x, y + h );
		Point sudoeste = new Point( y + w, y + h );
		
		g.drawLine(nordeste.x, nordeste.y, noroeste.x, noroeste.y);	
		g.drawLine(nordeste.x, nordeste.y, sudeste.x, sudeste.y);	
		g.drawLine(sudeste.x, sudeste.y , sudoeste.x, sudoeste.y);	
		g.drawLine(sudoeste.x, sudoeste.y, noroeste.x, noroeste.y);	

		g.drawLine(nordeste.x, nordeste.y, sudoeste.x, sudoeste.y);
		g.drawLine(noroeste.x, noroeste.y, sudeste.x, sudeste.y);	
	}
	
	public void desenharCirculo( int x, int y, int w , int h ) {
		g.drawOval(x, y, w, h);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}
}
