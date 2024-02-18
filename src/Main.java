public class Main {
    public static void main(String[] args) {
        int number = 23;
        int bigEndian = EndiannessConverter.convertEndianness(number);
        System.out.println("In big endian "+bigEndian);
        System.out.println("In little endian "+ EndiannessConverter.convertEndianness(bigEndian));
    }
}
