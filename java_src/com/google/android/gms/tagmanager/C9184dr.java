package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import com.google.android.gms.internal.EnumC6958fh;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.dr */
/* loaded from: classes2.dex */
public class C9184dr extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28974a = EnumC6890eg.FUNCTION_CALL.toString();

    /* renamed from: b */
    private static final String f28975b = EnumC6958fh.FUNCTION_CALL_NAME.toString();

    /* renamed from: c */
    private static final String f28976c = EnumC6958fh.ADDITIONAL_PARAMS.toString();

    /* renamed from: d */
    private final AbstractC9185a f28977d;

    /* renamed from: com.google.android.gms.tagmanager.dr$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9185a {
        /* renamed from: a */
        Object mo9009a(String str, Map<String, Object> map);
    }

    public C9184dr(AbstractC9185a abstractC9185a) {
        super(f28974a, f28975b);
        this.f28977d = abstractC9185a;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        String m9132a = C9147cw.m9132a(map.get(f28975b));
        HashMap hashMap = new HashMap();
        AbstractC7090hj.C7091a c7091a = map.get(f28976c);
        if (c7091a != null) {
            Object m9112f = C9147cw.m9112f(c7091a);
            if (!(m9112f instanceof Map)) {
                C9065aw.m9299b("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
                return C9147cw.m9110g();
            }
            for (Map.Entry entry : ((Map) m9112f).entrySet()) {
                hashMap.put(entry.getKey().toString(), entry.getValue());
            }
        }
        try {
            return C9147cw.m9111f(this.f28977d.mo9009a(m9132a, hashMap));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            C9065aw.m9299b(new StringBuilder(String.valueOf(m9132a).length() + 34 + String.valueOf(valueOf).length()).append("Custom macro/tag ").append(m9132a).append(" threw exception ").append(valueOf).toString());
            return C9147cw.m9110g();
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return false;
    }
}
