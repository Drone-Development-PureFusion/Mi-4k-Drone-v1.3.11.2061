package com.fimi.soul.module.droneTrack.p216a;

import com.fimi.soul.module.droneTrack.AbstractC2686f;
import com.fimi.soul.module.droneTrack.C2683c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.fimi.soul.module.droneTrack.a.d */
/* loaded from: classes.dex */
public class C2676d {

    /* renamed from: a */
    private C2679e f9132a = new C2679e();

    /* renamed from: b */
    private C2679e f9133b = new C2679e();

    /* renamed from: c */
    private C2679e f9134c = new C2679e();

    /* renamed from: d */
    private C2679e f9135d = new C2679e();

    /* renamed from: e */
    private AbstractC2686f f9136e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m30668a(HashMap<Integer, List<Object>> hashMap, HashMap<Integer, List<Object>> hashMap2) {
        int size = hashMap.size();
        for (Map.Entry<Integer, List<Object>> entry : hashMap2.entrySet()) {
            hashMap.put(Integer.valueOf(entry.getKey().intValue() + size), entry.getValue());
        }
    }

    /* renamed from: a */
    public C2679e m30672a() {
        return this.f9135d;
    }

    /* renamed from: a */
    public void m30669a(AbstractC2686f abstractC2686f) {
        this.f9136e = abstractC2686f;
    }

    /* renamed from: b */
    public C2679e m30667b() {
        return this.f9134c;
    }

    /* renamed from: c */
    public C2679e m30665c() {
        return this.f9133b;
    }

    /* renamed from: d */
    public C2679e m30663d() {
        return this.f9132a;
    }

    /* renamed from: e */
    public void m30661e() {
        C2683c.m30634b(new Runnable() { // from class: com.fimi.soul.module.droneTrack.a.d.1
            @Override // java.lang.Runnable
            public void run() {
                while (C2676d.this.f9132a != null && C2676d.this.f9133b != null && C2676d.this.f9134c != null && C2676d.this.f9135d != null) {
                    if (!C2676d.this.f9132a.m30657a() || !C2676d.this.f9133b.m30657a() || !C2676d.this.f9134c.m30657a() || !C2676d.this.f9135d.m30657a()) {
                        try {
                            Thread.sleep(1000L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        LinkedHashMap<Integer, List<Object>> m30696b = C2672b.m30703a().m30696b();
                        m30696b.putAll(C2676d.this.f9132a.m30652b());
                        C2676d.this.m30668a(m30696b, C2676d.this.f9133b.m30652b());
                        C2676d.this.m30668a(m30696b, C2676d.this.f9134c.m30652b());
                        C2676d.this.m30668a(m30696b, C2676d.this.f9135d.m30652b());
                        Collections.sort(new ArrayList(m30696b.entrySet()), new Comparator<Map.Entry<Integer, List<Object>>>() { // from class: com.fimi.soul.module.droneTrack.a.d.1.1
                            @Override // java.util.Comparator
                            /* renamed from: a */
                            public int compare(Map.Entry<Integer, List<Object>> entry, Map.Entry<Integer, List<Object>> entry2) {
                                return entry.getKey().intValue() - entry2.getKey().intValue();
                            }
                        });
                        if (C2676d.this.f9136e != null) {
                            C2676d.this.f9136e.mo30631a();
                            return;
                        }
                    }
                }
            }
        });
    }

    /* renamed from: f */
    public void m30659f() {
        this.f9132a.m30651b(true);
        this.f9133b.m30651b(true);
        this.f9134c.m30651b(true);
        this.f9135d.m30651b(true);
        this.f9132a.m30650c();
        this.f9133b.m30650c();
        this.f9134c.m30650c();
        this.f9135d.m30650c();
        this.f9132a = null;
        this.f9133b = null;
        this.f9134c = null;
        this.f9135d = null;
    }
}
