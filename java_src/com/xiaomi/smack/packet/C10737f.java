package com.xiaomi.smack.packet;

import android.os.Bundle;
import com.xiaomi.smack.util.C10749d;
/* renamed from: com.xiaomi.smack.packet.f */
/* loaded from: classes.dex */
public class C10737f extends AbstractC10735d {

    /* renamed from: c */
    private EnumC10739b f33494c;

    /* renamed from: d */
    private String f33495d;

    /* renamed from: e */
    private int f33496e;

    /* renamed from: f */
    private EnumC10738a f33497f;

    /* renamed from: com.xiaomi.smack.packet.f$a */
    /* loaded from: classes2.dex */
    public enum EnumC10738a {
        chat,
        available,
        away,
        xa,
        dnd
    }

    /* renamed from: com.xiaomi.smack.packet.f$b */
    /* loaded from: classes2.dex */
    public enum EnumC10739b {
        available,
        unavailable,
        subscribe,
        subscribed,
        unsubscribe,
        unsubscribed,
        error,
        probe
    }

    public C10737f(Bundle bundle) {
        super(bundle);
        this.f33494c = EnumC10739b.available;
        this.f33495d = null;
        this.f33496e = Integer.MIN_VALUE;
        this.f33497f = null;
        if (bundle.containsKey("ext_pres_type")) {
            this.f33494c = EnumC10739b.valueOf(bundle.getString("ext_pres_type"));
        }
        if (bundle.containsKey("ext_pres_status")) {
            this.f33495d = bundle.getString("ext_pres_status");
        }
        if (bundle.containsKey("ext_pres_prio")) {
            this.f33496e = bundle.getInt("ext_pres_prio");
        }
        if (bundle.containsKey("ext_pres_mode")) {
            this.f33497f = EnumC10738a.valueOf(bundle.getString("ext_pres_mode"));
        }
    }

    public C10737f(EnumC10739b enumC10739b) {
        this.f33494c = EnumC10739b.available;
        this.f33495d = null;
        this.f33496e = Integer.MIN_VALUE;
        this.f33497f = null;
        m3865a(enumC10739b);
    }

    /* renamed from: a */
    public void m3867a(int i) {
        if (i < -128 || i > 128) {
            throw new IllegalArgumentException("Priority value " + i + " is not valid. Valid range is -128 through 128.");
        }
        this.f33496e = i;
    }

    /* renamed from: a */
    public void m3866a(EnumC10738a enumC10738a) {
        this.f33497f = enumC10738a;
    }

    /* renamed from: a */
    public void m3865a(EnumC10739b enumC10739b) {
        if (enumC10739b == null) {
            throw new NullPointerException("Type cannot be null");
        }
        this.f33494c = enumC10739b;
    }

    /* renamed from: a */
    public void m3864a(String str) {
        this.f33495d = str;
    }

    @Override // com.xiaomi.smack.packet.AbstractC10735d
    /* renamed from: b */
    public Bundle mo3863b() {
        Bundle mo3863b = super.mo3863b();
        if (this.f33494c != null) {
            mo3863b.putString("ext_pres_type", this.f33494c.toString());
        }
        if (this.f33495d != null) {
            mo3863b.putString("ext_pres_status", this.f33495d);
        }
        if (this.f33496e != Integer.MIN_VALUE) {
            mo3863b.putInt("ext_pres_prio", this.f33496e);
        }
        if (this.f33497f != null && this.f33497f != EnumC10738a.available) {
            mo3863b.putString("ext_pres_mode", this.f33497f.toString());
        }
        return mo3863b;
    }

    @Override // com.xiaomi.smack.packet.AbstractC10735d
    /* renamed from: c */
    public String mo3862c() {
        StringBuilder sb = new StringBuilder();
        sb.append("<presence");
        if (t() != null) {
            sb.append(" xmlns=\"").append(t()).append("\"");
        }
        if (k() != null) {
            sb.append(" id=\"").append(k()).append("\"");
        }
        if (m() != null) {
            sb.append(" to=\"").append(C10749d.m3838a(m())).append("\"");
        }
        if (n() != null) {
            sb.append(" from=\"").append(C10749d.m3838a(n())).append("\"");
        }
        if (l() != null) {
            sb.append(" chid=\"").append(C10749d.m3838a(l())).append("\"");
        }
        if (this.f33494c != null) {
            sb.append(" type=\"").append(this.f33494c).append("\"");
        }
        sb.append(">");
        if (this.f33495d != null) {
            sb.append("<status>").append(C10749d.m3838a(this.f33495d)).append("</status>");
        }
        if (this.f33496e != Integer.MIN_VALUE) {
            sb.append("<priority>").append(this.f33496e).append("</priority>");
        }
        if (this.f33497f != null && this.f33497f != EnumC10738a.available) {
            sb.append("<show>").append(this.f33497f).append("</show>");
        }
        sb.append(s());
        C10741h p = p();
        if (p != null) {
            sb.append(p.m3859b());
        }
        sb.append("</presence>");
        return sb.toString();
    }
}
