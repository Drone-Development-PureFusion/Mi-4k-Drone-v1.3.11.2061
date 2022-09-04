package cn.sharesdk.framework.p076b.p078b;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Base64;
import cn.sharesdk.framework.utils.C0831d;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.Hashon;
import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: cn.sharesdk.framework.b.b.f */
/* loaded from: classes.dex */
public class C0808f extends AbstractC0805c {

    /* renamed from: p */
    private static int f1573p;

    /* renamed from: q */
    private static long f1574q;

    /* renamed from: a */
    public int f1575a;

    /* renamed from: b */
    public String f1576b;

    /* renamed from: c */
    public String f1577c;

    /* renamed from: d */
    public C0809a f1578d = new C0809a();

    /* renamed from: n */
    public String f1579n;

    /* renamed from: o */
    public String[] f1580o;

    /* renamed from: cn.sharesdk.framework.b.b.f$a */
    /* loaded from: classes.dex */
    public static class C0809a {

        /* renamed from: b */
        public String f1582b;

        /* renamed from: g */
        public HashMap<String, Object> f1587g;

        /* renamed from: a */
        public String f1581a = "";

        /* renamed from: c */
        public ArrayList<String> f1583c = new ArrayList<>();

        /* renamed from: d */
        public ArrayList<String> f1584d = new ArrayList<>();

        /* renamed from: e */
        public ArrayList<String> f1585e = new ArrayList<>();

        /* renamed from: f */
        public ArrayList<Bitmap> f1586f = new ArrayList<>();

        public String toString() {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(this.f1582b)) {
                this.f1582b = this.f1582b.trim().replaceAll("\r", "");
                this.f1582b = this.f1582b.trim().replaceAll("\n", "");
                this.f1582b = this.f1582b.trim().replaceAll("\r\n", "");
            }
            hashMap.put("text", this.f1582b);
            hashMap.put("url", this.f1583c);
            if (this.f1584d != null && this.f1584d.size() > 0) {
                hashMap.put("imgs", this.f1584d);
            }
            if (this.f1587g != null) {
                hashMap.put("attch", new Hashon().fromHashMap(this.f1587g));
            }
            return new Hashon().fromHashMap(hashMap);
        }
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: a */
    protected String mo37912a() {
        return "[SHR]";
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: a */
    protected void mo37911a(long j) {
        f1574q = j;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: b */
    protected int mo37909b() {
        return 5000;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: c */
    protected int mo37907c() {
        return 30;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: d */
    protected long mo37906d() {
        return f1573p;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: e */
    protected long mo37905e() {
        return f1574q;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: f */
    protected void mo37904f() {
        f1573p++;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append('|').append(this.f1575a);
        sb.append('|').append(this.f1576b);
        sb.append('|').append(TextUtils.isEmpty(this.f1577c) ? "" : this.f1577c);
        String str = "";
        if (this.f1580o != null && this.f1580o.length > 0) {
            str = "[\"" + TextUtils.join("\",\"", this.f1580o) + "\"]";
        }
        sb.append('|').append(str);
        sb.append('|');
        if (this.f1578d != null) {
            try {
                String encodeToString = Base64.encodeToString(Data.AES128Encode(this.f1557f.substring(0, 16), this.f1578d.toString()), 0);
                if (encodeToString.contains("\n")) {
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
        if (!TextUtils.isEmpty(this.f1579n)) {
            try {
                String encodeToString2 = Base64.encodeToString(Data.AES128Encode(this.f1557f.substring(0, 16), this.f1579n), 0);
                if (!TextUtils.isEmpty(encodeToString2) && encodeToString2.contains("\n")) {
                    encodeToString2 = encodeToString2.replace("\n", "");
                }
                sb.append(encodeToString2);
            } catch (Throwable th2) {
                C0831d.m37772a().m6187w(th2);
            }
        }
        return sb.toString();
    }
}
