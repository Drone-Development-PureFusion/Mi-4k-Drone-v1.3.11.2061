package com.fimi.soul.biz.p170b;

import android.os.Message;
import android.util.Log;
import com.fimi.kernel.AbstractC1584b;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p158b.AbstractC1586a;
import com.fimi.kernel.p158b.AbstractC1632e;
import com.fimi.kernel.p158b.EnumC1626d;
import com.fimi.kernel.p158b.p163e.C1634b;
import com.fimi.soul.entity.APConfig;
import com.fimi.soul.entity.APStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p005b.p006a.p007a.p008a.p026n.C0363a;
/* renamed from: com.fimi.soul.biz.b.b */
/* loaded from: classes.dex */
public class C1760b extends AbstractC1584b {

    /* renamed from: a */
    public static final String f4578a = "PSK_KEY";

    /* renamed from: b */
    public static final String f4579b = "AP_SSID";

    /* renamed from: c */
    public static final String f4580c = "AP_PRIMARY_CH";

    /* renamed from: d */
    public static final String f4581d = "DEF_ATH_countrycode";

    /* renamed from: e */
    public static final String f4582e = "VERSION";

    /* renamed from: f */
    public static final String f4583f = "AP_IPADDR";

    /* renamed from: g */
    public static final String f4584g = "ATH_txpower";

    /* renamed from: h */
    public static final String f4585h = "ERROR_INFO";

    /* renamed from: i */
    public static final String f4586i = "SIGNAL_INFO";

    /* renamed from: k */
    public static final String f4588k = "SP_KEY_CACHE_APCONFIG";

    /* renamed from: n */
    private C1634b f4591n;

    /* renamed from: l */
    private static String f4589l = "http://192.168.42.100/cgi-bin";

    /* renamed from: j */
    public static String f4587j = "UNCONNECT_CAMERA";

    /* renamed from: m */
    private static String f4590m = "\".*\"";

    /* renamed from: q */
    private AbstractC1586a f4594q = (AbstractC1586a) C1642c.m34890a(EnumC1626d.Http);

    /* renamed from: p */
    private Pattern f4593p = Pattern.compile(f4590m);

    /* renamed from: o */
    private Map<String, String> f4592o = new HashMap();

    /* renamed from: com.fimi.soul.biz.b.b$a */
    /* loaded from: classes.dex */
    private class C1768a {

        /* renamed from: b */
        private StringBuilder f4609b = new StringBuilder();

        public C1768a(String str) {
            this.f4609b.append(str);
            this.f4609b.append(C0363a.f360a);
        }

        /* renamed from: a */
        public String m34220a() {
            return this.f4609b.toString();
        }

        /* renamed from: a */
        public void m34219a(String str, String str2) {
            if (str == null || str2 == null || str2.trim().length() <= 0) {
                return;
            }
            this.f4609b.append(String.format("%s=%s&", str, str2));
        }
    }

    public C1760b() {
        this.f4591n = null;
        this.f4591n = (C1634b) C1642c.m34890a(EnumC1626d.Volley);
    }

    /* renamed from: a */
    private boolean m34247a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m34242b(String str, String str2, final AbstractC1632e<Boolean> abstractC1632e) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        this.f4591n.mo34910a(m34238c("VAPcfg"), hashMap, new AbstractC1632e<String>() { // from class: com.fimi.soul.biz.b.b.6
            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo30004a(String str3) {
                if (str3 != null) {
                    abstractC1632e.mo30004a(true);
                } else {
                    abstractC1632e.mo30004a(false);
                }
            }

            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: b  reason: avoid collision after fix types in other method */
            public void mo30002b(String str3) {
                if (str3 == null) {
                    abstractC1632e.mo30004a(true);
                } else {
                    abstractC1632e.mo30004a(false);
                }
            }
        });
    }

    /* renamed from: c */
    private String m34238c(String str) {
        return String.format("%s/%s", f4589l, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public APConfig m34237d() {
        APConfig aPConfig = new APConfig();
        if (this.f4592o != null && this.f4592o.size() > 0) {
            aPConfig.setApPwd(this.f4592o.get(f4578a));
            aPConfig.setSsid(this.f4592o.get(f4579b));
            aPConfig.setPrimaryChannel(this.f4592o.get(f4580c));
            aPConfig.setCountryCode(this.f4592o.get(f4581d));
            aPConfig.setVersion(this.f4592o.get(f4582e));
            aPConfig.setIpAddr(this.f4592o.get(f4583f));
            aPConfig.setPower(this.f4592o.get(f4584g));
            aPConfig.setConCameraStatus(this.f4592o.get(f4585h));
            if (this.f4592o.get(f4586i) != null) {
                aPConfig.setSignalInfo(Integer.parseInt(this.f4592o.get(f4586i)));
            }
        }
        return aPConfig;
    }

    @Override // com.fimi.kernel.AbstractC1584b
    /* renamed from: a */
    protected void mo30955a(Message message) {
    }

    /* renamed from: a */
    public void m34253a(final AbstractC1632e<APStatus> abstractC1632e) {
        this.f4591n.mo34907b(m34238c("status.cgi"), new AbstractC1632e<String>() { // from class: com.fimi.soul.biz.b.b.1
            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo30004a(String str) {
                Log.d("Good", str + "SUCCESS");
                APStatus aPStatus = new APStatus();
                Matcher matcher = C1760b.this.f4593p.matcher(str);
                if (matcher.find()) {
                    aPStatus.setSsid(matcher.group().replace("\"", ""));
                }
                abstractC1632e.mo30004a(aPStatus);
            }

            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: b  reason: avoid collision after fix types in other method */
            public void mo30002b(String str) {
                abstractC1632e.mo30002b(null);
            }
        });
    }

    /* renamed from: a */
    public void m34251a(APConfig aPConfig, final AbstractC1632e<Boolean> abstractC1632e) {
        if (aPConfig != null) {
            C1768a c1768a = new C1768a(String.format("%s/setting.cgi", f4589l));
            c1768a.m34219a(f4578a, aPConfig.getApPwd());
            c1768a.m34219a(f4581d, aPConfig.getCountryCode());
            c1768a.m34219a(f4584g, aPConfig.getPower());
            c1768a.m34219a(f4579b, aPConfig.getSsid());
            c1768a.m34219a(f4582e, aPConfig.getVersion());
            String m34220a = c1768a.m34220a();
            Log.d("Good", m34220a);
            this.f4594q.mo34912a(m34220a, new AbstractC1632e<String>() { // from class: com.fimi.soul.biz.b.b.3
                @Override // com.fimi.kernel.p158b.AbstractC1632e
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo30004a(String str) {
                    C1760b.this.m34240c(new AbstractC1632e<Boolean>() { // from class: com.fimi.soul.biz.b.b.3.1
                        @Override // com.fimi.kernel.p158b.AbstractC1632e
                        /* renamed from: a  reason: avoid collision after fix types in other method */
                        public void mo30004a(Boolean bool) {
                            abstractC1632e.mo30004a(bool);
                        }

                        @Override // com.fimi.kernel.p158b.AbstractC1632e
                        /* renamed from: b  reason: avoid collision after fix types in other method */
                        public void mo30002b(Boolean bool) {
                            abstractC1632e.mo30002b(bool);
                        }
                    });
                }

                @Override // com.fimi.kernel.p158b.AbstractC1632e
                /* renamed from: b  reason: avoid collision after fix types in other method */
                public void mo30002b(String str) {
                    abstractC1632e.mo30004a(false);
                }
            });
        }
    }

    /* renamed from: a */
    public void m34248a(String str, String str2, final AbstractC1632e<Boolean> abstractC1632e) {
        C1768a c1768a = new C1768a(String.format("%s/setting.cgi", f4589l));
        c1768a.m34219a(str, str2);
        this.f4594q.mo34912a(c1768a.m34220a(), new AbstractC1632e<String>() { // from class: com.fimi.soul.biz.b.b.4
            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo30004a(String str3) {
                Log.d("Good", str3);
                abstractC1632e.mo30004a(true);
            }

            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: b  reason: avoid collision after fix types in other method */
            public void mo30002b(String str3) {
                abstractC1632e.mo30004a(false);
            }
        });
    }

    /* renamed from: a */
    public boolean m34250a(String str) {
        return m34247a(m34241c(), str);
    }

    /* renamed from: a */
    public boolean m34249a(String str, String str2) {
        return m34247a(m34243b(str), str2);
    }

    /* renamed from: b */
    public APConfig m34246b() {
        APConfig aPConfig = (APConfig) C1642c.m34887c().mo34880a(f4588k, APConfig.class);
        return aPConfig == null ? new APConfig() : aPConfig;
    }

    /* renamed from: b */
    public void m34245b(final AbstractC1632e<APConfig> abstractC1632e) {
        this.f4592o.clear();
        this.f4591n.mo34907b(m34238c("config.cgi"), new AbstractC1632e<String>() { // from class: com.fimi.soul.biz.b.b.2
            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo30004a(String str) {
                if (str != null && str.length() > 3) {
                    Scanner scanner = new Scanner(str.substring(4));
                    while (scanner.hasNextLine()) {
                        String[] split = scanner.nextLine().split("=");
                        if (split != null && split.length == 2) {
                            C1760b.this.f4592o.put(split[0], split[1]);
                        }
                    }
                }
                APConfig m34237d = C1760b.this.m34237d();
                C1642c.m34887c().mo34879a(C1760b.f4588k, m34237d);
                abstractC1632e.mo30004a(m34237d);
            }

            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: b  reason: avoid collision after fix types in other method */
            public void mo30002b(String str) {
                abstractC1632e.mo30002b(new APConfig());
            }
        });
    }

    /* renamed from: b */
    public String[] m34243b(String str) {
        if (m34247a(C1759a.f4572a, str)) {
            return C1759a.f4575d;
        }
        if (m34247a(C1759a.f4574c, str)) {
            return C1759a.f4577f;
        }
        if (!m34247a(C1759a.f4573b, str)) {
            return null;
        }
        return C1759a.f4573b;
    }

    /* renamed from: c */
    public void m34240c(final AbstractC1632e<Boolean> abstractC1632e) {
        HashMap hashMap = new HashMap();
        hashMap.put("INDEX", "1");
        hashMap.put("COMMIT", "Save");
        this.f4591n.mo34910a(m34238c("VAPcfg"), hashMap, new AbstractC1632e<String>() { // from class: com.fimi.soul.biz.b.b.5
            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo30004a(String str) {
                abstractC1632e.mo30004a(true);
            }

            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: b  reason: avoid collision after fix types in other method */
            public void mo30002b(String str) {
                abstractC1632e.mo30002b(false);
            }
        });
    }

    /* renamed from: c */
    public String[] m34241c() {
        return m34243b(m34246b().getCountryCode());
    }

    /* renamed from: d */
    public void m34236d(AbstractC1632e<Boolean> abstractC1632e) {
        m34242b("RebootButton", "Reboot", abstractC1632e);
    }

    /* renamed from: e */
    public void m34235e(AbstractC1632e<Boolean> abstractC1632e) {
        m34242b("", "FactoryReset", abstractC1632e);
    }
}
