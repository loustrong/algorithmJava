package com.tom.athome;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;
import java.util.Date;

/**
 * Time Test
 *
 * @author Tom on 2021/1/1
 */
public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();
        // construct a timer that calls the listener
        // once every 10 seconds
        Timer t = new Timer(10000,listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
