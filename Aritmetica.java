public class Aritmetica implements ICalMedia {

    public double calcular(double a, double b) {
        double media = (a + b) / 2;
        return media;
    }

    public String Situacao(double media) {  
        return (media >= 5) ? "Aprovado" : "Reprovado";
    }

    @Override
    public String situacao(double media) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'situacao'");
    }

}
