package com.fimi.kernel.utils;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
/* renamed from: com.fimi.kernel.utils.z */
/* loaded from: classes.dex */
public class C1688z {

    /* renamed from: a */
    public static final int f4190a = 0;

    /* renamed from: e */
    private static Toast f4194e;

    /* renamed from: i */
    private static Toast f4198i;

    /* renamed from: d */
    private static Context f4193d = null;

    /* renamed from: b */
    public static int f4191b = 1;

    /* renamed from: c */
    public static int f4192c = 0;

    /* renamed from: f */
    private static Handler f4195f = null;

    /* renamed from: g */
    private static Runnable f4196g = new Runnable() { // from class: com.fimi.kernel.utils.z.1
        @Override // java.lang.Runnable
        public void run() {
            C1688z.f4194e.cancel();
        }
    };

    /* renamed from: h */
    private static Handler f4197h = new Handler() { // from class: com.fimi.kernel.utils.z.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    C1688z.m34447a(C1688z.f4193d, message.getData().getString("TEXT"), 1000);
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: a */
    public static void m34450a(Context context, int i) {
        f4193d = context;
        Toast.makeText(context, "" + ((Object) context.getResources().getText(i)), 0).show();
    }

    /* renamed from: a */
    public static void m34449a(Context context, int i, int i2) {
        m34447a(context, context.getResources().getString(i), i2);
    }

    /* renamed from: a */
    public static void m34448a(Context context, String str) {
        f4193d = context;
        if (!C1673n.m34653b(str)) {
            Toast.makeText(context, str, 0).show();
        }
    }

    /* renamed from: a */
    public static void m34447a(Context context, String str, int i) {
        if (context == null) {
            return;
        }
        f4195f = new Handler(context.getMainLooper());
        f4195f.removeCallbacks(f4196g);
        if (f4194e != null) {
            f4194e.setText(str);
        } else if (i == 0) {
            f4194e = Toast.makeText(context, str, 0);
        } else {
            f4194e = Toast.makeText(context, str, 1);
        }
        if (1 == i) {
            f4195f.postDelayed(f4196g, 3500L);
        } else if (i == 0) {
            f4195f.postDelayed(f4196g, 2000L);
        } else {
            f4195f.postDelayed(f4196g, i);
        }
        f4194e.show();
    }

    /* renamed from: b */
    public static void m34445b(Context context, int i) {
        f4193d = context;
        Message obtainMessage = f4197h.obtainMessage(0);
        Bundle bundle = new Bundle();
        if (context == null || bundle == null) {
            return;
        }
        bundle.putString("TEXT", context.getResources().getString(i));
        obtainMessage.setData(bundle);
        f4197h.sendMessage(obtainMessage);
    }

    /* renamed from: b */
    public static void m34444b(Context context, int i, int i2) {
        if (context != null) {
            m34442b(context, context.getString(i), i2);
        }
    }

    /* renamed from: b */
    public static void m34443b(Context context, String str) {
        f4193d = context;
        Message obtainMessage = f4197h.obtainMessage(0);
        Bundle bundle = new Bundle();
        bundle.putString("TEXT", str);
        obtainMessage.setData(bundle);
        f4197h.sendMessage(obtainMessage);
    }

    /* renamed from: b */
    public static void m34442b(Context context, String str, int i) {
        if (context == null) {
            return;
        }
        if (f4198i != null) {
            f4198i.setText(str);
        } else if (i == 0) {
            f4198i = Toast.makeText(context, str, 0);
        } else if (i == 1) {
            f4198i = Toast.makeText(context, str, 1);
        }
        f4198i.show();
    }
}
