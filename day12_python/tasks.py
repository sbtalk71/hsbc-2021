import random


def getBiasedNum():
    sequence=[1,1,1,2,2,3,4,4,5,5,6,6,6,6,6,6,6]
    
    print(random.choice(sequence))
    
def getBiasedNum2():
    sequence=[1,1,1,2,2,3,4,4,5,5,6,6,6,6,6,6,6]
    
    rnd_index = random.randrange(len(sequence)) 
    
    #if(rnd_index%2==0):
    print(sequence[rnd_index])
    #print(sequence[rnd_index]) 


if __name__=="__main__":
    getBiasedNum2()
    getBiasedNum2()
    getBiasedNum2()
    getBiasedNum2()
    getBiasedNum2()
    getBiasedNum2()