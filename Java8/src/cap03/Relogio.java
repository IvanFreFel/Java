package cap03;
public class Relogio {
    public static void main(String[] args) {
        int horas, minutos, segundos, centesimo;
        for(horas = 0; horas < 24; horas++){
            for(minutos = 0; minutos <60; minutos++){
                for(segundos = 0; segundos <60; segundos++){
                    System.out.println(horas + "h:" + minutos + "min:" + segundos + "s:");
                    try{
                        Thread.sleep(1000);
                        if(segundos == 25){
                            System.exit(0);
                        }
                    } catch(InterruptedException erro){
                        erro.toString();
                        
                    }
                    /*/for(centesimo = 0; centesimo <100; centesimo++){
                        System.out.println(horas + "h:" + minutos + "min:" + segundos + "s:");
                    try{
                        Thread.sleep(100);
                        if(segundos == 59){
                            System.exit(0);
                        }
                    } catch(InterruptedException erro){
                        erro.toString();
                        
                    }*/
                }
            }
        }
    }
}
