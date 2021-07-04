import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Board extends JPanel implements ActionListener {
        Image BackgroundImasge;
    car car;
    Timer time;
    public Board(){
        ImageIcon iamgeicon = new ImageIcon("bgi.png");
        BackgroundImage = iamgeicon.getImage();
        car = new car();
        addKeyListener(new action());
        time = new Timer(5, this);
        time.start();
        setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(BackgroundImage, 0, 0, this);
        g.drawImage(car.car, car.x, 330, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    private class action extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            car.move(e);
        }
    }
}

