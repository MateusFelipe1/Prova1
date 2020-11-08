public class Campeonato{
    private String premiacao;
    private int pontuacao;
    private int qtdtime;

    public Campeonato(String c, int p, int q){
        this.premiacao = c;
        this.pontuacao = p;
        this.qtdtime = q;
    }

    public String getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(String c) {
        this.premiacao = c;
    }
    


    public void setPontuacao(int p){
        this.pontuacao = p;
    }

    public int getPontuacao(){
        return pontuacao;
    
    }

    public void setQtdtime(int q){
        this.qtdtime = q;
    }

    public int getQtdtime(){
        return qtdtime;
    }



    public void jogando() {
        System.out.println(" 4 times estão jogando neste momento");
    }





    public void informacao(){
        System.out.println("INFORMAÇÕES SOBRE O CAMPEONATO");
        System.out.println("Premiacao: " + getPremiacao());
        System.out.println("Pontuacao necessaria para ser campeao:" + getPontuacao() + " pontos");
        System.out.println("Quantidade de times disputando o campeonato: " + getQtdtime());
        jogando();
        System.out.println();
    }

   





}