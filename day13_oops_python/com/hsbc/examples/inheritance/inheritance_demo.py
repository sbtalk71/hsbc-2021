
class Person:
    def __init__(self,pid,name):
        self.pid=pid
        self.name=name
        
        
    def getDetails(self):
        return str(self.pid)+" "+self.name
    
    
    
class Student(Person):
    def __init__(self,pid,name,year):
        #Person.__init__(self,pid, name)
        super().__init__(pid, name)
        self.year=year
        
    def getDetails(self):
        return f"{super().getDetails()} {self.year}"

if __name__=="__main__":
    
    amit = Student(100,"Amit Kumar",1989)
    
    print(amit.getDetails())