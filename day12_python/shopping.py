items_list = ['bread','paste']
items_with_qty = {"eggs":6,"broom":1,"biscuits":20}

def order(*items,delivery="Home",**items_qty):
    print(f"Items : {items}")
    for item,qty in items_qty.items():
        print(str(item)+" :"+str(qty))
    print("Delivery Type : "+delivery)
    
    
    
      
    
    
if __name__=="__main__":
    items_list = ['bread','paste']
    items_with_qty = {"eggs":6,"broom":1,"biscuits":20}
    
    order(*items_list, "Pickup",**items_with_qty)
    
    
    
    