
# Problem url: https://projecteuler.net/problem=21

max = 10000

amicable = {0}

def find_divisors(n):
    divisors = [1]
    for i in range(2, n):
        if n % i == 0:
            divisors.append(i)
    return divisors

def find_sum_divisors(n):
    divisors = find_divisors(n)
    sum = 0
    for i in divisors:
        sum += i
    return sum

for i in range(1, max):
    div_sum = find_sum_divisors(i)
    
    if i != div_sum and i == find_sum_divisors(div_sum):
        amicable.add(i)
        amicable.add(div_sum)
    
print('The sum of all amicable numbers under', max, 'is:', sum(amicable))
    