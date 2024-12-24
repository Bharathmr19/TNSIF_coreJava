package com.tnsif.inheritance.multilevel;

public class WordPad extends Notepad {  // Corrected inheritance to Notepad

    private boolean isBold;

    public WordPad() {
        super();
        this.isBold = false;
    }

    public void formatText(boolean bold) {
        if (bold) {
            content = "<b>" + content + "</b>";
        }
        isBold = bold;
    }

    public boolean isBold() {
        return isBold;
    }
}
