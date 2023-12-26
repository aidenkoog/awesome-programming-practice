package io.github.aidenkoog.androidpractice.design_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

interface Observer {
    void update(NumberGenerator generator);
}

class DigitObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver");
    }
}

abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator<Observer> ir = observers.iterator();

        while (ir.hasNext()) {
            Observer observer = ir.next();
            observer.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();
}

class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();

    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public void execute() {
        System.out.println("execute!");
    }
}

class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer = new DigitObserver();
        generator.addObserver(observer);
        generator.execute();
    }
}