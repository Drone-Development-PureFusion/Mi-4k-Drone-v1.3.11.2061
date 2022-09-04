package com.xiaomi.smack.packet;

import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.smack.util.C10749d;
/* renamed from: com.xiaomi.smack.packet.c */
/* loaded from: classes.dex */
public class C10734c extends AbstractC10735d {

    /* renamed from: c */
    private String f33467c;

    /* renamed from: d */
    private String f33468d;

    /* renamed from: e */
    private String f33469e;

    /* renamed from: f */
    private String f33470f;

    /* renamed from: g */
    private String f33471g;

    /* renamed from: h */
    private String f33472h;

    /* renamed from: i */
    private boolean f33473i;

    /* renamed from: j */
    private String f33474j;

    /* renamed from: k */
    private String f33475k;

    /* renamed from: l */
    private String f33476l;

    /* renamed from: m */
    private String f33477m;

    /* renamed from: n */
    private String f33478n;

    /* renamed from: o */
    private boolean f33479o;

    public C10734c() {
        this.f33467c = null;
        this.f33468d = null;
        this.f33473i = false;
        this.f33475k = "";
        this.f33476l = "";
        this.f33477m = "";
        this.f33478n = "";
        this.f33479o = false;
    }

    public C10734c(Bundle bundle) {
        super(bundle);
        this.f33467c = null;
        this.f33468d = null;
        this.f33473i = false;
        this.f33475k = "";
        this.f33476l = "";
        this.f33477m = "";
        this.f33478n = "";
        this.f33479o = false;
        this.f33467c = bundle.getString("ext_msg_type");
        this.f33469e = bundle.getString("ext_msg_lang");
        this.f33468d = bundle.getString("ext_msg_thread");
        this.f33470f = bundle.getString("ext_msg_sub");
        this.f33471g = bundle.getString("ext_msg_body");
        this.f33472h = bundle.getString("ext_body_encode");
        this.f33474j = bundle.getString("ext_msg_appid");
        this.f33473i = bundle.getBoolean("ext_msg_trans", false);
        this.f33479o = bundle.getBoolean("ext_msg_encrypt", false);
        this.f33475k = bundle.getString("ext_msg_seq");
        this.f33476l = bundle.getString("ext_msg_mseq");
        this.f33477m = bundle.getString("ext_msg_fseq");
        this.f33478n = bundle.getString("ext_msg_status");
    }

    /* renamed from: a */
    public String m3910a() {
        return this.f33467c;
    }

    /* renamed from: a */
    public void m3909a(String str) {
        this.f33474j = str;
    }

    /* renamed from: a */
    public void m3908a(String str, String str2) {
        this.f33471g = str;
        this.f33472h = str2;
    }

    /* renamed from: a */
    public void m3907a(boolean z) {
        this.f33473i = z;
    }

    @Override // com.xiaomi.smack.packet.AbstractC10735d
    /* renamed from: b */
    public Bundle mo3863b() {
        Bundle mo3863b = super.mo3863b();
        if (!TextUtils.isEmpty(this.f33467c)) {
            mo3863b.putString("ext_msg_type", this.f33467c);
        }
        if (this.f33469e != null) {
            mo3863b.putString("ext_msg_lang", this.f33469e);
        }
        if (this.f33470f != null) {
            mo3863b.putString("ext_msg_sub", this.f33470f);
        }
        if (this.f33471g != null) {
            mo3863b.putString("ext_msg_body", this.f33471g);
        }
        if (!TextUtils.isEmpty(this.f33472h)) {
            mo3863b.putString("ext_body_encode", this.f33472h);
        }
        if (this.f33468d != null) {
            mo3863b.putString("ext_msg_thread", this.f33468d);
        }
        if (this.f33474j != null) {
            mo3863b.putString("ext_msg_appid", this.f33474j);
        }
        if (this.f33473i) {
            mo3863b.putBoolean("ext_msg_trans", true);
        }
        if (!TextUtils.isEmpty(this.f33475k)) {
            mo3863b.putString("ext_msg_seq", this.f33475k);
        }
        if (!TextUtils.isEmpty(this.f33476l)) {
            mo3863b.putString("ext_msg_mseq", this.f33476l);
        }
        if (!TextUtils.isEmpty(this.f33477m)) {
            mo3863b.putString("ext_msg_fseq", this.f33477m);
        }
        if (this.f33479o) {
            mo3863b.putBoolean("ext_msg_encrypt", true);
        }
        if (!TextUtils.isEmpty(this.f33478n)) {
            mo3863b.putString("ext_msg_status", this.f33478n);
        }
        return mo3863b;
    }

    /* renamed from: b */
    public void m3906b(String str) {
        this.f33475k = str;
    }

    /* renamed from: b */
    public void m3905b(boolean z) {
        this.f33479o = z;
    }

    @Override // com.xiaomi.smack.packet.AbstractC10735d
    /* renamed from: c */
    public String mo3862c() {
        C10741h p;
        StringBuilder sb = new StringBuilder();
        sb.append("<message");
        if (t() != null) {
            sb.append(" xmlns=\"").append(t()).append("\"");
        }
        if (this.f33469e != null) {
            sb.append(" xml:lang=\"").append(m3893i()).append("\"");
        }
        if (k() != null) {
            sb.append(" id=\"").append(k()).append("\"");
        }
        if (m() != null) {
            sb.append(" to=\"").append(C10749d.m3838a(m())).append("\"");
        }
        if (!TextUtils.isEmpty(m3901e())) {
            sb.append(" seq=\"").append(m3901e()).append("\"");
        }
        if (!TextUtils.isEmpty(m3899f())) {
            sb.append(" mseq=\"").append(m3899f()).append("\"");
        }
        if (!TextUtils.isEmpty(m3897g())) {
            sb.append(" fseq=\"").append(m3897g()).append("\"");
        }
        if (!TextUtils.isEmpty(m3895h())) {
            sb.append(" status=\"").append(m3895h()).append("\"");
        }
        if (n() != null) {
            sb.append(" from=\"").append(C10749d.m3838a(n())).append("\"");
        }
        if (l() != null) {
            sb.append(" chid=\"").append(C10749d.m3838a(l())).append("\"");
        }
        if (this.f33473i) {
            sb.append(" transient=\"true\"");
        }
        if (!TextUtils.isEmpty(this.f33474j)) {
            sb.append(" appid=\"").append(m3903d()).append("\"");
        }
        if (!TextUtils.isEmpty(this.f33467c)) {
            sb.append(" type=\"").append(this.f33467c).append("\"");
        }
        if (this.f33479o) {
            sb.append(" s=\"1\"");
        }
        sb.append(">");
        if (this.f33470f != null) {
            sb.append("<subject>").append(C10749d.m3838a(this.f33470f));
            sb.append("</subject>");
        }
        if (this.f33471g != null) {
            sb.append("<body");
            if (!TextUtils.isEmpty(this.f33472h)) {
                sb.append(" encode=\"").append(this.f33472h).append("\"");
            }
            sb.append(">").append(C10749d.m3838a(this.f33471g)).append("</body>");
        }
        if (this.f33468d != null) {
            sb.append("<thread>").append(this.f33468d).append("</thread>");
        }
        if ("error".equalsIgnoreCase(this.f33467c) && (p = p()) != null) {
            sb.append(p.m3859b());
        }
        sb.append(s());
        sb.append("</message>");
        return sb.toString();
    }

    /* renamed from: c */
    public void m3904c(String str) {
        this.f33476l = str;
    }

    /* renamed from: d */
    public String m3903d() {
        return this.f33474j;
    }

    /* renamed from: d */
    public void m3902d(String str) {
        this.f33477m = str;
    }

    /* renamed from: e */
    public String m3901e() {
        return this.f33475k;
    }

    /* renamed from: e */
    public void m3900e(String str) {
        this.f33478n = str;
    }

    @Override // com.xiaomi.smack.packet.AbstractC10735d
    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C10734c c10734c = (C10734c) obj;
        if (!super.equals(c10734c)) {
            return false;
        }
        if (this.f33471g != null) {
            if (!this.f33471g.equals(c10734c.f33471g)) {
                return false;
            }
        } else if (c10734c.f33471g != null) {
            return false;
        }
        if (this.f33469e != null) {
            if (!this.f33469e.equals(c10734c.f33469e)) {
                return false;
            }
        } else if (c10734c.f33469e != null) {
            return false;
        }
        if (this.f33470f != null) {
            if (!this.f33470f.equals(c10734c.f33470f)) {
                return false;
            }
        } else if (c10734c.f33470f != null) {
            return false;
        }
        if (this.f33468d != null) {
            if (!this.f33468d.equals(c10734c.f33468d)) {
                return false;
            }
        } else if (c10734c.f33468d != null) {
            return false;
        }
        if (this.f33467c != c10734c.f33467c) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public String m3899f() {
        return this.f33476l;
    }

    /* renamed from: f */
    public void m3898f(String str) {
        this.f33467c = str;
    }

    /* renamed from: g */
    public String m3897g() {
        return this.f33477m;
    }

    /* renamed from: g */
    public void m3896g(String str) {
        this.f33470f = str;
    }

    /* renamed from: h */
    public String m3895h() {
        return this.f33478n;
    }

    /* renamed from: h */
    public void m3894h(String str) {
        this.f33471g = str;
    }

    @Override // com.xiaomi.smack.packet.AbstractC10735d
    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f33469e != null ? this.f33469e.hashCode() : 0) + (((this.f33468d != null ? this.f33468d.hashCode() : 0) + (((this.f33471g != null ? this.f33471g.hashCode() : 0) + ((this.f33467c != null ? this.f33467c.hashCode() : 0) * 31)) * 31)) * 31)) * 31;
        if (this.f33470f != null) {
            i = this.f33470f.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public String m3893i() {
        return this.f33469e;
    }

    /* renamed from: i */
    public void m3892i(String str) {
        this.f33468d = str;
    }

    /* renamed from: j */
    public void m3891j(String str) {
        this.f33469e = str;
    }
}
