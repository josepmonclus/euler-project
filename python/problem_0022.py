
# Problem url: https://projecteuler.net/problem=22

with open("resources/Problem0022_names.txt", "r") as file:
    content = file.read()
    
names = content.split('","')

# clean first and last item
names[0] = names[0].lstrip('"')
names[-1] = names[-1].rstrip('"')
names.sort()

alphabet = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']

total_scores = 0
for name in names:
    idx = names.index(name) + 1
    letters_value = [alphabet.index(letter) + 1 for letter in name]
    score = idx * sum(letters_value)
    total_scores += score    
    
print('Total score of all names in file is: ', total_scores)