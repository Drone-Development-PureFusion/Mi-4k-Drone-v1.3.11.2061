package com.tencent.stat.p268a;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.Properties;
/* renamed from: com.tencent.stat.a.c */
/* loaded from: classes2.dex */
public class C10325c {

    /* renamed from: a */
    String f32164a;

    /* renamed from: b */
    String[] f32165b;

    /* renamed from: c */
    Properties f32166c;

    public C10325c() {
        this.f32166c = null;
    }

    public C10325c(String str, String[] strArr, Properties properties) {
        this.f32166c = null;
        this.f32164a = str;
        this.f32165b = strArr;
        this.f32166c = properties;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10325c)) {
            return false;
        }
        C10325c c10325c = (C10325c) obj;
        boolean z = this.f32164a.equals(c10325c.f32164a) && Arrays.equals(this.f32165b, c10325c.f32165b);
        return this.f32166c != null ? z && this.f32166c.equals(c10325c.f32166c) : z && c10325c.f32166c == null;
    }

    public int hashCode() {
        int i = 0;
        if (this.f32164a != null) {
            i = this.f32164a.hashCode();
        }
        if (this.f32165b != null) {
            i ^= Arrays.hashCode(this.f32165b);
        }
        return this.f32166c != null ? i ^ this.f32166c.hashCode() : i;
    }

    public String toString() {
        String str = this.f32164a;
        String str2 = "";
        if (this.f32165b != null) {
            String str3 = this.f32165b[0];
            for (int i = 1; i < this.f32165b.length; i++) {
                str3 = str3 + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f32165b[i];
            }
            str2 = "[" + str3 + "]";
        }
        if (this.f32166c != null) {
            str2 = str2 + this.f32166c.toString();
        }
        return str + str2;
    }
}
