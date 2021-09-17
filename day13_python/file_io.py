import os
#file = None

try:
    location = 'C:\\workspaces\\hsbc-workspace-2021\\demo_files\\lions.txt'
    
    file = open(location, 'r')
    
    print(file.read())
    
    file.seek(0)
    
    print(file.readline())
    
    file.seek(0)
    
    for letter in file:
        print(letter)
        
    file.seek(0)
        
    if('male' in file.read()):
        print('male is present')
        
    file_to_write = open('lions_copy_2.txt', 'w')
    
    file.seek(0)
    
    file_to_write.write(file.read())
    
    
    os.remove('lions_copy_1.txt')
    
except FileNotFoundError as error:
    print(error)
finally:
    #file.close()
    print("All OK at Finally")

