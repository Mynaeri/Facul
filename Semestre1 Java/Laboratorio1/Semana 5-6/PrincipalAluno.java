public class PrincipalAluno{
    public static void main (String[] args){
        Aluno aluno1 = new Aluno("Brandamente Brasil","1585258",5,9);
        Aluno aluno2 = new Aluno("Ragigunda Cercená","2254879",8,2);
        Aluno aluno3 = new Aluno("Vitimado Jose Araujo","0085994",7,1);

        System.out.println("Informacoes do aluno 1:");
        aluno1.imprimeInfo();
        System.out.println("Informacoes do aluno 2: ");
        aluno2.imprimeInfo();
        System.out.println("Informacoes do aluno 3: ");
        aluno3.imprimeInfo();

        aluno2.setNotaGA(9);
        System.out.println("Nota do GA de Ragigunda alterada para 9!");
        aluno2.setNotaGB(Teclado.leInt("Digite a nova nota do GB de Ragigunda: "));
        System.out.println("Nota do GB de Ragigunda alterada para: "+ aluno2.getNotaGB());
        System.out.println("Média final de Ragigunda: "+aluno2.calculaMediaFinal());

        System.out.println("Matricula de Vitimando: "+ aluno3.getMatricula());

        aluno3.setMatricula("1585228");
        System.out.println("Matricula de Brandamente alterada para: "+ aluno3.getMatricula());

    }
}

class Aluno{
    private String nome, matricula;
    private double notaGA, notaGB;
    
    public Aluno(String nome, String matricula, double notaGA, double notaGB){
        this.nome = nome;
        this.matricula = matricula;
        this.notaGA = notaGA;
        this.notaGB = notaGB;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void setNotaGA(double notaGA){
        this.notaGA = notaGA;
    }
    
    public void setNotaGB(double notaGB){
        this.notaGB = notaGB;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public double getNotaGA(){
        return notaGA;
    }
    
    public double getNotaGB(){
        return notaGB;
    }
    
    public double calculaMediaFinal(){
        return (notaGA * 0.33) + (notaGB * 0.67);
    }
    
    public void imprimeInfo(){
        System.out.println("Nome do aluno: "+nome);
        System.out.println("Matrícula do aluno: "+matricula);
        System.out.println("Nota do GA: "+notaGA);
        System.out.println("Nota do GB: "+notaGB);
        System.out.println("Média final: "+calculaMediaFinal());
    }
}