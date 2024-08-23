public class IMC {

    public static String formula = "peso / altura / altura";

    public static double calcularIMC(double peso, double altura) {
        String expressao;
        expressao = formula.replace("peso", Double.toString(peso));
        expressao = expressao.replace("altura", Double.toString(altura));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();

    }
}