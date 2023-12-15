import java.awt.*;

public class PlayManager {


    //dibujar el Area
    //manejar las fichas
    //manejar las acciones(dibujar lineas, scores..)

    final int WIDTH = 360;
    final int HEIGTH = 600;

    public  static  int left_x;
    public  static  int right_x;
    public  static  int top_y;
    public  static  int bottom_y;

    public PlayManager(){

        //Principal area Frame
        left_x = (mainWindow.WIDTH / 2) - (WIDTH / 2); //1280/2 - 360/2= 460
        right_x = left_x + WIDTH;
        top_y = 50;
        bottom_y = top_y + HEIGTH;

    }
    public void update(){

    }
    public void draw(Graphics2D g2){

        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(4f));
        g2.drawRect(left_x-4, top_y-4, WIDTH+8, HEIGTH+8);

    }
}
