package edu.wofford;

public class TicTacToeModel {
    protected String winner;
    protected Integer XorO;
    protected String[] row1 = new String[3];
    protected String[] row2 = new String[3];
    protected String[] row3 = new String [3];
    protected Boolean hasStarted;

    public TicTacToeModel() {
        winner = "";
        XorO = 0;
        int i = 0;
        hasStarted = false;
        while (i < 3) {
            row1[i] = "Y";
            row2[i] = "Y";
            row3[i] = "Y";
            i = i + 1;
        }
    }

    public Boolean getHasStarted(){
        return hasStarted;
    }
    public void setHasStarted(Boolean has) {
        hasStarted = has;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String win) {
        winner = win;
    }

    public Integer getXorO () {
        return XorO;
    }

    public void setXorO (int set) {
        XorO = set;
    }

    public String XorOChar () {
        if (getXorO() == 0) {
            return "O";
        } else {
            return "X";
        }
    }

    public String[] getRow (int row) {
        if (row == 0) {
            return row1;
        } else if (row == 1) {
            return row2;
        } else {
            return row3;
        }
    }

    public void putAValue (String[] row, int col, int rownum) {
        String value;
        if (getXorO() == 0) {
            value = "X";
            setXorO(1);
        } else {
            value = "O";
            setXorO(0);
        }
        row[col] = value;
        if (rownum == 0) {
            row1 = row;
        } else if (rownum == 1) {
            row2 = row;
        } else {
            row3 = row;
        }
    }

    public void makeAMove (int row, int col) {
        if (isValidPlay(getRow(row), col)) {
            putAValue(getRow(row), col, row);
        }
        setHasStarted(true);
    }

    public Boolean isValidPlay (String[] row, int col) {
        if (row[col] == "Y") {
            return true;
        } else {
            return false;
        }

    }

    public Boolean hasWon () {
        if (getHasStarted() == true) {
            if (((row1[0].equals("X") | row1[0].equals("O"))) && row1[0].equals(row1[1]) && row1[1].equals(row1[2])) {
                setWinner(row1[0]);
                return true;
            } else if (((row2[0].equals("X") | row2[0].equals("O"))) && row2[0].equals(row2[1]) && row2[1].equals(row2[2])) {
                setWinner(row2[0]);
                return true;
            } else if (((row3[0].equals("X") | row3[0].equals("O"))) && row3[0].equals(row3[1]) && row3[1].equals(row3[2])) {
                setWinner(row3[0]);
                return true;
            } else if (((row1[0].equals("X") | row1[0].equals("O"))) && row1[0].equals(row2[0]) && row2[0].equals(row3[0])) {
                setWinner(row1[0]);
                return true;
            } else if (((row1[1].equals("X") | row1[1].equals("O"))) && row1[1].equals(row2[1]) && row2[1].equals(row3[1])) {
                setWinner(row1[1]);
                return true;
            } else if (((row1[2].equals("X") | row1[2].equals("O"))) && row1[2].equals(row2[2]) && row2[2].equals(row3[2])) {
                setWinner(row1[2]);
                return true;
            } else if (((row1[0].equals("X") | row1[0].equals("O"))) && row1[0].equals(row2[1]) && row2[1].equals(row3[2])) {
                setWinner(row1[0]);
                return true;
            } else if (((row1[2].equals("X") | row1[2].equals("O"))) && row1[2].equals(row2[1]) && row2[1].equals(row3[0])) {
                setWinner(row1[2]);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
