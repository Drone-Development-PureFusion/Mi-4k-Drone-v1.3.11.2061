package p282m.framework.p285ui.widget.asyncview;

import android.graphics.Bitmap;
/* renamed from: m.framework.ui.widget.asyncview.e */
/* loaded from: classes2.dex */
public class C10969e implements AbstractC10968d {

    /* renamed from: a */
    public static final C10969e f35372a = new C10969e();

    private C10969e() {
    }

    @Override // p282m.framework.p285ui.widget.asyncview.AbstractC10968d
    /* renamed from: a */
    public Bitmap mo2441a(AbstractC10959a abstractC10959a, Bitmap bitmap, String str) {
        if (str == null || str.trim().length() <= 0 || !str.equals(abstractC10959a.getUrl())) {
            return null;
        }
        return bitmap;
    }
}
