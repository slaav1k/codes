import numpy as np


def snake(ab, b, direction='H'):
    a = np.arange(1, ab * b + 1, dtype="int16")
    if direction == 'V':
        a = a.reshape((ab, b))
        a = a.T
    a = a.reshape((b, ab))
    if direction == 'V':
        a[:, 1::2] = a[::-1, 1::2]
    else:
        a[1::2, :] = a[1::2, ::-1]
    return a


print(snake(5, 3))
print(snake(5, 3, direction='V'))
