
def simpleArraySum(ar):
    x = 0
    for i in range(0,ar_count):
        x = x + ar[i]
        ar[i] += 1
    return x
    
if __name__ == '__main__':


    ar_count = int(input().strip())

    ar = list(map(int, input().rstrip().split()))

    result = simpleArraySum(ar)
