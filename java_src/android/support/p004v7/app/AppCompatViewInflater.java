package android.support.p004v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.p001v4.util.ArrayMap;
import android.support.p001v4.view.ViewCompat;
import android.support.p004v7.appcompat.C0176R;
import android.support.p004v7.view.ContextThemeWrapper;
import android.support.p004v7.widget.AppCompatAutoCompleteTextView;
import android.support.p004v7.widget.AppCompatButton;
import android.support.p004v7.widget.AppCompatCheckBox;
import android.support.p004v7.widget.AppCompatCheckedTextView;
import android.support.p004v7.widget.AppCompatEditText;
import android.support.p004v7.widget.AppCompatImageButton;
import android.support.p004v7.widget.AppCompatImageView;
import android.support.p004v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.p004v7.widget.AppCompatRadioButton;
import android.support.p004v7.widget.AppCompatRatingBar;
import android.support.p004v7.widget.AppCompatSeekBar;
import android.support.p004v7.widget.AppCompatSpinner;
import android.support.p004v7.widget.AppCompatTextView;
import android.support.p004v7.widget.TintContextWrapper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.google.android.gms.analytics.p229a.C3834c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.AppCompatViewInflater */
/* loaded from: classes.dex */
public class AppCompatViewInflater {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> sConstructorMap = new ArrayMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.AppCompatViewInflater$DeclaredOnClickListener */
    /* loaded from: classes.dex */
    public static class DeclaredOnClickListener implements View.OnClickListener {
        private final View mHostView;
        private final String mMethodName;
        private Context mResolvedContext;
        private Method mResolvedMethod;

        public DeclaredOnClickListener(@NonNull View view, @NonNull String str) {
            this.mHostView = view;
            this.mMethodName = str;
        }

        @NonNull
        private void resolveMethod(@Nullable Context context, @NonNull String str) {
            Method method;
            Context context2 = context;
            while (context2 != null) {
                try {
                    if (!context2.isRestricted() && (method = context2.getClass().getMethod(this.mMethodName, View.class)) != null) {
                        this.mResolvedMethod = method;
                        this.mResolvedContext = context2;
                        return;
                    }
                } catch (NoSuchMethodException e) {
                }
                context2 = context2 instanceof ContextWrapper ? ((ContextWrapper) context2).getBaseContext() : null;
            }
            int id = this.mHostView.getId();
            throw new IllegalStateException("Could not find method " + this.mMethodName + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.mHostView.getClass() + (id == -1 ? "" : " with id '" + this.mHostView.getContext().getResources().getResourceEntryName(id) + "'"));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NonNull View view) {
            if (this.mResolvedMethod == null) {
                resolveMethod(this.mHostView.getContext(), this.mMethodName);
            }
            try {
                this.mResolvedMethod.invoke(this.mResolvedContext, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT >= 15 && !ViewCompat.hasOnClickListeners(view)) {
                return;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new DeclaredOnClickListener(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View createView(Context context, String str, String str2) {
        Constructor<? extends View> constructor = sConstructorMap.get(str);
        if (constructor == null) {
            try {
                constructor = context.getClassLoader().loadClass(str2 != null ? str2 + str : str).asSubclass(View.class).getConstructor(sConstructorSignature);
                sConstructorMap.put(str, constructor);
            } catch (Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals(C3834c.f14908b)) {
            str = attributeSet.getAttributeValue(null, AbstractC0436c.f562i);
        }
        try {
            this.mConstructorArgs[0] = context;
            this.mConstructorArgs[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return createView(context, str, null);
            }
            for (int i = 0; i < sClassPrefixList.length; i++) {
                View createView = createView(context, str, sClassPrefixList[i]);
                if (createView != null) {
                    return createView;
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        } finally {
            this.mConstructorArgs[0] = null;
            this.mConstructorArgs[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0176R.styleable.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0176R.styleable.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C0176R.styleable.View_theme, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        int i = resourceId;
        obtainStyledAttributes.recycle();
        return i != 0 ? (!(context instanceof ContextThemeWrapper) || ((ContextThemeWrapper) context).getThemeResId() != i) ? new ContextThemeWrapper(context, i) : context : context;
    }

    public final View createView(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = TintContextWrapper.wrap(context2);
        }
        View view2 = null;
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = '\b';
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = '\f';
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = new AppCompatTextView(context2, attributeSet);
                break;
            case 1:
                view2 = new AppCompatImageView(context2, attributeSet);
                break;
            case 2:
                view2 = new AppCompatButton(context2, attributeSet);
                break;
            case 3:
                view2 = new AppCompatEditText(context2, attributeSet);
                break;
            case 4:
                view2 = new AppCompatSpinner(context2, attributeSet);
                break;
            case 5:
                view2 = new AppCompatImageButton(context2, attributeSet);
                break;
            case 6:
                view2 = new AppCompatCheckBox(context2, attributeSet);
                break;
            case 7:
                view2 = new AppCompatRadioButton(context2, attributeSet);
                break;
            case '\b':
                view2 = new AppCompatCheckedTextView(context2, attributeSet);
                break;
            case '\t':
                view2 = new AppCompatAutoCompleteTextView(context2, attributeSet);
                break;
            case '\n':
                view2 = new AppCompatMultiAutoCompleteTextView(context2, attributeSet);
                break;
            case 11:
                view2 = new AppCompatRatingBar(context2, attributeSet);
                break;
            case '\f':
                view2 = new AppCompatSeekBar(context2, attributeSet);
                break;
        }
        View createViewFromTag = (view2 != null || context == context2) ? view2 : createViewFromTag(context2, str, attributeSet);
        if (createViewFromTag != null) {
            checkOnClickListener(createViewFromTag, attributeSet);
        }
        return createViewFromTag;
    }
}
