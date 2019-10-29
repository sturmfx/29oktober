package com.company;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Main
{
    public static int x = 0;
    static Random r = new Random();
    public static JFrame gui = new JFrame();
    public static JTextArea text = new JTextArea(6, 50);
    public static JButton ok = new JButton("OK");
    public static void main(String[] args)
    {
        x = r.nextInt(100);
        ok.addActionListener(e ->
        {
            int x2;
            if(text.getText().matches("\\d{2}"))
            {
                x2 = Integer.parseInt(text.getText());
                if(x > x2)
                {
                    System.out.println("X is larger than " + x2);
                }
                else
                {
                    if(x < x2)
                    {
                        System.out.println("X is smaller than " + x2);
                    }
                    else
                    {
                        System.out.println("X is " + x2);
                    }
                }
            }
        });
        gui.setSize(new Dimension(600, 400));
        gui.setLayout(new FlowLayout());
        gui.add(text);
        gui.add(ok);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
