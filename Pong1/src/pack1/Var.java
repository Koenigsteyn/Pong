package pack1;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Var {

    static JFrame jf1;
    static int screenwidth = 800, screenheight = 600;

    static int x = 20, y = 185;
    static int gegnerx = 755, gegnery = 185;
    static int ballx = 200, bally = 200;


    static boolean moveup = false, movedown = false;

    static int balldirx = 1, balldiry = -1;

    static int playerpoints = 0, gegnerpoints = 0;

    static Font pixelfont;

    public Var() {

        try {
            pixelfont = Font.createFont(Font.TRUETYPE_FONT, new File("Platinum Sign.ttf")).deriveFont(50f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Platinum Sign.ttf")));
        }catch (FontFormatException | IOException e) {

            e.printStackTrace();
            }
    }

}