package com.google.android.gms.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.AbstractC7423mz;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.mu */
/* loaded from: classes2.dex */
public class RunnableC7418mu implements Runnable {

    /* renamed from: a */
    public final Context f24847a;

    /* renamed from: b */
    public final C7419mv f24848b;

    /* renamed from: c */
    public final C7419mv f24849c;

    /* renamed from: d */
    public final C7419mv f24850d;

    /* renamed from: e */
    public final C7422my f24851e;

    public RunnableC7418mu(Context context, C7419mv c7419mv, C7419mv c7419mv2, C7419mv c7419mv3, C7422my c7422my) {
        this.f24847a = context;
        this.f24848b = c7419mv;
        this.f24849c = c7419mv2;
        this.f24850d = c7419mv3;
        this.f24851e = c7422my;
    }

    /* renamed from: a */
    private AbstractC7423mz.C7424a m14544a(C7419mv c7419mv) {
        AbstractC7423mz.C7424a c7424a = new AbstractC7423mz.C7424a();
        if (c7419mv.m14543a() != null) {
            Map<String, Map<String, byte[]>> m14543a = c7419mv.m14543a();
            ArrayList arrayList = new ArrayList();
            for (String str : m14543a.keySet()) {
                ArrayList arrayList2 = new ArrayList();
                Map<String, byte[]> map = m14543a.get(str);
                for (String str2 : map.keySet()) {
                    AbstractC7423mz.C7425b c7425b = new AbstractC7423mz.C7425b();
                    c7425b.f24869a = str2;
                    c7425b.f24870b = map.get(str2);
                    arrayList2.add(c7425b);
                }
                AbstractC7423mz.C7427d c7427d = new AbstractC7423mz.C7427d();
                c7427d.f24874a = str;
                c7427d.f24875b = (AbstractC7423mz.C7425b[]) arrayList2.toArray(new AbstractC7423mz.C7425b[arrayList2.size()]);
                arrayList.add(c7427d);
            }
            c7424a.f24866a = (AbstractC7423mz.C7427d[]) arrayList.toArray(new AbstractC7423mz.C7427d[arrayList.size()]);
        }
        c7424a.f24867b = c7419mv.m14536c();
        return c7424a;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC7423mz.C7428e c7428e = new AbstractC7423mz.C7428e();
        if (this.f24848b != null) {
            c7428e.f24876a = m14544a(this.f24848b);
        }
        if (this.f24849c != null) {
            c7428e.f24877b = m14544a(this.f24849c);
        }
        if (this.f24850d != null) {
            c7428e.f24878c = m14544a(this.f24850d);
        }
        if (this.f24851e != null) {
            AbstractC7423mz.C7426c c7426c = new AbstractC7423mz.C7426c();
            c7426c.f24871a = this.f24851e.m14530a();
            c7426c.f24872b = this.f24851e.m14523b();
            c7428e.f24879d = c7426c;
        }
        if (this.f24851e != null && this.f24851e.m14522c() != null) {
            ArrayList arrayList = new ArrayList();
            Map<String, C7417mt> m14522c = this.f24851e.m14522c();
            for (String str : m14522c.keySet()) {
                if (m14522c.get(str) != null) {
                    AbstractC7423mz.C7429f c7429f = new AbstractC7423mz.C7429f();
                    c7429f.f24884c = str;
                    c7429f.f24883b = m14522c.get(str).m14545b();
                    c7429f.f24882a = m14522c.get(str).m14546a();
                    arrayList.add(c7429f);
                }
            }
            c7428e.f24880e = (AbstractC7423mz.C7429f[]) arrayList.toArray(new AbstractC7423mz.C7429f[arrayList.size()]);
        }
        byte[] m13857a = AbstractC7649rd.m13857a(c7428e);
        try {
            FileOutputStream openFileOutput = this.f24847a.openFileOutput("persisted_config", 0);
            openFileOutput.write(m13857a);
            openFileOutput.close();
        } catch (IOException e) {
            Log.e("AsyncPersisterTask", "Could not persist config.", e);
        }
    }
}
