
# Problem url: https://projecteuler.net/problem=15

import math

size = 20

# Solución usando fuerza bruta (inviable para numeros grandes)
paths = 0

def path(x, y):
    global paths
    
    if x == size and y == size:
        paths += 1
        print(paths)
    else:
        if x < size + 1:
            path(x + 1, y)
        if y < size + 1:
            path(x, y + 1)

path(0, 0)
print('A', size, 'x', size, 'grid has', paths, 'possible paths')

# Solución usando combinatoria
print( math.factorial(size*2) // (math.factorial(size) * math.factorial(size)))
