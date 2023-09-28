package com.example.automata;

public class TransitionThread extends Thread {

    public interface DoSequence {
        void sequence() throws InterruptedException;
    }

    private DoSequence doSequence;

    public void setSequence(DoSequence doSequence) {
        this.doSequence = doSequence;
    };

    @Override
    public void run() {
        try {
            doSequence.sequence();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
