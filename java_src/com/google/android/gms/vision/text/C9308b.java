package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import com.google.android.gms.vision.text.internal.client.WordBoxParcel;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.vision.text.b */
/* loaded from: classes2.dex */
public class C9308b implements AbstractC9309c {

    /* renamed from: a */
    private LineBoxParcel f29369a;

    /* renamed from: b */
    private List<C9307a> f29370b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9308b(LineBoxParcel lineBoxParcel) {
        this.f29369a = lineBoxParcel;
    }

    /* renamed from: a */
    List<C9307a> m8659a() {
        if (this.f29369a.f29387b.length == 0) {
            return new ArrayList(0);
        }
        if (this.f29370b == null) {
            this.f29370b = new ArrayList(this.f29369a.f29387b.length);
            for (WordBoxParcel wordBoxParcel : this.f29369a.f29387b) {
                this.f29370b.add(new C9307a(wordBoxParcel));
            }
        }
        return this.f29370b;
    }

    @Override // com.google.android.gms.vision.text.AbstractC9309c
    /* renamed from: b */
    public String mo8652b() {
        return this.f29369a.f29391f;
    }

    @Override // com.google.android.gms.vision.text.AbstractC9309c
    /* renamed from: c */
    public Rect mo8651c() {
        return C9315f.m8635a(this);
    }

    @Override // com.google.android.gms.vision.text.AbstractC9309c
    /* renamed from: d */
    public Point[] mo8650d() {
        return C9315f.m8634a(this.f29369a.f29388c);
    }

    @Override // com.google.android.gms.vision.text.AbstractC9309c
    /* renamed from: e */
    public List<? extends AbstractC9309c> mo8649e() {
        return m8659a();
    }

    /* renamed from: f */
    public String m8658f() {
        return this.f29369a.f29393h;
    }

    /* renamed from: g */
    public float m8657g() {
        return this.f29369a.f29388c.f29385f;
    }

    /* renamed from: h */
    public boolean m8656h() {
        return this.f29369a.f29395j;
    }
}
