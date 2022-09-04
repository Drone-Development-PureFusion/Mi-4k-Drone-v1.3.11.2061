package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.wechat.utils.WXMediaMessage;
/* renamed from: cn.sharesdk.wechat.utils.f */
/* loaded from: classes.dex */
public class C0852f extends WechatResp {

    /* renamed from: a */
    public WXMediaMessage f1723a;

    public C0852f(Bundle bundle) {
        super(bundle);
    }

    @Override // cn.sharesdk.wechat.utils.WechatResp
    /* renamed from: a */
    public int mo37694a() {
        return 4;
    }

    @Override // cn.sharesdk.wechat.utils.WechatResp
    /* renamed from: a */
    public void mo37693a(Bundle bundle) {
        super.mo37693a(bundle);
        this.f1723a = WXMediaMessage.C0845a.m37726a(bundle);
    }

    @Override // cn.sharesdk.wechat.utils.WechatResp
    /* renamed from: b */
    public void mo37692b(Bundle bundle) {
        super.mo37692b(bundle);
        bundle.putAll(WXMediaMessage.C0845a.m37725a(this.f1723a));
    }
}
