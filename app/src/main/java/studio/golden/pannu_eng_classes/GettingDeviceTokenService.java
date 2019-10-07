package studio.golden.pannu_eng_classes;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import androidx.appcompat.app.AppCompatActivity;


public class GettingDeviceTokenService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        String deviceToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("Device Token: ",deviceToken);
    }
}
