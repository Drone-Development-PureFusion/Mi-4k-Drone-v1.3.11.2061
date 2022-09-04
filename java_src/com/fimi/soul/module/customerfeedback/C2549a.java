package com.fimi.soul.module.customerfeedback;

import android.net.Uri;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.fimi.kernel.utils.C1685x;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* renamed from: com.fimi.soul.module.customerfeedback.a */
/* loaded from: classes.dex */
public class C2549a {

    /* renamed from: c */
    private static C2549a f8347c;

    /* renamed from: b */
    private int f8349b = 3;

    /* renamed from: a */
    private LinkedHashSet<Uri> f8348a = new LinkedHashSet<>();

    private C2549a() {
    }

    /* renamed from: a */
    public static C2549a m31251a() {
        if (f8347c == null) {
            synchronized (C2549a.class) {
                if (f8347c == null) {
                    f8347c = new C2549a();
                }
            }
        }
        return f8347c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m31246b(Uri uri) {
        ImagePipeline imagePipeline = Fresco.getImagePipeline();
        if (imagePipeline.isInBitmapMemoryCache(uri)) {
            imagePipeline.evictFromMemoryCache(uri);
        }
    }

    /* renamed from: c */
    private void m31245c() {
        Iterator<Uri> it2 = this.f8348a.iterator();
        while (it2.hasNext()) {
            m31246b(it2.next());
            if (this.f8348a.size() < this.f8349b) {
                return;
            }
        }
    }

    /* renamed from: a */
    public void m31250a(Uri uri) {
        this.f8348a.add(uri);
        if (this.f8348a.size() <= this.f8349b || this.f8348a.size() % this.f8349b != 0) {
            return;
        }
        m31245c();
    }

    /* renamed from: b */
    public void m31247b() {
        C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.module.customerfeedback.a.1
            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = C2549a.this.f8348a.iterator();
                while (it2.hasNext()) {
                    C2549a.this.m31246b((Uri) it2.next());
                }
            }
        });
    }
}
