import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String value = JOptionPane.showInputDialog(null,
                "Please enter the number, you want to convert to other number bases. \n" +
                        "Negative numbers and decimals are not allowed!",
                "Number",
                JOptionPane.QUESTION_MESSAGE);

        String base = JOptionPane.showInputDialog(null,
                "What's the base of the number you entered? \n" +
                        "Binary, octal, decimal or hexadecimal?",
                "Base",
                JOptionPane.QUESTION_MESSAGE);

        isValidInput(value, base.toLowerCase());

        try {
            convert(value, base.toLowerCase());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);

                exception(base.toLowerCase(), value); // terminate the program with an error message
        } finally {
            System.out.println("Thanks for using.");
        }
    }

    public static void isValidInput(String value, String base) {
        if (value == null || value.isEmpty() || value.isBlank()) exit();
        else if (!base.equals("binary") && !base.equals("octal") && !base.equals("decimal") && !base.equals("hexadecimal"))
            exit();
    }

    public static void convert(String num, String base) {
        switch (base.toLowerCase()) {
            case "binary" -> JOptionPane.showMessageDialog(null,
                    "You entered " + num + " in binary. \n" +
                            num + " equals to " + Converter.binary2octal(num) + " in octal. \n" +
                            num + " equals to " + Converter.binary2decimal(num) + " in decimal. \n" +
                            num + " equals to " + Converter.binary2hexadecimal(num) + " in hexadecimal. \n",
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE);
            case "octal" -> JOptionPane.showMessageDialog(null,
                    "You entered " + num + " in octal. \n" +
                            num + " equals to " + Converter.octal2binary(num) + " in binary. \n" +
                            num + " equals to " + Converter.octal2decimal(num) + " in decimal. \n" +
                            num + " equals to " + Converter.octal2hexadecimal(num) + " in hexadecimal. \n",
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE);
            case "decimal" -> JOptionPane.showMessageDialog(null,
                    "You entered " + num + " in decimal. \n" +
                            num + " equals to " + Converter.decimal2binary(num) + " in binary. \n" +
                            num + " equals to " + Converter.decimal2octal(num) + " in octal. \n" +
                            num + " equals to " + Converter.decimal2hexadecimal(num) + " in hexadecimal. \n",
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE);
            case "hexadecimal" -> JOptionPane.showMessageDialog(null,
                    "You entered " + num + " in hexadecimal. \n" +
                            num + " equals to " + Converter.hexadecimal2binary(num) + " in binary. \n" +
                            num + " equals to " + Converter.hexadecimal2octal(num) + " in octal. \n" +
                            num + " equals to " + Converter.hexadecimal2decimal(num) + " in decimal. \n",
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void exception(String base, String value) throws Exception {
        throw new Exception(value + " cannot be written in " + base + " base.");
    }

    public static void exit() {
        JOptionPane.showMessageDialog(null,
                "Invalid Input! \n" +
                        "The program has been stopped.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
}