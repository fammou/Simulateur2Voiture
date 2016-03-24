package AppliSimu;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import DomaineVoiture.Voiture;

public class IHMVoiture extends JFrame {

	private Voiture maVoiture;
	private Route route;
	private CommandeVoiture maCommandeVoiture;
	private  int xPixel;
	
	private void initGraphique() {
		this.setTitle("Simulateur de Voiture");
		this.setSize(505, 505);

		this.maCommandeVoiture = new CommandeVoiture(this, maVoiture);

		this.setVisible(true);
	}
	
	public IHMVoiture(Voiture maVoiture) {
		super();
		this.maVoiture = maVoiture;
		//maVoiture.addObserver(this);
		initGraphique();
	}

	public IHMVoiture() {
		super();
		initGraphique();
		this.maVoiture = null;
	}
	

	@Override
	public void paint(Graphics contexteGraphique) {
		super.paint(contexteGraphique);
		contexteGraphique.setColor(Color.red);
		dessinerVoiture(contexteGraphique);
	}



	public void setPixel(int xPixel){
		this.xPixel = xPixel;
	}

	private void dessinerVoiture(Graphics contexteGraphique) {
		//int xMetres = maVoiture.getX();
		//int xPixel = myview.calculerPositionPixels(xMetres);
		contexteGraphique.fillRect(this.xPixel, 300, 30, 15);
		dessinerRoute(contexteGraphique);
	}

	public void dessinerRoute(Graphics g){
		g.drawLine(0, 295, this.getWidth(), maVoiture.getY() + 295);
		g.drawLine(0, 320, this.getWidth(), maVoiture.getY() + 320);
		//route = new Route(maVoiture.getY(), this.getWidth());
	}
	
}
