package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import com.google.android.gms.internal.EnumC6958fh;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.bw */
/* loaded from: classes2.dex */
public class C9097bw extends AbstractC9141cr {

    /* renamed from: a */
    private static final String f28774a = EnumC6890eg.REGEX.toString();

    /* renamed from: b */
    private static final String f28775b = EnumC6958fh.IGNORE_CASE.toString();

    public C9097bw() {
        super(f28774a);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9141cr
    /* renamed from: a */
    protected boolean mo8890a(String str, String str2, Map<String, AbstractC7090hj.C7091a> map) {
        try {
            return Pattern.compile(str2, C9147cw.m9116e(map.get(f28775b)).booleanValue() ? 66 : 64).matcher(str).find();
        } catch (PatternSyntaxException e) {
            return false;
        }
    }
}
