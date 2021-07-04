import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class car  {
    Image car;
    int x;

    car(){
        ImageIcon imageicon = new ImageIcon("car.png");
        car = imageicon.getImage();
        x= 400;
    }

    public void move (KeyEvent e){
        int key = e.getKeyCode();

        if(key == 39) x = x+5;
        if(key == 37) x = x-5;
    }
}

}
