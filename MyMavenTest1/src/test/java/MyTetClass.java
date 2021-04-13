import org.testng.Assert;
import org.testng.annotations.Test;
import mytest.*;

public class MyTetClass {
    @Test
    public void setup(){
        System.out.println("Welcome to maven testing part");
    }

    @Test
    public void isNatural() {
        Assert.assertEquals(MyTest.isNatural(-1), false);
        Assert.assertEquals(MyTest.isNatural(1), true);
        Assert.assertEquals(MyTest.isNatural(0), false);
    }
//ignoring double values as in function we only accept int values
    @Test
    public void isEven() {
        Assert.assertEquals(MyTest.isEven(1),false);
        Assert.assertEquals(MyTest.isEven(2),true);

        }

    @Test
    public void factorialTest() {
        Assert.assertEquals(MyTest.factorial(0), 1);
        Assert.assertEquals(MyTest.factorial(2), 2);
        Assert.assertEquals(MyTest.factorial(4), 24);

    }
    @Test
    public void isPrime() {
        Assert.assertEquals(MyTest.isPrime(0), false);
        Assert.assertEquals(MyTest.isPrime(2), true);
        Assert.assertEquals(MyTest.isPrime(3), true);
        Assert.assertEquals(MyTest.isPrime(10), false);
    }

}
