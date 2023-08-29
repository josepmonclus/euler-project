
# Problem url: https://projecteuler.net/problem=10

primes = [2]

def is_prime(num: int):
    for prime in primes:
        if num % prime == 0:
            return False
    return True

primes_below = 2000000

for i in range(3, primes_below + 1):
    if is_prime(i):
        primes.append(i)
        print(i)

print('Sum of primes below ', primes_below, ' is: ', sum(primes))