def minimumPushes(word):
    length=len(word)
    if(length<9):
        return length
    total=8
    length-=8
    i=2
    while(length>0):
        if(length>9):
            total+=(8*i)
            length-=8
            i+=1
        else:
            total+=(length*i)
            break
    return total