package com.fimi.soul.biz.camera.p174c;

import android.util.Log;
import com.fimi.kernel.utils.C1662f;
import com.fimi.kernel.utils.C1680u;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.camera.AbstractC1794c;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.entity.BaseX11Cmd;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.biz.camera.entity.X11FileSystem;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.update.AbstractC2077i;
import com.fimi.soul.biz.update.C2080l;
import com.fimi.soul.utils.C3129m;
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
/* renamed from: com.fimi.soul.biz.camera.c.d */
/* loaded from: classes.dex */
public class C1820d extends AbstractC1808a {

    /* renamed from: c */
    private static final String f4754c = C3129m.m29053n();

    /* renamed from: a */
    private AbstractC2077i f4755a;

    /* renamed from: b */
    private boolean f4756b;

    /* renamed from: com.fimi.soul.biz.camera.c.d$a */
    /* loaded from: classes.dex */
    public enum EnumC1823a {
        Thumb,
        IDR,
        FullView
    }

    public C1820d(AbstractC1794c abstractC1794c) {
        super(abstractC1794c);
    }

    /* renamed from: a */
    private void m34032a(X11FileSystem x11FileSystem, X11RespCmd x11RespCmd) {
        X11FileInfo curDownloadFile = x11FileSystem.getCurDownloadFile();
        if (curDownloadFile != null) {
            curDownloadFile.setMd5(x11RespCmd.getMd5sum());
            curDownloadFile.setSize(x11RespCmd.getSize());
            a().m34125a(curDownloadFile);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m34011h() {
        X11FileInfo curUploadFile = a().m34093l().getCurUploadFile();
        Log.d("Good", "发送文件" + curUploadFile);
        if (curUploadFile != null) {
            File file = new File(curUploadFile.getLocalPath());
            long length = file.length();
            this.f4756b = false;
            Log.d("Good", "文件大小" + length);
            if (!file.exists()) {
                return;
            }
            long j = 0;
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[2560];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        Log.d("Good", "发送完毕,总长度为:" + j);
                        a().m34093l().setCurDownloadFile(null);
                        fileInputStream.close();
                        return;
                    } else if (!this.f4756b) {
                        a(bArr, 0, read);
                        j += read;
                        Log.d("Good", "已发送" + j);
                        if (this.f4755a != null) {
                            this.f4755a.mo28035a(j >= length, j, length, 0);
                        }
                    }
                }
            } catch (Exception e) {
                Log.d("Good", e.toString());
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void m34033a(X11FileInfo x11FileInfo) {
        a().m34093l().setCurDownloadFile(x11FileInfo);
        a(C1831e.f4795V, x11FileInfo.getName());
    }

    /* renamed from: a */
    public void m34031a(AbstractC2077i abstractC2077i) {
        this.f4755a = abstractC2077i;
    }

    /* renamed from: a */
    public void m34030a(String str) {
        a(C1831e.f4793T, str);
    }

    /* renamed from: a */
    public void m34029a(String str, int i) {
        BaseX11Cmd b = b(C1831e.f4797X, str, null);
        b.setSent_size(i);
        a(b);
    }

    /* renamed from: a */
    public void m34028a(String str, EnumC1823a enumC1823a) {
        new X11FileInfo();
        m34027a(str, null, C1662f.m34784a(new Date(), C1662f.f4115e), enumC1823a);
    }

    /* renamed from: a */
    public void m34027a(String str, String str2, String str3, EnumC1823a enumC1823a) {
        String str4 = null;
        switch (enumC1823a) {
            case Thumb:
                str4 = "thumb";
                break;
            case FullView:
                str4 = "fullview";
                break;
            case IDR:
                str4 = "idr";
                break;
        }
        X11FileInfo x11FileInfo = new X11FileInfo();
        x11FileInfo.setName(str);
        x11FileInfo.setCreateDate(str3);
        x11FileInfo.setAbsolutePath(str2);
        a(1025, str2, str4);
        x11FileInfo.setName(C1783b.m34164a(x11FileInfo));
        x11FileInfo.setLocalPath(f4754c);
        x11FileInfo.setRemotePath(a().m34093l().getCurPath());
        a().m34093l().setCurDownloadFile(x11FileInfo);
    }

    /* renamed from: a */
    public void m34026a(boolean z) {
        this.f4756b = z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fimi.soul.biz.camera.p174c.AbstractC1808a, com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
        super.mo28055a(z, x11RespCmd);
        if (z) {
            X11FileSystem m34093l = a().m34093l();
            switch (x11RespCmd.getMsg_id()) {
                case 1025:
                    m34032a(m34093l, x11RespCmd);
                    return;
                case C1831e.f4792S /* 1282 */:
                default:
                    return;
                case C1831e.f4793T /* 1283 */:
                case C1831e.f4794U /* 1284 */:
                    m34093l.setCurPath(x11RespCmd.getPwd());
                    return;
                case C1831e.f4795V /* 1285 */:
                    m34032a(m34093l, x11RespCmd);
                    return;
                case C1831e.f4796W /* 1286 */:
                    C2080l.m33050c("CMD_PUT_FILE:1286");
                    Log.i("msg=", "进入");
                    C1685x.m34457a(new Runnable() { // from class: com.fimi.soul.biz.camera.c.d.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C1820d.this.m34011h();
                        }
                    });
                    return;
            }
        }
    }

    /* renamed from: b */
    public void m34025b() {
        a(C1831e.f4794U);
    }

    /* renamed from: b */
    public void m34024b(int i) {
        if (i == 0) {
            m34017e();
        } else if (i != 1) {
        } else {
            a(253);
        }
    }

    /* renamed from: b */
    public void m34023b(String str) {
        a(C1831e.f4792S, String.format("%s -D -S", str));
    }

    /* renamed from: b */
    public void m34022b(String str, int i) {
        a(1027, str, i + "");
    }

    /* renamed from: c */
    public void m34021c() {
        m34030a("..");
    }

    /* renamed from: c */
    public void m34020c(String str) {
        a(C1831e.f4791R, str);
    }

    /* renamed from: d */
    public void m34019d() {
        m34030a(C1831e.f4924cR);
    }

    /* renamed from: d */
    public void m34018d(String str) {
        a(8, str);
    }

    /* renamed from: e */
    public void m34017e() {
        a(254);
    }

    /* renamed from: e */
    public void m34016e(String str) {
        X11FileInfo x11FileInfo = new X11FileInfo();
        x11FileInfo.setRemotePath(a().m34093l().getCurPath());
        if (x11FileInfo.getLocalPath() == null) {
            x11FileInfo.setLocalPath(f4754c);
        }
        x11FileInfo.setName(str);
        m34033a(x11FileInfo);
    }

    /* renamed from: f */
    public void m34015f() {
        String curPath = a().m34093l().getCurPath();
        if (curPath == null) {
            curPath = "";
        }
        m34023b(curPath);
    }

    /* renamed from: f */
    public void m34014f(String str) {
        a(C1831e.f4797X, str);
    }

    /* renamed from: g */
    public void m34012g(String str) {
        a(1026, str);
    }

    /* renamed from: g */
    public boolean m34013g() {
        return this.f4756b;
    }

    /* renamed from: h */
    public void m34010h(String str) {
        BaseX11Cmd b = b(C1831e.f4796W, C1831e.f4926cT + "" + str.substring(str.lastIndexOf("/") + 1), null);
        File file = new File(str);
        String m34548a = C1680u.m34548a(file);
        long length = file.length();
        b.setMd5sum(m34548a);
        b.setSize(length);
        X11FileInfo x11FileInfo = new X11FileInfo();
        x11FileInfo.setLocalPath(str);
        x11FileInfo.setName(file.getName());
        a().m34093l().setCurUploadFile(x11FileInfo);
        a(b);
    }
}
