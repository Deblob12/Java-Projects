/*
NAME: Jeffrey Chiu
PERIOD: 4
Project: Complex Numbers
Complex.java tester class
*/
import org.junit.Assert;

public class ComplexTest {
    public static void main(String[] args) {
        Complex a = new Complex(1,1);
        Complex b = new Complex(1,1);
        Assert.assertTrue("Test Failed Equals: ", a.equals(b));
        Assert.assertTrue("Test Failed CompareTo: ", a.compareTo(b) == 0);
        Assert.assertTrue("Test Failed Add: ",a.add(b).equals(new Complex(2,2)));
        Assert.assertTrue("Test Failed Subtract: ",a.subtract(b).equals(new Complex(1,1)));
        Assert.assertTrue("Test Failed Multiply: ",a.multiply(b).equals(new Complex(0,2)));
        Assert.assertTrue("Test Failed Static Multiply: ", Complex.multiply(new Complex(1,1), new Complex(1,1)).equals(new Complex(0,2)));
        a = new Complex(3, 2);
        b = new Complex(4, -3);
        Complex temp1 = new Complex(3,2);
        Complex temp2 = new Complex(4, -3);
        Assert.assertTrue("Test Failed Divide: ", a.divide(b).equals(new Complex(6.0/25.0, 17.0/25.0)));
        Assert.assertTrue("Test Failed Static Divide: ", Complex.divide(temp1, temp2).equals(new Complex(6.0/25.0, 17.0/25.0)));
        Assert.assertTrue("Test Failed Static Add: ", Complex.add(temp1, temp2).equals(new Complex(7, -1)));
        Assert.assertTrue("Test Failed Static Subtract: ", Complex.subtract(temp1, temp2).equals(new Complex(-1, 5)));
        Assert.assertTrue("Test Failed Dist: ", temp1.dist() <= (Math.sqrt(13) + 0.0003) || temp1.dist() >= (Math.sqrt(13) - 0.0003));
        Assert.assertTrue("Test Failed Arg: ", temp1.arg() <= Math.atan(2.0/3.0) + 0.0003 || temp1.arg() >= Math.atan(2.0/3.0) - 0.0003);
        Assert.assertTrue("Test Failed ln: ", Complex.ln(temp1).equals(new Complex(1.282, 0.588)));
        Assert.assertTrue("Test Failed log: ", Complex.log(temp1).equals(new Complex(0.557, 0.255)));
        Assert.assertTrue("Test Failed Exponential: ", Complex.expon(temp1).equals(new Complex(-8.359, 18.264)));
        Assert.assertTrue("Test Failed Power: ", temp1.power(2).equals(new Complex(5, 12)));
        temp1 = new Complex(3,2);
        Assert.assertTrue("Test Failed Complex Power: ", Complex.compower(temp1, temp1).equals(new Complex(-5.410, -13.410)));
        Assert.assertTrue("Test Failed Sine: ", Complex.sin(temp1).equals(new Complex(0.531, -3.591)));
        Assert.assertTrue("Test Failed Sinh: ", Complex.sinh(temp1).equals(new Complex(-4.169, 9.154)));
        Assert.assertTrue("Test Failed Arcsinh: ", Complex.arcsinh(temp1).equals(new Complex(1.983, 0.571)));
        Assert.assertTrue("Test Failed Arcsine: ", Complex.arcsin(temp1).equals(new Complex(0.965, 1.969)));
        Assert.assertTrue("Test Failed Cosine: ", Complex.cos(temp1).equals(new Complex(-3.725, -0.512)));
        Assert.assertTrue("Test Failed Cosh: ", Complex.cosh(temp1).equals(new Complex(-4.190, 9.109)));
        Assert.assertTrue("Test Failed Arccosh: ", Complex.arccosh(temp1).equals(new Complex(1.969, 0.606)));
        Assert.assertTrue("Test Failed Arccos: ", Complex.arccos(temp1).equals(new Complex(0.606, -1.969)));
        Assert.assertTrue("Test Failed Tangent: ", Complex.tan(temp1).equals(new Complex(-0.010, 0.965)));
        Assert.assertTrue("Test Failed tanh: ", Complex.tanh(temp1).equals(new Complex(1.003, -0.004)));
        Assert.assertTrue("Test Failed Arctanh: ", Complex.arctanh(temp1).equals(new Complex(0.229, 1.410)));
        Assert.assertTrue("Test Failed Arctan: ", Complex.arctan(temp1).equals(new Complex(1.339, 0.147)));

        Assert.assertTrue("Test Failed Cosecant: ", Complex.csc(temp1).equals(new Complex(0.040, 0.273)));
        Assert.assertTrue("Test Failed Csch: ", Complex.csch(temp1).equals(new Complex(-0.041, -0.090)));
        Assert.assertTrue("Test Failed Arccsch: ", Complex.arccsch(temp1).equals(new Complex(0.231, -0.150)));
        Assert.assertTrue("Test Failed Arccsc: ", Complex.arccsc(temp1).equals(new Complex(0.230, -0.157)));
        Assert.assertTrue("Test Failed Secant: ", Complex.sec(temp1).equals(new Complex(-0.264, 0.036)));
        Assert.assertTrue("Test Failed Sech: ", Complex.sech(temp1).equals(new Complex(-0.042, -0.091)));
        Assert.assertTrue("Test Failed Arcsech: ", Complex.arcsech(temp1).equals(new Complex(0.157, -1.341)));
        Assert.assertTrue("Test Failed Arcsec: ", Complex.arcsec(temp1).equals(new Complex(1.341, 0.157)));
        Assert.assertTrue("Test Failed Cotangent: ", Complex.cot(temp1).equals(new Complex(-0.011, -1.036)));
        Assert.assertTrue("Test Failed cotanh: ", Complex.coth(temp1).equals(new Complex(0.997, 0.004)));
        Assert.assertTrue("Test Failed Arccoth: ", Complex.arccoth(temp1).equals(new Complex(0.229, -0.161)));
        Assert.assertTrue("Test Failed Arccot: ", Complex.arccot(temp1).equals(new Complex(0.232, -0.147)));
        System.out.println("All Tests Passed! Yayy!");
    }
}
