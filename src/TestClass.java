import java.util.Random;

public class TestClass {
    public void compareEndianness() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int number = random.nextInt(Integer.MAX_VALUE - 200) + 200;
            System.out.println("Generated number: " + number);
            int myBigEndian = EndiannessConverter.convertEndianness(number);
            int integerBigEndian = Integer.reverseBytes(number);
            System.out.format("%-1s %1d %40s %1d %15s %1s", "In big endian my function:", myBigEndian,
                    "In big endian Integer function:", integerBigEndian,
                    "  Equals: ", (myBigEndian == integerBigEndian));
            System.out.println();
            int myLittleEndian = EndiannessConverter.convertEndianness(myBigEndian);
            int integerLittleEndian = Integer.reverseBytes(integerBigEndian);
            System.out.format("%-1s %1d %40s %1d %15s %1s", "In little endian my function:", myLittleEndian,
                    "In little endian Integer function:", integerLittleEndian,
                    "  Equals: ", (myLittleEndian == integerLittleEndian));
            System.out.println();
        }
    }
}
