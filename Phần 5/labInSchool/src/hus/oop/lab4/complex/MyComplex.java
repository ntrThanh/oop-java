package hus.oop.lab4.complex;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
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

    @Override
    public String toString() {
        return real + " +" + imag + "i";
    }

    public boolean isReal() {
        return (imag == 0);
    }

    public boolean isImaginary() {
        return (real == 0);
    }

    public boolean equals(double real, double imag) {
        // return (this.real == real && this.imag == imag);
        return Double.valueOf(real).equals(this.real) &&
                Double.valueOf(imag).equals(this.imag);
    }

    public boolean equals(MyComplex another) {
        // return (real == another.getReal() && imag == another.getImag());
        return Double.valueOf(another.getReal()).equals(this.real) &&
                Double.valueOf(another.getImag()).equals(this.imag);
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
        return new MyComplex(this.real + right.getReal(), this.getImag() + right.getReal());
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real + right.getReal(), this.imag + right.getImag());
    }

    public MyComplex multiply(MyComplex right){
        this.real = this.real * right.getReal() - this.imag * right.getImag();
        this.imag = this.real * right.getImag() + this.imag * right.getReal();
        return this;
    }

    public MyComplex divide(MyComplex right) {
        this.real = (this.real * right.getReal() - this.imag * right.getImag()) /
                        (right.getReal() * right.getReal() + right.getImag() * right.getImag());

        this.imag = (this.real * right.getImag() + this.imag * right.getReal()) /
                        (right.getReal() * right.getReal() + right.getImag() * right.getImag());
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(this.real, -this.imag);
    }

    public double argument() {
        return Math.atan2(imag, real);
    }
}
