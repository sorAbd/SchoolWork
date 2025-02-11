def ask_for_int(low, high):
    while True:
        try:
            user_input = int(input('please input the integer between 0 and 996 that you want to find a factoral of: '))
        except:
            print('that was an invalid input, please use an integer')
            continue
        if user_input in range(low, high):
            return user_input
        else:
            print('your integer input was not in range, please input a value between 0 and 996')


def factoral(n):
    if n ==0:
        return 1
    return n * factoral(n-1)

def main():
    print("Welcome to my recursion code with Factorials! I will now find the factorial of a non-negative number that you input")
    while True:
        n = ask_for_int(0, 996)
        factoral_value = factoral(n)
        print(factoral_value)
        again = input('Would you like to try again? Y or N: ')
        if again == 'y' or again == 'n':
            print('Thanks for playing, Goodbye!')
            break
main()