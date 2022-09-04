package p005b.p006a.p007a.p029b.p052m;

import com.fimi.soul.media.player.FimiMediaMeta;
import java.io.File;
import p005b.p006a.p007a.p029b.p058r.C0715n;
import p005b.p006a.p007a.p029b.p058r.C0719r;
/* renamed from: b.a.a.b.m.h */
/* loaded from: classes.dex */
public class C0636h<E> extends AbstractC0641m<E> {

    /* renamed from: a */
    public static final String f1131a = "http://logback.qos.ch/codes.html#sbtp_size_format";

    /* renamed from: b */
    public static final long f1132b = 10485760;

    /* renamed from: d */
    C0715n f1134d;

    /* renamed from: c */
    String f1133c = Long.toString(f1132b);

    /* renamed from: e */
    private C0719r f1135e = new C0719r();

    public C0636h() {
    }

    public C0636h(String str) {
        m38646a(str);
    }

    /* renamed from: a */
    public String m38647a() {
        return this.f1133c;
    }

    /* renamed from: a */
    public void m38646a(String str) {
        this.f1133c = str;
        this.f1134d = C0715n.m38409a(str);
    }

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0640l
    /* renamed from: a */
    public boolean mo38623a(File file, E e) {
        if (this.f1135e.m38402a()) {
            return false;
        }
        this.f1135e.m38401a(System.currentTimeMillis());
        return file.length() >= this.f1134d.m38410a();
    }

    /* renamed from: b */
    long m38645b(String str) {
        if (str == null) {
            return f1132b;
        }
        String upperCase = str.trim().toUpperCase();
        long j = 1;
        int indexOf = upperCase.indexOf("KB");
        if (indexOf != -1) {
            j = FimiMediaMeta.AV_CH_SIDE_RIGHT;
            upperCase = upperCase.substring(0, indexOf);
        } else {
            int indexOf2 = upperCase.indexOf("MB");
            if (indexOf2 != -1) {
                j = 1048576;
                upperCase = upperCase.substring(0, indexOf2);
            } else {
                int indexOf3 = upperCase.indexOf("GB");
                if (indexOf3 != -1) {
                    j = FimiMediaMeta.AV_CH_STEREO_RIGHT;
                    upperCase = upperCase.substring(0, indexOf3);
                }
            }
        }
        if (upperCase == null) {
            return f1132b;
        }
        try {
            return Long.valueOf(upperCase).longValue() * j;
        } catch (NumberFormatException e) {
            c("[" + upperCase + "] is not in proper int format. Please refer to " + f1131a);
            a("[" + str + "] not in expected format.", e);
            return f1132b;
        }
    }
}
