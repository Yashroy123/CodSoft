class ATM:
    def __init__(self, saving, name, acc_no):
        self.name = name
        self.account_no = acc_no
        self.saving = saving

    def greeting(self):
        print("Hello:", self.name)
        print("Your Bank account no is:", self.account_no)

    def deposit(self, amount):
        if amount >= 0:
            self.saving += amount
            print("Amount deposited successfully.")
        else:
            print("Invalid Input, try again.")

    def withdraw(self, amount):
        if amount <= 0 or amount > self.saving:
            print("Insufficient balance or invalid amount.")
        else:
            self.saving -= amount
            print("Transaction successful.")

    def check_balance(self):
        print("Current balance is:", self.saving)


class UserBankAccount:
    def __init__(self, atm):
        self.balance = atm
        self.balance.greeting()

    def menu(self):
        terminate = False
        while not terminate:
            print("\nSelect Options:")
            print("1. Withdrawal")
            print("2. Deposit")
            print("3. Check Balance")
            print("4. Exit")

            option = int(input("Enter your choice: "))

            if option == 1:
                self.withdraw()
            elif option == 2:
                self.deposit()
            elif option == 3:
                self.check_balance()
            elif option == 4:
                terminate = True
                print("Have a nice day, thanks for choosing our bank!")
            else:
                print("Invalid option.")

    def withdraw(self):
        amount = int(input("Enter the amount: "))
        self.balance.withdraw(amount)

    def deposit(self):
        amount = int(input("Enter the amount: "))
        self.balance.deposit(amount)

    def check_balance(self):
        self.balance.check_balance()


def main():
    print("== Welcome to Union Bank ==")
    attempt = 0
    make = False

    while not make:
        pin = int(input("Enter Your Bank Account PIN: "))

        if pin == 123:
            obj = ATM(25000, "Yash kumar roy", 123688)
            bank = UserBankAccount(obj)
            bank.menu()
        elif pin == 415:
            obj = ATM(50000, "Manish kumar roy", 12334688)
            bank = UserBankAccount(obj)
            bank.menu()
        elif pin == 768:
            obj = ATM(35000, "Lakshya kumar roy", 123688)
            bank = UserBankAccount(obj)
            bank.menu()
        elif pin == 543:
            obj = ATM(45000, "Prince kumar roy", 123688)
            bank = UserBankAccount(obj)
            bank.menu()
        else:
            attempt += 1
            if attempt >= 3:
                make = True
                print("Try Again After Some Time, You Exceeded Maximum Attempts.")
            else:
                print("Invalid PIN, Try Again.")


if __name__ == "__main__":
    main()



