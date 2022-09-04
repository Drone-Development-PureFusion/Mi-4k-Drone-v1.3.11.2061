package com.google.p222a.p223a;

import java.io.IOException;
/* renamed from: com.google.a.a.d */
/* loaded from: classes2.dex */
public class C3389d extends IOException {
    public C3389d(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C3389d m27946a() {
        return new C3389d("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C3389d m27945b() {
        return new C3389d("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C3389d m27944c() {
        return new C3389d("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C3389d m27943d() {
        return new C3389d("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C3389d m27942e() {
        return new C3389d("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C3389d m27941f() {
        return new C3389d("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C3389d m27940g() {
        return new C3389d("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static C3389d m27939h() {
        return new C3389d("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }
}
