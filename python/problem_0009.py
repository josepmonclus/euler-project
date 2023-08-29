
# Problem url: https://projecteuler.net/problem=9

def is_pitagorean(a, b, c):
    if a < b and b < c and a**2 + b**2 == c**2:
        return True
    else:
        return False

expected_sum = 1000

for a in range(1, expected_sum + 1):
    for b in range(a + 1, expected_sum + 1 - a):
        c = expected_sum - a - b
        if is_pitagorean(a, b, c):
            print('Pitagorean found: ', a, ' - ', b, ' - ', c)
            print('Product of this is: ', a * b * c)