package com.google.firebase.appindexing.p252a;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.appindexing.AbstractC9680g;
import com.google.firebase.appindexing.C9677d;
import com.google.firebase.appindexing.internal.C9706g;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.p252a.AbstractC9667e;
import java.util.Arrays;
/* renamed from: com.google.firebase.appindexing.a.e */
/* loaded from: classes2.dex */
public abstract class AbstractC9667e<T extends AbstractC9667e<?>> {

    /* renamed from: d */
    final Bundle f30268d = new Bundle();

    /* renamed from: e */
    final String f30269e;

    /* renamed from: f */
    Thing.Metadata f30270f;

    /* renamed from: g */
    String f30271g;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9667e(@NonNull String str) {
        C4588d.m23627a(str);
        C4588d.m23625a(str);
        this.f30269e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private T m7517a() {
        return this;
    }

    /* renamed from: a */
    private T m7515a(@NonNull String str, @NonNull Thing... thingArr) {
        C4588d.m23627a(str);
        C4588d.m23627a(thingArr);
        if (thingArr.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < thingArr.length; i2++) {
                thingArr[i] = thingArr[i2];
                if (thingArr[i2] == null) {
                    C9706g.m7406a(new StringBuilder(58).append("Thing at ").append(i2).append(" is null and is ignored by put method.").toString());
                } else {
                    i++;
                }
            }
            if (i > 0) {
                this.f30268d.putParcelableArray(str, (Parcelable[]) m7513a((Thing[]) Arrays.copyOfRange(thingArr, 0, i)));
            }
        } else {
            C9706g.m7406a("Thing array is empty and is ignored by put method.");
        }
        return m7517a();
    }

    /* renamed from: a */
    private static long[] m7514a(long[] jArr) {
        if (jArr.length < 100) {
            return jArr;
        }
        C9706g.m7406a("Input Array of elements is too big, cutting off.");
        return Arrays.copyOf(jArr, 100);
    }

    /* renamed from: a */
    private static <S> S[] m7513a(S[] sArr) {
        if (sArr.length < 100) {
            return sArr;
        }
        C9706g.m7406a("Input Array of elements is too big, cutting off.");
        return (S[]) Arrays.copyOf(sArr, 100);
    }

    /* renamed from: a */
    private static boolean[] m7512a(boolean[] zArr) {
        if (zArr.length < 100) {
            return zArr;
        }
        C9706g.m7406a("Input Array of elements is too big, cutting off.");
        return Arrays.copyOf(zArr, 100);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public <S extends AbstractC9667e> T m7516a(@NonNull String str, @NonNull S... sArr) {
        C4588d.m23627a(str);
        C4588d.m23627a(sArr);
        if (sArr.length > 0) {
            Thing[] thingArr = new Thing[sArr.length];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= sArr.length) {
                    break;
                }
                if (sArr[i2] == null) {
                    C9706g.m7406a(new StringBuilder(60).append("Builder at ").append(i2).append(" is null and is ignored by put method.").toString());
                } else {
                    thingArr[i2] = (Thing) sArr[i2].build();
                }
                i = i2 + 1;
            }
            if (thingArr.length > 0) {
                m7515a(str, thingArr);
            }
        } else {
            C9706g.m7406a("Builder array is empty and is ignored by put method.");
        }
        return m7517a();
    }

    @KeepName
    public final AbstractC9680g build() {
        return new Thing(new Bundle(this.f30268d), this.f30270f == null ? AbstractC9680g.AbstractC9682b.f30284a : this.f30270f, this.f30271g, this.f30269e);
    }

    @KeepName
    public T put(@NonNull String str, @NonNull long... jArr) {
        C4588d.m23627a(str);
        C4588d.m23627a(jArr);
        if (jArr.length > 0) {
            this.f30268d.putLongArray(str, m7514a(jArr));
        } else {
            C9706g.m7406a("Long array is empty and is ignored by put method.");
        }
        return m7517a();
    }

    @KeepName
    public T put(@NonNull String str, @NonNull AbstractC9680g... abstractC9680gArr) {
        C4588d.m23627a(str);
        C4588d.m23627a(abstractC9680gArr);
        Thing[] thingArr = new Thing[abstractC9680gArr.length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= abstractC9680gArr.length) {
                m7515a(str, thingArr);
                return m7517a();
            } else if (abstractC9680gArr[i2] != null && !(abstractC9680gArr[i2] instanceof Thing)) {
                throw new C9677d("Invalid Indexable encountered. Use Indexable.Builder or convenience methods under Indexables to create the Indexable.");
            } else {
                thingArr[i2] = (Thing) abstractC9680gArr[i2];
                i = i2 + 1;
            }
        }
    }

    @KeepName
    public T put(@NonNull String str, @NonNull String... strArr) {
        C4588d.m23627a(str);
        C4588d.m23627a(strArr);
        if (strArr.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < Math.min(strArr.length, 100); i2++) {
                strArr[i] = strArr[i2];
                if (strArr[i2] == null) {
                    C9706g.m7406a(new StringBuilder(59).append("String at ").append(i2).append(" is null and is ignored by put method.").toString());
                } else {
                    if (strArr[i].length() > 20000) {
                        C9706g.m7406a(new StringBuilder(53).append("String at ").append(i2).append(" is too long, truncating string.").toString());
                        strArr[i] = strArr[i].substring(0, 20000);
                    }
                    i++;
                }
            }
            if (i > 0) {
                this.f30268d.putStringArray(str, (String[]) m7513a((String[]) Arrays.copyOfRange(strArr, 0, i)));
            }
        } else {
            C9706g.m7406a("String array is empty and is ignored by put method.");
        }
        return m7517a();
    }

    @KeepName
    public T put(@NonNull String str, @NonNull boolean... zArr) {
        C4588d.m23627a(str);
        C4588d.m23627a(zArr);
        if (zArr.length > 0) {
            this.f30268d.putBooleanArray(str, m7512a(zArr));
        } else {
            C9706g.m7406a("Boolean array is empty and is ignored by put method.");
        }
        return m7517a();
    }

    @KeepName
    public final T setDescription(@NonNull String str) {
        C4588d.m23627a(str);
        return put("description", str);
    }

    @KeepName
    public final T setImage(@NonNull String str) {
        C4588d.m23627a(str);
        return put("image", str);
    }

    @KeepName
    public T setMetadata(@NonNull AbstractC9680g.AbstractC9682b.C9683a c9683a) {
        C4588d.m23622a(this.f30270f == null, "setMetadata may only be called once");
        C4588d.m23627a(c9683a);
        this.f30270f = c9683a.m7471a();
        return m7517a();
    }

    @KeepName
    public final T setName(@NonNull String str) {
        C4588d.m23627a(str);
        return put("name", str);
    }

    @KeepName
    public final T setSameAs(@NonNull String str) {
        C4588d.m23627a(str);
        return put("sameAs", str);
    }

    @KeepName
    public final T setUrl(@NonNull String str) {
        C4588d.m23627a(str);
        this.f30271g = str;
        return m7517a();
    }
}
