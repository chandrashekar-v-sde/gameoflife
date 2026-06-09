package com.chargepoint.gameoflife.engine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RuleEvaluatorTest {

    private final RuleEvaluator evaluator = new RuleEvaluator();

    @Test
    void shouldApplyGameOfLifeRules() {

        // Underpopulation
        assertFalse(evaluator.getNextState(true, 1));

        // Survival
        assertTrue(evaluator.getNextState(true, 2));
        assertTrue(evaluator.getNextState(true, 3));

        // Overpopulation
        assertFalse(evaluator.getNextState(true, 4));

        // Reproduction
        assertTrue(evaluator.getNextState(false, 3));
    }
}