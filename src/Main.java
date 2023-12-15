import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Comienza el Juego!");

        JFrame gameWindow = new JFrame("Luis");

        gameWindow.setResizable(false);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainWindow gp = new mainWindow();
        gameWindow.add(gp);
        gameWindow.pack();

        gameWindow.setLocationRelativeTo(null);
        gameWindow.setVisible(true);
    }

    public void windowsGame(){

    }
}