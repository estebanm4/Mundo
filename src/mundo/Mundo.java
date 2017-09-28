package mundo;

import javax.swing.JFrame;

public class Mundo extends JFrame {
    public Mundo() {
       initUI();
    }

    private void initUI() {

        add(new Escenario());
        setSize(1024, 514);
        setTitle("Ejercicio 0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        Mundo ex = new Mundo();
        ex.setVisible(true);
       
    }
}