from com.hsbc.app.db import empdb, EmpNotFoundError

def searchEmpById(empid):
    try:  
        if empid in empdb:
            print("emp Found : "+ str(empdb[empid]))
        else:
            raise EmpNotFoundError()    
    except EmpNotFoundError:
        print("Emp Not found")
        raise EmpNotFoundError()      
        

