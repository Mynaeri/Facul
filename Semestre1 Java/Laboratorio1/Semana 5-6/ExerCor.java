// Criar uma classe de cor com os valores R, G e B

public class ExerCor {
    public static void main(String[] args){
        CorRGB amarelo = new CorRGB(255, 255, 0);
        System.out.println(amarelo.getR()+","+amarelo.getG()+","+amarelo.getB());
    }
}
class CorRGB{
    private int R, G, B;

    public CorRGB(int R, int G, int B){
        this.R = R;
        this.G = G;
        this.B = B;
    }

    public int getR(){
        return R;
    }
    public void setR(int R){
        this.R = R;
    }

    public int getG(){
        return G;
    }
    public void setG(int G){
        this.G = G;
    }

    public int getB(){
        return B;
    }
    public void setB(int B){
        this.B = B;
    }
}