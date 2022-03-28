
package principal;


public class disparoEnemigo extends Thread {
    main main;
    tiroEnemigo tE;
    public disparoEnemigo(main main){
        this.main = main;
    }
    
    @Override
    public void run() {
        while(true){
            tE= new tiroEnemigo(main);
            main.tirosE.add(tE);
            try {
                kill k = new kill(tE, tE.n, main);               
                k.start();                
                Thread.sleep(100);//cada dos segundos aparece un disparo
                
            } catch (Exception e) {
            }
            
            
        }
    }
    
    
}
