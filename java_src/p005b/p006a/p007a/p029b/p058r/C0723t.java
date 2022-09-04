package p005b.p006a.p007a.p029b.p058r;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
/* renamed from: b.a.a.b.r.t */
/* loaded from: classes.dex */
public class C0723t {

    /* renamed from: a */
    public static final String f1320a = "^\\p{Alpha}[\\p{Alnum}+.-]*:.*$";

    /* renamed from: b */
    public static final String f1321b = "classpath:";

    /* renamed from: a */
    public static URL m38389a(String str) {
        URL url;
        if (str == null) {
            throw new NullPointerException("location is required");
        }
        if (!str.matches(f1320a)) {
            url = C0720s.m38397a(str);
        } else if (str.startsWith(f1321b)) {
            String substring = str.substring(f1321b.length());
            if (substring.startsWith("/")) {
                substring = substring.substring(1);
            }
            if (substring.length() == 0) {
                throw new MalformedURLException("path is required");
            }
            url = C0720s.m38397a(substring);
        } else {
            url = new URL(str);
        }
        if (url != null) {
            return url;
        }
        throw new FileNotFoundException(str);
    }
}
