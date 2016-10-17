package google.android.com.logcatphoneinfo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        // 0 = PHONE_TYPE_NONE, 1 = PHONE_TYPE_GSM, 2 = PHONE_TYPE_CDMA, 3 =
        // PHONE_TYPE_SIP
        int phoneType = tm.getPhoneType();
        Log.v(MainActivity.this.getClass()
                .getName(), "phoneType = " + phoneType);
        String imeiCode = tm.getDeviceId();
        Log.v(MainActivity.this.getClass()
                .getName(), "imeiCode = " + imeiCode);
        String phoneNumber = tm.getLine1Number();
        Log.v(MainActivity.this.getClass()
                .getName(), "phoneNumber = " + phoneNumber);
        // 0 = DATA_DISCONNECTED, 1 = DATA_CONNECTING, 2 = DATA_CONNECTED, 3 =
        // DATA_SUSPENDED
        int dataState = tm.getDataState();
        Log.v(MainActivity.this.getClass()
                .getName(), "dataState = " + dataState);
        String operator = tm.getSimOperator();
        Log.v(MainActivity.this.getClass()
                .getName(), "operator = " + operator);

    }
}
