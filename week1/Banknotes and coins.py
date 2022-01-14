
print("NOTAS:")
for note in notes:
    tot = n[0] // note
    n[0] += -(tot*note)
    print(f"{tot} nota(s) de R$ {note}.00" )


print("MOEDAS:")

##print(n)
if n[0] == 1:
    print(f"1 moeda(s) de R$ 1.00" )
else:
    print(f"0 moeda(s) de R$ 1.00" )
    
for coin in coins:
    tot = n[1] // coin
    n[1] += -(tot*coin)
    
        
    if coin == 5 or coin == 1:
        print(f"{tot} moeda(s) de R$ 0.0{coin}" )
    else:
        print(f"{tot} moeda(s) de R$ 0.{coin}" )



