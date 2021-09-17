class Emp:
    def __init__(self, empid, name, city, salary):
        self.empid = empid
        self.name = name
        self.city = city
        self.salary = salary
        
    def getDetails(self):
        return str(self.empid) + " " + self.name + " " + self.city + " " + str(self.salary)

    def __str__(self):
        return str(self.empid) + " " + self.name + " " + self.city + " " + str(self.salary)