package Models;

public abstract class Carta {
    private boolean tapada;

    public Carta(){
        this.tapada = true;
    }

    public boolean isTapada() {
        return tapada;
    }

    public void DarVuelta() {
        tapada = !tapada;

    }
    public void mostrar() {
        if(tapada){
            System.out.println("******");
        }else {
            System.out.println(getReprecentacion());
        }

    }

    public String getReprecentacion() {
        return "Carta generiaca";
    }

}
