package Models;

public class CartaJoker extends Carta{

    private boolean aColor;

    public CartaJoker(boolean aColor) {
        this.aColor = aColor;
    }

    @Override
        public String getReprecentacion() {
        return "Joker "+(aColor ? "a color": "Blanco y Negro" );
        }
    }

