package Models;

public class CartaFigura extends CartaConPalo {
    private char letra;

    public CartaFigura(Palo palo, char letra) {
        super(palo);
        this.letra = letra;
    }

    @Override
    public String getReprecentacion() {
        return letra+ super.getReprecentacion() ;
    }
}
