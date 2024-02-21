package lab1;

public class EndiannessConverter {
    public static int convertEndianness(int number){
        byte[] bytes = new byte[Integer.BYTES];
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            bytes[i] = (byte) (number & 0xFF);
            number >>= 8;
        }
        return byteArrayToInt(bytes);
    }
    private static int byteArrayToInt(byte[] bytes){
        int value = 0;
        for (byte b : bytes) {
            value = (value << 8) + (b & 0xFF);
        }
        return value;
    }
}

