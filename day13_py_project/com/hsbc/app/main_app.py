from com.hsbc.app.service import searchEmpById

if __name__=="__main__":
    
    try:
        searchEmpById(100)
    
    except:
        print("exception Propagated")