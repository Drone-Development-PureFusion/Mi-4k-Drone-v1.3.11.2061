package com.baidu.tts.auth;

import android.content.Context;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.jni.EmbeddedSynthesizerEngine;
import com.baidu.tts.p101e.C1162b;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p105h.p106a.C1191c;
import com.baidu.tts.p105h.p107b.C1193b;
import com.baidu.tts.p111k.AbstractC1199a;
import com.baidu.tts.p111k.AbstractCallableC1200b;
import com.baidu.tts.tools.StringTool;
import java.io.File;
/* renamed from: com.baidu.tts.auth.b */
/* loaded from: classes.dex */
public class C1068b implements AbstractCallableC1200b<C1068b, C1069a> {

    /* renamed from: a */
    private String f2476a;

    /* renamed from: b */
    private String f2477b;

    /* renamed from: com.baidu.tts.auth.b$a */
    /* loaded from: classes.dex */
    public static class C1069a implements AbstractC1199a {

        /* renamed from: a */
        private int f2478a;

        /* renamed from: b */
        private int f2479b = -1;

        /* renamed from: c */
        private String f2480c;

        /* renamed from: d */
        private String f2481d;

        /* renamed from: e */
        private TtsError f2482e;

        /* renamed from: a */
        public int m36776a() {
            if (this.f2478a >= 1000) {
                return this.f2478a - 1000;
            }
            return 0;
        }

        /* renamed from: a */
        public void m36775a(int i) {
            this.f2479b = i;
        }

        /* renamed from: a */
        public void m36774a(TtsError ttsError) {
            if (ttsError != null) {
                LoggerProxy.m36554d("OfflineAuth", "this=" + this + "--error=" + ttsError.getDetailMessage());
            }
            this.f2482e = ttsError;
        }

        /* renamed from: a */
        public void m36773a(String str) {
            this.f2480c = str;
        }

        /* renamed from: b */
        public TtsError m36772b() {
            return this.f2482e;
        }

        /* renamed from: b */
        public void m36771b(String str) {
            this.f2481d = str;
        }

        /* renamed from: c */
        public String m36770c() {
            if (m36768e()) {
                return "valid official";
            }
            if (m36769d()) {
                return "valid temp";
            }
            switch (this.f2478a) {
                case -10:
                    return "temp license expired";
                case -9:
                default:
                    return "not a valid result";
                case -8:
                    return "license not exist or invalid license";
                case -7:
                    return "platform unmatched";
                case -6:
                    return "will expire after a month";
                case -5:
                    return "official license expired";
                case -4:
                    return "cuid unmatched";
                case -3:
                    return "sign or appcode unmatched";
                case -2:
                    return "package name unmatched";
            }
        }

        /* renamed from: d */
        public boolean m36769d() {
            return this.f2478a >= 1000;
        }

        /* renamed from: e */
        public boolean m36768e() {
            return this.f2478a >= 0 && this.f2478a < 1000;
        }

        /* renamed from: f */
        public boolean m36767f() {
            return this.f2478a == -5 || this.f2478a == -6;
        }

        @Override // com.baidu.tts.p111k.AbstractC1199a
        /* renamed from: g */
        public boolean mo36249g() {
            if (StringTool.isEmpty(this.f2480c)) {
                return false;
            }
            File file = new File(this.f2480c);
            if (!file.exists()) {
                return false;
            }
            C1193b m36288a = C1193b.m36288a();
            Context m36283h = m36288a.m36283h();
            byte[] bArr = new byte[32];
            this.f2478a = EmbeddedSynthesizerEngine.bdTTSVerifyLicense(m36283h, this.f2481d, m36288a.m36282i(), this.f2480c, bArr);
            LoggerProxy.m36554d("OfflineAuth", "verify result=" + this.f2478a);
            if (bArr != null) {
                String str = new String(bArr);
                LoggerProxy.m36554d("OfflineAuth", "get appIdStr=" + str);
                try {
                    int indexOf = str.indexOf("end");
                    if (indexOf != -1) {
                        new C1162b(m36283h, str.substring(0, indexOf)).start();
                    }
                } catch (Exception e) {
                    LoggerProxy.m36554d("OfflineAuth", "embedded statistics start exception=" + e.toString());
                }
            }
            if (this.f2478a >= 0) {
                return true;
            }
            LoggerProxy.m36554d("OfflineAuth", "isDelete=" + file.delete());
            return false;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C1068b c1068b) {
        return (!StringTool.isEqual(this.f2476a, c1068b.m36782a()) || !StringTool.isEqual(this.f2477b, c1068b.m36779b())) ? 1 : 0;
    }

    /* renamed from: a */
    public String m36782a() {
        return this.f2476a;
    }

    /* renamed from: a */
    public void m36780a(String str) {
        this.f2476a = str;
    }

    /* renamed from: b */
    public String m36779b() {
        return this.f2477b;
    }

    /* renamed from: b */
    public void m36778b(String str) {
        this.f2477b = str;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: c */
    public C1069a call() {
        C1069a c1069a = new C1069a();
        c1069a.m36773a(this.f2477b);
        c1069a.m36771b(this.f2476a);
        if (!c1069a.mo36249g()) {
            C1193b m36288a = C1193b.m36288a();
            Context m36283h = m36288a.m36283h();
            String m36282i = m36288a.m36282i();
            LoggerProxy.m36554d("OfflineAuth", "+ downloadLicense");
            int bdTTSGetLicense = EmbeddedSynthesizerEngine.bdTTSGetLicense(m36283h, this.f2476a, m36282i, "0", "", this.f2477b);
            LoggerProxy.m36554d("OfflineAuth", "- downloadLicense ret = " + bdTTSGetLicense);
            c1069a.m36775a(bdTTSGetLicense);
            if (bdTTSGetLicense < 0) {
                c1069a.m36774a(C1191c.m36299a().m36296a(EnumC1182n.OFFLINE_ENGINE_DOWNLOAD_LICENSE_FAILED, bdTTSGetLicense, "appCode=" + this.f2476a + "--licensePath=" + this.f2477b));
            } else {
                c1069a.mo36249g();
            }
        }
        return c1069a;
    }
}
