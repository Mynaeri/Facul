// só criar classe lampada com um ligado ou desligado

public class ExerLamp {
    public static void main (String[] args) {

    Lampada lampSala = new Lampada(false);
    
    if (lampSala.isOnOff())
        System.out.println("A lampada da sala esta ligada.");
     else
        System.out.println("A lampada da sala esta desligada");
    }
}


class Lampada {
    private boolean onOff;

    public Lampada(boolean onOff){
        this.onOff = onOff;
    }
    public boolean isOnOff(){
        return onOff;
    }
    public void setOnOff(boolean onOff){
        this.onOff = onOff;
    }
}