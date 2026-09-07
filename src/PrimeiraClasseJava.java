public class PrimeiraClasseJava {
    // Variavel global => Acessivel de qualquer local
    static String meuNome = "Pedro";

    public static void main(String[] args) {
        nomeUsuario();
        maiorIdade();
        mediaNotasAlunos();
    }

    public static void nomeUsuario() {
        System.out.println("Meu nome é " + meuNome);
    }

    public static void maiorIdade() {
        int maiorIdade, minhaIdade;

        // Variavel local => Acessivel somente dentro do seu metodo
        maiorIdade = 18;
        minhaIdade = 21;

        if (minhaIdade >= maiorIdade) {
            System.out.println("E sou maior de idade");
        } else {
            System.out.println("E sou menor de idade");
        }
    }

    public static void mediaNotasAlunos() {
        float nota1, nota2, nota3, nota4, nota5, media;

        nota1 = 7.90f;
        nota2 = 3.80f;
        nota3 = 9.2f;
        nota4 = 4.90f;
        nota5 = 8.70f;

        media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        System.out.println("A media de notas do aluno foi " + media);
    }
}
