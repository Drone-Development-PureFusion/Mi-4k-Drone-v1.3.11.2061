package com.google.firebase.iid;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
/* renamed from: com.google.firebase.iid.d */
/* loaded from: classes.dex */
public class C9911d {

    /* renamed from: a */
    private static final Object f30811a = new Object();

    /* renamed from: b */
    private final C9914f f30812b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9911d(C9914f c9914f) {
        this.f30812b = c9914f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public String m6564a() {
        String str = null;
        synchronized (f30811a) {
            String string = this.f30812b.m6543a().getString("topic_operaion_queue", null);
            if (string != null) {
                String[] split = string.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                if (split.length > 1 && !TextUtils.isEmpty(split[1])) {
                    str = split[1];
                }
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m6563a(String str) {
        synchronized (f30811a) {
            String string = this.f30812b.m6543a().getString("topic_operaion_queue", "");
            String valueOf = String.valueOf(Constants.ACCEPT_TIME_SEPARATOR_SP);
            this.f30812b.m6543a().edit().putString("topic_operaion_queue", new StringBuilder(String.valueOf(string).length() + 0 + String.valueOf(valueOf).length() + String.valueOf(str).length()).append(string).append(valueOf).append(str).toString()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m6562b(String str) {
        boolean z;
        synchronized (f30811a) {
            String string = this.f30812b.m6543a().getString("topic_operaion_queue", "");
            String valueOf = String.valueOf(Constants.ACCEPT_TIME_SEPARATOR_SP);
            String valueOf2 = String.valueOf(str);
            if (string.startsWith(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf))) {
                String valueOf3 = String.valueOf(Constants.ACCEPT_TIME_SEPARATOR_SP);
                String valueOf4 = String.valueOf(str);
                this.f30812b.m6543a().edit().putString("topic_operaion_queue", string.substring((valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3)).length())).apply();
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
