public class Usuario {

    public static void main(String[] args) throws Exception{
        
        SmartTv smartTv = new SmartTv();
        
        // aumenta e diminui o volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        // Muda o canal
        smartTv.mudarCanal(12);
        smartTv.aumentarCanal();

        // Mostra o status da tv ligada, canal e volume
        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        // liga a smatTv
        smartTv.ligar();
        System.out.println("Nova Status -> Tv Ligada? " + smartTv.ligada);

        // desliga a smatTv
        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

    }
}