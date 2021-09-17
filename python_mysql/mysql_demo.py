import mysql.connector as mysql

cnx = mysql.connect(user='root', password='root',
                              host='127.0.0.1',
                              database='training')
#print(cnx)
cursor=cnx.cursor()

cursor.execute("select * from employee")
data = cursor.fetchall()

#print(data)
for emp in data:
    print(f"{emp[0]},{emp[1]},{emp[2]},{emp[3]},{emp[4]}")
cnx.close()