    // Criado a classe Livro
public class Livro{
    private String autor;
    private String nome;
    private int paginas;
    private boolean disponivel;
    // Método construtor:
    public Livro(String autor, String nome, int paginas, boolean disponivel){
        this.autor = autor;
        this.nome = nome;
        this.paginas = paginas;
        this.disponivel = disponivel;
    }
    // Método de acesso GET (getter), basicamente lê a o valor.
    public String getAutor(){
        return autor; // Retorna o valor após ler
    }
    // Método de acesso SET (setter), altera o valor, nesse caso o valor do atributo autor.
    public void setAutor(String autor){
        this.autor = autor; // Define o novo valor de autor.
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getPaginas(){
        return paginas;
    }
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }
    public boolean isDisponivel(){
        return disponivel;
    }
    public void setDisponivel (boolean disponivel){
        this.disponivel = disponivel;
    }
}