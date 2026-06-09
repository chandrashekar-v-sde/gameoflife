package com.chargepoint.gameoflife.init;

import com.chargepoint.gameoflife.model.Universe;

public class GliderInitializer {

    public void initialize(Universe universe) {
        int startRow = universe.getRows() / 2 - 1;
        int startCol = universe.getCols() / 2 - 1;

        // Glider pattern:
        // . X .
        // . . X
        // X X X

        universe.setAlive(startRow, startCol + 1, true);
        universe.setAlive(startRow + 1, startCol + 2, true);
        universe.setAlive(startRow + 2, startCol, true);
        universe.setAlive(startRow + 2, startCol + 1, true);
        universe.setAlive(startRow + 2, startCol + 2, true);
    }
}