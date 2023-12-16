package bsu.rfe.java.group8.lab3.Ambrazhei.varA1;

import javax.swing.*;
import java.util.Arrays;

public class mainA3 {
    public static void main(String[] args) {
        Double[] a = {1., 5., 4., 3., 2., 1.};

        HornersScheme frame = new HornersScheme(a);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


}