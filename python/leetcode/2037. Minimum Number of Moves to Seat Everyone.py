def minMovesToSeat(seats, students):
    k = 0
    while len(seats) > 0:
        a = seats.pop(seats.index(min(seats)))
        b = students.pop(students.index(min(students)))
        k += abs(a - b)
    return k