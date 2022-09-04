package com.google.android.gms.internal;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
/* JADX INFO: Access modifiers changed from: package-private */
@aaa
/* renamed from: com.google.android.gms.internal.wt */
/* loaded from: classes.dex */
public class C7943wt {

    /* renamed from: a */
    final AdRequestParcel f26133a;

    /* renamed from: b */
    final String f26134b;

    /* renamed from: c */
    final int f26135c;

    C7943wt(AdRequestParcel adRequestParcel, String str, int i) {
        this.f26133a = adRequestParcel;
        this.f26134b = str;
        this.f26135c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7943wt(C7940wr c7940wr) {
        this(c7940wr.m13207a(), c7940wr.m13200c(), c7940wr.m13202b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C7943wt m13163a(String str) {
        String[] split = str.split("\u0000");
        if (split.length != 3) {
            throw new IOException("Incorrect field count for QueueSeed.");
        }
        Parcel obtain = Parcel.obtain();
        try {
            String str2 = new String(Base64.decode(split[0], 0), "UTF-8");
            int parseInt = Integer.parseInt(split[1]);
            byte[] decode = Base64.decode(split[2], 0);
            obtain.unmarshall(decode, 0, decode.length);
            obtain.setDataPosition(0);
            return new C7943wt((AdRequestParcel) AdRequestParcel.CREATOR.createFromParcel(obtain), str2, parseInt);
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m13164a() {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                String encodeToString = Base64.encodeToString(this.f26134b.getBytes("UTF-8"), 0);
                String num = Integer.toString(this.f26135c);
                this.f26133a.writeToParcel(obtain, 0);
                String encodeToString2 = Base64.encodeToString(obtain.marshall(), 0);
                String sb = new StringBuilder(String.valueOf(encodeToString).length() + 2 + String.valueOf(num).length() + String.valueOf(encodeToString2).length()).append(encodeToString).append("\u0000").append(num).append("\u0000").append(encodeToString2).toString();
                obtain.recycle();
                return sb;
            } catch (UnsupportedEncodingException e) {
                abr.b("QueueSeed encode failed because UTF-8 is not available.");
                obtain.recycle();
                return "";
            }
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
