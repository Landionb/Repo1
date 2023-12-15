import javax.swing.*;
import java.awt.*;

public class mainWindow extends JPanel implements Runnable {

    final int FPS = 60;
    Thread gameThread;
    PlayManager pm;

    public mainWindow(){
        //ajustes del panel
        this.setPreferredSize(new Dimension(1280, 720));
        this.setBackground(Color.black);
        this.setLayout(null);

        pm = new PlayManager();
    }

    public void launchGame(){
        gameThread = new Thread(this);
        gameThread.start();
    }
    @Override
    public void run() {
        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime ;
        while (gameThread != null){
            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if (delta >= 1 ){

                update();
                repaint();
                delta--;
            }
        }
    }

    private void update(){
        pm.update();
    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
    }
}
