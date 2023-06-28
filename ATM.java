import java.util.Scanner;;
public class ATM {
public static void main(String[] args) {
    int balance = 1000, withdraw, deposit ;
    try (Scanner sc = new Scanner(System.in)) {
        while(true){
            System.out.println("||__________________welcome to SBI_______________||");
            System.out.println("choose 1 for Withdraw");
            System.out.println("choose 2 for  Deposite");
            System.out.println("choose 3 for Check Balance");
            System.out.println("choose 4 for Exit");
            System.out.print("choose the operation you want to perform ");
        
            int choose = sc.nextInt();
            switch(choose)
            {
                case 1:
                System.out.println("Enter Money To Withdraw :");
                withdraw = sc.nextInt();
        
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your balance");
                     
                }
                else{
                    System.out.println("Insufficent balnance");
                }
                System.out.println("");
                break;
        
        
                case 2:
                System.out.println("Enter the money to be deposite :  ");
                deposit = sc.nextInt();
        
                 balance = balance + deposit;
                 System.out.println("Your money has been succseefully deposited");
                 System.out.println("");
                 break;
        
                 case 3:
                 System.out.println("balance : " + balance);
                 System.out.println("");
                 break;
        
                 case 4:
               System.out.println("Thanku for using SBI");
            }
        }
    }
}    
}
