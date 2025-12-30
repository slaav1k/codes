class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int r =  grid.length;
        int c = grid[0].length;
        int res = 0;

        if (r < 3 || c < 3) {
            return 0;
        }

        boolean[] visited;
        boolean flag;
        int v, s;

        for (int i = 0; i + 2 < r; i++) {
            for (int j = 0; j + 2 < c; j++) {
                visited = new boolean[10];
                flag = true;

                for (int x = 0; x < 3 && flag; x++) {
                    for (int y = 0; y < 3; y++) {
                        v = grid[i + x][j + y];
                        if (v < 1 || v > 9 || visited[v]) {
                            flag = false;
                            break;
                        }
                        visited[v] = true;
                    }
                }
                if (!flag) {
                    continue;
                }
                
                s = grid[i][j] + grid[i][j + 1] + grid[i][j + 2];
                for (int x = 0; x < 3; x++) {
                    if (grid[i + x][j] + grid[i + x][j + 1] + grid[i + x][j + 2] != s) {
                        flag = false;
                        break;
                    }
                }
                for (int y = 0; y < 3; y++) {
                    if (grid[i][j + y] + grid[i + 1][j + y] + grid[i + 2][j + y] != s) {
                        flag = false;
                        break;
                    }
                }
                if (grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2] != s) {
                    flag = false;
                }
                if (grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j] != s) {
                    flag = false;
                }
                
                if (flag) {
                    res++;
                }
                
            }
        }
        return res;
    }
}