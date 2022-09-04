package com.fimi.soul.module.p209b;

import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import com.mob.tools.FakeActivity;
import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: com.fimi.soul.module.b.c */
/* loaded from: classes.dex */
public class C2511c extends FakeActivity {

    /* renamed from: a */
    private AbstractC2513e f8164a;

    public C2511c(AbstractC2513e abstractC2513e) {
        this.f8164a = abstractC2513e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m31434a(Platform platform) {
        this.f8164a.m31410b(platform);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean m31435a() {
        return this.f8164a.f8169a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final Platform.ShareParams m31432b(Platform platform) {
        if (this.f8164a.m31407c(platform)) {
            return this.f8164a.m31406d(platform);
        }
        return null;
    }

    /* renamed from: b */
    protected final HashMap<String, Object> m31433b() {
        return this.f8164a.f8170b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean m31431c() {
        return this.f8164a.f8171c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean m31430c(Platform platform) {
        return this.f8164a.m31418a(platform);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final ArrayList<C2477a> m31429d() {
        return this.f8164a.f8172d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final HashMap<String, String> m31428e() {
        return this.f8164a.f8173e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final PlatformActionListener m31427f() {
        return this.f8164a.f8174f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final AbstractC2515f m31426g() {
        return this.f8164a.f8175g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean m31425h() {
        return this.f8164a.f8176h;
    }
}
