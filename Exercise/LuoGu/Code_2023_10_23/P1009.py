x = eval(input())

sum =0
frac=1
for i in range(1,x+1):
    frac*=i
    sum+=frac

print(sum)