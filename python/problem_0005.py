
# Problem url: https://projecteuler.net/problem=5

import time

start = time.time()

n = 1

while True:
    found = True
    for i in range(20, 1, -1):
        if n % i != 0:
            found = False
            break
    
    if found:
        print("Answer is: ", n)
        break
    else:
        n += 1

end = time.time()
print(end - start)