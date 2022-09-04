package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
/* renamed from: com.android.volley.toolbox.d */
/* loaded from: classes.dex */
public class C0936d {

    /* renamed from: a */
    protected static final Comparator<byte[]> f2089a = new Comparator<byte[]>() { // from class: com.android.volley.toolbox.d.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };

    /* renamed from: b */
    private List<byte[]> f2090b = new LinkedList();

    /* renamed from: c */
    private List<byte[]> f2091c = new ArrayList(64);

    /* renamed from: d */
    private int f2092d = 0;

    /* renamed from: e */
    private final int f2093e;

    public C0936d(int i) {
        this.f2093e = i;
    }

    /* renamed from: a */
    private synchronized void m37360a() {
        while (this.f2092d > this.f2093e) {
            byte[] remove = this.f2090b.remove(0);
            this.f2091c.remove(remove);
            this.f2092d -= remove.length;
        }
    }

    /* renamed from: a */
    public synchronized void m37358a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f2093e) {
                this.f2090b.add(bArr);
                int binarySearch = Collections.binarySearch(this.f2091c, bArr, f2089a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f2091c.add(binarySearch, bArr);
                this.f2092d += bArr.length;
                m37360a();
            }
        }
    }

    /* renamed from: a */
    public synchronized byte[] m37359a(int i) {
        byte[] bArr;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f2091c.size()) {
                bArr = new byte[i];
                break;
            }
            bArr = this.f2091c.get(i3);
            if (bArr.length >= i) {
                this.f2092d -= bArr.length;
                this.f2091c.remove(i3);
                this.f2090b.remove(bArr);
                break;
            }
            i2 = i3 + 1;
        }
        return bArr;
    }
}
