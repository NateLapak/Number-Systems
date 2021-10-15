package NumberSystem;
public class numberSystems {
    
    // Function that converst decimal to octal
    public static String decimalToOctal(int numInDecimal) {
        
        String octalNum = "";
        while (numInDecimal != 0) {
            octalNum = numInDecimal % 8 + octalNum;
            numInDecimal /= 8;
        }
        return octalNum;
        
    }
    
    // Function that converts decimal to binary
    public static String decimalToBinary(int numInDecimal) {
        
        String binaryNum = "";
        
        while (numInDecimal != 0) {
            binaryNum = numInDecimal % 2 + binaryNum;
            numInDecimal /= 2;
        }
        return (binaryNum);
        
    }
    
    // Function that converts decimal to hexadecimal
    public static String decimalToHexadecimal(int numInDecimal) {
        
        char[] letters = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexadecimalNum = "";
        
        while (numInDecimal != 0) {
            hexadecimalNum = letters[numInDecimal % 16] + hexadecimalNum;
            numInDecimal /= 16;
        }
        
        return hexadecimalNum;
    }
    
    // Driver code
    public static void main(String[] args) {
        
        System.out.println("Decimal " + "Binary " + "Octal " + " Hexadecimal");
        for (int i = 0; i <= 256; i++) {
            System.out.print(i + "         " + decimalToBinary(i) + "       " + decimalToOctal(i) + "       " + decimalToHexadecimal(i));
            System.out.println();
        }
        
    }

}