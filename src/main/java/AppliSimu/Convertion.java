package AppliSimu;

/**
 * Created by sow25 on 17/03/16.
 */
public class Convertion {

    private double paramatreConversionMetresPixels = 0.5;

    public Convertion(){
    }

    public int conversionPositionPixel(int xMetres) {
        return (int) (paramatreConversionMetresPixels * xMetres);
    }
}

