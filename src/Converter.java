public class Converter {
    // data field
    private final String binNum;
    private final String octNum;
    private final String decNum;
    private final String hexNum;

    // default constructor;
    Converter() {
        this("0");
    }

    Converter(String value) {
        // "this" here is optional
        this.decNum = value;
        this.binNum = decimal2binary(value);
        this.octNum = decimal2octal(value);
        this.hexNum = decimal2hexadecimal(value);
    }

    public static String binary2octal(String value) {
        final int decimalForm = Integer.parseInt(String.valueOf(value), 2);
        return Integer.toOctalString(decimalForm);
    }

    public static String binary2decimal(String value) {
        return String.valueOf(Integer.parseInt(String.valueOf(value), 2));
    }

    public static String binary2hexadecimal(String value) {
        final int decimalForm = Integer.parseInt(String.valueOf(value), 2);
        return Integer.toHexString(decimalForm).toUpperCase();
    }

    public static String octal2binary(String value) {
        final int decimalForm = Integer.parseInt(String.valueOf(value), 8);
        return Integer.toBinaryString(decimalForm);
    }

    public static String octal2decimal(String value) {
        return String.valueOf(Integer.parseInt(String.valueOf(value), 8));
    }

    public static String octal2hexadecimal(String value) {
        final int decimalForm = Integer.parseInt(String.valueOf(value), 8);
        return Integer.toHexString(decimalForm).toUpperCase();
    }

    public static String decimal2binary(String value) {
        return Integer.toBinaryString(Integer.parseInt(value));
    }

    public static String decimal2octal(String value) {
        return Integer.toOctalString(Integer.parseInt(value));
    }

    public static String decimal2hexadecimal(String value) {
        return Integer.toHexString(Integer.parseInt(value)).toUpperCase();
    }

    public static String hexadecimal2binary(String value) {
        final int decimalForm = Integer.parseInt(String.valueOf(value), 16);
        return Integer.toBinaryString(decimalForm);
    }

    public static String hexadecimal2octal(String value) {
        final int decimalForm = Integer.parseInt(String.valueOf(value), 16);
        return Integer.toOctalString(decimalForm);
    }

    public static String hexadecimal2decimal(String value) {
        return String.valueOf(Integer.parseInt(String.valueOf(value), 16));
    }

    // accessors
    public String getBinaryNumber() {
        return binNum;
    }

    public String getOctalNumber() {
        return octNum;
    }

    public String getDecimalNumber() {
        return decNum;
    }

    public String getHexadecimalNumber() {
        return hexNum;
    }
}