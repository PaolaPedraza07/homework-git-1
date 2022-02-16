import java.math.BigInteger;

public class Operations {
    public BigInteger add(BigInteger a, BigInteger b){
        System.out.println("This is add method for 2 params");
        System.out.println("This is add method for 2 params");
        return a.add(b);
    }
    public BigInteger add(BigInteger a, BigInteger b, BigInteger c){
        System.out.println("This is add method for 3 params");
        return a.add(b).add(c);
    }
    public BigInteger add(BigInteger a, BigInteger b, BigInteger c, BigInteger d){
        System.out.println("This is add method for 4 params");
        return a.add(b).add(c).add(d);
    }
    public BigInteger sub(BigInteger a, BigInteger b){
        return a.subtract(b);
    }
    public BigInteger div(BigInteger a, BigInteger b){
        return a.divide(b);
    }
    public BigInteger mult(BigInteger a, BigInteger b){
        return a.multiply(b);
    }
    public BigInteger sqrt(BigInteger a, int b){
        return a.pow(b);
    }
}