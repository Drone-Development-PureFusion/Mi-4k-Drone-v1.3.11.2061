package android.support.p001v4.util;

import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: android.support.v4.util.DebugUtils */
/* loaded from: classes.dex */
public class DebugUtils {
    public static void buildShortClassTag(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if ((simpleName == null || simpleName.length() <= 0) && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append(C0494h.f734v);
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
