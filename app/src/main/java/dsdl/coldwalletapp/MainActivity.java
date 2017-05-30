package dsdl.coldwalletapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onSubmitClick(View v){
        EditText token = (EditText)findViewById(R.id.Token);
        String s = token.getText().toString();
        // Send s via BLE

        String res = "XDD";
        TextView result = (TextView)findViewById(R.id.Result);
        result.setText(res);
    }

}
