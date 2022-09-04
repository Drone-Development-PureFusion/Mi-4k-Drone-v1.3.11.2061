package cn.sharesdk.framework.authorize;

import android.content.Context;
import android.content.Intent;
import com.mob.tools.FakeActivity;
/* renamed from: cn.sharesdk.framework.authorize.a */
/* loaded from: classes.dex */
public class C0786a extends FakeActivity {

    /* renamed from: a */
    protected AuthorizeHelper f1510a;

    /* renamed from: a */
    public AuthorizeHelper m37983a() {
        return this.f1510a;
    }

    /* renamed from: a */
    public void m37982a(AuthorizeHelper authorizeHelper) {
        this.f1510a = authorizeHelper;
        super.show(authorizeHelper.getPlatform().getContext(), null);
    }

    @Override // com.mob.tools.FakeActivity
    public void show(Context context, Intent intent) {
        throw new RuntimeException("This method is deprecated, use show(AuthorizeHelper, Intent) instead");
    }
}
