from collections import Counter

def isNStraightHand(hand, groupSize):
    if len(hand) % groupSize != 0:
        return False
    
    count = Counter(hand)
    sorted_keys = sorted(count.keys())
    

    for key in sorted_keys:
        if count[key] > 0:
            start_count = count[key]
            for i in range(key, key + groupSize):
                if count[i] < start_count:
                    return False
                count[i] -= start_count
    return True

print(isNStraightHand([1,2,3,6,2,3,4,7,8], 3))