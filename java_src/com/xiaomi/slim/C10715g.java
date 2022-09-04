package com.xiaomi.slim;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.slim.g */
/* loaded from: classes2.dex */
public class C10715g extends Thread {

    /* renamed from: a */
    final /* synthetic */ C10714f f33397a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10715g(C10714f c10714f, String str) {
        super(str);
        this.f33397a = c10714f;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        C10711c c10711c;
        try {
            c10711c = this.f33397a.f33395w;
            c10711c.m4008a();
        } catch (Exception e) {
            this.f33397a.c(9, e);
        }
    }
}
