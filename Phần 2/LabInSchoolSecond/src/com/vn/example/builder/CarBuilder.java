package com.vn.example.builder;

public class CarBuilder implements Builder {
    private Car car;
    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeat(int number) {
        car.setSeat(number);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setChipComputer() {
        car.setChip("chip for car");
    }

    @Override
    public void setGps() {
        car.setGps("gps for car");
    }

    public Product getResult() {
        return car;
    }
}
