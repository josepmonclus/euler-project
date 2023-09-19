
# Problem url: https://projecteuler.net/problem=30

power = 5

max_n = (9 ** power) * power

equals = []

for n in range(2, max_n + 1):
    s = 0
    for d in str(n):
        s += int(d) ** power
    
    if n == s:
        equals.append(n)
        
print(f'The sum of all the numbers that can be written as the sum of fifth powers of their digits is {sum(equals)}')