package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.fimi.soul.utils.C3134q;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C6771bc;
import com.google.android.gms.tagmanager.AbstractC9032af;
import com.google.android.gms.tagmanager.AbstractC9042aj;
import com.google.android.gms.tagmanager.C9196e;
import com.tencent.connect.common.Constants;
import com.xiaomi.market.sdk.C10445j;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.p286a.p287a.p299f.p302c.C11125l;
import p005b.p006a.p007a.p029b.p045i.p046a.C0548a;
/* renamed from: com.google.android.gms.internal.app */
/* loaded from: classes2.dex */
public class C6716app {

    /* renamed from: a */
    private final Context f22732a;

    /* renamed from: b */
    private final String f22733b;

    /* renamed from: c */
    private final C6865dv f22734c;

    /* renamed from: d */
    private final AbstractC9042aj f22735d;

    /* renamed from: e */
    private final AbstractC9032af f22736e;

    /* renamed from: j */
    private int f22741j;

    /* renamed from: k */
    private C6787br f22742k;

    /* renamed from: l */
    private aow f22743l;

    /* renamed from: f */
    private final apr f22737f = new apr();

    /* renamed from: g */
    private final C6891eh f22738g = new C6891eh(new HashMap(50));

    /* renamed from: h */
    private final C6891eh f22739h = new C6891eh(new HashMap(10));

    /* renamed from: i */
    private final Set<String> f22740i = new HashSet();

    /* renamed from: m */
    private final AbstractC6720c f22744m = new AbstractC6720c() { // from class: com.google.android.gms.internal.app.1
        @Override // com.google.android.gms.internal.C6716app.AbstractC6720c
        /* renamed from: a */
        public aow mo16320a() {
            return C6716app.this.f22743l;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.app$a */
    /* loaded from: classes2.dex */
    public class C6718a implements C6771bc.AbstractC6772a {
        private C6718a() {
        }

        @Override // com.google.android.gms.internal.C6771bc.AbstractC6772a
        /* renamed from: a */
        public Object mo16202a(String str, Map<String, Object> map) {
            try {
                C6716app.this.f22736e.mo8892a(str, map);
                return null;
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e.getMessage());
                aph.m16396a(valueOf.length() != 0 ? "Error calling customEvaluator proxy:".concat(valueOf) : new String("Error calling customEvaluator proxy:"));
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.app$b */
    /* loaded from: classes2.dex */
    public class C6719b implements C6771bc.AbstractC6772a {
        private C6719b() {
        }

        @Override // com.google.android.gms.internal.C6771bc.AbstractC6772a
        /* renamed from: a */
        public Object mo16202a(String str, Map<String, Object> map) {
            try {
                return C6716app.this.f22736e.mo8891b(str, map);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e.getMessage());
                aph.m16396a(valueOf.length() != 0 ? "Error calling customEvaluator proxy:".concat(valueOf) : new String("Error calling customEvaluator proxy:"));
                return null;
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.app$c */
    /* loaded from: classes2.dex */
    public interface AbstractC6720c {
        /* renamed from: a */
        aow mo16320a();
    }

    public C6716app(Context context, String str, C6865dv c6865dv, C6873dy c6873dy, AbstractC9042aj abstractC9042aj, AbstractC9032af abstractC9032af) {
        C4588d.m23626a(c6865dv, "Internal Error: Container resource cannot be null");
        C4588d.m23626a(c6873dy, "Internal Error: Runtime resource cannot be null");
        C4588d.m23624a(str, (Object) "Internal Error: ContainerId cannot be empty");
        C4588d.m23627a(abstractC9042aj);
        C4588d.m23627a(abstractC9032af);
        this.f22732a = context;
        this.f22733b = str;
        this.f22734c = c6865dv;
        this.f22735d = abstractC9042aj;
        this.f22736e = abstractC9032af;
        m16329c();
        m16327d();
        m16325e();
        m16324f();
        m16323g();
        m16342a(c6873dy);
        m16322h();
    }

    /* renamed from: a */
    private AbstractC6880ea<?> m16341a(C6876dz c6876dz) {
        switch (c6876dz.m16068a()) {
            case 1:
                try {
                    return new C6884ec(Double.valueOf(Double.parseDouble((String) c6876dz.m16067b())));
                } catch (NumberFormatException e) {
                    return new C6893ej((String) c6876dz.m16067b());
                }
            case 2:
                List<C6876dz> list = (List) c6876dz.m16067b();
                ArrayList arrayList = new ArrayList(list.size());
                for (C6876dz c6876dz2 : list) {
                    arrayList.add(m16341a(c6876dz2));
                }
                return new C6887ef(arrayList);
            case 3:
                Map map = (Map) c6876dz.m16067b();
                HashMap hashMap = new HashMap(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    hashMap.put(aqf.m16218d(m16341a((C6876dz) entry.getKey())), m16341a((C6876dz) entry.getValue()));
                }
                return new C6891eh(hashMap);
            case 4:
                AbstractC6880ea<?> m16331b = m16331b((String) c6876dz.m16067b());
                return (!(m16331b instanceof C6893ej) || c6876dz.m16066c().isEmpty()) ? m16331b : new C6893ej(m16337a((String) ((C6893ej) m16331b).mo16034b(), c6876dz.m16066c()));
            case 5:
                return new C6893ej((String) c6876dz.m16067b());
            case 6:
                return new C6884ec(Double.valueOf(((Integer) c6876dz.m16067b()).doubleValue()));
            case 7:
                StringBuilder sb = new StringBuilder();
                for (C6876dz c6876dz3 : (List) c6876dz.m16067b()) {
                    sb.append(aqf.m16218d(m16341a(c6876dz3)));
                }
                return new C6893ej(sb.toString());
            case 8:
                return new C6883eb((Boolean) c6876dz.m16067b());
            default:
                throw new IllegalStateException(new StringBuilder(52).append("Attempting to expand unknown Value type ").append(c6876dz.m16068a()).append(".").toString());
        }
    }

    /* renamed from: a */
    private C6892ei m16336a(String str, Map<String, AbstractC6880ea<?>> map) {
        try {
            return aqc.m16230a(str, map, m16334b());
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(e.getMessage());
            aph.m16396a(new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(valueOf).length()).append("Incorrect keys for function ").append(str).append(". ").append(valueOf).toString());
            return null;
        }
    }

    /* renamed from: a */
    private String m16338a(String str, int i) {
        switch (i) {
            case 12:
                return m16326d(str);
            default:
                aph.m16396a(new StringBuilder(39).append("Unsupported Value Escaping: ").append(i).toString());
                return str;
        }
    }

    /* renamed from: a */
    private String m16337a(String str, List<Integer> list) {
        for (Integer num : list) {
            str = m16338a(str, num.intValue());
        }
        return str;
    }

    /* renamed from: a */
    private Map<String, AbstractC6880ea<?>> m16335a(Map<String, C6876dz> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, C6876dz> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), m16341a(entry.getValue()));
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m16342a(C6873dy c6873dy) {
        for (aqd aqdVar : c6873dy.m16072a()) {
            aqdVar.m16225a(this.f22737f);
            this.f22737f.m16316a(aqdVar.m16226a(), new C6885ed(aqdVar));
        }
    }

    /* renamed from: a */
    private void m16340a(EnumC6890eg enumC6890eg, aqe aqeVar) {
        this.f22738g.a(aqc.m16232a(enumC6890eg), new C6885ed(aqeVar));
    }

    /* renamed from: b */
    private AbstractC6880ea<?> m16331b(String str) {
        this.f22741j++;
        String valueOf = String.valueOf(m16321i());
        aph.m16391d(new StringBuilder(String.valueOf(valueOf).length() + 31 + String.valueOf(str).length()).append(valueOf).append("Beginning to evaluate variable ").append(str).toString());
        if (this.f22740i.contains(str)) {
            this.f22741j--;
            String valueOf2 = String.valueOf(this.f22740i.toString());
            throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 77 + String.valueOf(valueOf2).length()).append("Macro cycle detected.  Current macro reference: ").append(str).append(". Previous macro references: ").append(valueOf2).toString());
        }
        this.f22740i.add(str);
        C6867dw m16091a = this.f22734c.m16091a(str);
        if (m16091a == null) {
            this.f22741j--;
            this.f22740i.remove(str);
            String valueOf3 = String.valueOf(m16321i());
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf3).length() + 36 + String.valueOf(str).length()).append(valueOf3).append("Attempting to resolve unknown macro ").append(str).toString());
        }
        AbstractC6880ea<?> m16330b = m16330b(m16335a(m16091a.m16085a()));
        String valueOf4 = String.valueOf(m16321i());
        aph.m16391d(new StringBuilder(String.valueOf(valueOf4).length() + 25 + String.valueOf(str).length()).append(valueOf4).append("Done evaluating variable ").append(str).toString());
        this.f22741j--;
        this.f22740i.remove(str);
        return m16330b;
    }

    /* renamed from: b */
    private AbstractC6880ea m16330b(Map<String, AbstractC6880ea<?>> map) {
        C6892ei m16336a;
        if (map == null) {
            aph.m16396a("Cannot access the function parameters.");
            return C6886ee.f23122e;
        }
        AbstractC6880ea<?> abstractC6880ea = map.get(EnumC6958fh.FUNCTION.toString());
        if (!(abstractC6880ea instanceof C6893ej)) {
            aph.m16396a("No function id in properties");
            return C6886ee.f23122e;
        }
        String str = (String) ((C6893ej) abstractC6880ea).mo16034b();
        if (this.f22737f.m16317a(str)) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, AbstractC6880ea<?>> entry : map.entrySet()) {
                if (entry.getKey().startsWith("vtp_")) {
                    hashMap.put(entry.getKey().substring(4), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C6891eh(hashMap));
            m16336a = new C6892ei(str, arrayList);
        } else if (!m16328c(str)) {
            aph.m16396a(new StringBuilder(String.valueOf(str).length() + 30).append("functionId '").append(str).append("' is not supported").toString());
            return C6886ee.f23122e;
        } else {
            m16336a = m16336a(str, map);
        }
        if (m16336a == null) {
            aph.m16396a("Internal error: failed to convert function to a valid statement");
            return C6886ee.f23122e;
        }
        String valueOf = String.valueOf(m16336a.m16039e());
        aph.m16391d(valueOf.length() != 0 ? "Executing: ".concat(valueOf) : new String("Executing: "));
        AbstractC6880ea m16027a = C6895ek.m16027a(this.f22737f, m16336a);
        return (!(m16027a instanceof C6886ee) || !((C6886ee) m16027a).m16053e()) ? m16027a : ((C6886ee) m16027a).mo16034b();
    }

    /* renamed from: b */
    private boolean m16332b(C6867dw c6867dw) {
        C6876dz c6876dz = c6867dw.m16085a().get(EnumC6958fh.DISPATCH_ON_FIRE.toString());
        return c6876dz != null && c6876dz.m16068a() == 8 && ((Boolean) c6876dz.m16067b()).booleanValue();
    }

    /* renamed from: c */
    private void m16329c() {
        this.f22737f.m16316a("1", new C6885ed(new arb()));
        this.f22737f.m16316a("12", new C6885ed(new arc()));
        this.f22737f.m16316a("18", new C6885ed(new ard()));
        this.f22737f.m16316a(Constants.VIA_ACT_TYPE_NINETEEN, new C6885ed(new are()));
        this.f22737f.m16316a("20", new C6885ed(new arf()));
        this.f22737f.m16316a(Constants.VIA_REPORT_TYPE_QQFAVORITES, new C6885ed(new arg()));
        this.f22737f.m16316a(Constants.VIA_REPORT_TYPE_SHARE_TO_TROOPBAR, new C6885ed(new arh()));
        this.f22737f.m16316a("24", new C6885ed(new ari()));
        this.f22737f.m16316a("27", new C6885ed(new arj()));
        this.f22737f.m16316a(Constants.VIA_ACT_TYPE_TWENTY_EIGHT, new C6885ed(new ark()));
        this.f22737f.m16316a("29", new C6885ed(new arl()));
        this.f22737f.m16316a(C0548a.f933d, new C6885ed(new arm()));
        this.f22737f.m16316a("32", new C6885ed(new arn()));
        this.f22737f.m16316a("33", new C6885ed(new arn()));
        this.f22737f.m16316a("34", new C6885ed(new C6796c()));
        this.f22737f.m16316a(C0548a.f938i, new C6885ed(new C6796c()));
        this.f22737f.m16316a(C0548a.f941l, new C6885ed(new C6824d()));
        this.f22737f.m16316a("40", new C6885ed(new C6879e()));
    }

    /* renamed from: c */
    private boolean m16328c(String str) {
        String m16231a = aqc.m16231a(str);
        return m16231a != null && this.f22738g.a(m16231a);
    }

    /* renamed from: d */
    private String m16326d(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            aph.m16395a("Escape URI: unsupported encoding", e);
            return str;
        }
    }

    /* renamed from: d */
    private void m16327d() {
        this.f22737f.m16316a("0", new C6885ed(new C6124ab()));
        this.f22737f.m16316a("10", new C6885ed(new C6202ad()));
        this.f22737f.m16316a("25", new C6885ed(new C6218ae()));
        this.f22737f.m16316a("26", new C6885ed(new C6258af()));
        this.f22737f.m16316a(C0548a.f940k, new C6885ed(new C6284ag()));
    }

    /* renamed from: e */
    private void m16325e() {
        this.f22737f.m16316a("2", new C6885ed(new C6940f()));
        this.f22737f.m16316a("3", new C6885ed(new C7014g()));
        this.f22737f.m16316a("4", new C6885ed(new C7072h()));
        this.f22737f.m16316a("5", new C6885ed(new C7141i()));
        this.f22737f.m16316a("6", new C6885ed(new C7236j()));
        this.f22737f.m16316a(C3134q.f11824l, new C6885ed(new C7284k()));
        this.f22737f.m16316a(C3134q.f11825m, new C6885ed(new C7334l()));
        this.f22737f.m16316a(C3134q.f11826n, new C6885ed(new C7141i()));
        this.f22737f.m16316a("13", new C6885ed(new C7378m()));
        this.f22737f.m16316a("47", new C6885ed(new C7430n()));
        this.f22737f.m16316a(Constants.VIA_REPORT_TYPE_WPA_STATE, new C6885ed(new C7474o()));
        this.f22737f.m16316a("48", new C6885ed(new C7531p(this)));
        C7611q c7611q = new C7611q();
        this.f22737f.m16316a(Constants.VIA_REPORT_TYPE_START_WAP, new C6885ed(c7611q));
        this.f22737f.m16316a("17", new C6885ed(c7611q));
        this.f22737f.m16316a(Constants.VIA_REPORT_TYPE_DATALINE, new C6885ed(new C7683s()));
        this.f22737f.m16316a("45", new C6885ed(new C7720t()));
        this.f22737f.m16316a("46", new C6885ed(new C7777u()));
        this.f22737f.m16316a(C0548a.f939j, new C6885ed(new C7829v()));
        this.f22737f.m16316a("43", new C6885ed(new C7890w()));
        this.f22737f.m16316a("38", new C6885ed(new C7982x()));
        this.f22737f.m16316a("44", new C6885ed(new C8027y()));
        this.f22737f.m16316a("41", new C6885ed(new C8088z()));
        this.f22737f.m16316a("42", new C6885ed(new C6104aa()));
    }

    /* renamed from: f */
    private void m16324f() {
        m16340a(EnumC6890eg.CONTAINS, new C6813cp());
        m16340a(EnumC6890eg.ENDS_WITH, new C6814cq());
        m16340a(EnumC6890eg.EQUALS, new C6815cr());
        m16340a(EnumC6890eg.GREATER_EQUALS, new C6816cs());
        m16340a(EnumC6890eg.GREATER_THAN, new C6817ct());
        m16340a(EnumC6890eg.LESS_EQUALS, new C6818cu());
        m16340a(EnumC6890eg.LESS_THAN, new C6819cv());
        m16340a(EnumC6890eg.REGEX, new C6821cx());
        m16340a(EnumC6890eg.STARTS_WITH, new C6822cy());
        this.f22738g.a("advertiserId", new C6885ed(new C6777bh(this.f22732a)));
        this.f22738g.a("advertiserTrackingEnabled", new C6885ed(new C6778bi(this.f22732a)));
        this.f22738g.a("adwordsClickReferrer", new C6885ed(new C6779bj(this.f22732a, this.f22744m)));
        this.f22738g.a("applicationId", new C6885ed(new C6780bk(this.f22732a)));
        this.f22738g.a("applicationName", new C6885ed(new C6781bl(this.f22732a)));
        this.f22738g.a("applicationVersion", new C6885ed(new C6782bm(this.f22732a)));
        this.f22738g.a("applicationVersionName", new C6885ed(new C6783bn(this.f22732a)));
        this.f22738g.a("arbitraryPixieMacro", new C6885ed(new C6774be(1, this.f22737f)));
        this.f22738g.a("carrier", new C6885ed(new C6784bo(this.f22732a)));
        this.f22738g.a("constant", new C6885ed(new C7829v()));
        this.f22738g.a("containerId", new C6885ed(new C6785bp(new C6893ej(this.f22733b))));
        this.f22738g.a("containerVersion", new C6885ed(new C6785bp(new C6893ej(this.f22734c.m16090b()))));
        this.f22738g.a("customMacro", new C6885ed(new C6771bc(new C6719b())));
        this.f22738g.a("deviceBrand", new C6885ed(new C6788bs()));
        this.f22738g.a(C10445j.f32473as, new C6885ed(new C6789bt(this.f22732a)));
        this.f22738g.a("deviceModel", new C6885ed(new C6790bu()));
        this.f22738g.a("deviceName", new C6885ed(new C6791bv()));
        this.f22738g.a("encode", new C6885ed(new C6792bw()));
        this.f22738g.a("encrypt", new C6885ed(new C6793bx()));
        this.f22738g.a(C9196e.f29004b, new C6885ed(new C6786bq()));
        this.f22738g.a("eventParameters", new C6885ed(new C6794by(this.f22744m)));
        this.f22738g.a("version", new C6885ed(new C6795bz()));
        this.f22738g.a("hashcode", new C6885ed(new C6797ca()));
        this.f22738g.a("installReferrer", new C6885ed(new C6798cb(this.f22732a)));
        this.f22738g.a("join", new C6885ed(new C6799cc()));
        this.f22738g.a("language", new C6885ed(new C6800cd()));
        this.f22738g.a("locale", new C6885ed(new C6803cf()));
        this.f22738g.a("adWordsUniqueId", new C6885ed(new C6805ch(this.f22732a)));
        this.f22738g.a("osVersion", new C6885ed(new C6806ci()));
        this.f22738g.a(Constants.PARAM_PLATFORM, new C6885ed(new C6807cj()));
        this.f22738g.a("random", new C6885ed(new C6808ck()));
        this.f22738g.a("regexGroup", new C6885ed(new C6809cl()));
        this.f22738g.a(C10445j.f32463ai, new C6885ed(new C6811cn(this.f22732a)));
        this.f22738g.a("runtimeVersion", new C6885ed(new C6810cm()));
        this.f22738g.a("sdkVersion", new C6885ed(new C6812co()));
        this.f22742k = new C6787br();
        this.f22738g.a("currentTime", new C6885ed(this.f22742k));
        this.f22738g.a("userProperty", new C6885ed(new C6804cg(this.f22732a, this.f22744m)));
        this.f22738g.a("arbitraryPixel", new C6885ed(new C6826db(aou.m16435a(this.f22732a))));
        this.f22738g.a("customTag", new C6885ed(new C6771bc(new C6718a())));
        this.f22738g.a("universalAnalytics", new C6885ed(new C6827dc(this.f22732a, this.f22744m)));
        this.f22738g.a("queueRequest", new C6885ed(new C6823cz(aou.m16435a(this.f22732a))));
        this.f22738g.a("sendMeasurement", new C6885ed(new C6825da(this.f22735d, this.f22744m)));
        this.f22738g.a("arbitraryPixieTag", new C6885ed(new C6774be(0, this.f22737f)));
        this.f22738g.a("suppressPassthrough", new C6885ed(new C6776bg(this.f22732a, this.f22744m)));
    }

    /* renamed from: g */
    private void m16323g() {
        this.f22739h.a("decodeURI", new C6885ed(new C6765ax()));
        this.f22739h.a("decodeURIComponent", new C6885ed(new C6766ay()));
        this.f22739h.a("encodeURI", new C6885ed(new C6767az()));
        this.f22739h.a("encodeURIComponent", new C6885ed(new C6769ba()));
        this.f22739h.a("log", new C6885ed(new C6775bf()));
        this.f22739h.a("isArray", new C6885ed(new C6770bb()));
    }

    /* renamed from: h */
    private void m16322h() {
        C6891eh c6891eh = new C6891eh(new HashMap(1));
        c6891eh.a("mobile", this.f22738g);
        c6891eh.a("common", this.f22739h);
        this.f22737f.m16316a("gtmUtils", c6891eh);
        C6891eh c6891eh2 = new C6891eh(new HashMap(this.f22738g.mo16034b()));
        c6891eh2.m16042e();
        C6891eh c6891eh3 = new C6891eh(new HashMap(this.f22739h.mo16034b()));
        c6891eh3.m16042e();
        if (this.f22737f.m16317a("main") && (this.f22737f.m16315b("main") instanceof C6885ed)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(c6891eh);
            C6895ek.m16027a(this.f22737f, new C6892ei("main", arrayList));
        }
        this.f22738g.a("base", c6891eh2);
        this.f22739h.a("base", c6891eh3);
        c6891eh.m16042e();
        this.f22738g.m16042e();
        this.f22739h.m16042e();
    }

    /* renamed from: i */
    private String m16321i() {
        if (this.f22741j <= 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(this.f22741j));
        for (int i = 2; i < this.f22741j; i++) {
            sb.append(C11125l.f35805c);
        }
        sb.append(": ");
        return sb.toString();
    }

    /* renamed from: a */
    AbstractC6880ea<?> m16344a(C6867dw c6867dw) {
        this.f22740i.clear();
        try {
            AbstractC6880ea<?> m16330b = m16330b(m16335a(c6867dw.m16085a()));
            if (m16330b instanceof C6883eb) {
                return m16330b;
            }
            aph.m16396a("Predicate must return a boolean value");
            return new C6883eb(false);
        } catch (IllegalStateException e) {
            aph.m16396a("Error evaluating predicate.");
            return C6886ee.f23121d;
        }
    }

    /* renamed from: a */
    AbstractC6880ea<?> m16343a(C6870dx c6870dx, Map<C6867dw, AbstractC6880ea<?>> map) {
        String valueOf = String.valueOf(c6870dx);
        aph.m16391d(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Evaluating trigger ").append(valueOf).toString());
        for (C6867dw c6867dw : c6870dx.m16080b()) {
            AbstractC6880ea<?> abstractC6880ea = map.get(c6867dw);
            if (abstractC6880ea == null) {
                abstractC6880ea = m16344a(c6867dw);
                map.put(c6867dw, abstractC6880ea);
            }
            AbstractC6880ea<?> abstractC6880ea2 = abstractC6880ea;
            if (abstractC6880ea2 == C6886ee.f23121d) {
                return C6886ee.f23121d;
            }
            if (((Boolean) ((C6883eb) abstractC6880ea2).mo16034b()).booleanValue()) {
                return new C6883eb(false);
            }
        }
        for (C6867dw c6867dw2 : c6870dx.m16081a()) {
            AbstractC6880ea<?> abstractC6880ea3 = map.get(c6867dw2);
            if (abstractC6880ea3 == null) {
                abstractC6880ea3 = m16344a(c6867dw2);
                map.put(c6867dw2, abstractC6880ea3);
            }
            AbstractC6880ea<?> abstractC6880ea4 = abstractC6880ea3;
            if (abstractC6880ea4 == C6886ee.f23121d) {
                return C6886ee.f23121d;
            }
            if (!((Boolean) ((C6883eb) abstractC6880ea4).mo16034b()).booleanValue()) {
                return new C6883eb(false);
            }
        }
        return new C6883eb(true);
    }

    /* renamed from: a */
    public AbstractC6880ea<?> m16339a(String str) {
        if (this.f22740i.contains(str)) {
            String valueOf = String.valueOf(this.f22740i.toString());
            throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 77 + String.valueOf(valueOf).length()).append("Macro cycle detected.  Current macro reference: ").append(str).append(". Previous macro references: ").append(valueOf).toString());
        }
        this.f22741j = 0;
        return m16331b(str);
    }

    /* renamed from: a */
    public void m16347a() {
        aou.m16435a(this.f22732a).mo16413a();
    }

    /* renamed from: a */
    public void m16346a(aow aowVar) {
        boolean z;
        this.f22737f.m16316a("gtm.globals.eventName", new C6893ej(aowVar.m16430d()));
        this.f22742k.m16199a(aowVar);
        this.f22743l = aowVar;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        for (C6870dx c6870dx : this.f22734c.m16092a()) {
            if (!c6870dx.m16079c().isEmpty() || !c6870dx.m16078d().isEmpty()) {
                AbstractC6880ea<?> m16343a = m16343a(c6870dx, hashMap);
                if (m16343a == C6886ee.f23121d) {
                    String valueOf = String.valueOf(c6870dx);
                    aph.m16394b(new StringBuilder(String.valueOf(valueOf).length() + 41).append("Error encounted while evaluating trigger ").append(valueOf).toString());
                    if (!c6870dx.m16078d().isEmpty()) {
                        String valueOf2 = String.valueOf(c6870dx.m16078d());
                        aph.m16391d(new StringBuilder(String.valueOf(valueOf2).length() + 15).append("Blocking tags: ").append(valueOf2).toString());
                        hashSet2.addAll(c6870dx.m16078d());
                    }
                } else if (((Boolean) ((C6883eb) m16343a).mo16034b()).booleanValue()) {
                    String valueOf3 = String.valueOf(c6870dx);
                    aph.m16391d(new StringBuilder(String.valueOf(valueOf3).length() + 19).append("Trigger is firing: ").append(valueOf3).toString());
                    if (!c6870dx.m16079c().isEmpty()) {
                        String valueOf4 = String.valueOf(c6870dx.m16079c());
                        aph.m16391d(new StringBuilder(String.valueOf(valueOf4).length() + 34).append("Adding tags to firing candidates: ").append(valueOf4).toString());
                        hashSet.addAll(c6870dx.m16079c());
                    }
                    if (!c6870dx.m16078d().isEmpty()) {
                        String valueOf5 = String.valueOf(c6870dx.m16078d());
                        aph.m16391d(new StringBuilder(String.valueOf(valueOf5).length() + 24).append("Blocking disabled tags: ").append(valueOf5).toString());
                        hashSet2.addAll(c6870dx.m16078d());
                    }
                }
            } else {
                String valueOf6 = String.valueOf(c6870dx);
                aph.m16391d(new StringBuilder(String.valueOf(valueOf6).length() + 64).append("Trigger is not being evaluated since it has no associated tags: ").append(valueOf6).toString());
            }
        }
        hashSet.removeAll(hashSet2);
        boolean z2 = false;
        Iterator it2 = hashSet.iterator();
        while (true) {
            z = z2;
            if (!it2.hasNext()) {
                break;
            }
            C6867dw c6867dw = (C6867dw) it2.next();
            this.f22740i.clear();
            String valueOf7 = String.valueOf(c6867dw);
            aph.m16391d(new StringBuilder(String.valueOf(valueOf7).length() + 21).append("Executing firing tag ").append(valueOf7).toString());
            try {
                m16330b(m16335a(c6867dw.m16085a()));
                if (m16332b(c6867dw)) {
                    z = true;
                    String valueOf8 = String.valueOf(c6867dw);
                    aph.m16391d(new StringBuilder(String.valueOf(valueOf8).length() + 36).append("Tag configured to dispatch on fire: ").append(valueOf8).toString());
                }
            } catch (IllegalStateException e) {
                String valueOf9 = String.valueOf(e.getMessage());
                aph.m16396a(valueOf9.length() != 0 ? "Error firing tag: ".concat(valueOf9) : new String("Error firing tag: "));
            }
            z2 = z;
        }
        this.f22737f.m16313c("gtm.globals.eventName");
        if (aowVar.m16426h()) {
            String valueOf10 = String.valueOf(aowVar.m16430d());
            aph.m16391d(new StringBuilder(String.valueOf(valueOf10).length() + 35).append("Log passthrough event ").append(valueOf10).append(" to Firebase.").toString());
            try {
                this.f22735d.mo8895a(aowVar.m16428f(), aowVar.m16430d(), aowVar.m16429e(), aowVar.mo16434a());
            } catch (RemoteException e2) {
                String valueOf11 = String.valueOf(e2.getMessage());
                aph.m16396a(valueOf11.length() != 0 ? "Error calling measurement proxy:".concat(valueOf11) : new String("Error calling measurement proxy:"));
            }
        } else {
            String valueOf12 = String.valueOf(aowVar.m16430d());
            aph.m16391d(new StringBuilder(String.valueOf(valueOf12).length() + 63).append("Non-passthrough event ").append(valueOf12).append(" doesn't get logged to Firebase directly.").toString());
        }
        if (z) {
            aph.m16391d("Dispatch called for dispatchOnFire tags.");
            m16347a();
        }
    }

    /* renamed from: b */
    apr m16334b() {
        return this.f22737f;
    }
}
