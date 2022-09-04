package com.google.android.gms.internal;

import java.io.IOException;
/* renamed from: com.google.android.gms.internal.rc */
/* loaded from: classes2.dex */
public class C7648rc extends IOException {
    public C7648rc(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C7648rc m13864a() {
        return new C7648rc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C7648rc m13863b() {
        return new C7648rc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C7648rc m13862c() {
        return new C7648rc("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C7648rc m13861d() {
        return new C7648rc("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C7648rc m13860e() {
        return new C7648rc("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C7648rc m13859f() {
        return new C7648rc("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C7648rc m13858g() {
        return new C7648rc("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
