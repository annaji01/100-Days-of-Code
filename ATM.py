"""
Example - Successful Transaction
Input:
30 120.00

Output:
89.50

Example - Incorrect Withdrawal Amount (not multiple of 5)
Input:
42 120.00

Output:
120.00

Example - Insufficient Funds
Input:
300 120.00

Output:
120.00
"""

amount = float(input("Enter your bank amount :- "))

withdraw = int(input("Enter amount to withdraw :- "))

tax = 0.50

if withdraw % 5 == 0:
    if withdraw <= 2000 and amount <= 2000:
        result = (amount - withdraw) - tax
        print(result)

elif withdraw > amount:
    print("Insufficient Funds")
    print(amount)

else:
    print("Invalid Fund")
    print(amount)
