//package //Maths;
class CountDigits{
public static void main(String args[]){
    int number=12345;
    int count=0;
    while(number>0){
        count=count+1;
        number=number/10;
    }
    System.out.println("The number of digits in the given number is: " + count);
}

}