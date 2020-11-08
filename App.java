public class App {
    public static void main(String[] args) throws Exception {
        Campeonato resultado = new Campeonato("Viagem para Europa", 74, 10);
        resultado.informacao();


        Jogador atleta = new Jogador(23, 1.69, 74.3f);
        atleta.informacao();
    
    
    
        Estadios local = new Estadios(1000, 35, 2800 );
        local.informacao();
    
    
    
    
    
    
    }
}
