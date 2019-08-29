package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EventProbabilityTest {
    @Test
    void expectEqualProbability() {
        EventProbability probability = new EventProbability(0.50, 0.50);
        assertEquals(true, probability.compareProbability());
    }

    @Test
    void expectNotEqualProbability() {
        EventProbability probability = new EventProbability(0.50, 0.16);
        assertNotEquals(true, probability.compareProbability());
    }

    @Test
    void expectEqualProbabilityBetweenSameReferences() {
        EventProbability probabilityOne = new EventProbability(0.50, 0.16);
        assertEquals(true, probabilityOne.equals(probabilityOne));
    }

    @Test
    void expectFalseWhenReferenceisNull() {
        EventProbability probabilityOne = new EventProbability(0.50, 0.16);
        assertEquals(false, probabilityOne.equals(null));
    }

    @Test
    void expectNotEqualProbabilityBetweenTwoReferences() {
        EventProbability probabilityOne = new EventProbability(0.50, 0.16);
        EventProbability probabilityTwo = new EventProbability(0.25, 0.10);
        assertEquals(false, probabilityOne.equals(probabilityTwo));
    }

    @Test
    void expectEqualProbabilityBetweenTwoReferences() {
        EventProbability probabilityOne = new EventProbability(0.50, 0.16);
        EventProbability probabilityTwo = new EventProbability(0.50, 0.50);
        assertEquals(true, probabilityTwo.equals(probabilityTwo));
    }

    @Test
    void expectCombinedProbabilityoftwoEvents() {
        EventProbability combinedprobability = new EventProbability(0.50, 0.50);
        assertEquals(0.25, combinedprobability.combinedProbability());
    }
}