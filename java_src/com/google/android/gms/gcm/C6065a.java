package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4588d;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* renamed from: com.google.android.gms.gcm.a */
/* loaded from: classes2.dex */
public class C6065a {

    /* renamed from: a */
    public static final int f20529a = 0;

    /* renamed from: b */
    public static final int f20530b = 1;

    /* renamed from: c */
    public static final int f20531c = 2;

    /* renamed from: d */
    private static C6065a f20532d;

    /* renamed from: e */
    private Context f20533e;

    /* renamed from: f */
    private final PendingIntent f20534f;

    private C6065a(Context context) {
        this.f20533e = context;
        this.f20534f = PendingIntent.getBroadcast(this.f20533e, 0, new Intent(), 0);
    }

    /* renamed from: a */
    private Intent m18866a() {
        String m18839b = C6067c.m18839b(this.f20533e);
        int i = -1;
        if (m18839b != null) {
            i = C6067c.m18834c(this.f20533e);
        }
        if (m18839b == null || i < C6067c.f20538a) {
            Log.e("GcmNetworkManager", new StringBuilder(91).append("Google Play Services is not available, dropping GcmNetworkManager request. code=").append(i).toString());
            return null;
        }
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage(m18839b);
        intent.putExtra("app", this.f20534f);
        return intent;
    }

    /* renamed from: a */
    public static C6065a m18864a(Context context) {
        C6065a c6065a;
        synchronized (C6065a.class) {
            if (f20532d == null) {
                f20532d = new C6065a(context.getApplicationContext());
            }
            c6065a = f20532d;
        }
        return c6065a;
    }

    /* renamed from: a */
    private void m18865a(ComponentName componentName) {
        m18857b(componentName.getClassName());
        Intent m18866a = m18866a();
        if (m18866a == null) {
            return;
        }
        m18866a.putExtra("scheduler_action", "CANCEL_ALL");
        m18866a.putExtra("component", componentName);
        this.f20533e.sendBroadcast(m18866a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m18861a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must provide a valid tag.");
        }
        if (100 >= str.length()) {
            return;
        }
        throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
    }

    /* renamed from: a */
    private void m18860a(String str, ComponentName componentName) {
        m18861a(str);
        m18857b(componentName.getClassName());
        Intent m18866a = m18866a();
        if (m18866a == null) {
            return;
        }
        m18866a.putExtra("scheduler_action", "CANCEL_TASK");
        m18866a.putExtra("tag", str);
        m18866a.putExtra("component", componentName);
        this.f20533e.sendBroadcast(m18866a);
    }

    /* renamed from: b */
    private void m18857b(String str) {
        boolean z = true;
        C4588d.m23626a(str, (Object) "GcmTaskService must not be null.");
        Intent intent = new Intent(GcmTaskService.f20491b);
        intent.setPackage(this.f20533e.getPackageName());
        List<ResolveInfo> queryIntentServices = this.f20533e.getPackageManager().queryIntentServices(intent, 0);
        C4588d.m23618b((queryIntentServices == null || queryIntentServices.size() == 0) ? false : true, "There is no GcmTaskService component registered within this package. Have you extended GcmTaskService correctly?");
        Iterator<ResolveInfo> it2 = queryIntentServices.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                break;
            } else if (it2.next().serviceInfo.name.equals(str)) {
                break;
            }
        }
        C4588d.m23618b(z, new StringBuilder(String.valueOf(str).length() + Opcodes.DNEG).append("The GcmTaskService class you provided ").append(str).append(" does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY.").toString());
    }

    /* renamed from: a */
    public void m18863a(Task task) {
        m18857b(task.m18882c());
        Intent m18866a = m18866a();
        if (m18866a == null) {
            return;
        }
        Bundle extras = m18866a.getExtras();
        extras.putString("scheduler_action", "SCHEDULE_TASK");
        task.mo18886a(extras);
        m18866a.putExtras(extras);
        this.f20533e.sendBroadcast(m18866a);
    }

    /* renamed from: a */
    public void m18862a(Class<? extends GcmTaskService> cls) {
        m18858b(cls);
    }

    /* renamed from: a */
    public void m18859a(String str, Class<? extends GcmTaskService> cls) {
        m18856b(str, cls);
    }

    /* renamed from: b */
    public void m18858b(Class<? extends Service> cls) {
        m18865a(new ComponentName(this.f20533e, cls));
    }

    /* renamed from: b */
    public void m18856b(String str, Class<? extends Service> cls) {
        m18860a(str, new ComponentName(this.f20533e, cls));
    }
}
