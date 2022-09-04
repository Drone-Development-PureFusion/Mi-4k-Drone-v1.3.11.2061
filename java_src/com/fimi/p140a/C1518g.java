package com.fimi.p140a;
/* renamed from: com.fimi.a.g */
/* loaded from: classes.dex */
public class C1518g {

    /* renamed from: a */
    private EnumC1519a f3647a;

    /* renamed from: b */
    private EnumC1519a f3648b;

    /* renamed from: com.fimi.a.g$a */
    /* loaded from: classes.dex */
    public enum EnumC1519a {
        IDLE,
        MOUNT,
        UNMONT
    }

    /* renamed from: a */
    public boolean m35390a(boolean z) {
        if (z) {
            this.f3648b = EnumC1519a.MOUNT;
        } else {
            this.f3648b = EnumC1519a.UNMONT;
        }
        if (this.f3647a == this.f3648b) {
            return false;
        }
        this.f3647a = this.f3648b;
        return true;
    }
}
