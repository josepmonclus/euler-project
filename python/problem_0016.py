
# Problem url: https://projecteuler.net/problem=16

pow = 1000

result = 2 ** pow

sum = 0
for d in str(result):
    sum += int(d)
    
print(sum)