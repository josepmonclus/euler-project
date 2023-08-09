
# Problem url: https://projecteuler.net/problem=3

n = 600851475143

primes = []
max_div_prime = 1

i = 2
while i <= n:
    is_prime = True
    for prime in primes:
        if i % prime == 0:
            is_prime = False
            break
    
    if is_prime:
        primes.append(i)
        
        if n % i == 0:
            max_div_prime = i
            n = n // i
            print(max_div_prime)

    i += 1

print(f'Larger prime factor: {max_div_prime}')