package test;

public class Number {

    private int num;

    public int getNum() {
        return num;
    }

    public Number(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Number{" +
                "num=" + num +
                '}';
    }

    public Number() {
    }
}
