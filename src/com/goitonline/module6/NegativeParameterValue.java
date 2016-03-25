package com.goitonline.module6;

import java.util.Scanner;

/**
 * Created by Michael on 23.03.2016.
 */
public class NegativeParameterValue  extends Exception {
    public int scanner;

    public NegativeParameterValue(int modeSelectKey) {
        this.scanner = modeSelectKey;
    }

    public NegativeParameterValue(Scanner scanner) {

    }

    public int getModeSelectKey() {
        return scanner;
    }
}
