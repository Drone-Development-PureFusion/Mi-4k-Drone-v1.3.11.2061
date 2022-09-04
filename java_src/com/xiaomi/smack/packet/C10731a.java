package com.xiaomi.smack.packet;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.smack.util.C10749d;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* renamed from: com.xiaomi.smack.packet.a */
/* loaded from: classes.dex */
public class C10731a implements AbstractC10736e {

    /* renamed from: a */
    private String f33453a;

    /* renamed from: b */
    private String f33454b;

    /* renamed from: c */
    private String[] f33455c;

    /* renamed from: d */
    private String[] f33456d;

    /* renamed from: e */
    private String f33457e;

    /* renamed from: f */
    private List<C10731a> f33458f;

    public C10731a(String str, String str2, String[] strArr, String[] strArr2) {
        this.f33455c = null;
        this.f33456d = null;
        this.f33458f = null;
        this.f33453a = str;
        this.f33454b = str2;
        this.f33455c = strArr;
        this.f33456d = strArr2;
    }

    public C10731a(String str, String str2, String[] strArr, String[] strArr2, String str3, List<C10731a> list) {
        this.f33455c = null;
        this.f33456d = null;
        this.f33458f = null;
        this.f33453a = str;
        this.f33454b = str2;
        this.f33455c = strArr;
        this.f33456d = strArr2;
        this.f33457e = str3;
        this.f33458f = list;
    }

    /* renamed from: a */
    public static C10731a m3923a(Bundle bundle) {
        ArrayList arrayList;
        String string = bundle.getString("ext_ele_name");
        String string2 = bundle.getString("ext_ns");
        String string3 = bundle.getString("ext_text");
        Bundle bundle2 = bundle.getBundle("attributes");
        Set<String> keySet = bundle2.keySet();
        String[] strArr = new String[keySet.size()];
        String[] strArr2 = new String[keySet.size()];
        int i = 0;
        for (String str : keySet) {
            strArr[i] = str;
            strArr2[i] = bundle2.getString(str);
            i++;
        }
        if (bundle.containsKey("children")) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("children");
            arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add(m3923a((Bundle) parcelable));
            }
        } else {
            arrayList = null;
        }
        return new C10731a(string, string2, strArr, strArr2, string3, arrayList);
    }

    /* renamed from: a */
    public static Parcelable[] m3921a(List<C10731a> list) {
        return m3920a((C10731a[]) list.toArray(new C10731a[list.size()]));
    }

    /* renamed from: a */
    public static Parcelable[] m3920a(C10731a[] c10731aArr) {
        if (c10731aArr == null) {
            return null;
        }
        Parcelable[] parcelableArr = new Parcelable[c10731aArr.length];
        for (int i = 0; i < c10731aArr.length; i++) {
            parcelableArr[i] = c10731aArr[i].m3915f();
        }
        return parcelableArr;
    }

    /* renamed from: a */
    public String m3924a() {
        return this.f33453a;
    }

    /* renamed from: a */
    public String m3922a(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (this.f33455c != null) {
            for (int i = 0; i < this.f33455c.length; i++) {
                if (str.equals(this.f33455c[i])) {
                    return this.f33456d[i];
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public String m3919b() {
        return this.f33454b;
    }

    /* renamed from: b */
    public void m3918b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f33457e = C10749d.m3838a(str);
        } else {
            this.f33457e = str;
        }
    }

    /* renamed from: c */
    public String m3917c() {
        return !TextUtils.isEmpty(this.f33457e) ? C10749d.m3835b(this.f33457e) : this.f33457e;
    }

    @Override // com.xiaomi.smack.packet.AbstractC10736e
    /* renamed from: d */
    public String mo3868d() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(this.f33453a);
        if (!TextUtils.isEmpty(this.f33454b)) {
            sb.append(" ").append("xmlns=").append("\"").append(this.f33454b).append("\"");
        }
        if (this.f33455c != null && this.f33455c.length > 0) {
            for (int i = 0; i < this.f33455c.length; i++) {
                if (!TextUtils.isEmpty(this.f33456d[i])) {
                    sb.append(" ").append(this.f33455c[i]).append("=\"").append(C10749d.m3838a(this.f33456d[i])).append("\"");
                }
            }
        }
        if (!TextUtils.isEmpty(this.f33457e)) {
            sb.append(">").append(this.f33457e).append("</").append(this.f33453a).append(">");
        } else if (this.f33458f == null || this.f33458f.size() <= 0) {
            sb.append("/>");
        } else {
            sb.append(">");
            for (C10731a c10731a : this.f33458f) {
                sb.append(c10731a.mo3868d());
            }
            sb.append("</").append(this.f33453a).append(">");
        }
        return sb.toString();
    }

    /* renamed from: e */
    public Bundle m3916e() {
        Bundle bundle = new Bundle();
        bundle.putString("ext_ele_name", this.f33453a);
        bundle.putString("ext_ns", this.f33454b);
        bundle.putString("ext_text", this.f33457e);
        Bundle bundle2 = new Bundle();
        if (this.f33455c != null && this.f33455c.length > 0) {
            for (int i = 0; i < this.f33455c.length; i++) {
                bundle2.putString(this.f33455c[i], this.f33456d[i]);
            }
        }
        bundle.putBundle("attributes", bundle2);
        if (this.f33458f != null && this.f33458f.size() > 0) {
            bundle.putParcelableArray("children", m3921a(this.f33458f));
        }
        return bundle;
    }

    /* renamed from: f */
    public Parcelable m3915f() {
        return m3916e();
    }

    public String toString() {
        return mo3868d();
    }
}
