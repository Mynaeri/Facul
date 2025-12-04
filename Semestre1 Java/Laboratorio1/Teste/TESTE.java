public class TESTE {
    public static void main(String[] args){
        Livro primeiroLivro = new Livro("Jorge Nois", "O tesouro dos guri", 2130, true);

        System.out.println("Autor: " + primeiroLivro.getAutor());
        System.out.println("Nome: " + primeiroLivro.getNome());
        System.out.println("Qtd de páginas: " + primeiroLivro.getPaginas());
        System.out.println("Disponibilidade: " + primeiroLivro.isDisponivel());
    }
}

// Main criado (ponto de partida)