package Basics;
class BinaryLiterals{
    public static void main (String args[]){
        int binaryNum=0b1010;
        System.out.println("The binary number 1010 in decimal is: " + binaryNum);
        System.out.println("The binary number 1010 in hexadecimal is: " + Integer.toHexString(binaryNum));
        System.out.println("The binary number 1010 in octal is: " + Integer.toOctalString(binaryNum));
        System.out.println("The binary number 1010 in binary is: " + Integer.toBinaryString(binaryNum));
        System.out.println("The binary number 1010 in character is: " + (char)binaryNum);
        
    }
}