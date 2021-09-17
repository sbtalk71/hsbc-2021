
class MyClass:
    x=20
    def __init__(self,id,name):
        print("Constructor executed..")
        self.id=id;
        self.name=name
        
    def sayHello(self,name):
        print(f"{name}, Hello from Python class")
        
    def setName(self,name):
        self.name=name;
        
    def __str__(self):
        
        return str(self.id)+" "+self.name