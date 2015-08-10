package homework7.gameXO;

import javax.swing.*;

/**
 * Created by Razer on 09.08.15.
 */
public class GameEngine {
    private boolean isPress;
    private char array[] = new char[9];
    private int count = 0;

    public boolean isPress() {
        return isPress;
    }

    public char pressButtonLogic(int position) {
        char result;
        if (isPress) {
            result = '0';
            isPress = false;
        } else {
            result = 'X';
            isPress = true;
        }
        array[position] = result;
        return result;
    }

    public boolean isWin() {
        boolean result = false;
        if ((array[0] == array[1]) && (array[1] == array[2]) && array[0] != '\u0000') {
            result = true;
        }
        if ((array[3] == array[4]) && (array[4] == array[5] && array[3] != '\u0000')) {
            result = true;
        }
        if ((array[6] == array[7]) && (array[7] == array[8]) && array[6] != '\u0000') {
            result = true;
        }
        if ((array[0] == array[3]) && (array[3] == array[6]) && array[0] != '\u0000') {
            result = true;
        }
        if ((array[1] == array[4]) && (array[4] == array[7]) && array[1] != '\u0000') {
            result = true;
        }
        if ((array[2] == array[5]) && (array[5] == array[8]) && array[2] != '\u0000') {
            result = true;
        }
        if ((array[0] == array[4]) && (array[4] == array[8]) && array[0] != '\u0000') {
            result = true;
        }
        if ((array[2] == array[4]) && (array[4] == array[6]) && array[2] != '\u0000') {
            result = true;
        }
        count++;
        return result;
    }

    public boolean isDraw() {
        if (count == array.length) return true;
        else return false;
    }
}
