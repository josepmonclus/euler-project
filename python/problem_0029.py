
# Problem url: https://projecteuler.net/problem=29

min_power = 2
max_power = 100

powers = set()

for a in range(min_power, max_power + 1):
    for b in range(min_power, max_power + 1):
        powers.add(a ** b)

print(len(powers))