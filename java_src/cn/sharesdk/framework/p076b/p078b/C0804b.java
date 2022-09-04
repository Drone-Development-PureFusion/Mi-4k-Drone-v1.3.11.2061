package cn.sharesdk.framework.p076b.p078b;

import android.text.TextUtils;
import android.util.Base64;
import cn.sharesdk.framework.utils.C0831d;
import com.mob.tools.utils.Data;
/* renamed from: cn.sharesdk.framework.b.b.b */
/* loaded from: classes.dex */
public class C0804b extends AbstractC0805c {

    /* renamed from: n */
    private static int f1550n;

    /* renamed from: o */
    private static long f1551o;

    /* renamed from: a */
    public int f1552a;

    /* renamed from: b */
    public String f1553b;

    /* renamed from: c */
    public String f1554c;

    /* renamed from: d */
    public String f1555d;

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: a */
    protected String mo37912a() {
        return "[AUT]";
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: a */
    protected void mo37911a(long j) {
        f1551o = j;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: b */
    protected int mo37909b() {
        return 5000;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: c */
    protected int mo37907c() {
        return 5;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: d */
    protected long mo37906d() {
        return f1550n;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: e */
    protected long mo37905e() {
        return f1551o;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: f */
    protected void mo37904f() {
        f1550n++;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append('|').append(this.f1552a);
        sb.append('|').append(this.f1553b);
        sb.append('|');
        if (!TextUtils.isEmpty(this.f1555d)) {
            try {
                String encodeToString = Base64.encodeToString(Data.AES128Encode(this.f1557f.substring(0, 16), this.f1555d), 0);
                if (!TextUtils.isEmpty(encodeToString) && encodeToString.contains("\n")) {
                    encodeToString = encodeToString.replace("\n", "");
                }
                sb.append(encodeToString);
            } catch (Throwable th) {
                C0831d.m37772a().m6199d(th);
            }
        }
        sb.append('|');
        if (!TextUtils.isEmpty(this.f1564m)) {
            sb.append(this.f1564m);
        }
        sb.append('|');
        if (!TextUtils.isEmpty(this.f1554c)) {
            sb.append(this.f1554c);
        }
        return sb.toString();
    }
}
