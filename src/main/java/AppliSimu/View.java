package AppliSimu;

import DomaineVoiture.Voiture;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by sow25 on 17/03/16.
 */
public class View implements Observer {

    private IHMVoiture ihmVoiture;
    private Voiture voiture;
    private Calculate calcul;

    public View(IHMVoiture ihmVoiture, Voiture voiture){
        this.ihmVoiture = ihmVoiture;
        this.voiture = voiture;
        this.voiture.addObserver(this);
        this.calcul = new Calculate();
    }



    @Override
    public void update(Observable arg0, Object arg1) {
        int xMetres = this.voiture.getX();
        int xPixel = this.calcul.calculerPositionPixels(xMetres);
        this.ihmVoiture.setPixel(xPixel);
        this.ihmVoiture.repaint();
    }
}
