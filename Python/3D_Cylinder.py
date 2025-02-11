#Step 1: Import math
import math
#Step 2: Get the variables

Radius = float(input("What is the radius of your 3D cylinder? "))
Height = float(input("What is the height of your 3D cylinder? "))

#Step 3: Calculate
Surface_Area = (2 * math.pi * Radius * Height) + (2 * math.pi * (Radius ** 2))

#Step 4: Print output
print("The surface area of your 3D cylinder is {:.2f}".format(Surface_Area))