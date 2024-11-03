package ATM;
import java.util.Scanner;

  class ATM {
     String name;
     int account_no;
     int saving ;

      ATM(int saving,String name,int Acc_no) {
         this.name = name;
         this.account_no = Acc_no;
         this.saving=saving;
     }


     public void greeting() {
         System.out.println("Hello:" + name);
         System.out.println("Your Bank account no is :" + account_no);
     }

     public void deposit(int amount) {
        if(amount>=0) {
            saving += amount;
            System.out.println("Amount deposit Successfully:");
        }
         System.out.println("Invalid Input,try again");

     }

     public void withdraw(int amount) {
         if (amount < 0 || amount>saving) {
             System.out.println("Insufficient balance:");
         }
         saving = saving - amount;
         System.out.println("Transaction successful:");

     }

     public void check_balance() {
         System.out.println("current balance is:"+saving);
     }


 }
 class user_bank_account {
         private ATM balance;
         Scanner sc;
        user_bank_account(ATM balance){
            this.balance=balance;
            this.sc=new Scanner(System.in);
            balance.greeting();
        }


        public void menu() {
            boolean terminiate = false;
            while (!terminiate) {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Select Options:");
                System.out.println("1.Withdrawal:");
                System.out.println("2.deposit:");
                System.out.println("3.Check_balance:");
                System.out.println("4.Exit:");
                int option = scanner.nextInt();
                switch (option){
                    case 1:
                      withdraw();
                      break;
                    case 2:
                        deposit();
                        break;
                    case 3:
                       check_balancee();
                       break;
                    case 4:
                        terminiate=true;
                        System.out.println("Have a nice day,thanks for choosing our bank:");
                        break;
                    default:
                        System.out.println("Invalid option:");
                }
            }
        }

        public void withdraw(){
            System.out.println(("Enter the amount:"));
            int amount=sc.nextInt();
           balance.withdraw(amount);
        }

         public void deposit(){
             System.out.println("Enter the amount:");
            int amount=sc.nextInt();
            balance.deposit(amount);
         }
         public void check_balancee(){
            balance.check_balance();
         }
 }


    class ATM_machine {

        public static void main(String[] args) {
            System.out.println("==Welcome to Union Bank===");
            int attempt=0;
            Scanner sc = new Scanner(System.in);
            boolean make=false;
            while(!make){
                System.out.println("Enter Your Bank Account Pin:");
                int pin=sc.nextInt();
                switch(pin){
                    case 123:
                        ATM obj = new ATM(25000, "Yash kumar roy", 123688);
                        user_bank_account bank = new user_bank_account(obj);
                        bank.menu();
                        break;
                    case 415:
                        ATM obj1 = new ATM(50000, "Manish kumar roy", 12334688);
                        user_bank_account bank1 = new user_bank_account(obj1);
                        bank1.menu();
                        break;
                    case 768:
                        ATM obj2 = new ATM(35000, "lakshya kumar roy", 123688);
                        user_bank_account bank2 = new user_bank_account(obj2);
                        bank2.menu();
                        break;
                    case 543:
                        ATM obj3 = new ATM(45000, "Prince kumar roy", 123688);
                        user_bank_account bank3 = new user_bank_account(obj3);
                        bank3.menu();
                        break;
                    default:
                        if(attempt==3){
                            make=true;
                            System.out.println("Try Again After some time,you exceed maximum attempt:");
                        }
                }
                attempt+=1;
            }

        }
    }

