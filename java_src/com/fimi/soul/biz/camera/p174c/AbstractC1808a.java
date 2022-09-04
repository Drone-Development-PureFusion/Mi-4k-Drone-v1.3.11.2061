package com.fimi.soul.biz.camera.p174c;

import android.util.Log;
import com.fimi.soul.biz.camera.AbstractC1794c;
import com.fimi.soul.biz.camera.entity.BaseX11Cmd;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.p173b.AbstractC1792f;
import com.fimi.soul.utils.C3082aj;
/* renamed from: com.fimi.soul.biz.camera.c.a */
/* loaded from: classes.dex */
public abstract class AbstractC1808a implements AbstractC1792f<X11RespCmd> {

    /* renamed from: a */
    private AbstractC1794c f4714a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1808a(AbstractC1794c abstractC1794c) {
        this.f4714a = abstractC1794c;
    }

    /* renamed from: a */
    public AbstractC1794c m34080a() {
        return this.f4714a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m34079a(int i) {
        m34078a(i, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m34078a(int i, String str) {
        m34077a(i, str, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m34077a(int i, String str, String str2) {
        BaseX11Cmd baseX11Cmd = new BaseX11Cmd();
        baseX11Cmd.setMsg_id(i);
        baseX11Cmd.setParam(str);
        baseX11Cmd.setType(str2);
        baseX11Cmd.setToken(m34080a().m34100f());
        m34076a(baseX11Cmd);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m34076a(BaseX11Cmd baseX11Cmd) {
        String str = C3082aj.m29330a(baseX11Cmd) + "\n";
        Log.i("moweiru", "send cmd: " + str);
        m34080a().mo34118a(str.getBytes());
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m34075a(byte[] bArr, int i, int i2) {
        m34080a().mo34117a(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public BaseX11Cmd m34074b(int i, String str, String str2) {
        BaseX11Cmd baseX11Cmd = new BaseX11Cmd();
        baseX11Cmd.setMsg_id(i);
        baseX11Cmd.setParam(str);
        baseX11Cmd.setType(str2);
        baseX11Cmd.setToken(m34080a().m34100f());
        return baseX11Cmd;
    }
}
