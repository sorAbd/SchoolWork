#Step 1: import random
import random

#Step 2: set counter variables
roll_1 = 0
roll_2 = 0
roll_3 = 0
roll_4 = 0
roll_5 = 0
roll_6 = 0

#Step 3: start loop
for i in range(600):
    roll = random.randint(1,6)
    if roll == 1:
        roll_1 += 1
    elif roll == 2:
        roll_2 += 1
    if roll == 3:
        roll_3 += 1
    elif roll == 4:
        roll_4 += 1
    if roll == 5:
        roll_5 += 1
    elif roll == 6:
        roll_6 += 1

#step 4: set calculation variables
per_roll_1 = roll_1/600
per_roll_2 = roll_2/600
per_roll_3 = roll_3/600
per_roll_4 = roll_4/600
per_roll_5 = roll_5/600
per_roll_6 = roll_6/600

#Step 5: print statements
print("\nThe number of times that 1 was rolled was", roll_1, "\n the percentage of this is", per_roll_1)
print("\nThe number of times that 1 was rolled was", roll_2, "\n the percentage of this is", per_roll_2)
print("\nThe number of times that 1 was rolled was", roll_3, "\n the percentage of this is", per_roll_3)
print("\nThe number of times that 1 was rolled was", roll_4, "\n the percentage of this is", per_roll_4)
print("\nThe number of times that 1 was rolled was", roll_5, "\n the percentage of this is", per_roll_5)
print("\nThe number of times that 1 was rolled was", roll_6, "\n the percentage of this is", per_roll_6)
print("\ngoodbye!")