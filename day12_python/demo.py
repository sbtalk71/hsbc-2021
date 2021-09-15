def greet():
    print(message())


def message():
    return "Good Morning"


list1 = [1,2,3,4,5,6,7,8,9,10]
"""print only odd numbers from the list
"""

list2 = ["Austria","India","Australia","Alaska","London","Armenia"]


list_num = [1,2,3,4,4,4,5,6,6,6,6,7,7,8]

def printElements(seq):
    print(seq.count(4))
    
    
if __name__=="__main__":
    greet()
    
    printElements(list_num)
    
    
    