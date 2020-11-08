public class Estadios{

    private int qtdPublico;
    private double valorIngresso;
    private double qtdArrecadado;
    private int ponto;

    public Estadios(int q, int v, int a){
        this.qtdPublico = q;
        this.valorIngresso = v;
        this.qtdArrecadado = a;
        this.ponto = 100;
    }


    public int getQtdPublico() {
        return qtdPublico;
    }

    public void setQtdPublico(int q) {
        this.qtdPublico = q;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double v) {
        this.valorIngresso = v;
    }

    public double getQtdArrecadado() {
        return qtdArrecadado;
    }

    public void setQtdArrecadado(double a) {
        this.qtdArrecadado = a;
    }

    public void partida(){
        System.out.print("Na ultima partidida tiveram ");
        ultimaPartida();
    }

    private void ultimaPartida(){
        System.out.println(50 + ponto + " pessoas no estádio");
    }
    


    public void informacao(){
        System.out.println("INFORMAÇÕES MEDIAS SOBRE AS PARTIDAS");
        System.out.println("Quantidade media de publico por estadio: " + getQtdPublico() + " Pessoas");
        System.out.println("Valor medio dos ingressos:" + getValorIngresso() + " reais ");
        System.out.println("Quantidade media arrecadada por jogo: " + getQtdArrecadado() + " reais ");
        partida();
        System.out.println();
    }

   











}