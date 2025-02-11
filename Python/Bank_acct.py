class BankAccount:

    def __init__(self, acct_id, first_name, last_name):
        self.acct_id = acct_id
        self.first_name = first_name
        self.last_name = last_name
        self.balance = 0.0

    def __str__(self):
        return str(self.acct_id) + " Name: " + self.first_name + " " + self.last_name + " Balance : $" + str(self.balance)

    def deposit(self, amount):
        self.balance = self.balance + amount

    def withdrawal(self, amount):
        if self.balance < amount:
            raise ValueError ("Insufficient Funds. Tried to withdrawal $" + str(amount) + " but only have $" + str(self.balance))

        self.balance = self.balance - amount
        print("$" + str(amount) + " withdrawn from account " + str(self.acct_id))

    def transfer_from(self, amount, to_account):
        self.withdrawal(amount)
        to_account.deposit(amount)
        if self.withdrawal(amount) > self.balance:
            raise ValueError ("Insufficient Funds. Tried to transfer $" + str(amount) + " but only have $" + str(self.balance))

def main():
    acct_1 = BankAccount(123, "John", "Smith")
    acct_2 = BankAccount(345, "Jane", "Doe")
    print("Before deposit: $", acct_1)
    acct_1.deposit(100.00)
    print("After deposit: $", acct_1)
    print("Before deposit: $", acct_2)
    acct_2.deposit(50.00)
    print("After deposit: $", acct_2)
    print("acct_1 BEFORE transfer: $", acct_1)
    print("acct_2 BEFORE transfer: $", acct_2)
    try:
        acct_2.transfer_from(750.00, acct_1)
    except ValueError as f:
        print(f)
        print("could not transfer")
        print("After transfer: $", acct_2)
    print("acct_1 AFTER transfer: $", acct_1)
    print("acct_2 AFTER transfer: $", acct_2)

    print("Before withdrawal: $", acct_1)
    print("After withdrawal: $", acct_1)

    try:
        acct_1.withdrawal(200.00)
    except ValueError as e:
        print(e)
        print("could not withdrawal")
        print("After withdrawal: $", acct_1)
    print(acct_1)
    print(acct_2)

main()
