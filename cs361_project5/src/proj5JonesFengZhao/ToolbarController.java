/*
File: ToolbarController.java
CS361 Project 5
Names: Yi Feng, Matt Jones, Danqing Zhao
Date: 10/12/18
 */

package proj5JonesFengZhao;

import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;



/**
 * This class is the controller for all of the toolbar functionality.
 * Specifically the Hello and Goodbye Buttons.
 *
 * @author  Kevin Ahn, Jackie Hang, Matt Jones, Kevin Zhou
 * @version 1.0
 * @since   10-3-2018
 */
public class ToolbarController {

    /**
     * Defines and instantiates a text input dialog box that waits for
     * the user's input and displays it on the Hello button.
     */
    public void handleCompile(Button compileButton) {
        System.out.println("Code is compiling");
    }

    /**
     * Handler for the goodbye button's event listener and changes the
     * button's when triggered.
     */
    public void handleCompileRun(Button compileRunButton) {
        System.out.println("Code is compiling and running");
    }
    
    void handleStop(Button stopButton){
        System.out.println("Running code is being stopped.");
    }
}
