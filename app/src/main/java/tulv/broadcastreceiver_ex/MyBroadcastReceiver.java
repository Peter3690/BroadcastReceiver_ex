package tulv.broadcastreceiver_ex;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by tulv on 12/26/2016.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String s=intent.getStringExtra("content");
        Toast.makeText(context, "thay doi trang thai wifi "+s, Toast.LENGTH_SHORT).show();
    }
}
