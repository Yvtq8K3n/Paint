package com.company;

import javax.swing.*;
import java.awt.*;

public class JMenuPane extends JTabbedPane {
    JMenuBasePane jMenuBasePane;
    JPanel jPane2;
    JPanel jPane3;
    JPanel jPane4;

    public JMenuPane() {
        super();
        initComponents();
    }

    public void initComponents(){
        //Creating components
        jMenuBasePane = new JMenuBasePane();
        jPane2 = new JPanel();
        jPane3 = new JPanel();
        jPane4 = new JPanel();

        //Adding components
        addTab("Base", jMenuBasePane);
        addTab("Tab 2", jPane2);
        addTab("Tab 3", jPane3);
        addTab("Tab 4", jPane4);
    }


}
