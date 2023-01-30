public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada ?" + smartTv.ligada);
        System.out.println("Qual o volume ?" + smartTv.volume);
        System.out.println("Qual o canal?" + smartTv.canal);
    }
}


