package com.xiaomi.market.sdk;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/* renamed from: com.xiaomi.market.sdk.e */
/* loaded from: classes2.dex */
public class C10440e extends AbstractC10444i {

    /* renamed from: G */
    final /* synthetic */ C10438c f32428G;

    /* renamed from: H */
    private File f32429H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10440e(C10438c c10438c, File file) {
        super(c10438c, new FileOutputStream(file));
        this.f32428G = c10438c;
        this.f32429H = file;
    }

    @Override // com.xiaomi.market.sdk.AbstractC10444i
    public void reset() {
        try {
            this.f32443S.close();
        } catch (IOException e) {
        }
        this.f32429H.delete();
        try {
            this.f32443S = new FileOutputStream(this.f32429H);
        } catch (FileNotFoundException e2) {
        }
    }
}
