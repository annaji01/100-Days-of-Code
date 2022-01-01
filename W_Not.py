"""Given an integer, n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5 , print Not Weird
If n is even and in the inclusive range of 6 to 20 , print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird. """

n = int(input("Take any no. "))

# This will print even's
if n % 2 == 0:
    if range(2, 5):
        print("Not Weird")
    elif range(6, 21):
        print("Weird")
    elif n > 21:
        print("Not Weird")

# This will print odd's
else:
    print("Weird")


for i in range(1,20):
    print(i)