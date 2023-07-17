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