package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import com.google.android.gms.internal.C7771tv;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
@aaa
/* renamed from: com.google.android.gms.internal.ts */
/* loaded from: classes.dex */
public class C7766ts {

    /* renamed from: b */
    private final int f25689b;

    /* renamed from: d */
    private final AbstractC7765tr f25691d = new C7770tu();

    /* renamed from: a */
    private final int f25688a = 6;

    /* renamed from: c */
    private final int f25690c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ts$a */
    /* loaded from: classes2.dex */
    public static class C7768a {

        /* renamed from: a */
        ByteArrayOutputStream f25693a = new ByteArrayOutputStream(4096);

        /* renamed from: b */
        Base64OutputStream f25694b = new Base64OutputStream(this.f25693a, 10);

        /* renamed from: a */
        public void m13524a(byte[] bArr) {
            this.f25694b.write(bArr);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.io.ByteArrayOutputStream, android.util.Base64OutputStream] */
        public String toString() {
            String str;
            try {
                this.f25694b.close();
            } catch (IOException e) {
                abr.b("HashManager: Unable to convert to Base64.", e);
            }
            try {
                this.f25693a.close();
                str = this.f25693a.toString();
            } catch (IOException e2) {
                abr.b("HashManager: Unable to convert to Base64.", e2);
                str = "";
            } finally {
                this.f25693a = null;
                this.f25694b = null;
            }
            return str;
        }
    }

    public C7766ts(int i) {
        this.f25689b = i;
    }

    /* renamed from: a */
    C7768a m13528a() {
        return new C7768a();
    }

    /* renamed from: a */
    String m13527a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        C7768a m13528a = m13528a();
        PriorityQueue priorityQueue = new PriorityQueue(this.f25689b, new Comparator<C7771tv.C7772a>() { // from class: com.google.android.gms.internal.ts.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(C7771tv.C7772a c7772a, C7771tv.C7772a c7772a2) {
                int i = c7772a.f25698c - c7772a2.f25698c;
                return i != 0 ? i : (int) (c7772a.f25696a - c7772a2.f25696a);
            }
        });
        for (String str2 : split) {
            String[] m13519b = C7769tt.m13519b(str2);
            if (m13519b.length != 0) {
                C7771tv.m13509a(m13519b, this.f25689b, this.f25688a, priorityQueue);
            }
        }
        Iterator it2 = priorityQueue.iterator();
        while (it2.hasNext()) {
            try {
                m13528a.m13524a(this.f25691d.mo13516a(((C7771tv.C7772a) it2.next()).f25697b));
            } catch (IOException e) {
                abr.b("Error while writing hash to byteStream", e);
            }
        }
        return m13528a.toString();
    }

    /* renamed from: a */
    public String m13526a(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            stringBuffer.append(it2.next().toLowerCase(Locale.US));
            stringBuffer.append('\n');
        }
        return m13527a(stringBuffer.toString());
    }
}
