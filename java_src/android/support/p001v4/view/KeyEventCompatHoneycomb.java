package android.support.p001v4.view;

import android.view.KeyEvent;
/* renamed from: android.support.v4.view.KeyEventCompatHoneycomb */
/* loaded from: classes.dex */
class KeyEventCompatHoneycomb {
    KeyEventCompatHoneycomb() {
    }

    public static boolean metaStateHasModifiers(int i, int i2) {
        return KeyEvent.metaStateHasModifiers(i, i2);
    }

    public static boolean metaStateHasNoModifiers(int i) {
        return KeyEvent.metaStateHasNoModifiers(i);
    }

    public static int normalizeMetaState(int i) {
        return KeyEvent.normalizeMetaState(i);
    }
}
