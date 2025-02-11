#Step 1: import random
import random

#Step 2: While loop
while True:

# Step 3: set roll variable
    roll = random.randint(1, 6)
    print("You rolled . . .", roll)
    roll_again = input("Want to roll again? ")
#Step 4: if statments
    if roll_again == "n" or roll_again == "N":
        print("goodbye")
        break
    elif roll_again == "Y" or roll_again == "y":
        print("Ok we will roll again")
    else:
        print("That was not a vaild statement, so we shall roll again")