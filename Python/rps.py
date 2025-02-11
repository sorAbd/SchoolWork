#Step 1: import random
import random

#Step 2: set up boolean variable and while loop
run_the_game_again = True

while run_the_game_again == True:

#Step 3: get user input
    user_rps = int(input("Enter 1 for rock, 2 for Paper, or 3 for Scissors: "))

#step 4: if statements for user
    if user_rps == 1:
        print("You chose Rock!")
    elif user_rps == 2:
        print("You chose Paper!")
    elif user_rps == 3:
        print("You chose Scissors!")
    else:
        print("Invalid choice :(. I'm just going to assign you as rock :P")
        user_rps = 1

#step 4 random number
    computer_rps = random.randint(1,3)

#Step 5 if statements for computer
    if computer_rps == 1:
        print("The computer chose Rock!")
    elif computer_rps == 2:
        print("The computer chose Paper!")
    elif computer_rps == 3:
        print("The computer chose Scissors!")

#step 7 print winners
    dub_message = "CONGRATS YOU WON!, goodbye!"
    loss_message = "Sorry you lost. :( try again"
    tie_message = "Its a Tie, try again"

    if user_rps == 1 and computer_rps == 1:
        print(tie_message)
        run_the_game_again = True
    elif user_rps == 2 and computer_rps == 2:
        print(tie_message)
        run_the_game_again = True
    elif user_rps == 3 and computer_rps == 3:
        print(tie_message)
        run_the_game_again = True
    elif user_rps == 1 and computer_rps == 3:
        print(dub_message)
        break
    elif user_rps == 2 and computer_rps == 1:
        print(dub_message)
        break
    elif user_rps == 3 and computer_rps == 2:
        print(dub_message)
        break
    elif user_rps == 1 and computer_rps == 2:
        print(loss_message)
    elif user_rps == 3 and computer_rps == 1:
        print(loss_message)
    elif user_rps == 2 and computer_rps == 3:
        print(loss_message)