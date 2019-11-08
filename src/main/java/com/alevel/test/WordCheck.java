package com.alevel.test;

import com.sun.xml.internal.txw2.output.DumpSerializer;
public boolean isValidSudoku(char[][] board) {


public class WordCheck {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (used(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean used(char[][] board, String word, int i, int j, int k) {
        int m = board.length;
        int n = board[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n) {
            return false;
        }

        if (board[i][j] == word.charAt(k)) {
            char temp = board[i][j];
            board[i][j] = '#';
            if (k == word.length() - 1) {
                return true;
            } else if (used(board, word, i - 1, j, k + 1)
                    || used(board, word, i + 1, j, k + 1)
                    || used(board, word, i, j - 1, k + 1)
                    || used(board, word, i, j + 1, k + 1)) {
                return true;
            }
            board[i][j] = temp;
        }


        return false;
    }
}
}