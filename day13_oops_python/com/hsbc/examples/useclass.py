from com.hsbc.examples.myclasses import MyClass

if __name__=="__main__":
   
    #print(MyClass.x)
    mc = MyClass(100,'Shantanu')
    mc.sayHello("Shantanu")
    
    print(mc)
    
    mc.name="S Banerjee"
   # mc.setName("S Banerjee")
    
    print(mc)
    
    