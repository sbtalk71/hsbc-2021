

class AgeNotAllowedError(Exception):
    pass

def check_age():
    while(True):
        try:
            age = int(input("Enter the age :"))
            print(f"You entered : {age}")
        
            if age < 18 :
                raise AgeNotAllowedError()
                
            elif age > 60:
                raise AgeNotAllowedError()
            
            else:
                print("welcome to the group..")
                continue
                
        except ValueError as error:
            print(f"Error raised {error}")
            continue
        except AgeNotAllowedError:
            print("age should be between 18 and 60")
            continue
                

