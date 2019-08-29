package com.tw.vapasi;

// chances of occurence of two events which could be similar.
public class EventProbability {
    private double eventOneProbability;
    private double eventTwoProbability;

    public EventProbability(double eventProbability1, double EventProbability2) {
        this.eventOneProbability = eventProbability1;
        this.eventTwoProbability = EventProbability2;
    }

    public boolean CompareProbability() {
        return eventOneProbability == eventTwoProbability;
    }

    public boolean equals(Object obj) {
        if ((obj != null) && obj instanceof EventProbability) {
            return true;
        }
        return false;
    }

}


