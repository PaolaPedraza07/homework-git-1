import java.math.BigInteger;

public class Operations {
    public static void main(String[] args) {
        System.out.println(args[0]);
    }
    public BigInteger add(BigInteger a, BigInteger b){
        System.out.println("This is add method for 2 params");
        System.out.println("This is add method for 2 params");
        BigInteger result = a.add(b);
        System.out.println("The result is: "+result);
        return result;
    }
    public BigInteger add(BigInteger a, BigInteger b, BigInteger c){
        System.out.println("This is add method for 3 params");
        BigInteger result = a.add(b).add(c);
        System.out.println("The result is: "+result);
        return result;
    }
    public BigInteger add(BigInteger a, BigInteger b, BigInteger c, BigInteger d){
        System.out.println("This is add method for 4 params");
        BigInteger result = a.add(b).add(c).add(d);
        System.out.println("The result is: "+result);
        return result;
    }
    public BigInteger sub(BigInteger a, BigInteger b){
        BigInteger result = a.subtract(b);
        System.out.println("The result is: "+result);
        return result;
    }
    public BigInteger div(BigInteger a, BigInteger b){
        BigInteger result = a.divide(b);
        System.out.println("The result is: "+result);
        return result;
    }
    public BigInteger mult(BigInteger a, BigInteger b){
        BigInteger result = a.multiply(b);
        System.out.println("The result is: "+result);
        return result;
    }
    public BigInteger sqrt(BigInteger a, int b){
        BigInteger result = a.pow(b);
        System.out.println("The result is: "+result);
        return result;
    }
}