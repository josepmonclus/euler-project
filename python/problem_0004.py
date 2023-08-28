
# Problem url: https://projecteuler.net/problem=4

max_palindrome = 0

def is_palindrome(i):
    reverse = str(i)[::-1]
    return True if i == int(reverse) else False
    
for n in range(1, 1000):
    for m in range(1,1000):
        i = n * m
        if is_palindrome(i) and i > max_palindrome:
            max_palindrome = i

print("Max palindrome is: ", max_palindrome)