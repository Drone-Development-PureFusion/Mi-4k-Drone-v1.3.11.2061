package it.sephiroth.android.library.widget;

import android.widget.ExpandableListView;
import java.util.ArrayList;
/* renamed from: it.sephiroth.android.library.widget.b */
/* loaded from: classes2.dex */
class C10937b {

    /* renamed from: a */
    public static final int f35266a = 1;

    /* renamed from: b */
    public static final int f35267b = 2;

    /* renamed from: g */
    private static final int f35268g = 5;

    /* renamed from: h */
    private static ArrayList<C10937b> f35269h = new ArrayList<>(5);

    /* renamed from: c */
    public int f35270c;

    /* renamed from: d */
    public int f35271d;

    /* renamed from: e */
    int f35272e;

    /* renamed from: f */
    public int f35273f;

    private C10937b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10937b m2653a(int i) {
        return m2651a(2, i, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10937b m2652a(int i, int i2) {
        return m2651a(1, i, i2, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10937b m2651a(int i, int i2, int i3, int i4) {
        C10937b m2647d = m2647d();
        m2647d.f35273f = i;
        m2647d.f35270c = i2;
        m2647d.f35271d = i3;
        m2647d.f35272e = i4;
        return m2647d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10937b m2650a(long j) {
        if (j == 4294967295L) {
            return null;
        }
        C10937b m2647d = m2647d();
        m2647d.f35270c = ExpandableListView.getPackedPositionGroup(j);
        if (ExpandableListView.getPackedPositionType(j) != 1) {
            m2647d.f35273f = 2;
            return m2647d;
        }
        m2647d.f35273f = 1;
        m2647d.f35271d = ExpandableListView.getPackedPositionChild(j);
        return m2647d;
    }

    /* renamed from: c */
    private void m2648c() {
        this.f35270c = 0;
        this.f35271d = 0;
        this.f35272e = 0;
        this.f35273f = 0;
    }

    /* renamed from: d */
    private static C10937b m2647d() {
        C10937b c10937b;
        synchronized (f35269h) {
            if (f35269h.size() > 0) {
                c10937b = f35269h.remove(0);
                c10937b.m2648c();
            } else {
                c10937b = new C10937b();
            }
        }
        return c10937b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m2654a() {
        return this.f35273f == 1 ? ExpandableListView.getPackedPositionForChild(this.f35270c, this.f35271d) : ExpandableListView.getPackedPositionForGroup(this.f35270c);
    }

    /* renamed from: b */
    public void m2649b() {
        synchronized (f35269h) {
            if (f35269h.size() < 5) {
                f35269h.add(this);
            }
        }
    }
}
