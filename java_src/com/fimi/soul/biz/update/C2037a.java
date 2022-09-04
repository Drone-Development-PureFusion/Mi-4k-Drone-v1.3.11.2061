package com.fimi.soul.biz.update;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p158b.AbstractC1632e;
import com.fimi.kernel.p158b.EnumC1626d;
import com.fimi.kernel.p158b.p159a.AbstractC1587a;
import com.fimi.kernel.p158b.p159a.C1589b;
import com.fimi.kernel.p158b.p159a.C1596c;
import com.fimi.kernel.p158b.p161c.AbstractC1623b;
import com.fimi.kernel.p158b.p163e.C1634b;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p170b.C1760b;
import com.fimi.soul.biz.p179g.C1846a;
import com.fimi.soul.entity.APConfig;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.ServerResult;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.utils.NetUtil;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
/* renamed from: com.fimi.soul.biz.update.a */
/* loaded from: classes.dex */
public class C2037a extends AbstractC2056c {

    /* renamed from: f */
    private static final String f5722f = "KEY_APUPDATEBIZ_LASTEST_VERSION";

    /* renamed from: g */
    private static final int f5723g = 1;

    /* renamed from: h */
    private static final String f5724h = "ar934x_US";

    /* renamed from: k */
    private static String f5725k = "192.168.42.100";

    /* renamed from: l */
    private static String f5726l = "192.168.42.150";

    /* renamed from: q */
    private static final int f5727q = 3;

    /* renamed from: j */
    private C1634b f5729j;

    /* renamed from: m */
    private String f5730m;

    /* renamed from: n */
    private long f5731n;

    /* renamed from: o */
    private long f5732o;

    /* renamed from: p */
    private int f5733p;

    /* renamed from: s */
    private C1760b f5735s;

    /* renamed from: t */
    private AbstractC2077i f5736t;

    /* renamed from: i */
    private C1589b f5728i = null;

    /* renamed from: r */
    private boolean f5734r = false;

    public C2037a() {
        this.f5729j = null;
        this.f5735s = null;
        this.f5729j = (C1634b) C1642c.m34890a(EnumC1626d.Volley);
        this.f5735s = new C1760b();
        if (C1846a.m33917a().m33915b() == 1) {
            return;
        }
        f5725k = "192.168.100.1";
        f5726l = "192.168.100.2";
    }

    /* renamed from: c */
    static /* synthetic */ int m33157c(C2037a c2037a) {
        int i = c2037a.f5733p;
        c2037a.f5733p = i + 1;
        return i;
    }

    /* renamed from: c */
    public static String m33158c() {
        return C3129m.m29045v();
    }

    /* renamed from: d */
    public static String m33156d() {
        return String.format("%s%s", C3129m.m29045v(), C3029b.f11267L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.biz.update.AbstractC2056c, com.fimi.kernel.AbstractC1584b
    /* renamed from: a */
    public void mo30955a(Message message) {
        super.mo30955a(message);
        if (message.what == 1) {
            if (message.arg1 == 1) {
                this.f5736t.mo28035a(false, message.arg2, 100L, 0);
            } else {
                this.f5736t.mo28035a(true, 0L, 0L, 0);
            }
        }
    }

    /* renamed from: a */
    public void m33167a(AbstractC2077i abstractC2077i) {
        if (i() == null) {
            abstractC2077i.mo28035a(true, 0L, 0L, 0);
            return;
        }
        i().getUrl();
        this.f5730m = m33156d();
        a(i(), this.f5730m, abstractC2077i);
    }

    /* renamed from: a */
    public void m33166a(final AbstractC2077i abstractC2077i, Context context, FirmwareInfo firmwareInfo) {
        if (firmwareInfo.getSysId() == 15) {
            this.f5730m = String.format("%s/%s/%s", C3129m.m29070a(), "firmware", C2080l.m33059a(firmwareInfo.getFileEncode(), firmwareInfo.getVersion()));
        } else if (firmwareInfo.getSysId() == 26) {
            this.f5730m = String.format("%s/%s/%s", C3129m.m29070a(), "firmware", C2080l.m33054b(firmwareInfo.getFileEncode(), firmwareInfo.getVersion()));
        } else if (firmwareInfo.getSysId() == 14) {
            this.f5730m = String.format("%s/%s/%s", C3129m.m29070a(), "firmware", C2080l.m33049c(firmwareInfo.getFileEncode(), firmwareInfo.getVersion()));
        } else if (firmwareInfo.getSysId() == 25) {
            this.f5730m = String.format("%s/%s/%s", C3129m.m29070a(), "firmware", C2080l.m33045d(firmwareInfo.getFileEncode(), firmwareInfo.getVersion()));
        } else {
            this.f5730m = String.format("%s/%s/%s", C3129m.m29070a(), "firmware", C2080l.m33060a(firmwareInfo.getFileEncode()));
        }
        File file = new File(String.format("%s/%s", C3129m.m29070a(), "firmware"));
        if (!file.exists()) {
            file.mkdir();
        }
        new File(this.f5730m);
        if (!new File(this.f5730m).isFile()) {
            abstractC2077i.mo28035a(true, 0L, 0L, 0);
            return;
        }
        if (this.f5728i != null) {
            this.f5728i.m35064h();
            this.f5728i = null;
        }
        this.f5728i = (C1589b) C1642c.m34890a(EnumC1626d.Ftp);
        C1596c m35074c = this.f5728i.m35074c();
        if (firmwareInfo.getSysId() == 14 || firmwareInfo.getSysId() == 25) {
            m35074c.m35062a(true);
            m35074c.a(f5726l);
        } else {
            m35074c.a(f5725k);
        }
        m35074c.a(21);
        this.f5728i.m35090a(new AbstractC1623b() { // from class: com.fimi.soul.biz.update.a.4
            @Override // com.fimi.kernel.p158b.p161c.AbstractC1623b
            /* renamed from: a */
            public void mo33142a(boolean z, String str) {
                if (!z) {
                    abstractC2077i.mo28035a(true, 0L, 0L, 0);
                    return;
                }
                File file2 = new File(C2037a.this.f5730m);
                C2037a.this.f5731n = file2.length();
                C2037a.this.f5732o = 0L;
                C2037a.this.f5728i.m35078b(file2, new AbstractC1587a() { // from class: com.fimi.soul.biz.update.a.4.1
                    @Override // com.fimi.kernel.p158b.p159a.AbstractC1587a
                    /* renamed from: a */
                    public void mo33141a(AbstractC1587a.EnumC1588a enumC1588a, int i) {
                        C2037a.this.f5732o += i;
                        abstractC2077i.mo28035a(enumC1588a == AbstractC1587a.EnumC1588a.Completed || enumC1588a == AbstractC1587a.EnumC1588a.Aborted, C2037a.this.f5732o, C2037a.this.f5731n, 0);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void m33165a(final AbstractC2079k<UpdateVersonBean> abstractC2079k) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getDeviceVersion"));
        arrayList.add(new BasicNameValuePair("sysID", "5"));
        arrayList.add(new BasicNameValuePair("modelName", f5724h));
        NetUtil.m29408a(arrayList, C1642c.m34893a());
        String format = String.format("%s?%s", C1756a.f4551j, URLEncodedUtils.format(arrayList, "UTF-8"));
        Log.d("Good", "请求url:" + format);
        this.f5729j.mo34912a(format, new AbstractC1632e<String>() { // from class: com.fimi.soul.biz.update.a.1
            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo30004a(String str) {
                Log.d("Good", str);
                if (str == null || str.length() <= 0) {
                    return;
                }
                try {
                    ServerResult serverResult = (ServerResult) C2037a.this.g().fromJson(str, new TypeToken<ServerResult<UpdateVersonBean>>() { // from class: com.fimi.soul.biz.update.a.1.1
                    }.getType());
                    if (serverResult != null) {
                        C2037a.this.b((UpdateVersonBean) serverResult.getData());
                        C2037a.this.c(C2037a.this.i());
                        abstractC2079k.m33067a(serverResult.getData());
                        return;
                    }
                } catch (Exception e) {
                }
                abstractC2079k.m33067a(C2037a.this.j());
            }

            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: b  reason: avoid collision after fix types in other method */
            public void mo30002b(String str) {
                abstractC2079k.m33067a(C2037a.this.j());
            }
        });
    }

    /* renamed from: a */
    public void m33164a(InputStream inputStream, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str, true);
            byte[] bArr = new byte[512000];
            while (true) {
                int read = inputStream.read(bArr, 0, 512000);
                if (read == -1) {
                    fileOutputStream.close();
                    inputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m33160b(AbstractC2077i abstractC2077i) {
        if (this.f5728i != null) {
            this.f5728i.m35064h();
        }
        this.f5736t = abstractC2077i;
        a(new Runnable() { // from class: com.fimi.soul.biz.update.a.3
            @Override // java.lang.Runnable
            public void run() {
                C2037a.this.f5733p = 0;
                C2037a.this.f5734r = true;
                String format = String.format("http://%s:8080/upgrade", C2037a.f5725k);
                while (C2037a.this.f5734r) {
                    try {
                        C2037a.this.f5729j.mo34912a(format, new AbstractC1632e<String>() { // from class: com.fimi.soul.biz.update.a.3.1
                            @Override // com.fimi.kernel.p158b.AbstractC1632e
                            /* renamed from: a  reason: avoid collision after fix types in other method */
                            public void mo30004a(String str) {
                                Log.d("Good", str);
                                try {
                                    int parseInt = Integer.parseInt(str.trim().replace("\n", ""));
                                    Message message = new Message();
                                    message.what = 1;
                                    if (parseInt < 100) {
                                        message.arg1 = 1;
                                        message.arg2 = parseInt;
                                    } else {
                                        message.arg1 = 0;
                                        message.arg2 = 0;
                                        C2037a.this.f5734r = false;
                                    }
                                    C2037a.this.a().sendMessage(message);
                                } catch (Exception e) {
                                    Log.d("Good", "Error");
                                    C2037a.m33157c(C2037a.this);
                                }
                            }

                            @Override // com.fimi.kernel.p158b.AbstractC1632e
                            /* renamed from: b  reason: avoid collision after fix types in other method */
                            public void mo30002b(String str) {
                                C2037a.m33157c(C2037a.this);
                            }
                        });
                        Thread.sleep(500L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public void m33159b(final AbstractC2079k<UpdateVersonBean> abstractC2079k) {
        this.f5735s.m34245b(new AbstractC1632e<APConfig>() { // from class: com.fimi.soul.biz.update.a.2
            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo30004a(APConfig aPConfig) {
                UpdateVersonBean updateVersonBean = new UpdateVersonBean();
                if (aPConfig != null && aPConfig.getVersion() != null) {
                    String[] split = aPConfig.getVersion().split("_");
                    updateVersonBean.setNewVersion(split[split.length - 1]);
                    C2037a.this.a(updateVersonBean);
                }
                abstractC2079k.m33067a(updateVersonBean);
            }

            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: b  reason: avoid collision after fix types in other method */
            public void mo30002b(APConfig aPConfig) {
                abstractC2079k.m33067a(new UpdateVersonBean());
            }
        });
    }

    /* renamed from: b */
    public boolean m33163b() {
        if (i() != null && h() != null) {
            try {
                if (Integer.parseInt(i().getNewVersion()) > Integer.parseInt(h().getNewVersion())) {
                    return true;
                }
            } catch (Exception e) {
            }
        }
        return false;
    }

    /* renamed from: e */
    public void m33154e() {
        try {
            if (this.f5728i == null) {
                return;
            }
            this.f5728i.m35064h();
        } catch (Exception e) {
            C2080l.m33055b("e:" + e.getMessage().toString());
        }
    }
}
