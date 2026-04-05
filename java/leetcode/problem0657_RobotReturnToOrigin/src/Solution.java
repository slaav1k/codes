class Solution {
    public boolean judgeCircle(String moves) {
       int x = 0, y = 0;
       for (Character c : moves.toCharArray()) {
           switch (c) {
               case 'U':
                   x++;
                   break;
               case 'D':
                   x--;
                   break;
               case 'L':
                   y++;
                   break;
               case 'R':
                   y--;
                   break;
           }
       }
       return x == 0 && y == 0;
    }
}