package com.fimi.x1bh.p221b;

import android.util.Log;
import android.view.View;
import com.fimi.kernel.p158b.p161c.AbstractC1625d;
import com.fimi.soul.biz.camera.AbstractC1794c;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.camera.p173b.AbstractC1790d;
import com.fimi.soul.entity.CameraMountState;
import com.fimi.soul.module.droneFragment.View$OnTouchListenerC2622b;
import com.fimi.x1bh.module.main.CloudTerraceMainActivity;
/* renamed from: com.fimi.x1bh.b.a */
/* loaded from: classes.dex */
public class C3339a implements AbstractC1790d, AbstractC3341b {

    /* renamed from: a */
    private View$OnTouchListenerC2622b f13294a;

    /* renamed from: b */
    private C1827d f13295b;

    /* renamed from: c */
    private CloudTerraceMainActivity f13296c;

    /* renamed from: d */
    private CameraMountState f13297d = CameraMountState.IDLE;

    /* renamed from: a */
    public void m28245a() {
        this.f13294a.m30960s();
        this.f13295b.a((AbstractC1790d) null);
        this.f13295b.r();
    }

    /* renamed from: a */
    public void m28244a(CloudTerraceMainActivity cloudTerraceMainActivity, View view) {
        this.f13296c = cloudTerraceMainActivity;
        this.f13294a = new View$OnTouchListenerC2622b(cloudTerraceMainActivity, view);
        this.f13295b = (C1827d) C1783b.m34166a().m34150d();
        this.f13295b.c(new AbstractC1625d() { // from class: com.fimi.x1bh.b.a.1
            @Override // com.fimi.kernel.p158b.p161c.AbstractC1625d
            /* renamed from: a */
            public void mo28036a(String str) {
            }
        });
        this.f13295b.a(this);
    }

    /* renamed from: b */
    public void m28243b() {
        this.f13294a.m30986a(this.f13295b.e());
        this.f13294a.m30977d();
        this.f13294a.m30971h();
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1790d
    /* renamed from: b */
    public void mo28242b(boolean z, Object obj) {
        Log.i("istep", "onMount");
        this.f13294a.m30982b((String) null);
        this.f13297d = CameraMountState.MOUNT;
        this.f13294a.m30984b(this.f13297d);
        this.f13295b.m33989u().m34052b();
        this.f13296c.m28165h();
    }

    /* renamed from: c */
    public void m28241c() {
        this.f13294a.m30967l();
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1790d
    /* renamed from: c */
    public void mo28240c(boolean z, Object obj) {
        Log.i("istep", "onDisMount");
        this.f13295b.a(AbstractC1794c.EnumC1804a.Normal);
        this.f13294a.m30993a(CameraMountState.DISMOUNT);
        this.f13297d = CameraMountState.DISMOUNT;
        this.f13294a.m30984b(this.f13297d);
    }

    /* renamed from: d */
    public void m28239d() {
        this.f13294a.m30968k();
    }

    @Override // com.fimi.x1bh.p221b.AbstractC3341b
    /* renamed from: e */
    public void mo28238e() {
        this.f13294a.m30969j();
    }

    @Override // com.fimi.x1bh.p221b.AbstractC3341b
    /* renamed from: f */
    public void mo28237f() {
        this.f13294a.m30966m();
    }
}
