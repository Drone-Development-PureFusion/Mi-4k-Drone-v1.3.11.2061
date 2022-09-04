package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.framework.utils.C0831d;
import cn.sharesdk.wechat.utils.WXMediaMessage;
import com.google.android.gms.location.places.AbstractC8240d;
/* renamed from: cn.sharesdk.wechat.utils.d */
/* loaded from: classes.dex */
public class C0850d extends AbstractC0858j {

    /* renamed from: a */
    public WXMediaMessage f1721a;

    /* renamed from: b */
    public int f1722b;

    @Override // cn.sharesdk.wechat.utils.AbstractC0858j
    /* renamed from: a */
    public int mo37662a() {
        return 2;
    }

    @Override // cn.sharesdk.wechat.utils.AbstractC0858j
    /* renamed from: a */
    public void mo37661a(Bundle bundle) {
        super.mo37661a(bundle);
        bundle.putAll(WXMediaMessage.C0845a.m37725a(this.f1721a));
        bundle.putInt("_wxapi_sendmessagetowx_req_scene", this.f1722b);
    }

    @Override // cn.sharesdk.wechat.utils.AbstractC0858j
    /* renamed from: b */
    public boolean mo37660b() {
        if (this.f1721a.getType() == 8 && (this.f1721a.thumbData == null || this.f1721a.thumbData.length <= 0)) {
            C0831d.m37772a().m6200d("checkArgs fail, thumbData should not be null when send emoji", new Object[0]);
            return false;
        } else if (this.f1721a.thumbData != null && this.f1721a.thumbData.length > 32768) {
            C0831d.m37772a().m6200d("checkArgs fail, thumbData is invalid", new Object[0]);
            return false;
        } else if (this.f1721a.title != null && this.f1721a.title.length() > 512) {
            C0831d.m37772a().m6200d("checkArgs fail, title is invalid", new Object[0]);
            return false;
        } else {
            if (this.f1721a.description != null && this.f1721a.description.length() > 1024) {
                this.f1721a.description = this.f1721a.description.substring(0, AbstractC8240d.f27011bn) + "...";
            }
            if (this.f1721a.mediaObject != null) {
                return this.f1721a.mediaObject.checkArgs();
            }
            C0831d.m37772a().m6200d("checkArgs fail, mediaObject is null", new Object[0]);
            return false;
        }
    }
}
