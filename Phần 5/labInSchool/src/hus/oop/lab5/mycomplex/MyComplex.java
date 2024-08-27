package hus.oop.lab5.mycomplex;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return real + " + " + imag + "i";
    }

    public boolean isReal() {
        return imag == 0;
    }

    public boolean isImaginary() {
        return real == 0;
    }

    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex another) {
        return real == another.getReal() && imag == another.getImag();
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();

        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(real + right.getReal(), imag + right.getImag());
    }

    public double argument() {
        return Math.atan2(imag, real);
    }

    public MyComplex subtract(hus.oop.lab4.complex.MyComplex right) {
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }

    public MyComplex subtractNew(hus.oop.lab4.complex.MyComplex right) {
        return new MyComplex(this.real + right.getReal(), this.imag + right.getImag());
    }

    public MyComplex multiply(hus.oop.lab4.complex.MyComplex right){
        this.real = this.real * right.getReal() - this.imag * right.getImag();
        this.imag = this.real * right.getImag() + this.imag * right.getReal();
        return this;
    }

    public MyComplex divide(hus.oop.lab4.complex.MyComplex right) {
        this.real = (this.real * right.getReal() - this.imag * right.getImag()) /
                (right.getReal() * right.getReal() + right.getImag() * right.getImag());

        this.imag = (this.real * right.getImag() + this.imag * right.getReal()) /
                (right.getReal() * right.getReal() + right.getImag() * right.getImag());
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(this.real, -this.imag);
    }
}
