package com.chargepoint.gameoflife.printer;

import com.chargepoint.gameoflife.model.Universe;

public class UniversePrinter {

    public void print(Universe universe) {
        for (int row = 0; row < universe.getRows(); row++) {
            StringBuilder line = new StringBuilder();

            for (int col = 0; col < universe.getCols(); col++) {
                line.append(universe.isAlive(row, col) ? "X " : ". ");
            }

            System.out.println(line);
        }

        System.out.println();
    }
}