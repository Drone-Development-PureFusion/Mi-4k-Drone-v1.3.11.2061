package android.support.p001v4.view;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
/* renamed from: android.support.v4.view.KeyEventCompat */
/* loaded from: classes.dex */
public class KeyEventCompat {
    static final KeyEventVersionImpl IMPL;

    /* renamed from: android.support.v4.view.KeyEventCompat$BaseKeyEventVersionImpl */
    /* loaded from: classes.dex */
    static class BaseKeyEventVersionImpl implements KeyEventVersionImpl {
        private static final int META_ALL_MASK = 247;
        private static final int META_MODIFIER_MASK = 247;

        BaseKeyEventVersionImpl() {
        }

        private static int metaStateFilterDirectionalModifiers(int i, int i2, int i3, int i4, int i5) {
            boolean z = true;
            boolean z2 = (i2 & i3) != 0;
            int i6 = i4 | i5;
            if ((i2 & i6) == 0) {
                z = false;
            }
            if (!z2) {
                return z ? i & (i3 ^ (-1)) : i;
            } else if (!z) {
                return i & (i6 ^ (-1));
            } else {
                throw new IllegalArgumentException("bad arguments");
            }
        }

        @Override // android.support.p001v4.view.KeyEventCompat.KeyEventVersionImpl
        public boolean dispatch(KeyEvent keyEvent, KeyEvent.Callback callback, Object obj, Object obj2) {
            return keyEvent.dispatch(callback);
        }

        @Override // android.support.p001v4.view.KeyEventCompat.KeyEventVersionImpl
        public Object getKeyDispatcherState(View view) {
            return null;
        }

        @Override // android.support.p001v4.view.KeyEventCompat.KeyEventVersionImpl
        public boolean isTracking(KeyEvent keyEvent) {
            return false;
        }

        @Override // android.support.p001v4.view.KeyEventCompat.KeyEventVersionImpl
        public boolean metaStateHasModifiers(int i, int i2) {
            return metaStateFilterDirectionalModifiers(metaStateFilterDirectionalModifiers(normalizeMetaState(i) & 247, i2, 1, 64, 128), i2, 2, 16, 32) == i2;
        }

        @Override // android.support.p001v4.view.KeyEventCompat.KeyEventVersionImpl
        public boolean metaStateHasNoModifiers(int i) {
            return (normalizeMetaState(i) & 247) == 0;
        }

        @Override // android.support.p001v4.view.KeyEventCompat.KeyEventVersionImpl
        public int normalizeMetaState(int i) {
            int i2 = (i & 192) != 0 ? i | 1 : i;
            if ((i2 & 48) != 0) {
                i2 |= 2;
            }
            return i2 & 247;
        }

        @Override // android.support.p001v4.view.KeyEventCompat.KeyEventVersionImpl
        public void startTracking(KeyEvent keyEvent) {
        }
    }

    /* renamed from: android.support.v4.view.KeyEventCompat$EclairKeyEventVersionImpl */
    /* loaded from: classes.dex */
    static class EclairKeyEventVersionImpl extends BaseKeyEventVersionImpl {
        EclairKeyEventVersionImpl() {
        }

        @Override // android.support.p001v4.view.KeyEventCompat.BaseKeyEventVersionImpl, android.support.p001v4.view.KeyEventCompat.KeyEventVersionImpl
        public boolean dispatch(KeyEvent keyEvent, KeyEvent.Callback callback, Object obj, Object obj2) {
            return KeyEventCompatEclair.dispatch(keyEvent, callback, obj, obj2);
        }

        @Override // android.support.p001v4.view.KeyEventCompat.BaseKeyEventVersionImpl, android.support.p001v4.view.KeyEventCompat.KeyEventVersionImpl
        public Object getKeyDispatcherState(View view) {
            return KeyEventCompatEclair.getKeyDispatcherState(view);
        }

        @Override // android.support.p001v4.view.KeyEventCompat.BaseKeyEventVersionImpl, android.support.p001v4.view.KeyEventCompat.KeyEventVersionImpl
        public boolean isTracking(KeyEvent keyEvent) {
            return KeyEventCompatEclair.isTracking(keyEvent);
        }

        @Override // android.support.p001v4.view.KeyEventCompat.BaseKeyEventVersionImpl, android.support.p001v4.view.KeyEventCompat.KeyEventVersionImpl
        public void startTracking(KeyEvent keyEvent) {
            KeyEventCompatEclair.startTracking(keyEvent);
        }
    }

    /* renamed from: android.support.v4.view.KeyEventCompat$HoneycombKeyEventVersionImpl */
    /* loaded from: classes.dex */
    static class HoneycombKeyEventVersionImpl extends EclairKeyEventVersionImpl {
        HoneycombKeyEventVersionImpl() {
        }

        @Override // android.support.p001v4.view.KeyEventCompat.BaseKeyEventVersionImpl, android.support.p001v4.view.KeyEventCompat.KeyEventVersionImpl
        public boolean metaStateHasModifiers(int i, int i2) {
            return KeyEventCompatHoneycomb.metaStateHasModifiers(i, i2);
        }

        @Override // android.support.p001v4.view.KeyEventCompat.BaseKeyEventVersionImpl, android.support.p001v4.view.KeyEventCompat.KeyEventVersionImpl
        public boolean metaStateHasNoModifiers(int i) {
            return KeyEventCompatHoneycomb.metaStateHasNoModifiers(i);
        }

        @Override // android.support.p001v4.view.KeyEventCompat.BaseKeyEventVersionImpl, android.support.p001v4.view.KeyEventCompat.KeyEventVersionImpl
        public int normalizeMetaState(int i) {
            return KeyEventCompatHoneycomb.normalizeMetaState(i);
        }
    }

    /* renamed from: android.support.v4.view.KeyEventCompat$KeyEventVersionImpl */
    /* loaded from: classes.dex */
    interface KeyEventVersionImpl {
        boolean dispatch(KeyEvent keyEvent, KeyEvent.Callback callback, Object obj, Object obj2);

        Object getKeyDispatcherState(View view);

        boolean isTracking(KeyEvent keyEvent);

        boolean metaStateHasModifiers(int i, int i2);

        boolean metaStateHasNoModifiers(int i);

        int normalizeMetaState(int i);

        void startTracking(KeyEvent keyEvent);
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            IMPL = new HoneycombKeyEventVersionImpl();
        } else {
            IMPL = new BaseKeyEventVersionImpl();
        }
    }

    public static boolean dispatch(KeyEvent keyEvent, KeyEvent.Callback callback, Object obj, Object obj2) {
        return IMPL.dispatch(keyEvent, callback, obj, obj2);
    }

    public static Object getKeyDispatcherState(View view) {
        return IMPL.getKeyDispatcherState(view);
    }

    public static boolean hasModifiers(KeyEvent keyEvent, int i) {
        return IMPL.metaStateHasModifiers(keyEvent.getMetaState(), i);
    }

    public static boolean hasNoModifiers(KeyEvent keyEvent) {
        return IMPL.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public static boolean isTracking(KeyEvent keyEvent) {
        return IMPL.isTracking(keyEvent);
    }

    public static boolean metaStateHasModifiers(int i, int i2) {
        return IMPL.metaStateHasModifiers(i, i2);
    }

    public static boolean metaStateHasNoModifiers(int i) {
        return IMPL.metaStateHasNoModifiers(i);
    }

    public static int normalizeMetaState(int i) {
        return IMPL.normalizeMetaState(i);
    }

    public static void startTracking(KeyEvent keyEvent) {
        IMPL.startTracking(keyEvent);
    }
}
