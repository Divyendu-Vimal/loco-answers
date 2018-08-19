package ai.loko.hk.ui.notification;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class IDReceiver extends FirebaseInstanceIdService {
    public IDReceiver() {
    }

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("IDReceiver", "onTokenRefresh: "+refreshedToken);
    }
}
