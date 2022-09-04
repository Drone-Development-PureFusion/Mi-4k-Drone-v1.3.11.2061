package com.fimi.soul.biz.p183k;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.entity.DeviceType;
import com.fimi.soul.entity.DynamicDYZ_Entity;
import com.fimi.soul.utils.C3077ae;
import com.fimi.soul.utils.C3078af;
import com.fimi.soul.utils.C3084al;
import com.fimi.soul.utils.C3103au;
import com.google.android.gms.maps.C8500c;
import com.google.android.gms.maps.model.C8611c;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import it.p273a.p274a.AbstractC10866e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* renamed from: com.fimi.soul.biz.k.d */
/* loaded from: classes.dex */
public class C1901d {

    /* renamed from: e */
    private SQLiteDatabase f5232e;

    /* renamed from: f */
    private C8500c f5233f;

    /* renamed from: i */
    private CircleOptions f5236i;

    /* renamed from: j */
    private CircleOptions f5237j;

    /* renamed from: k */
    private CircleOptions f5238k;

    /* renamed from: l */
    private CircleOptions f5239l;

    /* renamed from: n */
    private List<DynamicDYZ_Entity> f5241n;

    /* renamed from: o */
    private Context f5242o;

    /* renamed from: b */
    private final List<LatLng> f5229b = new ArrayList();

    /* renamed from: c */
    private final List<LatLng> f5230c = new ArrayList();

    /* renamed from: d */
    private final List<LatLng> f5231d = new ArrayList();

    /* renamed from: p */
    private int f5243p = 0;

    /* renamed from: r */
    private final int f5245r = 100;

    /* renamed from: s */
    private final int f5246s = 200;

    /* renamed from: a */
    Handler f5228a = new Handler() { // from class: com.fimi.soul.biz.k.d.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i;
            int i2;
            int i3;
            LatLng latLng;
            double d = 500000.0d;
            super.handleMessage(message);
            if (message.what == 100 || message.what == 200) {
                try {
                    if (C1901d.this.f5233f.m11613a().f27431b <= 8.0f) {
                        C1901d.this.m33643d();
                        return;
                    }
                    C1901d.this.m33651a(C1901d.this.f5234g, C1901d.this.f5229b);
                    C1901d.this.m33651a(C1901d.this.f5244q, C1901d.this.f5230c);
                    C1901d.this.m33651a(C1901d.this.f5235h, C1901d.this.f5231d);
                    LatLng m11483a = C1901d.this.f5233f.m11554n().m11483a(new Point(0, 0));
                    LatLng latLng2 = C1901d.this.f5233f.m11613a().f27430a;
                    if (latLng2 == null) {
                        return;
                    }
                    double m29318a = C3077ae.m29349c(m11483a, latLng2).m29318a();
                    if (m29318a < 20000.0d) {
                        m29318a = 35000.0d;
                    }
                    if (m29318a <= 500000.0d) {
                        d = m29318a;
                    }
                    double d2 = d / 111000.0d;
                    if (C1901d.this.f5232e == null) {
                        return;
                    }
                    String str = "SELECT LAT,LON,CLASS from dmz_tb where LAT > " + (latLng2.f27462a - d2) + " and LAT <" + (latLng2.f27462a + d2) + " and LON >" + (latLng2.f27463b - d2) + " and LON < " + (latLng2.f27463b + d2);
                    if (C1772d.m34208a().m34187k() || C1681v.m34543a(DroidPlannerApp.m34273g()).m34495v() == DeviceType.DEVICE_4K) {
                        str = "select LAT,LON,WarnRadius,NoFlyRadius,HLRadius from dmz_tbv10 where LAT> " + (latLng2.f27462a - d2) + " and LAT <" + (latLng2.f27462a + d2) + " and LON >" + (latLng2.f27463b - d2) + " and LON < " + (d2 + latLng2.f27463b);
                    }
                    Cursor rawQuery = C1901d.this.f5232e.rawQuery(str, null);
                    if (rawQuery != null && rawQuery.getCount() > 0) {
                        while (rawQuery.moveToNext()) {
                            double d3 = rawQuery.getFloat(rawQuery.getColumnIndex("LAT"));
                            double d4 = rawQuery.getFloat(rawQuery.getColumnIndex("LON"));
                            if (C1772d.m34208a().m34187k() || C1681v.m34543a(DroidPlannerApp.m34273g()).m34495v() == DeviceType.DEVICE_4K) {
                                int i4 = rawQuery.getInt(rawQuery.getColumnIndex("NoFlyRadius"));
                                int i5 = (rawQuery.getInt(rawQuery.getColumnIndex("WarnRadius")) + i4) * 10;
                                int i6 = rawQuery.getInt(rawQuery.getColumnIndex("HLRadius")) * 10;
                                int i7 = i6 + 1500;
                                i = i4 * 10;
                                i2 = i5;
                                i3 = i6;
                            } else {
                                byte b = (byte) rawQuery.getInt(rawQuery.getColumnIndex("CLASS"));
                                int i8 = b & 3;
                                i3 = 0;
                                i2 = 0;
                                i = (((b & 63) == 30 ? 127 : b & 63) + 1) * 1000;
                            }
                            if (!C2022a.m33223a().m33221b()) {
                                C3084al m29346a = C3078af.m29346a(d3, d4);
                                latLng = new LatLng(m29346a.m29322a(), m29346a.m29320b());
                            } else {
                                latLng = new LatLng(d3, d4);
                            }
                            if (C1772d.m34208a().m34187k() || C1681v.m34543a(DroidPlannerApp.m34273g()).m34495v() == DeviceType.DEVICE_4K) {
                                if (i < i3) {
                                }
                                C1901d.this.m33647b(latLng, i2, C1901d.this.f5237j);
                            }
                            C1901d.this.m33653a(latLng, i, C1901d.this.f5236i);
                        }
                    }
                    if (rawQuery == null) {
                        return;
                    }
                    rawQuery.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    };

    /* renamed from: g */
    private List<C8611c> f5234g = C1906g.m33620c().m33619d();

    /* renamed from: m */
    private ExecutorService f5240m = C1685x.m34458a();

    /* renamed from: q */
    private final List<C8611c> f5244q = C1906g.m33620c().m33618e();

    /* renamed from: h */
    private List<C8611c> f5235h = C1906g.m33620c().m33623a();

    public C1901d(Context context, C8500c c8500c) {
        this.f5242o = context;
        this.f5233f = c8500c;
        m33657a(context);
        m33638f();
    }

    /* renamed from: a */
    private void m33657a(Context context) {
        try {
            File file = new File(C3103au.m29187o(context));
            if (!file.exists()) {
                return;
            }
            this.f5232e = SQLiteDatabase.openDatabase(file.getPath(), null, 0);
        } catch (Exception e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m33653a(LatLng latLng, int i, CircleOptions circleOptions) {
        if (!this.f5229b.contains(latLng)) {
            this.f5229b.add(latLng);
            C8611c m11581a = this.f5233f.m11581a(circleOptions.m11413a(latLng).m11416a(i));
            if (this.f5234g.contains(m11581a)) {
                return;
            }
            this.f5234g.add(m11581a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m33651a(List<C8611c> list, List<LatLng> list2) {
        C1894b m33702a = C1894b.m33702a();
        if (list.size() > 5) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= list.size() - 5) {
                    return;
                }
                C8611c c8611c = list.get(i2);
                if (list2.contains(c8611c.m11069c()) && !m33702a.m33699b(c8611c.m11069c())) {
                    list2.remove(c8611c.m11069c());
                    c8611c.m11079a();
                    list.remove(i2);
                }
                i = i2 + 1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m33647b(LatLng latLng, int i, CircleOptions circleOptions) {
        if (!this.f5230c.contains(latLng)) {
            this.f5230c.add(latLng);
            C8611c m11581a = this.f5233f.m11581a(circleOptions.m11413a(latLng).m11416a(i));
            if (this.f5244q.contains(m11581a)) {
                return;
            }
            this.f5244q.add(m11581a);
        }
    }

    /* renamed from: c */
    private void m33644c(LatLng latLng, int i, CircleOptions circleOptions) {
        if (!this.f5231d.contains(latLng)) {
            this.f5231d.add(latLng);
            C8611c m11581a = this.f5233f.m11581a(circleOptions.m11413a(latLng).m11416a(i));
            if (this.f5235h.contains(m11581a)) {
                return;
            }
            this.f5235h.add(m11581a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m33643d() {
        ArrayList arrayList = new ArrayList();
        for (C8611c c8611c : this.f5234g) {
            if (!C1894b.m33702a().m33699b(c8611c.m11069c())) {
                arrayList.add(c8611c);
                c8611c.m11079a();
            }
        }
        this.f5234g.removeAll(arrayList);
        for (C8611c c8611c2 : this.f5244q) {
            c8611c2.m11079a();
        }
        for (C8611c c8611c3 : this.f5235h) {
            c8611c3.m11079a();
        }
        this.f5229b.clear();
        this.f5244q.clear();
        this.f5230c.clear();
        this.f5235h.clear();
        this.f5231d.clear();
        this.f5231d.clear();
    }

    /* renamed from: d */
    private void m33641d(LatLng latLng, int i, CircleOptions circleOptions) {
    }

    /* renamed from: e */
    private void m33640e() {
        for (C8611c c8611c : this.f5234g) {
            c8611c.m11079a();
        }
        for (C8611c c8611c2 : this.f5244q) {
            c8611c2.m11079a();
        }
        for (C8611c c8611c3 : this.f5235h) {
            c8611c3.m11079a();
        }
        this.f5229b.clear();
        this.f5244q.clear();
        this.f5230c.clear();
        this.f5235h.clear();
        this.f5231d.clear();
        this.f5231d.clear();
    }

    /* renamed from: f */
    private void m33638f() {
        this.f5236i = C1905f.m33624a(8000, Color.argb(99, 255, 79, 0), Color.argb(26, 255, 36, 0), 0.0f, 100);
        this.f5237j = C1905f.m33624a(8000, Color.argb(99, 255, 79, 0), Color.argb(26, 255, 36, 0), 0.0f, 100);
        this.f5238k = C1905f.m33624a(8000, Color.argb(99, (int) AbstractC10866e.f34825D, (int) Opcodes.FNEG, 0), Color.argb(26, 255, 138, 0), 0.0f, 100);
        this.f5239l = C1905f.m33624a(8000, Color.argb(99, (int) AbstractC10866e.f34825D, (int) Opcodes.FNEG, 0), Color.argb(26, 255, 138, 0), 0.0f, 100);
    }

    /* renamed from: a */
    public void m33658a() {
        if (this.f5228a.hasMessages(100)) {
            this.f5228a.removeMessages(100);
        }
        this.f5228a.sendEmptyMessageDelayed(100, 1500L);
    }

    /* renamed from: a */
    public void m33652a(List<DynamicDYZ_Entity> list) {
        this.f5241n = list;
    }

    /* renamed from: b */
    public void m33650b() {
        if (this.f5232e == null || !this.f5232e.isOpen()) {
            return;
        }
        this.f5232e.close();
    }

    /* renamed from: c */
    public void m33646c() {
        m33640e();
        this.f5228a.sendEmptyMessageDelayed(200, 1000L);
    }
}
