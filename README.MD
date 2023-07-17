## Simple Program

1. **Check the given Number is Prime Number or Not**
```java
class Demo{

    static boolean isPrime(int n){
        if(n==0 || n==1)
           return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
         return true;
    }
   public static void main(String[] args) {
         System.out.println(isPrime(2));
   }
}
```
2. **Range Of primeNumber**
```java
class Demo{

    static boolean isPrime(int n){
        if(n==0 || n==1)
           return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
         return true;
    }
    static void rangePrimeNumber(int n){
          for(int i=1;i<=n;i++){
            if(isPrime(i)) //helper function
            System.out.println(i);
          }
    }
   public static void main(String[] args) {
         rangePrimeNumber(100);
   }
}
```
3. **Multiple Table**
```java
import java.util.Scanner;
public class MultipleTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter for Table of a Number");
        int number=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number+"*"+i+"="+ (i*number));
        }
    }
}

```
4. **Find Reverse of a given Number**
```java
import java.util.Scanner;

class Demo{
  public static void main(String[] args) {
    System.out.println("Give me a number");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    
    int reverse=0;
    while(num!=0){
        int lastNumber=num%10;
        reverse=reverse*10 + (lastNumber);
        num/=10;
    }
    System.out.println(reverse);
  }
}
```
5. **Find the First Number**
```java
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        System.out.println("Give me a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fist = 0;
        while (num != 0) {
            fist = num % 10;
            num /= 10;
        }
        System.out.println(fist);
    }
}
```
6. **Find the perfect Number**
```java

class Demo {
    static boolean isPerfectNumber(int n){
           int temp=n;
           int sum=0;
            for(int i=1;i<n;i++){
                if(n%i==0)
                 sum+=i;
            }
         return sum==temp;
    }
    public static void main(String[] args) {
       System.out.println(isPerfectNumber(6));
    }
}
```
7. **Range Perfect Number**
```java

class Demo {
    static boolean isPerfectNumber(int n){
           int temp=n;
           int sum=0;
            for(int i=1;i<n;i++){
                if(n%i==0)
                 sum+=i;
            }
         return sum==temp;
    }
    static void RangePerfectNumber(int n){
          for(int i=1;i<=n;i++){
            if(isPerfectNumber(i))
            System.out.println(i);
          }
    }
    public static void main(String[] args) {
        RangePerfectNumber(500);
    }
}
```
8. **Check Armstrong Number**
```java
class Demo {
    static boolean isArmStrongNumber(int n) {
        int sum = 0;
        int temp = n;
        while (n != 0) {
            int lastNumber = n % 10;
            int cuibe = lastNumber * lastNumber * lastNumber;
            sum += cuibe;
            n /= 10;
        }
        return temp == sum;
    }

    public static void main(String[] args) {
          System.out.println(isArmStrongNumber(152));
    }
}
```
9. **Print ArmStrong Number**
```java

class Demo {
    static boolean isArmStrongNumber(int n) {
        int sum = 0;
        int temp = n;
        while (n != 0) {
            int lastNumber = n % 10;
            int cuibe = lastNumber * lastNumber * lastNumber;
            sum += cuibe;
            n /= 10;
        }
        return temp == sum;
    }
    static void RangeArmStrong(int n){
        for(int i=0;i<=n;i++){
            if(isArmStrongNumber(i))
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
         RangeArmStrong(500);
    }
}
```
10. Write a program to convert binary to Decimal
```java
class Demo{
    static void convertBinToDec(int n){
        int decNum=0;
        int pow=0;
          while(n!=0){
            int lastNum=n%10;
            decNum+=(lastNum*Math.pow(2,pow));
            pow++;
            n/=10;
          }
          System.out.println(decNum);
    }
    public static void main(String[] args) {
        convertBinToDec(1010);
    }
}
```