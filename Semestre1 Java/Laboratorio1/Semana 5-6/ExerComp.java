// Criar uma classe computador com marca, velocidade, data de fabricacao e se é novo ou nao

public class ExerComp {
    public static void main (String[] args){
        
        Computador pcSala = new Computador("Asus", 3.55, 2017, false);
        System.out.print(pcSala);
    }
}

class Computador{
    private String marca;
    private double velocidade;
    private int dataFab;
    private boolean novo;

    public Computador(String marca, double velocidade, int dataFab, boolean novo){
        this.marca = marca;
        this.velocidade = velocidade;
        this.dataFab = dataFab;
        this.novo = novo;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public double getVelocidade(){
        return velocidade;
    }
    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }

    public int getDataFab(){
        return dataFab;
    }
    public void setDataFab(int dataFab){
        this.dataFab = dataFab;
    }

    public boolean isNovo(){
        return novo;
    }
    public void setNovo(boolean novo){
        this.novo = novo;
    }

// toString() adicionado pq tinha outro exercicio perguntando o que era e o que fazia

@Override
    public String toString() {
        return "Marca: " + marca +
           "\nVelocidade: " + velocidade + "GHz" +
           "\nAno de fabricação: " + dataFab +
           "\nÉ novo? " + (novo ? "Sim" : "Não");
    }
}