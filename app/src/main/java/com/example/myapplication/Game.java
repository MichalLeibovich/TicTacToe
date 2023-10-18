package com.example.myapplication;

public class Game
{
    int[][] arr = new int[3][3];
    int turns;

    MainActivity ac;

    public Game(MainActivity ac){
        this.ac = ac;
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3 ;j++){
                arr[i][j] = 0;
            }
        }
        turns = 0;
    }


    public void move(int row, int col)
    {
        if (arr[row][col] == 0)
        {
            if (turns % 2 == 0) {
                arr[row][col] = 1; //X
                ac.updateBoard(row,col,'X');
            }
            else {
                arr[row][col] = 2; //O
                ac.updateBoard(row,col,'O');

            }
            turns++;
        }
        else
           System.out.println("This spot is occupied!");
    }

    public boolean checkWin()
    {
        if (turns >= 5) {
            if ((arr[0][0] == 1 && arr[0][1] == 1 && arr[0][2] == 1) || (arr[0][0] == 2 && arr[0][1] == 2 && arr[0][2] == 2)) // row 1
                return true;
            if ((arr[1][0] == 1 && arr[1][1] == 1 && arr[1][2] == 1) || (arr[1][0] == 2 && arr[1][1] == 2 && arr[1][2] == 2)) // row 2
                return true;
            if ((arr[2][0] == 1 && arr[2][1] == 1 && arr[2][2] == 1) || (arr[2][0] == 2 && arr[2][1] == 2 && arr[2][2] == 2)) // row 3
                return true;
            if ((arr[0][0] == 1 && arr[1][0] == 1 && arr[2][0] == 1) || (arr[0][0] == 2 && arr[1][0] == 2 && arr[2][0] == 2)) // col 1
                return true;
            if ((arr[0][1] == 1 && arr[1][1] == 1 && arr[2][1] == 1) || (arr[0][1] == 2 && arr[1][1] == 2 && arr[2][1] == 2)) // col 2
                return true;
            if ((arr[0][2] == 1 && arr[1][2] == 1 && arr[2][2] == 1) || (arr[0][2] == 2 && arr[1][2] == 2 && arr[2][2] == 2)) // col 3
                return true;
            if ((arr[0][0] == 1 && arr[1][1] == 1 && arr[2][2] == 1) || (arr[0][0] == 2 && arr[1][1] == 2 && arr[2][2] == 2)) // 1 אלכסון
                return true;
            if ((arr[0][2] == 1 && arr[1][1] == 1 && arr[2][0] == 1) || (arr[0][2] == 2 && arr[1][1] == 2 && arr[2][0] == 2)) // 2 אלכסון
                return true;
        }
        return false;
    }

    public boolean checkTie()
    {
        if (arr[0][0]!=0 && arr[0][1]!=0 && arr[0][2]!=0 &&
            arr[1][0]!=0 && arr[1][1]!=0 && arr[1][2]!=0 &&
            arr[2][0]!=0 && arr[2][1]!=0 && arr[2][2]!=0)
            return true;
        return false;
    }
}
