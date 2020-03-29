package com.owenpeterson;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class ChangeClipboard {

    public static void setClipboard(String setTo){
        StringSelection stringSelection = new StringSelection(setTo);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);
    }
}
