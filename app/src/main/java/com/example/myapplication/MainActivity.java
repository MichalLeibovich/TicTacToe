package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Game game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new Game(this);
    }

    public void userClick(View view) {
        int row=0, col=0;

        String strid = getResources().getResourceEntryName(view.getId());
         row = strid.charAt(0)-'0';
         col = strid.charAt(1)-'0';
        if (view.getId() == R.id.b00) {
             row = 0; col = 0;}
        if (view.getId() == R.id.b01) {
            row = 0; col = 1;}
        if (view.getId() == R.id.b02) {
            row = 0; col = 2;}
        if (view.getId() == R.id.b10) {
             row = 1; col = 0;}
        if (view.getId() == R.id.b11) {
            row = 1; col = 1;}
        if (view.getId() == R.id.b12) {
            row = 1; col = 1;}
        if (view.getId() == R.id.b20) {
             row = 2; col = 0;}
        if (view.getId() == R.id.b21) {
            row = 2; col = 2;}
        if (view.getId() == R.id.b22) {
            row = 2; col = 2;}
        game.move(row, col);
    }


    public void updateBoard(int row, int col,char ch)
    {

        String str = "b"+row+col;

        int id = getResources().getIdentifier(str,"id",getPackageName());

       Button b =  (Button)findViewById(id);

       b.setText("" + ch);
    }
}
