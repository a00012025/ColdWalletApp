package dsdl.coldwalletapp;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private EditText token;
    private BluetoothAdapter mBluetoothAdapter;
    private int REQUEST_ENABLE_BT = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.result);
        token = (EditText) findViewById(R.id.token);

        final BluetoothManager bluetoothManager =
                (BluetoothManager) getSystemService(Context.BLUETOOTH_SERVICE);
        mBluetoothAdapter = bluetoothManager.getAdapter();
        if (mBluetoothAdapter == null || !mBluetoothAdapter.isEnabled()) {
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
        }

    }
    @Override
    void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode== REQUEST_ENABLE_BT) {
            Set<BluetoothDevice> devices = mBluetoothAdapter.getBondedDevices();
            for (int i = 0; i < devices.size(); i++) {
                BluetoothDevice device = (BluetoothDevice) devices.iterator().next();
                System.out.println(device.getName());
            }

        }

    }
    public void onSubmitClick(View v){
        String s = token.getText().toString();
        // Send s via BLE
        
        String res = "XDDDD";
        result.setText(res);
    }

}
