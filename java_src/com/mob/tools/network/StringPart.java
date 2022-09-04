package com.mob.tools.network;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
/* loaded from: classes2.dex */
public class StringPart extends HTTPPart {

    /* renamed from: sb */
    private StringBuilder f31137sb = new StringBuilder();

    public StringPart append(String str) {
        this.f31137sb.append(str);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mob.tools.network.HTTPPart
    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.f31137sb.toString().getBytes("utf-8"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mob.tools.network.HTTPPart
    public long length() {
        return this.f31137sb.toString().getBytes("utf-8").length;
    }

    public String toString() {
        return this.f31137sb.toString();
    }
}
