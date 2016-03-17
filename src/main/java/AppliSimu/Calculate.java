package AppliSimu;

/**
 * Created by sow25 on 17/03/16.
 */
public class Calculate {

    private double paramatreConversionMetresPixels = 0.5;

    public Calculate(){
    }

    public int calculerPositionPixels(int xMetres) {
        return (int) (paramatreConversionMetresPixels * xMetres);
    }
}
