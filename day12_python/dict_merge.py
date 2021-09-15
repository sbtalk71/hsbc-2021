
employees_1 = [{"id":100,"name":"Karan"},{"id":101,"name":"Jeevan"},{"id":102,"name":"Charan"}]

employees_2 = [{"id":100,"name":"Karan"},{"id":104,"name":"Shruti"},{"id":105,"name":"Chatur"}]

employees_merged = employees_1+employees_2

#merged_set = set(employees_merged)

for idx in range(0,len(employees_1)):
    id_keys = list(employees_1[idx].keys())
    for key in employees_2[idx]:
        if key not in id_keys:
            employees_1[idx][key]=employees_2[idx][key]
            
print(employees_1)
        

