package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.vision.text.internal.client.WordBoxParcel;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.vision.text.a */
/* loaded from: classes2.dex */
public class C9307a implements AbstractC9309c {

    /* renamed from: a */
    private WordBoxParcel f29368a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9307a(WordBoxParcel wordBoxParcel) {
        this.f29368a = wordBoxParcel;
    }

    /* renamed from: a */
    public String m8660a() {
        return this.f29368a.f29408g;
    }

    @Override // com.google.android.gms.vision.text.AbstractC9309c
    /* renamed from: b */
    public String mo8652b() {
        return this.f29368a.f29406e;
    }

    @Override // com.google.android.gms.vision.text.AbstractC9309c
    /* renamed from: c */
    public Rect mo8651c() {
        return C9315f.m8635a(this);
    }

    @Override // com.google.android.gms.vision.text.AbstractC9309c
    /* renamed from: d */
    public Point[] mo8650d() {
        return C9315f.m8634a(this.f29368a.f29404c);
    }

    @Override // com.google.android.gms.vision.text.AbstractC9309c
    /* renamed from: e */
    public List<? extends AbstractC9309c> mo8649e() {
        return new ArrayList();
    }
}
