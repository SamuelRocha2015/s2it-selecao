public class QuestaoNove {

    public static void main(String[] args) {
        System.out.println(getNosSubsequents(criaArvoreParaTeste()));
    }

    /**
     * Método que calcula a soma dos nós subsequentes
     */
    public static int getNosSubsequents(BinaryTree no) {
        int valor = 0;

        if (no != null) {
            if (no.getLeft() != null) {
                valor += no.getLeft().getValor();
                valor += getNosSubsequents(no.getLeft());
            }

            if (no.getRight() != null) {
                valor += no.getRight().getValor();
                valor += getNosSubsequents(no.getRight());
            }
        }

        return valor;
    }

    /**
     * Cria e preenche a arvore que será utilizada para o teste
     */
    private static BinaryTree criaArvoreParaTeste() {

        //exemplo utilizado para teste
        BinaryTree arvoreA = new BinaryTree();
        BinaryTree arvoreA1 = new BinaryTree(10);
        BinaryTree arvoreA2 = new BinaryTree(15);

        BinaryTree arvoreA11 = new BinaryTree(20);
        BinaryTree arvoreA12 = new BinaryTree(25);

        BinaryTree arvoreA21 = new BinaryTree(30);
        BinaryTree arvoreA22 = new BinaryTree(35);

        arvoreA.setRight(arvoreA1);
        arvoreA.setLeft(arvoreA2);

        arvoreA1.setRight(arvoreA11);
        arvoreA1.setLeft(arvoreA12);

        arvoreA2.setRight(arvoreA21);
        arvoreA2.setLeft(arvoreA22);

        return arvoreA;
    }

}

/**
 * Estrutura de arvore binária
 */
class BinaryTree {

    private int valor;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree() {
    }

    public BinaryTree(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }
}
