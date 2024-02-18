import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(Integer.MAX_VALUE - 200)+ 200;
        System.out.println("Generated number: "+number);
        int myBigEndian = EndiannessConverter.convertEndianness(number);
        int integerBigEndian = Integer.reverseBytes(number);
        System.out.println("In big endian my function: "+myBigEndian+ "\tIn big endian Integer function: "+ integerBigEndian);
        System.out.println("In little endian my function: "+ EndiannessConverter.convertEndianness(myBigEndian)
                + "\tIn little endian Integer function: "+Integer.reverseBytes(integerBigEndian));
    }
}
