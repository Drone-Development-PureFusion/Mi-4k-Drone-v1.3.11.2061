package com.tencent.map.p262b;

import android.net.wifi.ScanResult;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.firebase.p251a.C9654a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.tencent.map.b.c */
/* loaded from: classes2.dex */
public final class C10160c {

    /* renamed from: a */
    private static C10160c f31369a;

    /* renamed from: b */
    private long f31370b = 0;

    /* renamed from: c */
    private List<C10161a> f31371c = new ArrayList();

    /* renamed from: d */
    private List<C10162b> f31372d = new ArrayList();

    /* renamed from: e */
    private String f31373e;

    /* renamed from: com.tencent.map.b.c$a */
    /* loaded from: classes2.dex */
    static class C10161a {

        /* renamed from: a */
        public int f31374a;

        /* renamed from: b */
        public int f31375b;

        /* renamed from: c */
        public int f31376c;

        /* renamed from: d */
        public int f31377d;

        private C10161a() {
            this.f31374a = -1;
            this.f31375b = -1;
            this.f31376c = -1;
            this.f31377d = -1;
        }

        /* synthetic */ C10161a(byte b) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.map.b.c$b */
    /* loaded from: classes2.dex */
    public static class C10162b {

        /* renamed from: a */
        public String f31378a;

        private C10162b() {
            this.f31378a = null;
        }

        /* synthetic */ C10162b(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static C10160c m6032a() {
        if (f31369a == null) {
            f31369a = new C10160c();
        }
        return f31369a;
    }

    /* renamed from: a */
    private static boolean m6029a(StringBuffer stringBuffer) {
        try {
            return new JSONObject(stringBuffer.toString()).getJSONObject(C9654a.C9656b.f30231p).getDouble("accuracy") < 5000.0d;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m6028a(List<ScanResult> list) {
        int i;
        if (list == null) {
            return false;
        }
        if (this.f31372d != null) {
            i = 0;
            for (int i2 = 0; i2 < this.f31372d.size(); i2++) {
                String str = this.f31372d.get(i2).f31378a;
                int i3 = 0;
                while (true) {
                    if (str != null && i3 < list.size()) {
                        if (str.equals(list.get(i3).BSSID)) {
                            i++;
                            break;
                        }
                        i3++;
                    }
                }
            }
        } else {
            i = 0;
        }
        int size = list.size();
        if (size >= 6 && i >= (size / 2) + 1) {
            return true;
        }
        if (size < 6 && i >= 2) {
            return true;
        }
        return this.f31372d.size() <= 2 && list.size() <= 2 && Math.abs(System.currentTimeMillis() - this.f31370b) <= NotificationOptions.f16268b;
    }

    /* renamed from: a */
    public final void m6031a(int i, int i2, int i3, int i4, List<ScanResult> list) {
        this.f31370b = System.currentTimeMillis();
        this.f31373e = null;
        this.f31371c.clear();
        C10161a c10161a = new C10161a((byte) 0);
        c10161a.f31374a = i;
        c10161a.f31375b = i2;
        c10161a.f31376c = i3;
        c10161a.f31377d = i4;
        this.f31371c.add(c10161a);
        if (list != null) {
            this.f31372d.clear();
            for (int i5 = 0; i5 < list.size(); i5++) {
                C10162b c10162b = new C10162b((byte) 0);
                c10162b.f31378a = list.get(i5).BSSID;
                int i6 = list.get(i5).level;
                this.f31372d.add(c10162b);
            }
        }
    }

    /* renamed from: a */
    public final void m6030a(String str) {
        this.f31373e = str;
    }

    /* renamed from: b */
    public final String m6026b(int i, int i2, int i3, int i4, List<ScanResult> list) {
        if (this.f31373e == null || this.f31373e.length() < 10) {
            return null;
        }
        String str = this.f31373e;
        if (str == null || list == null) {
            str = null;
        } else {
            long abs = Math.abs(System.currentTimeMillis() - this.f31370b);
            if ((abs > NotificationOptions.f16268b && list.size() > 2) || ((abs > 45000 && list.size() <= 2) || !m6029a(new StringBuffer(str)))) {
                str = null;
            }
        }
        this.f31373e = str;
        if (this.f31373e == null) {
            return null;
        }
        if (this.f31371c != null && this.f31371c.size() > 0) {
            C10161a c10161a = this.f31371c.get(0);
            if (c10161a.f31374a != i || c10161a.f31375b != i2 || c10161a.f31376c != i3 || c10161a.f31377d != i4) {
                return null;
            }
            if ((this.f31372d == null || this.f31372d.size() == 0) && (list == null || list.size() == 0)) {
                return this.f31373e;
            }
            if (m6028a(list)) {
                return this.f31373e;
            }
        }
        if (!m6028a(list)) {
            return null;
        }
        return this.f31373e;
    }

    /* renamed from: b */
    public final void m6027b() {
        this.f31373e = null;
    }
}
