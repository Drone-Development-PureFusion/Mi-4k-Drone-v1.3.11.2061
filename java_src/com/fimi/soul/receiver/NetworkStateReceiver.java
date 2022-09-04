package com.fimi.soul.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* loaded from: classes.dex */
public abstract class NetworkStateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f11332a = "android.net.conn.CONNECTIVITY_CHANGE";

    /* renamed from: com.fimi.soul.receiver.NetworkStateReceiver$a */
    /* loaded from: classes.dex */
    public enum EnumC3033a {
        Wifi,
        Mobile,
        None
    }

    /* renamed from: a */
    private boolean m29522a(NetworkInfo.State state) {
        return state != null && NetworkInfo.State.CONNECTED == state;
    }

    /* renamed from: a */
    public abstract void mo29420a(EnumC3033a enumC3033a, Context context);

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo.State state = connectivityManager.getNetworkInfo(1).getState();
            if (connectivityManager.getNetworkInfo(0) == null) {
                return;
            }
            NetworkInfo.State state2 = connectivityManager.getNetworkInfo(0).getState();
            if (m29522a(state)) {
                mo29420a(EnumC3033a.Wifi, context);
            } else if (m29522a(state2)) {
                mo29420a(EnumC3033a.Mobile, context);
            } else {
                mo29420a(EnumC3033a.None, context);
            }
        }
    }
}
