package DesignPattern.TheProxyPattern;

import DesignPattern.TheStatePattern.GumballMachine;

public class NoQuarterState implements State {
    private static final long serialVerionUID = 2L;
    transient GumballMachine gumballMachine;
    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
