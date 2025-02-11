import random

choices =["Rock","Paper","Scissors"]

dub_message = "CONGRATS YOU WON!"
loss_message = "Sorry you lost. :( try again"
tie_message = "Its a Tie, try again"

outcomes = [[tie_message, loss_message, dub_message],
            [dub_message,tie_message, loss_message],
            [loss_message,dub_message,tie_message]]

Human = 0
Computer = 0

while True:

    try:
        user_rps = int(input("Enter 1 for rock, 2 for Paper, or 3 for Scissors: "))
    except:
        print("Invalid input, Enter valid input, try again")
        continue
    try:
        print("you choose ", choices[user_rps - 1])
    except:
        print("please type numbers 1, 2 or 3; try again")
        continue

    computer_rps = random.randint(1,3)

    print("The computer chooses ", choices[computer_rps - 1])

    outcome = (outcomes[user_rps - 1 ][computer_rps - 1])
    if outcome == dub_message:
        Human += 1
    elif outcome == loss_message:
        Computer += 1
    print (outcome, " \n Human: ", Human, "Computer: ", Computer)
    if Human == 2 or Computer == 2:
        break
print("Goodbye")
