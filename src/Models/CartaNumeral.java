package Models;

public class CartaNumeral extends CartaConPalo {
    private int numero;

    public CartaNumeral(Palo palo, int numero) {
        super(palo);
        this.numero = numero;
    }

    @Override
    public String getReprecentacion() {
        return numero + super.getReprecentacion();
    }
}
