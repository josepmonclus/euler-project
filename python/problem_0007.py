
# Problem url: https://projecteuler.net/problem=7

primes = [2]

def is_prime(num: int):
    for prime in primes:
        if num % prime == 0:
            return False
    return True
    

i = 3
while len(primes) < 10001:
    if is_prime(i):
        primes.append(i)
    i += 1
    
print("10001st prime is: ", primes[-1])