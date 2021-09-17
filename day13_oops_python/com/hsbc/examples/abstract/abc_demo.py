from abc import ABC, abstractmethod


class Animal(ABC):
    
    def __init__(self, name):
        self.name = name;
        
    @abstractmethod   
    def speak(self):
        pass
    
    
class Dog(Animal):
   
    def speak(self):
        print(f"{self.name} is barking..")


class Cat(Animal):
   
    def speak(self):
        print(f"{self.name} is meow-ing..")

        
if __name__ == "__main__":
    fido = Dog("Fido")
    
    fido.speak()
    
    tom = Cat("Tom")
    tom.speak()
