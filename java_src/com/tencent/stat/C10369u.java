package com.tencent.stat;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.stat.u */
/* loaded from: classes2.dex */
public class C10369u implements AbstractC10335c {

    /* renamed from: a */
    final /* synthetic */ List f32306a;

    /* renamed from: b */
    final /* synthetic */ int f32307b;

    /* renamed from: c */
    final /* synthetic */ C10362n f32308c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10369u(C10362n c10362n, List list, int i) {
        this.f32308c = c10362n;
        this.f32306a = list;
        this.f32307b = i;
    }

    @Override // com.tencent.stat.AbstractC10335c
    /* renamed from: a */
    public void mo5338a() {
        this.f32308c.m5353a(this.f32306a);
    }

    @Override // com.tencent.stat.AbstractC10335c
    /* renamed from: b */
    public void mo5337b() {
        this.f32308c.m5352a(this.f32306a, 1);
        this.f32308c.f32290b += this.f32307b;
    }
}
