public class Usuario {
    public static void main(String[] args) {
        //

        SmartTV smartTV = new SmartTV();

        System.out.println("--------------------------");
        System.out.println("          STATUS          ");
        System.out.println("Ligada: " + smartTV.ligada);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);
        System.out.println("--------------------------");

        System.out.println("       Atualização:       ");
        smartTV.ligar();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.passarCanal();
        smartTV.passarCanal();
        System.out.println("--------------------------");
        System.out.println("          STATUS          ");
        System.out.println("Ligada: " + smartTV.ligada);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);
        System.out.println("--------------------------");

        System.out.println("       Atualização:       ");
        smartTV.voltarCanal();
        smartTV.diminuirVolume();
        System.out.println("--------------------------");
        System.out.println("          STATUS          ");
        System.out.println("Ligada: " + smartTV.ligada);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);
        System.out.println("--------------------------");

        System.out.println("       Atualização:       ");
        smartTV.definirCanal(9);
        System.out.println("--------------------------");
        System.out.println("          STATUS          ");
        System.out.println("Ligada: " + smartTV.ligada);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);
        System.out.println("--------------------------");

        System.out.println("       Atualização:       ");
        smartTV.desligar();
        System.out.println("--------------------------");
        System.out.println("          STATUS          ");
        System.out.println("Ligada: " + smartTV.ligada);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);
        System.out.println("--------------------------");

    }
}