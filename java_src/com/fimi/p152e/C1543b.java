package com.fimi.p152e;

import android.os.Handler;
import android.os.Message;
import com.fimi.p140a.p145e.C1508c;
import com.fimi.p148c.AbstractC1523b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.fimi.e.b */
/* loaded from: classes.dex */
public class C1543b implements AbstractC1523b {

    /* renamed from: a */
    private static C1543b f3758a = new C1543b();

    /* renamed from: b */
    private List<AbstractC1523b> f3759b = new ArrayList();

    /* renamed from: c */
    private Handler f3760c = new Handler() { // from class: com.fimi.e.b.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            for (AbstractC1523b abstractC1523b : C1543b.this.f3759b) {
                abstractC1523b.mo28086a(message.what, (C1508c) message.obj);
            }
        }
    };

    /* renamed from: a */
    public static void m35230a() {
        m35227b();
    }

    /* renamed from: b */
    public static C1543b m35227b() {
        return f3758a;
    }

    @Override // com.fimi.p148c.AbstractC1523b
    /* renamed from: a */
    public synchronized void mo28086a(int i, C1508c c1508c) {
        this.f3760c.obtainMessage(i, c1508c).sendToTarget();
    }

    /* renamed from: a */
    public synchronized void m35229a(AbstractC1523b abstractC1523b) {
        this.f3759b.add(abstractC1523b);
    }

    /* renamed from: b */
    public synchronized void m35226b(AbstractC1523b abstractC1523b) {
        AbstractC1523b abstractC1523b2;
        Iterator<AbstractC1523b> it2 = this.f3759b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                abstractC1523b2 = null;
                break;
            }
            abstractC1523b2 = it2.next();
            if (abstractC1523b2 != null && abstractC1523b2 == abstractC1523b) {
                break;
            }
        }
        if (abstractC1523b2 != null) {
            this.f3759b.remove(abstractC1523b2);
        }
    }
}
