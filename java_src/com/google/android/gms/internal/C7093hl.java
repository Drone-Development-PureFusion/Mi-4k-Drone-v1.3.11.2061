package com.google.android.gms.internal;

import com.google.android.gms.internal.C7122hv;
import com.tencent.stat.DeviceInfo;
import java.util.HashMap;
import java.util.Map;
import org.p286a.p287a.C11086e;
import p005b.p006a.p007a.p029b.p052m.p053a.C0612f;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.hl */
/* loaded from: classes2.dex */
public class C7093hl implements C7122hv.AbstractC7125a {

    /* renamed from: a */
    private static long f23895a = 0;

    /* renamed from: b */
    private C7101hp f23896b;

    /* renamed from: c */
    private C7122hv f23897c;

    /* renamed from: d */
    private AbstractC7094a f23898d;

    /* renamed from: e */
    private EnumC7096c f23899e = EnumC7096c.REALTIME_CONNECTING;

    /* renamed from: f */
    private final C7315ks f23900f;

    /* renamed from: com.google.android.gms.internal.hl$a */
    /* loaded from: classes2.dex */
    public interface AbstractC7094a {
        /* renamed from: a */
        void mo15568a(long j, String str);

        /* renamed from: a */
        void mo15567a(EnumC7095b enumC7095b);

        /* renamed from: a */
        void mo15556a(String str);

        /* renamed from: a */
        void mo15546a(Map<String, Object> map);

        /* renamed from: b */
        void mo15541b(String str);
    }

    /* renamed from: com.google.android.gms.internal.hl$b */
    /* loaded from: classes2.dex */
    public enum EnumC7095b {
        SERVER_RESET,
        OTHER
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.hl$c */
    /* loaded from: classes2.dex */
    public enum EnumC7096c {
        REALTIME_CONNECTING,
        REALTIME_CONNECTED,
        REALTIME_DISCONNECTED
    }

    public C7093hl(C7099hn c7099hn, C7101hp c7101hp, String str, AbstractC7094a abstractC7094a, String str2) {
        long j = f23895a;
        f23895a = 1 + j;
        this.f23896b = c7101hp;
        this.f23898d = abstractC7094a;
        this.f23900f = new C7315ks(c7099hn.m15584a(), C11086e.f35717j, new StringBuilder(25).append("conn_").append(j).toString());
        this.f23897c = new C7122hv(c7099hn, c7101hp, str, this, str2);
    }

    /* renamed from: a */
    private void m15594a(long j, String str) {
        if (this.f23900f.m14844a()) {
            this.f23900f.m14840a("realtime connection established", new Object[0]);
        }
        this.f23899e = EnumC7096c.REALTIME_CONNECTED;
        this.f23898d.mo15568a(j, str);
    }

    /* renamed from: a */
    private void m15592a(String str) {
        if (this.f23900f.m14844a()) {
            this.f23900f.m14840a("Connection shutdown command received. Shutting down...", new Object[0]);
        }
        this.f23898d.mo15541b(str);
        m15590b();
    }

    /* renamed from: b */
    private void m15589b(String str) {
        if (this.f23900f.m14844a()) {
            C7315ks c7315ks = this.f23900f;
            String valueOf = String.valueOf(this.f23896b.m15573a());
            c7315ks.m14840a(new StringBuilder(String.valueOf(valueOf).length() + 62 + String.valueOf(str).length()).append("Got a reset; killing connection to ").append(valueOf).append("; Updating internalHost to ").append(str).toString(), new Object[0]);
        }
        this.f23898d.mo15556a(str);
        m15593a(EnumC7095b.SERVER_RESET);
    }

    /* renamed from: b */
    private void m15588b(Map<String, Object> map) {
        if (this.f23900f.m14844a()) {
            C7315ks c7315ks = this.f23900f;
            String valueOf = String.valueOf(map.toString());
            c7315ks.m14840a(valueOf.length() != 0 ? "received data message: ".concat(valueOf) : new String("received data message: "), new Object[0]);
        }
        this.f23898d.mo15546a(map);
    }

    /* renamed from: b */
    private void m15587b(Map<String, Object> map, boolean z) {
        if (this.f23899e != EnumC7096c.REALTIME_CONNECTED) {
            this.f23900f.m14840a("Tried to send on an unconnected connection", new Object[0]);
            return;
        }
        if (z) {
            this.f23900f.m14840a("Sending data (contents hidden)", new Object[0]);
        } else {
            this.f23900f.m14840a("Sending data: %s", map);
        }
        this.f23897c.m15477a(map);
    }

    /* renamed from: c */
    private void m15586c(Map<String, Object> map) {
        if (this.f23900f.m14844a()) {
            C7315ks c7315ks = this.f23900f;
            String valueOf = String.valueOf(map.toString());
            c7315ks.m14840a(valueOf.length() != 0 ? "Got control message: ".concat(valueOf) : new String("Got control message: "), new Object[0]);
        }
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (this.f23900f.m14844a()) {
                    C7315ks c7315ks2 = this.f23900f;
                    String valueOf2 = String.valueOf(map.toString());
                    c7315ks2.m14840a(valueOf2.length() != 0 ? "Got invalid control message: ".concat(valueOf2) : new String("Got invalid control message: "), new Object[0]);
                }
                m15590b();
            } else if (str.equals("s")) {
                m15592a((String) map.get(C0612f.f1063a));
            } else if (str.equals("r")) {
                m15589b((String) map.get(C0612f.f1063a));
            } else if (str.equals("h")) {
                m15585d((Map) map.get(C0612f.f1063a));
            } else if (!this.f23900f.m14844a()) {
            } else {
                C7315ks c7315ks3 = this.f23900f;
                String valueOf3 = String.valueOf(str);
                c7315ks3.m14840a(valueOf3.length() != 0 ? "Ignoring unknown control message: ".concat(valueOf3) : new String("Ignoring unknown control message: "), new Object[0]);
            }
        } catch (ClassCastException e) {
            if (this.f23900f.m14844a()) {
                C7315ks c7315ks4 = this.f23900f;
                String valueOf4 = String.valueOf(e.toString());
                c7315ks4.m14840a(valueOf4.length() != 0 ? "Failed to parse control message: ".concat(valueOf4) : new String("Failed to parse control message: "), new Object[0]);
            }
            m15590b();
        }
    }

    /* renamed from: d */
    private void m15585d(Map<String, Object> map) {
        long longValue = ((Long) map.get(DeviceInfo.TAG_TIMESTAMPS)).longValue();
        this.f23898d.mo15556a((String) map.get("h"));
        String str = (String) map.get("s");
        if (this.f23899e == EnumC7096c.REALTIME_CONNECTING) {
            this.f23897c.m15476b();
            m15594a(longValue, str);
        }
    }

    /* renamed from: a */
    public void m15595a() {
        if (this.f23900f.m14844a()) {
            this.f23900f.m14840a("Opening a connection", new Object[0]);
        }
        this.f23897c.m15485a();
    }

    /* renamed from: a */
    public void m15593a(EnumC7095b enumC7095b) {
        if (this.f23899e != EnumC7096c.REALTIME_DISCONNECTED) {
            if (this.f23900f.m14844a()) {
                this.f23900f.m14840a("closing realtime connection", new Object[0]);
            }
            this.f23899e = EnumC7096c.REALTIME_DISCONNECTED;
            if (this.f23897c != null) {
                this.f23897c.m15473c();
                this.f23897c = null;
            }
            this.f23898d.mo15567a(enumC7095b);
        }
    }

    @Override // com.google.android.gms.internal.C7122hv.AbstractC7125a
    /* renamed from: a */
    public void mo15460a(Map<String, Object> map) {
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (this.f23900f.m14844a()) {
                    C7315ks c7315ks = this.f23900f;
                    String valueOf = String.valueOf(map.toString());
                    c7315ks.m14840a(valueOf.length() != 0 ? "Failed to parse server message: missing message type:".concat(valueOf) : new String("Failed to parse server message: missing message type:"), new Object[0]);
                }
                m15590b();
            } else if (str.equals(C0612f.f1063a)) {
                m15588b((Map) map.get(C0612f.f1063a));
            } else if (str.equals("c")) {
                m15586c((Map) map.get(C0612f.f1063a));
            } else if (!this.f23900f.m14844a()) {
            } else {
                C7315ks c7315ks2 = this.f23900f;
                String valueOf2 = String.valueOf(str);
                c7315ks2.m14840a(valueOf2.length() != 0 ? "Ignoring unknown server message type: ".concat(valueOf2) : new String("Ignoring unknown server message type: "), new Object[0]);
            }
        } catch (ClassCastException e) {
            if (this.f23900f.m14844a()) {
                C7315ks c7315ks3 = this.f23900f;
                String valueOf3 = String.valueOf(e.toString());
                c7315ks3.m14840a(valueOf3.length() != 0 ? "Failed to parse server message: ".concat(valueOf3) : new String("Failed to parse server message: "), new Object[0]);
            }
            m15590b();
        }
    }

    /* renamed from: a */
    public void m15591a(Map<String, Object> map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("t", C0612f.f1063a);
        hashMap.put(C0612f.f1063a, map);
        m15587b(hashMap, z);
    }

    @Override // com.google.android.gms.internal.C7122hv.AbstractC7125a
    /* renamed from: a */
    public void mo15459a(boolean z) {
        this.f23897c = null;
        if (z || this.f23899e != EnumC7096c.REALTIME_CONNECTING) {
            if (this.f23900f.m14844a()) {
                this.f23900f.m14840a("Realtime connection lost", new Object[0]);
            }
        } else if (this.f23900f.m14844a()) {
            this.f23900f.m14840a("Realtime connection failed", new Object[0]);
        }
        m15590b();
    }

    /* renamed from: b */
    public void m15590b() {
        m15593a(EnumC7095b.OTHER);
    }
}
