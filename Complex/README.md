# Complex Number API:

# Documentation

## `public Complex()`

Constructor for class Complex Creates a Complex object with Re(z) = 0 and Im(z) = 0

## `public Complex(double real, double imaginary)`

Another Constructor for class Complex

 * **Parameters:**
   * `real` — double value to be stored in Re(z)
   * `imaginary` — double alue to be stored in Im(z)

## `public Complex(Complex W)`

Another Constructor for class Complex

 * **Parameters:** `W` — Complex object in which we create a identical object to

## `public Complex add(Complex W)`

Adds a Complex Object to the current Complex Object Instance

 * **Parameters:** `W` — Complex object that is added to current Complex instance
 * **Returns:** type Complex, Updated Complex object after addition

## `public Complex subtract(Complex W)`

Subtracts a Complex Object from current Complex Object Instance

 * **Parameters:** `W` — Complex object that is subtracted from current Complex instance
 * **Returns:** type Complex, Updated Complex object after addition

## `public Complex multiply(Complex W)`

Multiplies a Complex Object with current Complex Object Instance

 * **Parameters:** `W` — Complex object that is multiplied with current Complex instance
 * **Returns:** type Complex, Updated Complex object after multiplication

## `public Complex divide(Complex W)`

Divides a Complex Object from current Complex Object Instance

 * **Parameters:** `W` — Complex object that is divided from current Complex instance
 * **Returns:** type Complex, Updated Complex object after division

## `public Complex toConjugate()`

Converts current Complex instance to its conjugate

 * **Returns:** type Complex, conjugate of Complex instance

## `public static Complex conjugate(Complex W)`

Returns conjugate of Complex Object

 * **Parameters:** `W` — Complex Object
 * **Returns:** type Complex, Conjugate of W

## `public static Complex add(Complex X, Complex Y)`

Static method to add two Complex Objects

 * **Parameters:**
   * `X` — Complex Object 1
   * `Y` — Complex Object 2
 * **Returns:** type Complex, X + Y

## `public static Complex subtract(Complex X, Complex Y)`

Static method to subtract two Complex Objects

 * **Parameters:**
   * `X` — Complex Object 1
   * `Y` — Complex Object 2
 * **Returns:** type Complex, X - Y

## `public static Complex multiply(Complex X, Complex Y)`

Static method to multiply two Complex Objects

 * **Parameters:**
   * `X` — Complex Object 1
   * `Y` — Complex Object 2
 * **Returns:** type Complex, X * Y

## `public static Complex divide(Complex X, Complex Y)`

Static method to divide two Complex Objects

 * **Parameters:**
   * `X` — Complex Object 1
   * `Y` — Complex Object 2
 * **Returns:** type Complex, X / Y

## `public double dist()`

 * **Returns:** type double, Magnitude of current Complex object

## `public double arg()`

 * **Returns:** type double, Angle(in radians) current Complex Object makes with positive x-axis

## `public static Complex ln(Complex T)`

Method to ln a Complex object

 * **Parameters:** `T` — Complex object to be natural logged
 * **Returns:** type Complex, ln T

## `public static Complex log(Complex T)`

Method to log a Complex object

 * **Parameters:** `T` — Complex object to be logged
 * **Returns:** type Complex, log T

## `public static Complex expon(Complex T)`

Method to exponentiated a Complex object

 * **Parameters:** `T` — Complex object to be exponentiated
 * **Returns:** type Complex, e^T

## `public Complex[] roots(int n)`

Method to find roots of current Complex instance using DeMoivre's Theorem

 * **Parameters:** `n` — Degree of root
 * **Returns:** type Complex[], Array containing n nth roots of current Complex instance

## `public Complex power(int n)`

Method to find powers of current Complex instance using DeMoivre's Theorem

 * **Parameters:** `n` — Degree
 * **Returns:** type Complex, this^n

## `public static Complex compower(Complex X, Complex Y)`

Method to find value of one Complex Object to another

 * **Parameters:**
   * `X` — Complex Object 1
   * `Y` — Complex Object 2
 * **Returns:** type Complex, X^Y

## `public static Complex sin(Complex T)`

Finds sin of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, sin(T)

## `public static Complex cos(Complex T)`

Finds cos of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, cos(T)

## `public static Complex tan(Complex T)`

Finds tan of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, tan(T)

## `public Complex sqrt()`

Finds principal square root of current Complex instance

 * **Returns:** type Complex, principal square root of current Complex instance

## `public static Complex csc(Complex T)`

Finds csc of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, csc(T)

## `public static Complex sec(Complex T)`

Finds sec of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, sec(T)

## `public static Complex cot(Complex T)`

Finds cot of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, cot(T)

## `public static Complex arcsin(Complex T)`

Finds arcsin of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, arcsin(T)

## `public static Complex arccos(Complex T)`

Finds arccos of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, arccos(T)

## `public static Complex arctan(Complex T)`

Finds arctan of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, arctan(T)

## `public static Complex arccsc(Complex T)`

Finds arccsc of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, arccsc(T)

## `public static Complex arcsec(Complex T)`

Finds arcsec of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, arcsec(T)

## `public static Complex arccot(Complex T)`

Finds arccot of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, arccot(T)

## `public static Complex sinh(Complex T)`

Finds sinh of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, sinh(T)

## `public static Complex cosh(Complex T)`

Finds coth of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, coth(T)

## `public static Complex tanh(Complex T)`

Finds tanh of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, tanh(T)

## `public static Complex csch(Complex T)`

Finds csch of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, csch(T)

## `public static Complex sech(Complex T)`

Finds sech of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, sech(T)

## `public static Complex coth(Complex T)`

Finds coth of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, coth(T)

## `public static Complex arcsinh(Complex T)`

Finds arcsinh of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, arcsinh(T)

## `public static Complex arccosh(Complex T)`

Finds arccosh of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, arccosh(T)

## `public static Complex arctanh(Complex T)`

Finds arctanh of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, arctanh(T)

## `public static Complex arccoth(Complex T)`

Finds arccoth of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, arccoth(T)

## `public static Complex arccsch(Complex T)`

Finds arccsch of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, arccsch(T)

## `public static Complex arcsech(Complex T)`

Finds arcsech of Complex Object

 * **Parameters:** `T` — Complex Object
 * **Returns:** type Complex, arcsech(T)

## `public static double distance(Complex T, Complex W)`

Finds magnitude of distance vector between two Complex objects

 * **Parameters:**
   * `T` — Complex Object 1
   * `W` — Complex Object 2
 * **Returns:** type double, |T - W|

## `public static Complex[] quadroots(double a, double b, double c)`

Find roots of ax^2 + bx + c

 * **Parameters:**
   * `a` — a
   * `b` — b
   * `c` — c
 * **Returns:** type Complex[], Complex array holding roots to quadratic

## `public int compareTo(Complex X)`

Compares magnitude of this Complex instance to another Complex object

 * **Parameters:** `X` — Complex object
 * **Returns:** type int, less than 0 if instance is smaller; equal if equal, greater if greater

## `public static boolean equals(Complex T, Complex W)`

Tests equality between two Complex Objects

 * **Parameters:**
   * `T` — Complex Object 1
   * `W` — Complex Object 2
 * **Returns:** type Boolean, whether T and W have same real/imag components +- 0.03 for precision errors

## `public String toString()`

Converts Complex Object to String

 * **Returns:** type String, "Re(z) + Im(z)"

## `public void setReal(double xx)`

Set real component of instance to xx

 * **Parameters:** `xx` — type double, value to set as real

## `public void setImaginary(double yy)`

Set imaginary component of instance to xx

 * **Parameters:** `yy` — type double, value to set as imaginary

## `public double getReal()`

 * **Returns:** type double, real value

## `public double getImaginary()`

 * **Returns:** type double, imaginary value

## `public boolean equals(Complex W)`

Tests equality between this instance and another Complex Object

 * **Parameters:** `W` — Complex Object
 * **Returns:** type Boolean, whether this and W have same real/imag components +- 0.03 for precision errors
