package com.xiaomi.network;

import java.net.InetSocketAddress;
/* loaded from: classes2.dex */
public final class Host {

    /* renamed from: a */
    private String f32741a;

    /* renamed from: b */
    private int f32742b;

    public Host(String str, int i) {
        this.f32741a = str;
        this.f32742b = i;
    }

    /* renamed from: a */
    public static Host m4755a(String str, int i) {
        int lastIndexOf = str.lastIndexOf(":");
        if (lastIndexOf != -1) {
            String substring = str.substring(0, lastIndexOf);
            try {
                int parseInt = Integer.parseInt(str.substring(lastIndexOf + 1));
                if (parseInt > 0) {
                    i = parseInt;
                }
                str = substring;
            } catch (NumberFormatException e) {
                str = substring;
            }
        }
        return new Host(str, i);
    }

    /* renamed from: b */
    public static InetSocketAddress m4753b(String str, int i) {
        Host m4755a = m4755a(str, i);
        return new InetSocketAddress(m4755a.m4754b(), m4755a.m4756a());
    }

    /* renamed from: a */
    public int m4756a() {
        return this.f32742b;
    }

    /* renamed from: b */
    public String m4754b() {
        return this.f32741a;
    }

    public String toString() {
        return this.f32742b > 0 ? this.f32741a + ":" + this.f32742b : this.f32741a;
    }
}
