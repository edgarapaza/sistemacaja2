package sistemacaja;

import java.util.TimerTask;
import javax.swing.JOptionPane;

class Codigo extends TimerTask{

    //Las veces que se debe repetir el código
    private int veces = 0;
    private int contadorVeces = 0;
    inicioCaja obj;
    @Override
    public void run() {
        
        
        contadorVeces++;
        obj = new inicioCaja();
        if (contadorVeces <= veces) {
            
            
            JOptionPane.showMessageDialog(obj, "aqui");
        } else {
            JOptionPane.showMessageDialog(obj, "fin");
            //Si ya se cumplió el número de veces, se cancela todo            
            this.cancel();
            System.exit(0); 
        }
        
    }
    
}
