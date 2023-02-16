import java.util.*;
class condition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age");
        int a = sc.nextInt();
        if(a>=18){
            System.out.println("Adult");
        }else if(a<18 && a >=10){
            System.out.println("Non-Adult");

        }else {
            System.out.println("Bache ho Tum");
        }
    }
}