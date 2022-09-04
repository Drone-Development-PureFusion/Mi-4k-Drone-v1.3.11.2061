package com.google.android.gms.common.data;

import com.google.android.gms.common.data.AbstractC4523c;
import java.util.HashSet;
import java.util.Iterator;
/* renamed from: com.google.android.gms.common.data.d */
/* loaded from: classes2.dex */
public final class C4525d implements AbstractC4523c, AbstractC4523c.AbstractC4524a {

    /* renamed from: a */
    private HashSet<AbstractC4523c> f16905a = new HashSet<>();

    @Override // com.google.android.gms.common.data.AbstractC4523c
    /* renamed from: a */
    public void mo23865a() {
        Iterator<AbstractC4523c> it2 = this.f16905a.iterator();
        while (it2.hasNext()) {
            it2.next().mo23865a();
        }
    }

    @Override // com.google.android.gms.common.data.AbstractC4523c
    /* renamed from: a */
    public void mo23864a(int i, int i2) {
        Iterator<AbstractC4523c> it2 = this.f16905a.iterator();
        while (it2.hasNext()) {
            it2.next().mo23864a(i, i2);
        }
    }

    @Override // com.google.android.gms.common.data.AbstractC4523c
    /* renamed from: a */
    public void mo23863a(int i, int i2, int i3) {
        Iterator<AbstractC4523c> it2 = this.f16905a.iterator();
        while (it2.hasNext()) {
            it2.next().mo23863a(i, i2, i3);
        }
    }

    @Override // com.google.android.gms.common.data.AbstractC4523c.AbstractC4524a
    /* renamed from: a */
    public void mo23862a(AbstractC4523c abstractC4523c) {
        this.f16905a.add(abstractC4523c);
    }

    @Override // com.google.android.gms.common.data.AbstractC4523c
    /* renamed from: b */
    public void mo23860b(int i, int i2) {
        Iterator<AbstractC4523c> it2 = this.f16905a.iterator();
        while (it2.hasNext()) {
            it2.next().mo23860b(i, i2);
        }
    }

    @Override // com.google.android.gms.common.data.AbstractC4523c.AbstractC4524a
    /* renamed from: b */
    public void mo23859b(AbstractC4523c abstractC4523c) {
        this.f16905a.remove(abstractC4523c);
    }

    /* renamed from: b */
    public boolean m23861b() {
        return !this.f16905a.isEmpty();
    }

    /* renamed from: c */
    public void m23858c() {
        this.f16905a.clear();
    }

    @Override // com.google.android.gms.common.data.AbstractC4523c
    /* renamed from: c */
    public void mo23857c(int i, int i2) {
        Iterator<AbstractC4523c> it2 = this.f16905a.iterator();
        while (it2.hasNext()) {
            it2.next().mo23857c(i, i2);
        }
    }
}
