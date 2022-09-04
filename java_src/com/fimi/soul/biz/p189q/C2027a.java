package com.fimi.soul.biz.p189q;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import java.util.HashMap;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.biz.q.a */
/* loaded from: classes.dex */
public class C2027a extends AbstractC2195b {

    /* renamed from: a */
    public static final int f5699a = 194;

    /* renamed from: c */
    private static C2196c f5700c;

    /* renamed from: d */
    private byte f5701d;

    /* renamed from: e */
    private byte f5702e;

    /* renamed from: f */
    private byte f5703f;

    /* renamed from: g */
    private byte f5704g;

    /* renamed from: h */
    private byte f5705h;

    /* renamed from: i */
    private String f5706i;

    /* renamed from: j */
    private HashMap<Integer, String> f5707j = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.biz.q.a$a */
    /* loaded from: classes.dex */
    public static class C2028a {

        /* renamed from: a */
        private static final C2027a f5708a = new C2027a();

        private C2028a() {
        }
    }

    /* renamed from: a */
    public static C2027a m33210a() {
        return C2028a.f5708a;
    }

    /* renamed from: b */
    public static void m33203b(C2196c c2196c) {
        f5700c = c2196c;
    }

    /* renamed from: c */
    public static void m33199c(C2196c c2196c) {
        f5700c = c2196c;
    }

    /* renamed from: d */
    public static C2196c m33198d() {
        return f5700c;
    }

    /* renamed from: a */
    public String m33206a(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i += 2) {
            int parseInt = Integer.parseInt(str.substring(i, i + 2), 16);
            sb.append((char) parseInt);
            sb2.append(parseInt);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m33209a(byte b) {
        this.f5705h = b;
    }

    /* renamed from: a */
    public void m33207a(C2196c c2196c) {
        this.f6910b = c2196c.f6913c;
        m33203b(c2196c);
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f5701d = c2197d.m32739d();
        this.f5702e = c2197d.m32739d();
        this.f5703f = c2197d.m32739d();
        this.f5704g = c2197d.m32739d();
        this.f5705h = c2197d.m32739d();
        try {
            StringBuilder sb = new StringBuilder();
            byte[] m32755f = f5700c.m32755f();
            for (int i = 0; i < m32755f.length; i++) {
                sb.append(Character.forDigit((m32755f[i] & 240) >> 4, 16));
                sb.append(Character.forDigit(m32755f[i] & 15, 16));
            }
            this.f5706i = m33206a(sb.toString().substring(16, sb.toString().length() - 4));
            this.f5707j.put(Integer.valueOf(this.f5702e), this.f5706i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public boolean m33208a(int i) {
        return this.f5707j.containsKey(Integer.valueOf(i));
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        return null;
    }

    /* renamed from: b */
    public String m33204b(int i) {
        return this.f5707j.containsKey(Integer.valueOf(i)) ? this.f5707j.get(Integer.valueOf(i)) : " ";
    }

    /* renamed from: b */
    public void m33205b(byte b) {
        this.f5704g = b;
    }

    /* renamed from: b */
    public void m33202b(String str) {
        this.f5706i = str;
    }

    /* renamed from: c */
    public C2196c m33201c() {
        return f5700c;
    }

    /* renamed from: c */
    public void m33200c(byte b) {
        this.f5703f = b;
    }

    /* renamed from: d */
    public void m33197d(byte b) {
        this.f5702e = b;
    }

    /* renamed from: e */
    public String m33196e() {
        return this.f5706i;
    }

    /* renamed from: e */
    public void m33195e(byte b) {
        this.f5701d = b;
    }

    /* renamed from: f */
    public byte m33194f() {
        return this.f5705h;
    }

    /* renamed from: g */
    public byte m33193g() {
        return this.f5704g;
    }

    /* renamed from: h */
    public byte m33192h() {
        return this.f5703f;
    }

    /* renamed from: i */
    public byte m33191i() {
        return this.f5702e;
    }

    /* renamed from: j */
    public byte m33190j() {
        return this.f5701d;
    }

    /* renamed from: k */
    public HashMap<Integer, String> m33189k() {
        return this.f5707j;
    }

    /* renamed from: l */
    public void m33188l() {
        this.f5707j.clear();
    }

    public String toString() {
        return "ParseC2BackOrder{Packet_sequence=" + ((int) this.f5701d) + ", type=" + ((int) this.f5702e) + ", model=" + ((int) this.f5703f) + ", reserved=" + ((int) this.f5704g) + ", cmdId=" + ((int) this.f5705h) + ", versionDiscription='" + this.f5706i + C0494h.f738z + C0494h.f735w;
    }
}
