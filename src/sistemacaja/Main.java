package sistemacaja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Main {

    public static void main(String[] args) {
        
        JFrame f = new JFrame();
        final JDialog dialog = new JDialog(f, "Titulo", true);
        
        dialog.setLocationRelativeTo(null);
        dialog.setUndecorated(true);

        ImageIcon imagen = new ImageIcon("C:\\Users\\Jhonnel\\Documents\\NetBeansProjects\\sistemacaja2\\src\\sistemacaja\\introarp.jpg");
        
        JLabel label1 = new JLabel(imagen);
        dialog.setBounds(400, 200, 600, 454);
        dialog.add(label1);
        
        Timer timer = new Timer(3000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
                dialog.dispose();

            }
        });
        
        timer.setRepeats(false);
        timer.start();
        
        
        dialog.setVisible(true); // if modal, application will pause here
        

        System.out.println("Dialog closed");
        
        //Mostrar Siguiente formulario
        frmLogin Login=new frmLogin();
        Login.setVisible(true);
        //System.exit(0);
    }

}
