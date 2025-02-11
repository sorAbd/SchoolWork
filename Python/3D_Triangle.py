# Step 1: Ask for variables
Length = float(input("What is the length of the Pyramid? "))
Height = float(input("What is the height of the Pyramid? "))
Width = float(input("What is the width of the Pyramid? "))

#Step 2: Calculate
Area = (Length * Width * Height)/3

# Step 3: Output
print("The area of your Pyradmid is {:.2f}".format(Area))
