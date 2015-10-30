package com.example.lenovo.maxtap;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Highscore extends Activity {
    private EditText et;
    private String data;
    private String file = "mydata";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hscore);
        et = (EditText) (findViewById(R.id.editText1));
    }

    public void save(View view) {
        et.setText("cool");
        data = et.getText().toString();

        try {
            FileOutputStream fOut = openFileOutput(file, MODE_WORLD_READABLE);
            fOut.write(data.getBytes());
            fOut.close();
            Toast.makeText(getBaseContext(), "file saved", Toast.LENGTH_SHORT).show();
        } catch (Exception e) { // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void read(View view) {
        try {
            FileInputStream fin = openFileInput(file);
            int c;
            String temp = "";
            while ((c = fin.read()) != -1) {
                temp = temp + Character.toString((char) c);
            }
            et.setText(temp);
            Toast.makeText(getBaseContext(), "file read", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
        }
    }


}




