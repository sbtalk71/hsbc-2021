from com.hsbc.emp import Emp

empdb={100:Emp(100,'Shantanu','Hyderabad',45000),
       101:Emp(101,'Shantanu','Hyderabad',45000),
       102:Emp(102,'Shantanu','Hyderabad',45000),
       103:Emp(103,'Shantanu','Hyderabad',45000),
       104:Emp(104,'Shantanu','Hyderabad',45000)
        }

class EmpNotFoundError(Exception):
    pass