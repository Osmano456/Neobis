n = int(input())
vals = [100, 50, 20, 10, 5, 2 , 1]

print(n)
for val in vals:
    tot = n // val
    n += -(tot*val)
    print(f"{tot} nota(s) de R$ {val},00" )



