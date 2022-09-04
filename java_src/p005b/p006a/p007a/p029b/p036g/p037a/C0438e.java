package p005b.p006a.p007a.p029b.p036g.p037a;

import java.util.Properties;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p058r.C0708g;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.b.g.a.e */
/* loaded from: classes.dex */
public class C0438e {

    /* renamed from: b.a.a.b.g.a.e$a */
    /* loaded from: classes.dex */
    public enum EnumC0440a {
        LOCAL,
        CONTEXT,
        SYSTEM
    }

    /* renamed from: a */
    public static EnumC0440a m39282a(String str) {
        return EnumC0440a.SYSTEM.toString().equalsIgnoreCase(str) ? EnumC0440a.SYSTEM : EnumC0440a.CONTEXT.toString().equalsIgnoreCase(str) ? EnumC0440a.CONTEXT : EnumC0440a.LOCAL;
    }

    /* renamed from: a */
    public static void m39284a(C0479k c0479k, String str, String str2, EnumC0440a enumC0440a) {
        switch (enumC0440a) {
            case LOCAL:
                c0479k.m39198a(str, str2);
                return;
            case CONTEXT:
                c0479k.c_().mo39319a(str, str2);
                return;
            case SYSTEM:
                C0724u.m38387a(c0479k, str, str2);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public static void m39283a(C0479k c0479k, Properties properties, EnumC0440a enumC0440a) {
        switch (enumC0440a) {
            case LOCAL:
                c0479k.m39196a(properties);
                return;
            case CONTEXT:
                new C0708g(c0479k.c_()).m38429a(properties);
                return;
            case SYSTEM:
                C0724u.m38386a(c0479k, properties);
                return;
            default:
                return;
        }
    }
}
