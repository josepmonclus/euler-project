
# Problem url: https://projecteuler.net/problem=2

even_sum = 0

a = 1
b = 1

while b < 4000000:
    c = a + b
    
    if c % 2 == 0:
        even_sum += c
    
    a = b
    b = c

print(even_sum)