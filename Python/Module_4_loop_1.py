#step 1: set rerun value
rerun = True

#Step 2: start while loop
while rerun == True:
    print("Hello!")
    quit = input("Want to quit?  Enter Y or N: ")

#step 3: if statements
    if quit == "Y" or quit == "y":
        print('Goodbye!')
        break
    elif quit == "N" or quit == "n":
        print("ok I will continue")
    else:
        print("That was not a proper input, I will assume that you do not want to quit")