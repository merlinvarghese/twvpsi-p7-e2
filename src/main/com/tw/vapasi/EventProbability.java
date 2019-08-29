package com.tw.vapasi;

// chances of occurence of two events which could be similar.
public class EventProbability {
    private double coinProbability;
    private double diceProbability;


    public EventProbability(double coinProbability,double diceProbability) {
        this.coinProbability = coinProbability;
        this.diceProbability = diceProbability;
    }

    public boolean compareProbability() {
        return coinProbability == diceProbability;
    }
    double combinedProbability(){
        return coinProbability * diceProbability;
    }
    public boolean equals(Object obj) {

        if ((obj != null) && obj instanceof EventProbability) {
            return true;
        }
        return false;
    }

}


