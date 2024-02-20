import numpy as np


def stairs(array):
    row = len(array)
    matrix = np.zeros((row, row), dtype=int)
    for i in range(row):
        matrix[i] = np.roll(array, i)
    return matrix


print(stairs(np.arange(3)))
