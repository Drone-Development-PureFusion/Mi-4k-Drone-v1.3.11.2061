package com.baidu.tts.p112l;

import android.content.Context;
import com.baidu.tts.client.model.BasicHandler;
import com.baidu.tts.client.model.Conditions;
import com.baidu.tts.client.model.DownloadHandler;
import com.baidu.tts.client.model.LibEngineParams;
import com.baidu.tts.client.model.ModelBags;
import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.database.C1154a;
import com.baidu.tts.database.C1157d;
import com.baidu.tts.p098d.C1143b;
import com.baidu.tts.p098d.C1151d;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.p112l.p113a.C1210h;
import com.baidu.tts.tools.DataTool;
import com.baidu.tts.tools.MD5;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
/* renamed from: com.baidu.tts.l.a */
/* loaded from: classes.dex */
public class C1202a {

    /* renamed from: a */
    private Context f3034a;

    /* renamed from: b */
    private C1154a f3035b;

    /* renamed from: c */
    private C1157d f3036c;

    /* renamed from: d */
    private C1210h f3037d;

    /* renamed from: e */
    private C1151d f3038e;

    public C1202a(Context context) {
        this.f3034a = context;
        m36228g();
    }

    /* renamed from: g */
    private void m36228g() {
        this.f3035b = new C1154a(this);
        this.f3036c = new C1157d(this);
        this.f3037d = new C1210h(this);
        this.f3038e = new C1151d();
        this.f3038e.m36399a(this);
        this.f3038e.m36401a();
    }

    /* renamed from: a */
    public int m36244a(int i, int i2) {
        return this.f3036c.m36369a(i, i2);
    }

    /* renamed from: a */
    public BasicHandler<ModelBags> m36243a(Conditions conditions) {
        return this.f3037d.m36216a(conditions);
    }

    /* renamed from: a */
    public BasicHandler<ModelBags> m36242a(Conditions conditions, boolean z) {
        return this.f3037d.m36215a(conditions, z);
    }

    /* renamed from: a */
    public BasicHandler<ModelFileBags> m36237a(Set<String> set) {
        return this.f3037d.m36214a(set);
    }

    /* renamed from: a */
    public DownloadHandler m36241a(C1143b c1143b) {
        return this.f3038e.m36400a(c1143b);
    }

    /* renamed from: a */
    public LibEngineParams m36245a() {
        return this.f3037d.m36217a();
    }

    /* renamed from: a */
    public String m36239a(String str, String str2) {
        return this.f3035b.m36379a(str, str2);
    }

    /* renamed from: a */
    public void m36238a(String str, String str2, String str3) {
        this.f3036c.m36367a(str, str2, str3);
    }

    /* renamed from: a */
    public boolean m36240a(String str) {
        Map<String, String> m36372d = this.f3035b.m36372d(str);
        if (DataTool.isMapEmpty(m36372d)) {
            return false;
        }
        String str2 = m36372d.get(EnumC1175g.LENGTH.m36317b());
        String str3 = m36372d.get(EnumC1175g.MD5.m36317b());
        File file = new File(m36372d.get(EnumC1175g.ABS_PATH.m36317b()));
        return file.exists() && file.length() == Long.parseLong(str2) && MD5.getInstance().getBigFileMd5(file).equalsIgnoreCase(str3);
    }

    /* renamed from: b */
    public BasicHandler<ModelBags> m36236b() {
        return this.f3037d.m36213b();
    }

    /* renamed from: b */
    public BasicHandler<ModelFileBags> m36234b(Set<String> set) {
        return this.f3037d.m36212b(set);
    }

    /* renamed from: b */
    public boolean m36235b(String str) {
        Map<String, String> m36371e = this.f3035b.m36371e(str);
        if (DataTool.isMapEmpty(m36371e)) {
            return false;
        }
        return m36240a(m36371e.get(EnumC1175g.TEXT_DATA_ID.m36317b())) && m36240a(m36371e.get(EnumC1175g.SPEECH_DATA_ID.m36317b()));
    }

    /* renamed from: c */
    public void m36233c() {
        this.f3038e.m36397b();
    }

    /* renamed from: c */
    public void m36232c(String str) {
        this.f3036c.m36368a(str);
    }

    /* renamed from: d */
    public Context m36231d() {
        return this.f3034a;
    }

    /* renamed from: e */
    public C1154a m36230e() {
        return this.f3035b;
    }

    /* renamed from: f */
    public Map<String, ArrayList> m36229f() {
        return this.f3036c.m36370a();
    }
}
