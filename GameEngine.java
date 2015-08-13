package homework7.gameXO;


/**
 * Created by Razer on 09.08.15.
 */
public class GameEngine {
    private char array[] = new char[9];
    private int count = 0;

    public int getCount() {
        return count;
    }

    public char pressButtonLogic(int position) {
        char result;
        if (count%2==0) {
            result = 'X';
        } else {
            result = '0';
        }
        array[position] = result;
        count++;
        return result;
    }

    public boolean isWin() {
        if ((array[0] == array[1]) && (array[1] == array[2]) && array[0] != '\u0000') {
            return true;
        } else if ((array[3] == array[4]) && (array[4] == array[5]) && array[3] != '\u0000') {
            return true;
        } else if ((array[6] == array[7]) && (array[7] == array[8]) && array[6] != '\u0000') {
            return true;
        } else if ((array[0] == array[3]) && (array[3] == array[6]) && array[0] != '\u0000') {
            return true;
        } else if ((array[1] == array[4]) && (array[4] == array[7]) && array[1] != '\u0000') {
            return true;
        } else if ((array[2] == array[5]) && (array[5] == array[8]) && array[2] != '\u0000') {
            return true;
        } else if ((array[0] == array[4]) && (array[4] == array[8]) && array[0] != '\u0000') {
            return true;
        } else if ((array[2] == array[4]) && (array[4] == array[6]) && array[2] != '\u0000') {
            return true;
        }
        return false;
    }

    public boolean isDraw() {
        return (count == array.length);
    }
}
