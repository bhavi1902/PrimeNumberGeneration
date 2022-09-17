/*Brute force- technique (checking each range number one by one by changing the value of n each time we want to know whether the number entered is prime or not) */
public class javaclass {
    public static void main(String[] args){
        //System.out.println("Enter a number:");
        //Scanner sc = new Scanner(System.in);
        // n=sc.nextInt();
        int n=7;
        int temp=0;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }


    }
}
