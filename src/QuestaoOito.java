public class QuestaoOito {

    public static void main(String[] args) {
        System.out.println("Valor de Saída: " + geraC(143, 32323));
    }

    public static int geraC(int numA, int numB) {

        String numAStr = String.valueOf(numA);
        String numBStr = String.valueOf(numB);
        String numCStr = "";

        int limite = Math.max(numAStr.length(), numBStr.length());
        for (int i = 0; i <= limite; i++) {
            if (i < numAStr.length()) {
                numCStr += numAStr.charAt(i);
            }
            if (i < numBStr.length()) {
                numCStr += numBStr.charAt(i);
            }
        }

        //criei essas variaveis apenas para melhorar legibilidade do codigo evitando problemas de numeros mágicos
        int valMaximo = 1000000;
        int retornoMaximo = -1;
        int numC = Integer.valueOf(numCStr.toString());

        //Caso C seja maior que 1.000.000, retornar -1
        return  numC > valMaximo ? retornoMaximo : numC;
    }

}
