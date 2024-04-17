def islandPerimeter(grid):
    perimetr = 0
    for i in range(0, len(grid)):
        for j in range(0, len(grid[i])):
            if grid[i][j]:
                island = 0
                if (i - 1 >= 0 and grid[i - 1][j] == 1):
                    island += 1
                if (i + 1 < len(grid) and grid[i + 1][j] == 1):
                    island += 1
                if (j - 1 >= 0 and grid[i][j - 1] == 1):
                    island += 1
                if (j + 1 < len(grid[i]) and grid[i][j + 1] == 1):
                    island += 1
                perimetr += 4 - island
    return perimetr

print(islandPerimeter([[1,0]]))