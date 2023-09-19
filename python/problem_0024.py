
# Problem url: https://projecteuler.net/problem=24

word = '0123456789'

def do_permute(permutes_list, permuted, to_permute):
    if len(to_permute) == 1:
        permutes_list.append(permuted + to_permute)
    else:
        for pos in range(0, len(to_permute)):
            do_permute(permutes_list, permuted + to_permute[pos], to_permute[:pos] + to_permute[pos + 1:])
    
        
def get_permutes(word: str):
    permutes_list = []
            
    do_permute(permutes_list, '', word)
        
    return permutes_list
    
permutes = get_permutes(word)
permutes.sort()

print(len(permutes))

print(f'The millionth lexicographic permutation of {word} is {permutes[999999]}')