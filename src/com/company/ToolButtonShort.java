package com.company;

import javax.swing.*;
import java.awt.*;

public class ToolButtonShort extends JToggleButton {
    private Color hoverBackgroundColor = new Color(232, 239, 247);
    private Color hoverSelectionColor = new Color(164, 206, 249);
    private Color pressedBackgroundColor = new Color(201, 224, 247);
    private Color pressedSelectionColor = new Color(98, 162, 228);

    public ToolButtonShort(ImageIcon imageIcon) {
        this("", imageIcon);
        setPreferredSize(new Dimension(24, 24));
        setMaximumSize(new Dimension(24, 24));
    }

    public ToolButtonShort(String value, ImageIcon imageIcon) {
        super(value, imageIcon);
        setMargin(new Insets(0,0,0,0));
        setMaximumSize(new Dimension(60, 24));
        setFocusPainted(false);
        setBorderPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());

        if (getModel().isRollover()) {
            g.setColor(hoverBackgroundColor);
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(hoverSelectionColor);
            g.drawRect(0, 0, getWidth()-1, getHeight()-1);
        }
        if(getModel().isPressed()){
            g.setColor(pressedBackgroundColor);
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(pressedSelectionColor);
            g.drawRect(0, 0, getWidth()-1, getHeight()-1);
        }
        super.paintComponent(g);
    }


}
