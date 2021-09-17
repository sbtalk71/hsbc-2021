
if __name__=="__main__":
    
    x=5
    if(x>6):
        print(x)
        
        
        
list_1 = [1,2,3,4]
try:

    print(list_1[2])
    print("No Exception, We are OK")
    
except ValueError:
    print("Index is not available")

except:
    print("All exceptions caught here")
finally:
    print("Finally block executes..")