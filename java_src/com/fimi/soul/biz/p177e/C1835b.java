package com.fimi.soul.biz.p177e;

import android.text.TextUtils;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.p180h.C1849a;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.service.CameraSocketService;
import java.io.File;
import java.util.LinkedList;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
/* renamed from: com.fimi.soul.biz.e.b */
/* loaded from: classes.dex */
public class C1835b {

    /* renamed from: a */
    private final int f4987a;

    /* renamed from: b */
    private final int f4988b;

    /* renamed from: c */
    private EnumC1838b f4989c;

    /* renamed from: d */
    private final C1842d f4990d;

    /* renamed from: e */
    private boolean f4991e;

    /* renamed from: f */
    private BlockingDeque<C2196c> f4992f;

    /* renamed from: g */
    private int f4993g;

    /* renamed from: h */
    private LinkedList<C2196c> f4994h;

    /* renamed from: i */
    private volatile boolean f4995i;

    /* renamed from: j */
    private boolean f4996j;

    /* renamed from: com.fimi.soul.biz.e.b$a */
    /* loaded from: classes.dex */
    public static class C1837a {

        /* renamed from: a */
        public static final C1835b f4998a = new C1835b();
    }

    /* renamed from: com.fimi.soul.biz.e.b$b */
    /* loaded from: classes.dex */
    public enum EnumC1838b {
        Nornal,
        WriteCom,
        WritingSky,
        WritingFool
    }

    private C1835b() {
        this.f4987a = 100;
        this.f4988b = 10000;
        this.f4989c = EnumC1838b.Nornal;
        this.f4990d = C1842d.m33941a();
        this.f4992f = new LinkedBlockingDeque();
        this.f4993g = CameraSocketService.f11340b;
        this.f4994h = new LinkedList<>();
        C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.biz.e.b.1
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    if (C1835b.this.f4992f.size() > 0) {
                        C1835b.this.m33954b((C2196c) C1835b.this.f4992f.poll());
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static C1835b m33961a() {
        return C1837a.f4998a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m33954b(C2196c c2196c) {
        if (this.f4991e) {
            if (!this.f4990d.m33927j()) {
                this.f4990d.m33937b();
                m33946h();
                this.f4990d.m33932e();
                this.f4990d.m33931f();
                this.f4996j = false;
            }
            this.f4990d.m33940a(c2196c);
            m33951c(true);
            return;
        }
        if (this.f4990d.m33927j()) {
            this.f4990d.m33926k();
        }
        if (!this.f4990d.m33933d()) {
            this.f4990d.m33935c();
            this.f4996j = false;
        }
        this.f4990d.m33936b(c2196c);
        m33951c(false);
        if (this.f4994h.size() < this.f4993g) {
            this.f4994h.add(c2196c);
            return;
        }
        this.f4994h.removeFirst();
        this.f4994h.addLast(c2196c);
    }

    /* renamed from: c */
    private void m33951c(boolean z) {
        if (TextUtils.isEmpty(C1849a.m33913a().m33910b()) || this.f4996j) {
            return;
        }
        this.f4996j = true;
        File m33925l = z ? this.f4990d.m33925l() : this.f4990d.m33924m();
        if (m33925l == null) {
            return;
        }
        this.f4990d.m33939a(m33925l);
    }

    /* renamed from: h */
    private void m33946h() {
        if (this.f4994h == null || this.f4994h.size() <= 0) {
            return;
        }
        while (this.f4994h.size() > 0) {
            this.f4990d.m33940a(this.f4994h.pollFirst());
        }
        this.f4994h.clear();
    }

    /* renamed from: i */
    private void m33945i() {
        if (this.f4994h == null || this.f4994h.size() <= 0) {
            return;
        }
        while (this.f4994h.size() > 0) {
            this.f4990d.m33940a(this.f4994h.pollFirst());
        }
        this.f4990d.m33926k();
    }

    /* renamed from: a */
    public void m33960a(EnumC1838b enumC1838b) {
        this.f4989c = enumC1838b;
    }

    /* renamed from: a */
    public void m33957a(C2196c c2196c) {
        this.f4992f.add(c2196c);
    }

    /* renamed from: a */
    public void m33956a(boolean z) {
        this.f4995i = z;
    }

    /* renamed from: b */
    public void m33953b(boolean z) {
        this.f4991e = z;
    }

    /* renamed from: b */
    public boolean m33955b() {
        return this.f4990d.m33927j();
    }

    /* renamed from: c */
    public LinkedList m33952c() {
        return this.f4994h;
    }

    /* renamed from: d */
    public void m33950d() {
        this.f4994h.clear();
    }

    /* renamed from: e */
    public boolean m33949e() {
        return this.f4995i;
    }

    /* renamed from: f */
    public EnumC1838b m33948f() {
        return this.f4989c;
    }

    /* renamed from: g */
    public boolean m33947g() {
        return this.f4991e;
    }
}
