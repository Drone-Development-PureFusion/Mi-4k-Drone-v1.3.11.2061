package com.fimi.soul.module.droneTrack.p216a;

import com.fimi.soul.biz.p177e.C1839c;
import com.fimi.soul.module.droneTrack.AbstractC2686f;
import com.fimi.soul.module.droneTrack.C2683c;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.soul.module.droneTrack.a.c */
/* loaded from: classes.dex */
public class C2673c {

    /* renamed from: b */
    private static final String f9125b = C1839c.m33944a().m33943b();

    /* renamed from: a */
    List<List<String>> f9126a;

    /* renamed from: c */
    private C2676d f9127c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.module.droneTrack.a.c$a */
    /* loaded from: classes.dex */
    public static class C2675a {

        /* renamed from: a */
        private static C2673c f9131a = new C2673c();

        private C2675a() {
        }
    }

    /* renamed from: a */
    public static C2673c m30681a() {
        return C2675a.f9131a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m30676a(String[] strArr, int i) {
        if (this.f9126a == null) {
            this.f9126a = new ArrayList();
        } else {
            this.f9126a.clear();
        }
        int length = strArr.length % i == 0 ? strArr.length / i : strArr.length / i;
        for (int i2 = 0; i2 < length; i2++) {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (int i4 = i2 * i; i3 < i && i4 < strArr.length; i4++) {
                arrayList.add(strArr[i4]);
                i3++;
            }
            this.f9126a.add(arrayList);
        }
    }

    /* renamed from: a */
    public void m30677a(final String str, final AbstractC2686f abstractC2686f) {
        C2683c.m30634b(new Runnable() { // from class: com.fimi.soul.module.droneTrack.a.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (str != null) {
                    File file = new File(str);
                    if (!file.exists()) {
                        return;
                    }
                    try {
                        byte[] bArr = new byte[(int) file.length()];
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                        randomAccessFile.read(bArr);
                        String[] split = new String(bArr).split("\n");
                        randomAccessFile.close();
                        C2673c.this.m30675b();
                        int length = split.length;
                        C2673c.this.m30676a(split, split.length / 4);
                        if (C2673c.this.f9126a == null || C2673c.this.f9126a.size() < 4) {
                            return;
                        }
                        C2673c.this.f9127c = new C2676d();
                        C2673c.this.f9127c.m30669a(abstractC2686f);
                        C2673c.this.f9127c.m30663d().m30654a(C2673c.this.f9126a.get(0));
                        C2673c.this.f9127c.m30665c().m30654a(C2673c.this.f9126a.get(1));
                        C2673c.this.f9127c.m30667b().m30654a(C2673c.this.f9126a.get(2));
                        C2673c.this.f9127c.m30672a().m30654a(C2673c.this.f9126a.get(3));
                        C2673c.this.f9127c.m30661e();
                    } catch (Exception e) {
                        if (abstractC2686f == null) {
                            return;
                        }
                        abstractC2686f.mo30630a(e.toString());
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public void m30675b() {
        C2672b.m30703a().m30691d();
        m30674c();
        if (this.f9127c != null) {
            this.f9127c.m30669a((AbstractC2686f) null);
            this.f9127c = null;
        }
        if (this.f9126a != null) {
            this.f9126a = null;
        }
    }

    /* renamed from: c */
    public void m30674c() {
        if (this.f9127c != null) {
            this.f9127c.m30659f();
        }
    }
}
