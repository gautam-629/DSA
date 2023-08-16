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
## Arrays
1. **Linear Searching**
```java
//Example with number
class Demo{
  public static int linearSearch(int numbers[],int key){
    for(int i=0;i<numbers.length;i++){
      if(numbers[i]==key)
        return i;
    }
       return -1;
  }
   public static void main(String[] args) {
       int numbers[]={1,23,4,5,6,7,8,9};
       int key=8;
      int index=linearSearch(numbers, key);

      if(index==-1){
        System.out.println("Not found");
      }
      else{
        System.out.println("Key found at index:"+index);
      }

   }
}

//Example with String
class Demo{
  public static int linearSearch(String names[],String key){
    for(int i=0;i<names.length;i++){
      if(names[i].equals(key))
        return i;
    }
       return -1;
  }
   public static void main(String[] args) {
       String names[]={"Binod","Gautam","don"};
       String key="do";
      int index=linearSearch(names, key);

      if(index==-1){
        System.out.println("Not found");
      }
      else{
        System.out.println("Key found at index:"+ index);
      }

   }
}
```
2. **Find the Smallest and Largest Number**
```java
public class Demo {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest Number " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {  2, 3, 4, 5, 6, 7, 8 };
        System.out.println("Largest Number "+ getLargest(numbers));
    }
}

```
3. **Binary Search**
>**Prerequired: sorted array**
```java
class Demo {

    public static int binarySearch(int numbers[], int key) {

        int start = 0, end = numbers.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (numbers[mid] == key) { // found
                return mid;
            }
            if (numbers[mid] < key) { // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6 };
        int key = 6;

        int index = binarySearch(numbers, key);

        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index " + index);
        }
    }
}
```
4. Reverse Of an Array
>**Space complexcity**
```java
class Demo{
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9};
        
        int copy[]=new int[numbers.length];

       int j=numbers.length-1;
        for(int i=0;i<numbers.length;i++){
             copy[i]=numbers[j];
             j--;
        }

        for(int value:copy){
            System.out.println(value);
        }
    }
}
```
>**Optimal Way**

```java
class Demo{

    public static void Reverse(int numbers[]){
         int start=0, end=numbers.length-1;

         while(start<end){
            int temp=numbers[start];
            numbers[start]=numbers[end];
            numbers[end]=temp;
            start++;
            end--;
         }

    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7};

        Reverse(numbers);

        for( int el:numbers){
            System.out.println(el);
        }
    }
}
```
4. **Print pair of Array**
```java
class Demo{

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};

        for(int i=0;i<numbers.length;i++){
          for(int j=i+1;j<numbers.length;j++){
            System.out.print("("+numbers[i] + "," + numbers[j] + ") ");
          }
          System.out.println();
        }
    }
}
```