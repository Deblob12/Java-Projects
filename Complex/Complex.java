/*
NAME: Jeffrey Chiu
PERIOD: 4
Project: Complex Numbers Class
*/

public class Complex {
    //double to keep track of Re(z)
    private double real;
    //double to keep track of Im(z)
    private double imaginary;

    /**
     * Constructor for class Complex
     * Creates a Complex object with Re(z) = 0 and Im(z) = 0
     */
    public Complex() {
        real = 0;
        imaginary = 0;
    }

    /**
     * Another Constructor for class Complex
     * @param real double value to be stored in Re(z)
     * @param imaginary double alue to be stored in Im(z)
     */
    public Complex(double real, double imaginary) {
        this.real = (Math.round(real * 10000.0) / 10000.0);
        this.imaginary = Math.round(imaginary * 10000.0) / 10000.0;
    }

    /**
     * Another Constructor for class Complex
     * @param W Complex object in which we create a identical object to
     */
    public Complex(Complex W){
        this.real = W.getReal();
        this.imaginary = W.getImaginary();
    }

    /**
     * Adds a Complex Object to the current Complex Object Instance
     * @param W Complex object that is added to current Complex instance
     * @return type Complex, Updated Complex object after addition
     */
    public Complex add(Complex W) {
        this.real += W.getReal();
        this.imaginary += W.getImaginary();
        return this;
    }

    /**
     * Subtracts a Complex Object from current Complex Object Instance
     * @param W Complex object that is subtracted from current Complex instance
     * @return type Complex, Updated Complex object after addition
     */
    public Complex subtract(Complex W) {
        this.real -= W.getReal();
        this.imaginary -= W.getImaginary();
        return this;
    }

    /**
     * Multiplies a Complex Object with current Complex Object Instance
     * @param W Complex object that is multiplied with current Complex instance
     * @return type Complex, Updated Complex object after multiplication
     */
    public Complex multiply(Complex W) {
        double startReal = this.real;
        double startImag = this.imaginary;
        this.real = startReal * W. real - startImag * W.imaginary;
        this.imaginary = startReal * W.imaginary + startImag * W.real;
        return this;
    }

    /**
     * Divides a Complex Object from current Complex Object Instance
     * @param W Complex object that is divided from current Complex instance
     * @return type Complex, Updated Complex object after division
     */
    public Complex divide(Complex W) {
        double tempReal, tempImag;
        Complex temp = new Complex(W);
        temp.toConjugate();
        if (!W.equals(new Complex(0,0))) {
            this.multiply(temp);
            tempReal = this.real / (W.real * W.real + W.imaginary * W.imaginary);
            tempImag = this.imaginary / (W.real * W.real + W.imaginary * W.imaginary);
            this.real = tempReal;
            this.imaginary = tempImag;
            return this;
        }
        else {
            throw new IllegalArgumentException("Argument cannot be 0 + 0i");
        }
    }

    /**
     * Converts current Complex instance to its conjugate
     * @return type Complex, conjugate of Complex instance
     */
    public Complex toConjugate() {
        this.imaginary *= -1;
        return this;
    }

    /**
     * Returns conjugate of Complex Object
     * @param W Complex Object
     * @return type Complex, Conjugate of W
     */
    public static Complex conjugate(Complex W) {
        W.setImaginary(-1 * W.getImaginary());
        return W;
    }

    /**
     * Static method to add two Complex Objects
     * @param X Complex Object 1
     * @param Y Complex Object 2
     * @return type Complex, X + Y
     */
    public static Complex add(Complex X, Complex Y) {
        return new Complex(X.getReal() + Y.getReal(), X.getImaginary() + Y.getImaginary());
    }

    /**
     * Static method to subtract two Complex Objects
     * @param X Complex Object 1
     * @param Y Complex Object 2
     * @return type Complex, X - Y
     */
    public static Complex subtract(Complex X, Complex Y) {
        return new Complex(X.getReal() - Y.getReal(), X.getImaginary() - Y.getImaginary());
    }

    /**
     * Static method to multiply two Complex Objects
     * @param X Complex Object 1
     * @param Y Complex Object 2
     * @return type Complex, X * Y
     */
    public static Complex multiply(Complex X, Complex Y) {
        return new Complex(X.real * Y. real - X.imaginary * Y.imaginary, X.real * Y.imaginary + X.imaginary * Y.real);
    }

    /**
     * Static method to divide two Complex Objects
     * @param X Complex Object 1
     * @param Y Complex Object 2
     * @return type Complex, X / Y
     */
    public static Complex divide(Complex X, Complex Y) {
        Complex temp1 = new Complex(Y);
        temp1.toConjugate();
        if (!Y.equals(new Complex(0,0))){
            Complex temp = multiply(X, temp1);
            double squaredDist = Y.getReal() * Y.getReal() + Y.getImaginary() * Y.getImaginary();
            double tempReal = temp.getReal() / squaredDist;
            double tempImag = temp.getImaginary() / squaredDist;
            temp.real = tempReal; temp.imaginary = tempImag;
            return temp;
        }
        else {
            throw new IllegalArgumentException("Second Complex Number cannot be 0 + 0i");
        }
    }

    /**
     * @return type double, Magnitude of current Complex object
     */
    public double dist() {
        double dist = Math.round(Math.sqrt(this.real * this.real + this.imaginary * this.imaginary) * 10000.0) / 10000.0;
        return dist;
    }

    /**
     * @return type double, Angle(in radians) current Complex Object makes with positive x-axis
     */
    public double arg() {
        if (real == 0 || imaginary == 0) {
            if (real == 0 && imaginary != 0) {
                return imaginary < 0 ? -1 * Math.PI / 2 : Math.PI / 2;
            }
            if (real != 0 && imaginary == 0) {
                return real < 0 ? Math.PI : 0;
            }
            if (real == 0 && imaginary == 0) {
                throw new IllegalArgumentException("At least one of real or imaginary components have to be greater than 0");
            }
        }
        if (real > 0 && imaginary > 0) {
            return Math.round(Math.atan(imaginary / real) * 10000.0) / 10000.0;
        }
        else if (real > 0 && imaginary < 0) {
            return Math.round(Math.atan(imaginary / real) * 10000.0) / 10000.0;
        }
        else if (real < 0 && imaginary > 0) {
            return Math.round((Math.atan(imaginary / real) + Math.PI) * 10000.0) / 10000.0;
        }
        else if (real < 0 && imaginary < 0) {
            return Math.round((Math.atan(imaginary / real) + Math.PI) * 10000.0) / 10000.0;
        }
        return -1;
    }

    /**
     * Method to ln a Complex object
     * @param T Complex object to be natural logged
     * @return type Complex, ln T
     */
    public static Complex ln(Complex T) {
        double real = Math.round(Math.log(T.dist()) * 10000.0) / 10000.0;
        double imag = Math.round(T.arg() * 10000.0) / 10000.0;
        return new Complex(real, imag);
    }

    /**
     * Method to log a Complex object
     * @param T Complex object to be logged
     * @return type Complex, log T
     */
    public static Complex log(Complex T) {
        return Complex.ln(T).divide(new Complex(Math.log(10), 0));
    }

    /**
     * Method to exponentiated a Complex object
     * @param T Complex object to be exponentiated
     * @return type Complex, e^T
     */
    public static Complex expon(Complex T) {
        double real = Math.round(Math.exp(T.getReal()) * Math.cos(T.getImaginary()) * 10000.0) / 10000.0;
        double imag = Math.round(Math.exp(T.getReal()) * Math.sin(T.getImaginary()) * 10000.0)/ 10000.0;
        return new Complex(real, imag);
    }

    /**
     * Method to find roots of current Complex instance using DeMoivre's Theorem
     * @param n Degree of root
     * @return type Complex[], Array containing n nth roots of current Complex instance
     */
    public Complex[] roots(int n) {
        Complex[] roots = new Complex[n];
        double theta = arg();
        double r = dist();
        double factor = Math.pow(r, 1.0/n);

        for (int i = 0; i < n; i++) {
            double cos = Math.cos((theta + 2 * Math.PI * i) / n);
            double sin = Math.sin((theta + 2 * Math.PI * i) / n);
            roots[i] = new Complex(Math.round(factor * cos * 10000.0) / 10000.0 , Math.round(factor * sin * 10000.0) / 10000.0);
        }
        return roots;
    }

    /**
     * Method to find powers of current Complex instance using DeMoivre's Theorem
     * @param n Degree
     * @return type Complex, this^n
     */
    public Complex power(int n) {
        double theta = arg();
        double r = dist();
        double cos = Math.cos(n * theta);
        double sin = Math.sin(n * theta);
        this.real = Math.round(Math.pow(r, n) * Math.cos(n * theta) * 1000.0) / 1000.0;
        this.imaginary = Math.round(Math.pow(r, n) * Math.sin(n * theta) * 1000.0) / 1000.0;
        return this;
    }

    /**
     * Method to find value of one Complex Object to another
     * @param X Complex Object 1
     * @param Y Complex Object 2
     * @return type Complex, X^Y
     */
    public static Complex compower(Complex X, Complex Y) {
        double r = X.dist();
        double theta = X.arg();
        Complex temp1 = new Complex(Math.log(r), 0).multiply(Y);
        Complex temp2 = new Complex(0, theta).multiply(Y);
        Complex temp3 = add(temp1, temp2);
        return expon(temp3);
    }

    /**
     * Finds sin of Complex Object
     * @param T Complex Object
     * @return type Complex, sin(T)
     */
    public static Complex sin(Complex T) {
        return new Complex(Math.cosh(-1 * T.getImaginary()) * Math.sin(T.getReal()),
                -1 * Math.sinh(-1 * T.getImaginary()) * Math.cos(T.getReal()));
    }

    /**
     * Finds cos of Complex Object
     * @param T Complex Object
     * @return type Complex, cos(T)
     */
    public static Complex cos(Complex T) {
        return new Complex(Math.cosh(-1 * T.getImaginary()) * Math.cos(T.getReal()),
                Math.sinh(-1 * T.getImaginary()) * Math.sin(T.getReal()));
    }

    /**
     * Finds tan of Complex Object
     * @param T Complex Object
     * @return type Complex, tan(T)
     */
    public static Complex tan(Complex T) {
        if (!Complex.cos(T).equals(new Complex(0,0))) {
            return Complex.sin(T).divide(Complex.cos(T));
        }
        else {
            throw new IllegalArgumentException("Undefined");
        }
    }

    /**
     * Finds principal square root of current Complex instance
     * @return type Complex, principal square root of current Complex instance
     */
    public Complex sqrt() {
        Complex[] roots = this.roots(2);
        for (Complex root: roots) {
            if (root.getReal() >= 0) {
                return root;
            }
        }
        return roots[1];
    }

    /**
     * Finds csc of Complex Object
     * @param T Complex Object
     * @return type Complex, csc(T)
     */
    public static Complex csc(Complex T) {
        if (!Complex.sin(T).equals(new Complex(0,0))) {
            return (new Complex(1,0).divide(Complex.sin(T)));
        }
        else {
            throw new IllegalArgumentException("Undefined");
        }
    }

    /**
     * Finds sec of Complex Object
     * @param T Complex Object
     * @return type Complex, sec(T)
     */
    public static Complex sec(Complex T) {
        if (!Complex.cos(T).equals(new Complex(0,0))) {
            return new Complex(1,0).divide(Complex.cos(T));
        }
        else {
            throw new IllegalArgumentException("Undefined");
        }
    }

    /**
     * Finds cot of Complex Object
     * @param T Complex Object
     * @return type Complex, cot(T)
     */
    public static Complex cot(Complex T) {
        if (!Complex.sin(T).equals(new Complex(0,0))) {
            return Complex.cos(T).divide(Complex.sin(T));
        }
        else {
            throw new IllegalArgumentException("Undefined");
        }
    }

    /**
     * Finds arcsin of Complex Object
     * @param T Complex Object
     * @return type Complex, arcsin(T)
     */
    public static Complex arcsin(Complex T) {
        Complex temp = new Complex(T);
        Complex temp1 = new Complex(T);
        temp = (new Complex(1, 0).subtract(temp.power(2)));
        Complex root = temp.sqrt();
        Complex ans = Complex.ln(root.add(temp1.multiply(new Complex(0,1))));
        ans = ans.multiply(new Complex(0, -1));
        if ((ans.getReal() < 0 && ans.getImaginary() < 0) || (ans.getReal() < 0 && ans.getImaginary() > 0)) {
            ans.setReal(ans.getReal() * -1);
            ans.setImaginary(ans.getImaginary() * -1);
        }
        return ans;
    }

    /**
     * Finds arccos of Complex Object
     * @param T Complex Object
     * @return type Complex, arccos(T)
     */
    public static Complex arccos(Complex T) {
        Complex temp = new Complex(T);
        Complex root = temp.power(2).subtract(new Complex(1,0)).sqrt();
        Complex ans = Complex.ln(root.add(T));
        ans = ans.multiply(new Complex(0, -1));
        if ((ans.getReal() < 0 && ans.getImaginary() < 0) || (ans.getReal() > 0 && ans.getImaginary() < 0)) {
            ans.setReal(ans.getReal() * -1);
            ans.setImaginary(ans.getImaginary() * -1);
        }
        return ans;
    }

    /**
     * Finds arctan of Complex Object
     * @param T Complex Object
     * @return type Complex, arctan(T)
     */
    public static Complex arctan(Complex T) {
        Complex temp = new Complex(T);
        Complex temp1 = new Complex(T);
        Complex a = temp.multiply(new Complex(0,1)).add(new Complex(1,0));
        Complex b = temp1.multiply(new Complex(0,-1)).add(new Complex(1,0));
        Complex c = new Complex(0.5, 0).divide(new Complex(0, 1));
        Complex ans = c.multiply(Complex.ln(a.divide(b)));
        if ((ans.getReal() < 0 && ans.getImaginary() < 0) || (ans.getReal() < 0 && ans.getImaginary() > 0)) {
            ans.setReal(ans.getReal() * -1);
            ans.setImaginary(ans.getImaginary() * -1);
        }
        return ans;
    }

    /**
     * Finds arccsc of Complex Object
     * @param T Complex Object
     * @return type Complex, arccsc(T)
     */
    public static Complex arccsc(Complex T) {
        Complex temp = arcsin(new Complex(1, 0).divide(T));
        if (temp.getReal() < 0 && temp.getImaginary() > 0 || temp.getReal() < 0 && temp.getImaginary() < 0) {
            temp.setReal(temp.getReal() * -1.0);
            temp.setImaginary(temp.getImaginary() * -1.0);
        }

        return temp;
    }

    /**
     * Finds arcsec of Complex Object
     * @param T Complex Object
     * @return type Complex, arcsec(T)
     */
    public static Complex arcsec(Complex T) {
        Complex temp = arccos(new Complex(1,0).divide(T));
        if (temp.getReal() > 0 && temp.getImaginary() < 0 || temp.getReal() < 0 && temp.getImaginary() < 0) {
            temp.setReal(temp.getReal() * -1.0);
            temp.setImaginary(temp.getImaginary() * -1.0);
        }

        return temp;
    }

    /**
     * Finds arccot of Complex Object
     * @param T Complex Object
     * @return type Complex, arccot(T)
     */
    public static Complex arccot(Complex T) {
        Complex temp = arctan(new Complex(1,0).divide(T));
        if (temp.getReal() < 0 && temp.getImaginary() > 0 || temp.getReal() < 0 && temp.getImaginary() < 0) {
            temp.setReal(temp.getReal() * -1.0);
            temp.setImaginary(temp.getImaginary() * -1.0);
        }

        return temp;
    }

    /**
     * Finds sinh of Complex Object
     * @param T Complex Object
     * @return type Complex, sinh(T)
     */
    public static Complex sinh(Complex T) {
        return new Complex(Math.round(Math.sinh(T.getReal()) * Math.cos(T.getImaginary()) * 10000.0) / 10000.0,
                Math.round(Math.cosh(T.getReal()) * Math.sin(T.getImaginary()) * 10000.0) / 10000.0);
    }

    /**
     * Finds coth of Complex Object
     * @param T Complex Object
     * @return type Complex, coth(T)
     */
    public static Complex cosh(Complex T) {
        return new Complex(Math.round(Math.cosh(T.getReal()) * Math.cos(T.getImaginary()) * 10000.0) / 10000.0,
                Math.round(Math.sinh(T.getReal()) * Math.sin(T.getImaginary()) * 10000.0) / 10000.0);
    }

    /**
     * Finds tanh of Complex Object
     * @param T Complex Object
     * @return type Complex, tanh(T)
     */
    public static Complex tanh(Complex T) {
        if (Complex.sinh(T) != new Complex(0,0)) {
            return Complex.sinh(T).divide(Complex.cosh(T));
        }
        else {
            throw new IllegalArgumentException("Undefined");
        }
    }

    /**
     * Finds csch of Complex Object
     * @param T Complex Object
     * @return type Complex, csch(T)
     */
    public static Complex csch(Complex T) {
        if (Complex.sinh(T) != new Complex(0,0)) {
            return (new Complex(1,0).divide(Complex.sinh(T)));
        }
        else {
            throw new IllegalArgumentException("Undefined");
        }
    }

    /**
     * Finds sech of Complex Object
     * @param T Complex Object
     * @return type Complex, sech(T)
     */
    public static Complex sech(Complex T) {
        if (Complex.cosh(T) != new Complex(0,0)) {
            return (new Complex(1,0).divide(Complex.cosh(T)));
        }
        else {
            throw new IllegalArgumentException("Undefined");
        }
    }

    /**
     * Finds coth of Complex Object
     * @param T Complex Object
     * @return type Complex, coth(T)
     */
    public static Complex coth(Complex T) {
        if (Complex.sinh(T) != new Complex(0,0)) {
            return (Complex.cosh(T).divide(Complex.sinh(T)));
        }
        else {
            throw new IllegalArgumentException("Undefined");
        }
    }

    /**
     * Finds arcsinh of Complex Object
     * @param T Complex Object
     * @return type Complex, arcsinh(T)
     */
    public static Complex arcsinh(Complex T) {
        Complex temp = new Complex(T);
        Complex clone = new Complex(T);
        Complex[] roots = clone.power(2).add(new Complex(1,0)).roots(2);
        return Complex.ln(roots[0].add(temp));
    }

    /**
     * Finds arccosh of Complex Object
     * @param T Complex Object
     * @return type Complex, arccosh(T)
     */
    public static Complex arccosh(Complex T) {
        Complex clone = new Complex(T);
        Complex clone1 = new Complex(T);
        Complex roots1 = clone.add(new Complex(1,0)).sqrt();
        Complex roots2 = clone1.subtract(new Complex(1,0)).sqrt();
        return Complex.ln(roots1.multiply(roots2).add(T));
    }

    /**
     * Finds arctanh of Complex Object
     * @param T Complex Object
     * @return type Complex, arctanh(T)
     */
    public static Complex arctanh(Complex T) {
        Complex temp = new Complex(T);
        Complex clone = new Complex(T);
        clone = Complex.add(clone, new Complex(1,0)).divide(clone.subtract(new Complex(1,0), clone));
        return (new Complex(0.5, 0).multiply(Complex.ln(clone)));
    }

    /**
     * Finds arccoth of Complex Object
     * @param T Complex Object
     * @return type Complex, arccoth(T)
     */
    public static Complex arccoth(Complex T) {
        return arctanh(new Complex(1,0).divide(T));
    }

    /**
     * Finds arccsch of Complex Object
     * @param T Complex Object
     * @return type Complex, arccsch(T)
     */
    public static Complex arccsch(Complex T) {
        return arcsinh(new Complex(1,0).divide(T));
    }

    /**
     * Finds arcsech of Complex Object
     * @param T Complex Object
     * @return type Complex, arcsech(T)
     */
    public static Complex arcsech(Complex T) {
        return arccosh(new Complex(1,0).divide(T));
    }

    /**
     * Finds magnitude of distance vector between two Complex objects
     * @param T Complex Object 1
     * @param W Complex Object 2
     * @return type double, |T - W|
     */
    public static double distance(Complex T, Complex W) {
        return (Math.sqrt(Math.pow((T.getReal()- W.getReal()), 2)+Math.pow(T.getImaginary() - W.getImaginary(), 2)));
    }

    /**
     * Find roots of ax^2 + bx + c
     * @param a a
     * @param b b
     * @param c c
     * @return type Complex[], Complex array holding roots to quadratic
     */
    public static Complex[] quadroots(double a, double b, double c) {
        Complex X = new Complex(-1 * b / (2 * a), Math.sqrt(4 * a * c - (b * b)) / (2 * a));
        Complex Y = new Complex(-1 * b / (2 * a), -1 * Math.sqrt(4 * a * c - (b * b)) / (2 * a));
        return new Complex[]{X, Y};
    }

    /**
     * Compares magnitude of this Complex instance to another Complex object
     * @param X Complex object
     * @return type int, <0 if instance is smaller; =0 if equal, >0 if greater
     */
    public int compareTo(Complex X) {
        if (Math.abs(X.dist() - this.dist()) < 0.003)
            return 0;
        else if (this.dist() < X.dist())
            return -1;
        return 1;
    }

    /**
     * Tests equality between two Complex Objects
     * @param T Complex Object 1
     * @param W Complex Object 2
     * @return type Boolean, whether T and W have same real/imag components +- 0.03 for precision errors
     */
    public static boolean equals(Complex T, Complex W) {
        if (Math.abs(T.real - W.getReal()) < 0.003 && Math.abs(T.imaginary - W.getImaginary()) < 0.003) {
            return true;
        }
        return false;
    }

    /**
     * Converts Complex Object to String
     * @return type String, "Re(z) + Im(z)"
     */
    public String toString() {
        String s;
        if (this.imaginary >= 0) {
            s = (Double.toString(this.real) + " + " + Double.toString(this.imaginary) + "i");
        }
        else {
            s = (Double.toString(this.real) + " - " + Double.toString(-1 * this.imaginary) + "i");
        }
        return s;
    }

    /**
     * Set real component of instance to xx
     * @param xx type double, value to set as real
     */
    public void setReal(double xx){
        this.real = xx;
    }

    /**
     * Set imaginary component of instance to xx
     * @param yy type double, value to set as imaginary
     */
    public void setImaginary(double yy) {
        this.imaginary = yy;
    }

    /**
     * @return type double, real value
     */
    public double getReal() {
        return this.real;
    }

    /**
     * @return type double, imaginary value
     */
    public double getImaginary(){
        return this.imaginary;
    }

    /**
     * Tests equality between this instance and another Complex Object
     * @param W Complex Object
     * @return type Boolean, whether this and W have same real/imag components +- 0.03 for precision errors
     */
    public boolean equals(Complex W) {
        if (Math.abs(this.real - W.getReal()) < 0.003 && Math.abs(this.imaginary - W.getImaginary()) < 0.003) {
            return true;
        }
        return false;
    }
}
