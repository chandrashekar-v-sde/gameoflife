package com.chargepoint.gameoflife;

import com.chargepoint.gameoflife.engine.GameEngine;
import com.chargepoint.gameoflife.engine.RuleEvaluator;
import com.chargepoint.gameoflife.init.GliderInitializer;
import com.chargepoint.gameoflife.model.Universe;
import com.chargepoint.gameoflife.printer.UniversePrinter;

public class Application {

    private static final int SIZE = 25;
    private static final int GENERATIONS = 50;

    public static void main(String[] args) {
        Universe universe = new Universe(SIZE, SIZE);

        GliderInitializer initializer = new GliderInitializer();
        initializer.initialize(universe);

        GameEngine engine = new GameEngine(new RuleEvaluator());
        UniversePrinter printer = new UniversePrinter();

        for (int generation = 1; generation <= GENERATIONS; generation++) {
            System.out.println("Generation " + generation);
            printer.print(universe);

            universe = engine.nextGeneration(universe);
        }
    }
}