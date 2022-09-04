package com.baidu.tts.p098d.p100b;

import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.database.C1154a;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.tools.DataTool;
import com.baidu.tts.tools.StringTool;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.baidu.tts.d.b.c */
/* loaded from: classes.dex */
public class C1146c {

    /* renamed from: a */
    private String f2704a;

    /* renamed from: b */
    private Map<String, String> f2705b = new HashMap();

    public C1146c(String str) {
        this.f2704a = str;
    }

    /* renamed from: a */
    public String m36444a() {
        return DataTool.getMapValue(this.f2705b, EnumC1175g.ABS_PATH.m36317b());
    }

    /* renamed from: a */
    public void m36443a(ModelFileBags modelFileBags, C1154a c1154a) {
        c1154a.m36382a(modelFileBags);
        m36442a(c1154a);
    }

    /* renamed from: a */
    public boolean m36442a(C1154a c1154a) {
        this.f2705b = c1154a.m36372d(this.f2704a);
        if (DataTool.isMapEmpty(this.f2705b)) {
            return false;
        }
        String str = this.f2705b.get(EnumC1175g.ABS_PATH.m36317b());
        if (StringTool.isEmpty(str)) {
            c1154a.m36375b(this.f2704a);
            return false;
        }
        C1148e.m36420a().m36414c(str).m36452c(this.f2704a);
        return true;
    }

    /* renamed from: b */
    public String m36441b() {
        return DataTool.getMapValue(this.f2705b, EnumC1175g.LENGTH.m36317b());
    }

    /* renamed from: c */
    public String m36440c() {
        return DataTool.getMapValue(this.f2705b, EnumC1175g.MD5.m36317b());
    }
}
