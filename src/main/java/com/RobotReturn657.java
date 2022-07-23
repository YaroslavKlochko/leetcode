// create 2 boxes
// iterate and check conditions
// return the final check

public class RobotReturn657 {

    public boolean judgeCircle(String moves) {
        int UpAndDown = 0;
        int LeftAndRight = 0;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                UpAndDown++;
            } else if (moves.charAt(i) == 'D') {
                UpAndDown--;
            } else if (moves.charAt(i) == 'L') {
                LeftAndRight--;
            } else if (moves.charAt(i) == 'R') {
                LeftAndRight++;
            }
        }
        return UpAndDown == 0 && LeftAndRight == 0;
    }
}
