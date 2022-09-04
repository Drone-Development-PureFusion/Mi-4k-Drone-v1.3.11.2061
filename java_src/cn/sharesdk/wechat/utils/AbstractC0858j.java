package cn.sharesdk.wechat.utils;

import android.os.Bundle;
/* renamed from: cn.sharesdk.wechat.utils.j */
/* loaded from: classes.dex */
public abstract class AbstractC0858j {

    /* renamed from: c */
    public String f1741c;

    /* renamed from: a */
    public abstract int mo37662a();

    /* renamed from: a */
    public void mo37661a(Bundle bundle) {
        bundle.putInt("_wxapi_command_type", mo37662a());
        bundle.putString("_wxapi_basereq_transaction", this.f1741c);
    }

    /* renamed from: b */
    public abstract boolean mo37660b();
}
