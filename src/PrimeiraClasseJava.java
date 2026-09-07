public class PrimeiraClasseJava {
    // Variavel global => Acessivel de qualquer local
    static String meuNome = "Pedro";

    public static void main(String[] args) {
        nomeUsuario();
        maiorIdade();
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
}
