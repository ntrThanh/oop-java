package com.vn.example.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Director() {
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeat(2);
        builder.setEngine("engine for suv car");
        builder.setChipComputer();
        builder.setGps();
    }

    public void makeSportCar(Builder builder) {
        builder.reset();
        builder.setSeat(2);
        builder.setEngine("engine for sport car car");
        builder.setChipComputer();
        builder.setGps();
    }


}
