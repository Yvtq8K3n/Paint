package com.company;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;

public class ApplicationView extends JFrame {
    private JPanel mainPanel;
    private JMenuPane jMenuPane;
    private JPanel jCanvasPanel;

    public ApplicationView() {
        setTitle("JPanelBackgroundColor Test");
        try {
            //Attempting to get System Look and Feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.getDefaults().put("TabbedPane.contentBorderInsets", new Insets(0,0,0,0));
            //UIManager.put("Button.focus", new ColorUIResource(new Color(0, 0, 0, 0)));
        } catch (ClassNotFoundException | InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        initComponents();
        setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
        setVisible(true);
        pack();
    }

    public void initComponents(){
        jMenuPane = new JMenuPane();
        jMenuPane.setBackground(Color.GREEN);

        jCanvasPanel = new JPanel();
        jCanvasPanel.setBackground(Color.RED);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(jMenuPane, BorderLayout.PAGE_START);
        mainPanel.add(jCanvasPanel, BorderLayout.CENTER);

        add(mainPanel, BorderLayout.CENTER);
    }

    public static void main(String args[]) {
        new ApplicationView();
    }
}