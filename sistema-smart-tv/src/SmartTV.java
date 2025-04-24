public class SmartTV {
    // Atributos
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // Métodos
    public void ligar(){
        System.out.println("Ligando...");
        ligada = true;
    }

    public void desligar(){
        System.out.println("Desligando...");
        ligada = false;
    }

    public void definirCanal(int canal){
        System.out.println("Indo para o canal " + canal);
        this.canal = canal;
    }

    public void passarCanal(){
        System.out.println("Canal+ " + canal);
        canal++;
    }

    public void voltarCanal(){
        System.out.println("Canal- " + canal);
        canal--;
    }

    public void aumentarVolume(){
        System.out.println("Volume+ " + volume);
        volume++;
    }

    public void diminuirVolume(){
        System.out.println("Volume- " + volume);
        volume--;
    }
}
