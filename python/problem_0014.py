
# Problem url: https://projecteuler.net/problem=14

def collatz_sequence(number):
    seq = [number]
    
    while number != 1:
        if number % 2 == 0:
            number = number // 2
        else:
            number = (3 * number) + 1
        seq.append(number)
    return seq

max_sequence_length = 0
num_with_max_sequence_length = 0

top_number = 1000000
for i in range(1, top_number + 1):
    collatz_seq = collatz_sequence(i)
    
    if len(collatz_seq) > max_sequence_length:
        max_sequence_length = len(collatz_seq)
        num_with_max_sequence_length = i

print('Max number with max collatz length: ', num_with_max_sequence_length)
print('Max collatz length: ', max_sequence_length)