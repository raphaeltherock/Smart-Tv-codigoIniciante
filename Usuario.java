public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

       // smartTv.diminuirVolume();
        smartTv.diminuirVolume();
       // System.out.println("Qual o volume ? " + smartTv.volume);

       // System.out.println("A TV esta Ligada? " + smartTv.ligada);
        System.out.println("Qual o volume ? " + smartTv.volume);
       // System.out.println("Qual o canal? " + smartTv.canal);


       // smartTv.ligar();
       // System.out.println("Novo Status -> A TV esta Ligada? " + smartTv.ligada);

        //smartTv.desligar();
       // System.out.println("Novo Status -> A TV esta Ligada? " + smartTv.ligada);

        smartTv.mudarCanal(2);
        System.out.println("Qual o canal? " + smartTv.canal);
        
        smartTv.ligar();
        System.out.println("Novo Status -> A Tv esta Ligada? " + smartTv.ligada);

    }

}


