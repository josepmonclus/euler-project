
# Problem url: https://projecteuler.net/problem=12

def find_divisors(num):
    divisors = []
    i = 1
    max = num
    while i < max:
        if num % i == 0:
            max = num // i
            divisors.append(i)
            divisors.append(max)
        i += 1
    return divisors

found = False
num_divisors = 500
n = 1
while not found:
    sum = 0
    for i in range(1, n + 1):
        sum += i
    if len(find_divisors(sum)) > num_divisors:
        print('First triangle number with more than ', num_divisors, ' is: ', sum)
        found = True
    n += 1
    