
# Problem url: https://projecteuler.net/problem=36

max_n = 1000000

eq_palindromic = []

for n in range(max_n + 1):
    if n == int(str(n)[::-1]):
        b = bin(n)[2:]
        if b == b[::-1]:
            eq_palindromic.append(n)
        
print(f'The sum of all numbers, less than one million, which are palindromic in base 10 and base 2 is: {sum(eq_palindromic)}')