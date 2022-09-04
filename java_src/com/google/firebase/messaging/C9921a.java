package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.C9751b;
import com.google.firebase.iid.C9912e;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.regex.Pattern;
/* renamed from: com.google.firebase.messaging.a */
/* loaded from: classes2.dex */
public class C9921a {

    /* renamed from: a */
    public static final String f30861a = "FCM";

    /* renamed from: b */
    private static final Pattern f30862b = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: c */
    private static C9921a f30863c;

    /* renamed from: d */
    private final FirebaseInstanceId f30864d;

    /* renamed from: e */
    private PendingIntent f30865e;

    private C9921a(FirebaseInstanceId firebaseInstanceId) {
        this.f30864d = firebaseInstanceId;
    }

    /* renamed from: a */
    public static synchronized C9921a m6479a() {
        C9921a c9921a;
        synchronized (C9921a.class) {
            if (f30863c == null) {
                f30863c = new C9921a(FirebaseInstanceId.m6622a());
            }
            c9921a = f30863c;
        }
        return c9921a;
    }

    /* renamed from: a */
    private synchronized void m6478a(Context context, Intent intent) {
        if (this.f30865e == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.f30865e = PendingIntent.getBroadcast(context, 0, intent2, 0);
        }
        intent.putExtra("app", this.f30865e);
    }

    /* renamed from: a */
    public void m6477a(RemoteMessage remoteMessage) {
        if (TextUtils.isEmpty(remoteMessage.m6507b())) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Context m7224a = C9751b.m7205d().m7224a();
        String m6560a = C9912e.m6560a(m7224a);
        if (m6560a == null) {
            Log.e("FirebaseMessaging", "Google Play services package is missing. Impossible to send message");
            return;
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        m6478a(m7224a, intent);
        intent.setPackage(m6560a);
        remoteMessage.m6508a(intent);
        m7224a.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    /* renamed from: a */
    public void m6476a(String str) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in subscribeToTopic.");
            str = str.substring("/topics/".length());
        }
        if (str == null || !f30862b.matcher(str).matches()) {
            String valueOf = String.valueOf("[a-zA-Z0-9-_.~%]{1,900}");
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 55 + String.valueOf(valueOf).length()).append("Invalid topic name: ").append(str).append(" does not match the allowed format ").append(valueOf).toString());
        }
        FirebaseInstanceId m6622a = FirebaseInstanceId.m6622a();
        String valueOf2 = String.valueOf("S!");
        String valueOf3 = String.valueOf(str);
        m6622a.m6619a(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2));
    }

    /* renamed from: b */
    public void m6475b(String str) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in unsubscribeFromTopic.");
            str = str.substring("/topics/".length());
        }
        if (str == null || !f30862b.matcher(str).matches()) {
            String valueOf = String.valueOf("[a-zA-Z0-9-_.~%]{1,900}");
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 55 + String.valueOf(valueOf).length()).append("Invalid topic name: ").append(str).append(" does not match the allowed format ").append(valueOf).toString());
        }
        FirebaseInstanceId m6622a = FirebaseInstanceId.m6622a();
        String valueOf2 = String.valueOf("U!");
        String valueOf3 = String.valueOf(str);
        m6622a.m6619a(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2));
    }
}
