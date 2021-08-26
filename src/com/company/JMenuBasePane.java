package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;

public class JMenuBasePane extends JPanel {
    JPanel clipboardPane;
    JPanel imagePane;
    JPanel toolsPane;

    public JMenuBasePane() {
        setLayout(new FlowLayout(FlowLayout.LEADING));
        initComponents();
    }

    private void initComponents() {
        clipboardPane = createClipboardLayout();
        add(clipboardPane);
        addSeparator();

        imagePane = createImageLayout();
        add(imagePane);
        addSeparator();

        toolsPane = createToolsLayout();
        add(toolsPane);
        addSeparator();
    }

    private void addSeparator() {
        JSeparator jSeparator = new JSeparator(JSeparator.VERTICAL);
        jSeparator.setForeground(new Color(227, 228, 229));
        jSeparator.setBackground(new Color(227, 228, 229));
        jSeparator.setPreferredSize(new Dimension(1, 93));
        add(jSeparator);
    }

    private JPanel createClipboardLayout() {
        //ClipboardContentPane
        ToolButtonShort btnCut = new ToolButtonShort("Cut", new ImageIcon("./resources/Cut.png"));
        ToolButtonShort btnCopy = new ToolButtonShort("Copy", new ImageIcon("./resources/Copy.png"));
        JPanel clipboardContentPane = new JPanel();
        clipboardContentPane.setLayout(new BoxLayout(clipboardContentPane, BoxLayout.PAGE_AXIS));
        clipboardContentPane.add(btnCut);
        clipboardContentPane.add(btnCopy);

        //btnPaste
        ToolButtonShort btnPaste = new ToolButtonShort("Paste", new ImageIcon("./resources/Paste.png"));
        btnPaste.setPreferredSize(new Dimension(42, 66));
        btnPaste.setVerticalTextPosition(JLabel.BOTTOM);
        btnPaste.setHorizontalTextPosition(JLabel.CENTER);

        //JLabel
        JLabel clipboardTitle = new JLabel("Clipboard");
        clipboardTitle.setVerticalAlignment(JLabel.BOTTOM);
        clipboardTitle.setHorizontalAlignment(JLabel.CENTER);
        JPanel clipboardTitlePane = new JPanel();
        clipboardTitlePane.setLayout(new BorderLayout());
        clipboardTitlePane.add(clipboardTitle, BorderLayout.CENTER);

        //ClipboardPane
        JPanel clipboardPane = new JPanel();
        clipboardPane.setPreferredSize(new Dimension(102, 93));
        clipboardPane.setLayout(new BorderLayout());
        clipboardPane.add(btnPaste, BorderLayout.LINE_START);
        clipboardPane.add(clipboardContentPane, BorderLayout.CENTER);
        clipboardPane.add(clipboardTitlePane, BorderLayout.PAGE_END);
        return clipboardPane;
    }


    private JPanel createImageLayout() {
        //ImageContentPane
        JPanel imageContentPane = new JPanel();
        imageContentPane.setLayout(new BoxLayout(imageContentPane, BoxLayout.PAGE_AXIS));
        ToolButtonShort btnCrop = new ToolButtonShort("Crop", new ImageIcon("./resources/Crop.png"));
        ToolButtonShort btnResize = new ToolButtonShort("Resize", new ImageIcon("./resources/Resize.png"));
        ToolButtonShort btnRotate = new ToolButtonShort("Rotate", new ImageIcon("./resources/Rotate.png"));
        imageContentPane.add(btnCrop);
        imageContentPane.add(btnResize);
        imageContentPane.add(btnRotate);

        //btnSelect
        ToolButtonShort btnSelect = new ToolButtonShort("Select", new ImageIcon("./resources/Select.png"));
        btnSelect.setPreferredSize(new Dimension(58, 66));
        btnSelect.setVerticalTextPosition(JLabel.BOTTOM);
        btnSelect.setHorizontalTextPosition(JLabel.CENTER);

        //JLabel
        JLabel imageTitle = new JLabel("Image");
        imageTitle.setVerticalAlignment(JLabel.BOTTOM);
        imageTitle.setHorizontalAlignment(JLabel.CENTER);
        JPanel imageTitleContentPane = new JPanel();
        imageTitleContentPane.setLayout(new BorderLayout());
        imageTitleContentPane.add(imageTitle, BorderLayout.CENTER);

        //ClipboardContentPane
        JPanel imagePane = new JPanel();
        imagePane.setPreferredSize(new Dimension(123, 93));
        imagePane.setLayout(new BorderLayout());
        imagePane.add(btnSelect, BorderLayout.LINE_START);
        imagePane.add(imageContentPane, BorderLayout.CENTER);
        imagePane.add(imageTitleContentPane, BorderLayout.PAGE_END);
        return imagePane;
    }

    private JPanel createToolsLayout() {
        //ImageContentPane
        JPanel toolsContentPane = new JPanel();
        GridLayout gridLayout = new GridLayout(2, 4);
        gridLayout.setVgap(5);
        toolsContentPane.setLayout(gridLayout);
        ToolButtonShort btnPencil = new ToolButtonShort(new ImageIcon("./resources/Pencil.png"));
        ToolButtonShort btnColorFill = new ToolButtonShort(new ImageIcon("./resources/ColorFill.png"));
        ToolButtonShort btnText = new ToolButtonShort(new ImageIcon("./resources/Text.png"));
        ToolButtonShort btnWand = new ToolButtonShort(new ImageIcon("./resources/Wand.png"));
        ToolButtonShort btnEraser = new ToolButtonShort(new ImageIcon("./resources/Eraser.png"));
        ToolButtonShort btnColorPicker = new ToolButtonShort(new ImageIcon("./resources/ColorPicker.png"));
        ToolButtonShort btnMagnifier = new ToolButtonShort(new ImageIcon("./resources/Magnifier.png"));
        ToolButtonShort btnColorReplace = new ToolButtonShort(new ImageIcon("./resources/ColorReplace.png"));
        toolsContentPane.add(btnPencil);
        toolsContentPane.add(btnColorFill);
        toolsContentPane.add(btnText);
        toolsContentPane.add(btnWand);
        toolsContentPane.add(btnEraser);
        toolsContentPane.add(btnColorPicker);
        toolsContentPane.add(btnMagnifier);
        toolsContentPane.add(btnColorReplace);

        JPanel spacePane = new JPanel();
        spacePane.setPreferredSize(new Dimension(0, 0));

        //JLabel
        JLabel imageTitle = new JLabel("Tools");
        imageTitle.setVerticalAlignment(JLabel.BOTTOM);
        imageTitle.setHorizontalAlignment(JLabel.CENTER);
        JPanel imageTitleContentPane = new JPanel();
        imageTitleContentPane.setLayout(new BorderLayout());
        imageTitleContentPane.add(imageTitle, BorderLayout.CENTER);

        //ClipboardContentPane
        JPanel toolPane = new JPanel();
        toolPane.setPreferredSize(new Dimension(72, 93));
        toolPane.setLayout(new BorderLayout(10, 10));
        toolPane.add(spacePane, BorderLayout.PAGE_START);
        toolPane.add(toolsContentPane, BorderLayout.CENTER);
        toolPane.add(imageTitleContentPane, BorderLayout.PAGE_END);
        return toolPane;
    }
}
