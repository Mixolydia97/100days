from sys import argv
#script name is arg1, input file is arg2
script, input_file = argv
#prints the contents of the input file
def print_all(f):
    print(f.read())
#changes position of read/write pointer in the file to 0
def rewind(f):
    f.seek(0)
#prints line count and reads the next line
def print_a_line(line_count, f):
    print(line_count, f.readline())
#current_file is now an object with text from input file
current_file = open(input_file)

print("First let's print the whole file:\n")

print_all(current_file)

print("Now let's rewind, kind of like a tape.")

rewind(current_file)

print("Let's print three lines:")

current_line = 1
print_a_line(current_line, current_file)
print(current_line)
current_line += 1
print_a_line(current_line, current_file)
print(current_line)
current_line += 1
print_a_line(current_line, current_file)
print(current_line)