package hw1;

public class Task9 {

    static boolean knightBoardCapture(int[][] board) {
        boolean flag = true;
        int x_, y_;
        final int[][] coordinateOffset =
            new int[][] {{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}};
        for (int x = 0; flag && x < board.length; x++) {
            for (int y = 0; flag && y < board[0].length; y++) {
                if (board[x][y] == 1) {
                    for (int i = 0; flag && i < coordinateOffset.length; i++) {
                        x_ = x + coordinateOffset[i][0];
                        y_ = y + coordinateOffset[i][1];
                        if (x_ > 0 && x_ < board.length && y_ > 0 && y_ < board[0].length) {
                            flag = board[x][y] != board[x_][y_];
                        }
                    }
                }
            }
        }
        return flag;
    }
}
