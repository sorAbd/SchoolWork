#Step 1: import random
import random

#Step 2: set counter variables
roll_counter = [0,0,0,0,0,0]

#Step 3: start loop
for i in range(600):
    roll = random.randint(1,6)
    if roll == 1:
        roll_counter[roll-1] += 1
    elif roll == 2:
        roll_counter[roll - 1] += 1
    if roll == 3:
        roll_counter[roll - 1] += 1
    elif roll == 4:
        roll_counter[roll - 1] += 1
    if roll == 5:
        roll_counter[roll - 1] += 1
    elif roll == 6:
        roll_counter[roll - 1] += 1

#step 4: set calculation variables
per_roll_1 = 1
per_roll_2 = 2
per_roll_3 = 3
per_roll_4 = 4
per_roll_5 = 5
per_roll_6 = 6

#Step 5: print statements
print("\nThe number of times that 1 was rolled was", roll_counter[per_roll_1 - 1], "\n the percentage of this is", roll_counter[per_roll_1 - 1]/600 )
print("\nThe number of times that 1 was rolled was", roll_counter[per_roll_2 - 1], "\n the percentage of this is", roll_counter[per_roll_2 - 1]/600)
print("\nThe number of times that 1 was rolled was", roll_counter[per_roll_3 - 1], "\n the percentage of this is", roll_counter[per_roll_3 - 1]/600)
print("\nThe number of times that 1 was rolled was", roll_counter[per_roll_4 - 1], "\n the percentage of this is", roll_counter[per_roll_4 - 1]/600)
print("\nThe number of times that 1 was rolled was", roll_counter[per_roll_5 - 1], "\n the percentage of this is", roll_counter[per_roll_5 - 1]/600)
print("\nThe number of times that 1 was rolled was", roll_counter[per_roll_6 - 1], "\n the percentage of this is", roll_counter[per_roll_6 - 1]/600)
print("\ngoodbye!")