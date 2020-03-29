package com.owenpeterson;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) throws AWTException, InterruptedException {

        GUIForBee bee = new GUIForBee();


        Robot robot = new Robot();
        ChangeClipboard changeClipboard = new ChangeClipboard();
        String startNarrator = "narrator.exe";

        //Sets clipboard to "narrator.exe"
        changeClipboard.setClipboard(startNarrator);

        //Opens run window
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_R);

        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_R);

        //Makes thread sleep so windows doesn't have an stroke
        Thread.sleep(1000);

        //Pastes narrator.exe so the narrator opens
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        //Runs narrator.exe
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        //Waits so the narrator has time to start up
        Thread.sleep(1000);

        //Opens swing window with entire bee movie script as title to be read
        bee.beeScript();






    }
}
