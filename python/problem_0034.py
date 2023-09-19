
# Problem url: https://projecteuler.net/problem=34

def factorial(n):
    fact = 1
    for n in range(1, n + 1):
        fact *= n
    return fact

equals = []

n = 3
s = 0
while n < 99999:
    
    for d in str(n):
        s += factorial(int(d))
    
    if n == s:
        equals.append(n)
    
    s = 0
    n += 1
    
print(f'The sum of all numbers which are equal to the sum of the factorial of their digits is {sum(equals)}')
