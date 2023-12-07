package yalc_java.sec10.chap03;

import yalc_java.sec07.chap04.*;

class Dragon extends Unit {
    public Dragon(Side side) {
        super(side, 3000);
    }

    @Override
    public String toString() {
        return side.toString() + " 진영 드래곤";
    }
}