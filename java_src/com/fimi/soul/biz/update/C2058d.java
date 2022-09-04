package com.fimi.soul.biz.update;

import android.content.Context;
import android.util.Log;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p158b.AbstractC1632e;
import com.fimi.kernel.p158b.EnumC1626d;
import com.fimi.kernel.p158b.p163e.C1634b;
import com.fimi.kernel.utils.C1673n;
import com.fimi.kernel.utils.C1688z;
import com.fimi.soul.base.C1756a;
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
/* renamed from: com.fimi.soul.biz.update.d */
/* loaded from: classes.dex */
public class C2058d extends AbstractC2056c {

    /* renamed from: f */
    public static final String f5776f = "firmware.zip";

    /* renamed from: g */
    private static final String f5777g = "x1";

    /* renamed from: h */
    private C1634b f5778h;

    public C2058d() {
        this.f5778h = null;
        this.f5778h = (C1634b) C1642c.m34890a(EnumC1626d.Volley);
    }

    /* renamed from: a */
    public static String m33110a(String str) {
        if (str != null) {
            int indexOf = str.indexOf(86);
            int indexOf2 = str.indexOf(66);
            int indexOf3 = str.indexOf("SP");
            if (indexOf3 > 0 && indexOf < indexOf3) {
                return str.substring(indexOf + 1, indexOf3);
            }
            if (indexOf < indexOf2) {
                return str.substring(indexOf + 1, indexOf2);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m33109b() {
        return String.format("%s%s", C3129m.m29045v(), "firmware.zip");
    }

    /* renamed from: c */
    public static String m33108c() {
        return String.format("%s%s", C3129m.m29045v(), C3029b.f11281Z);
    }

    /* renamed from: d */
    public static String m33107d() {
        return "fimware.zip";
    }

    /* renamed from: e */
    public static String m33106e() {
        return C1673n.m34651b(m33107d(), ".zip") + ".bin";
    }

    /* renamed from: a */
    public void m33114a(Context context) {
        String format = String.format("%s/%s/%s", C3129m.m29070a(), "firmware", "firmware.zip");
        File file = new File(String.format("%s/%s", C3129m.m29070a(), "firmware"));
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(format);
        if (file2.exists()) {
            file2.delete();
        }
        try {
            m33111a(context.getAssets().open("firmware.zip"), String.format("%s/%s/%s", C3129m.m29070a(), "firmware", "firmware.zip"));
        } catch (Exception e) {
            C1688z.m34448a(context, "写文件出错：" + e.getMessage());
        }
    }

    /* renamed from: a */
    public void m33113a(AbstractC2077i abstractC2077i) {
        if (i() == null) {
            abstractC2077i.mo28035a(true, 0L, 0L, 0);
        } else {
            a(i(), m33109b(), abstractC2077i);
        }
    }

    /* renamed from: a */
    public void m33112a(final AbstractC2079k<UpdateVersonBean> abstractC2079k) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getDeviceVersion"));
        arrayList.add(new BasicNameValuePair("sysID", "04"));
        arrayList.add(new BasicNameValuePair("modelName", f5777g));
        NetUtil.m29408a(arrayList, C1642c.m34893a());
        String format = String.format("%s?%s", C1756a.f4551j, URLEncodedUtils.format(arrayList, "UTF-8"));
        Log.d("Good", "请求url:" + format);
        this.f5778h.mo34912a(format, new AbstractC1632e<String>() { // from class: com.fimi.soul.biz.update.d.1
            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo30004a(String str) {
                Log.d("Good", str);
                if (str == null || str.length() <= 0) {
                    return;
                }
                try {
                    ServerResult serverResult = (ServerResult) C2058d.this.g().fromJson(str, new TypeToken<ServerResult<UpdateVersonBean>>() { // from class: com.fimi.soul.biz.update.d.1.1
                    }.getType());
                    if (serverResult != null) {
                        C2058d.this.b((UpdateVersonBean) serverResult.getData());
                        C2058d.this.c(C2058d.this.i());
                        abstractC2079k.m33067a(serverResult.getData());
                        return;
                    }
                } catch (Exception e) {
                }
                abstractC2079k.m33067a(C2058d.this.j());
            }

            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: b  reason: avoid collision after fix types in other method */
            public void mo30002b(String str) {
                Log.d("Good", str);
                abstractC2079k.m33067a(C2058d.this.j());
            }
        });
    }

    /* renamed from: a */
    public void m33111a(InputStream inputStream, String str) {
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
}
