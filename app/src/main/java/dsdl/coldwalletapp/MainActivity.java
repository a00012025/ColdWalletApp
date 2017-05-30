package dsdl.coldwalletapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private EditText token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.result);
        token = (EditText) findViewById(R.id.token);
    }

    public void onSubmitClick(View v){
        String s = token.getText().toString();
        // Send s via BLE
        
        String res = "XDDDD";
        result.setText(res);
    }

}
