package Lec_16;

public class Calculator implements Basic_calculator{
    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void subtract(int a, int b) {
        System.out.println(a-b);
    }

    @Override
    public void multiply(int a, int b) {
        System.out.println(a*b);
    }

    @Override
    public void divide(int a, int b) {
        System.out.println(a-b);
    }

    @Override
    public void display() {
        System.out.println("Hello world");
    }

    @Override
    public void print1() {
        System.out.println("Hello");
    }
}
