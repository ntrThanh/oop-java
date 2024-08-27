package com.vn.example.composite;

import java.util.ArrayList;
import java.util.List;
public class CompoundGraphic implements Graphic {
    private List<Graphic> graphicList;

    public CompoundGraphic() {
        this.graphicList = new ArrayList<>();
    }

    public CompoundGraphic(List<Graphic> graphicList) {
        this.graphicList = graphicList;
    }

    public void remove(Graphic graphic) {
        graphicList.remove(graphic);
    }

    public void add(Graphic graphic) {
        graphicList.add(graphic);
    }

    @Override
    public void move(int x, int y) {
        for(int i = 0; i < graphicList.size(); i++) {
            graphicList.get(i).move(x, y);
        }
    }

    @Override
    public void draw() {
        for(int i = 0; i < graphicList.size(); i++) {
            graphicList.get(i).draw();
        }
    }
}
