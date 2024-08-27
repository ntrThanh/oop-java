package com.vn.example.builder;

public interface Builder {
    void reset();
    void setSeat(int number) ;
    void setEngine(String engine);
    void setChipComputer();
    void setGps();
    Product getResult();
}
