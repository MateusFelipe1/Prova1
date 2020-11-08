public class Jogador{
    private int idade;
    private double altura;
    private float peso;

    public Jogador(int i, double a, float p ){
        this.idade = i;
        this.altura = a;
        this.peso = p;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double a) {
        this.altura = a;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(int p) {
        this.peso = p;
    }

    public void jogar(){
        System.out.println("Os jogadores estão jogando");
    }


    public void informacao(){
        System.out.println("INFORMAÇÕES SOBRE A MEDIA DOS JOGADORES");
        System.out.println("Idade média: " + getIdade() + " Anos");
        System.out.println("Altura média: " + getAltura());
        System.out.println("Peso médio: " + getPeso() + " Kg");
        jogar();
        System.out.println();

    }


}
