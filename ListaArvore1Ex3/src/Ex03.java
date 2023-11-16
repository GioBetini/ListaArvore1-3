import arvoreChar.ArvoreChar;

public class Ex03 {
    public static void main(String[] args) throws Exception {
        char[] vet = {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};
        ArvoreChar arvore = new ArvoreChar();

        for(char i : vet){
            arvore.insert(i);
        }

        try{
            arvore.remove('F');
            arvore.remove('U');
            System.out.println("Atravessamento pré-ordem");
            arvore.prefixSearch();
            System.out.println("============================================");
            System.out.println("Atravessamento em ordem");
            arvore.infixSearch();
            System.out.println("============================================");
            System.out.println("Atravessamento pós-ordem");
            arvore.postfixSearch();
            System.out.println("============================================");
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
