
# Problem url: https://projecteuler.net/problem=28

size = 1001

def change_dir(dir):
    return dir + 1 if dir < 3 else 0

def generate_matrix(size):
    matrix = [[0 for _ in range(size)] for _ in range(size)]
    
    side = 1
    dir = 0 # 0: east / 1: south / 2: west / 3: north
    
    x = size // 2
    y = size // 2
    
    i = 1
    while i < size ** 2:
        if i == 1:
            matrix[x][y] = i
            i += 1
        else:
            for _ in range(side):
                if dir == 0:
                    y += 1
                elif dir == 1:
                    x += 1
                elif dir == 2:
                    y -= 1
                elif dir == 3:
                    x -= 1
                matrix[x][y] = i
                if i < size ** 2:
                    i += 1
                else:
                    break
            dir = change_dir(dir)
            
            if i == size ** 2:
                break
            
            for _ in range(side):
                if dir == 0:
                    y += 1
                elif dir == 1:
                    x += 1
                elif dir == 2:
                    y -= 1
                elif dir == 3:
                    x -= 1
                matrix[x][y] = i
                if i < size ** 2:
                    i += 1
                else:
                    break
            dir = change_dir(dir)
            
            side += 1
         
    return matrix

matrix = generate_matrix(size)

# print matrix
# for row in range(len(matrix)):
#     print(matrix[row])

diagonals_sum = 0

# [0, 0] -> [size - 1, size - 1]
for i in range(size):
    diagonals_sum += matrix[i][i]

# [size - 1, 0] -> [0, size - 1]
for i in range(size):
    diagonals_sum += matrix[size - 1 - i][i]

diagonals_sum -= 1 # because center is added twice

print(f'Sum of diagonals is {diagonals_sum}')