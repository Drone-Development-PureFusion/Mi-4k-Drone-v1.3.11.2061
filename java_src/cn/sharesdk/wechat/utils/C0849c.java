package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.wechat.utils.WXMediaMessage;
/* renamed from: cn.sharesdk.wechat.utils.c */
/* loaded from: classes.dex */
public class C0849c extends WechatResp {

    /* renamed from: a */
    public WXMediaMessage f1720a;

    public C0849c(Bundle bundle) {
        super(bundle);
    }

    @Override // cn.sharesdk.wechat.utils.WechatResp
    /* renamed from: a */
    public int mo37694a() {
        return 3;
    }

    @Override // cn.sharesdk.wechat.utils.WechatResp
    /* renamed from: a */
    public void mo37693a(Bundle bundle) {
        super.mo37693a(bundle);
        this.f1720a = WXMediaMessage.C0845a.m37726a(bundle);
    }

    @Override // cn.sharesdk.wechat.utils.WechatResp
    /* renamed from: b */
    public void mo37692b(Bundle bundle) {
        super.mo37692b(bundle);
        bundle.putAll(WXMediaMessage.C0845a.m37725a(this.f1720a));
    }
}
