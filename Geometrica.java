public class Geometrica implements ICalMedia {

    public double calcular(double a, double b) {
        double media = Math.sqrt(a * b);
        return media;
    }

    public String situacao(double media) {
        return (media >= 7) ? "Aprovado" : "Reprovado";
    }
}
