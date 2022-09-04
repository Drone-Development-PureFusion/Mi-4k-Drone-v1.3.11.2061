package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.ik */
/* loaded from: classes2.dex */
public abstract class AbstractC7162ik<K, V> {

    /* renamed from: a */
    private static final String f24088a = AbstractC7162ik.class.getSimpleName();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static <K, V> HashMap<K, V> m15353b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            Log.d(f24088a, "decode object failure");
        }
        return null;
    }

    /* renamed from: a */
    protected abstract HashMap<K, V> mo13699a();

    /* renamed from: a */
    protected abstract void mo13698a(String str);

    public String toString() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(mo13699a());
            objectOutputStream.close();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException e) {
            return null;
        }
    }
}
