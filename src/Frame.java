import javax.swing.*;

public class Frame {public static void main(String[]args){
    JFrame frame = new JFrame("frame title");
    frame.setSize(1048, 540);
    frame.add(new com.nfs.Board());
    frame.setVisible(true);
}
}
}
