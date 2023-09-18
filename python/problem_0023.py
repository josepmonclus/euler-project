
# Problem url: https://projecteuler.net/problem=23

max = 28124

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

abundants = []
for i in range(1, max):
    div_sum = find_sum_divisors(i)
    
    if div_sum > i: # abundant number
        abundants.append(i)

print('There are', len(abundants), 'abundant numbers under', max)

all = [i for i in range(1, max)]

for a in abundants:
    for b in abundants:
        s = a + b
        if s > max:
            break
        elif s in all:
            all.remove(a + b)
          
print(sum(all))