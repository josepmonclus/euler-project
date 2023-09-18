
# Problem url: https://projecteuler.net/problem=20

n = 100

factorial = 1
for i in range(n, 0, -1):
    factorial *= i

sum = 0
for digit in str(factorial):
    sum += int(digit)

print(str(n) + '! is:', factorial, 'and the sum of digits is:', sum)