package com.vn.example.builder;

public class ManualBuilder implements Builder {
    private Manual manual;
    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeat(int number) {
        manual.setSeat(number);
    }

    @Override
    public void setEngine(String engine) {
        manual.setEngine(engine);
    }

    @Override
    public void setChipComputer() {
        manual.setChip("chip for manual");
    }

    @Override
    public void setGps() {
        manual.setGps("gps for manual");
    }

    public Product getResult() {
        return manual;
    }
}
