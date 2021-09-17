
try:
    a=10
    b=10
    c=a/b
    nums = (1,2,3,4)
    nums.append(23)
    
    print(c)
except ZeroDivisionError:
    print("Exception Occurred : ")
except AttributeError as error:
    print(f"Exception Occurred :{error}")
finally:
    print("finally : All OK here..")
    