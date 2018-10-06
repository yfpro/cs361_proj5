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
 * @author Kevin Ahn, Jackie Hang, Matt Jones, Kevin Zhou
 * @version 1.0
 * @since 10-3-2018
 */
class ToolbarController {

    /**
     * Will compile the code and print error codes in the terminal if necessary.
     * Otherwise, it will print compilation success.
     * @param compileButton Reference to the Compile Button initialized in Main.fxml
     */
    void handleCompile(Button compileButton) {
        System.out.println("Code is compiling");
    }

    /**
     * Will compile the code and print error codes in the terminal if necessary.
     * Otherwise, it will print compilation success.
     * If code compiles successfully, the code will be run.
     * @param compileRunButton Reference to the Compile and Run Button initialized in
     *                         Main.fxml
     */
    void handleCompileRun(Button compileRunButton) {
        System.out.println("Code is compiling and running");
    }

    /**
     * Will stop any code running through the Compile and Run button.
     *
     * @param stopButton Reference to the Stop Button initialized in Main.fxml
     */
    void handleStop(Button stopButton) {
        System.out.println("Running code is stopping");
    }
}
