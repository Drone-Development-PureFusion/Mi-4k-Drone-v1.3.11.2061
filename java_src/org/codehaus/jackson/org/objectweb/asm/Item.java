package org.codehaus.jackson.org.objectweb.asm;
/* loaded from: classes3.dex */
final class Item {

    /* renamed from: a */
    int f36929a;

    /* renamed from: b */
    int f36930b;

    /* renamed from: c */
    int f36931c;

    /* renamed from: d */
    long f36932d;

    /* renamed from: g */
    String f36933g;

    /* renamed from: h */
    String f36934h;

    /* renamed from: i */
    String f36935i;

    /* renamed from: j */
    int f36936j;

    /* renamed from: k */
    Item f36937k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Item() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Item(int i) {
        this.f36929a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Item(int i, Item item) {
        this.f36929a = i;
        this.f36930b = item.f36930b;
        this.f36931c = item.f36931c;
        this.f36932d = item.f36932d;
        this.f36933g = item.f36933g;
        this.f36934h = item.f36934h;
        this.f36935i = item.f36935i;
        this.f36936j = item.f36936j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m225a(double d) {
        this.f36930b = 6;
        this.f36932d = Double.doubleToRawLongBits(d);
        this.f36936j = Integer.MAX_VALUE & (this.f36930b + ((int) d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m224a(float f) {
        this.f36930b = 4;
        this.f36931c = Float.floatToRawIntBits(f);
        this.f36936j = Integer.MAX_VALUE & (this.f36930b + ((int) f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m223a(int i) {
        this.f36930b = 3;
        this.f36931c = i;
        this.f36936j = Integer.MAX_VALUE & (this.f36930b + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m222a(int i, String str, String str2, String str3) {
        this.f36930b = i;
        this.f36933g = str;
        this.f36934h = str2;
        this.f36935i = str3;
        switch (i) {
            case 1:
            case 7:
            case 8:
            case 13:
                this.f36936j = (str.hashCode() + i) & Integer.MAX_VALUE;
                return;
            case 12:
                this.f36936j = ((str.hashCode() * str2.hashCode()) + i) & Integer.MAX_VALUE;
                return;
            default:
                this.f36936j = ((str.hashCode() * str2.hashCode() * str3.hashCode()) + i) & Integer.MAX_VALUE;
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m221a(long j) {
        this.f36930b = 5;
        this.f36932d = j;
        this.f36936j = Integer.MAX_VALUE & (this.f36930b + ((int) j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m220a(Item item) {
        switch (this.f36930b) {
            case 1:
            case 7:
            case 8:
            case 13:
                return item.f36933g.equals(this.f36933g);
            case 2:
            case 9:
            case 10:
            case 11:
            default:
                return item.f36933g.equals(this.f36933g) && item.f36934h.equals(this.f36934h) && item.f36935i.equals(this.f36935i);
            case 3:
            case 4:
                return item.f36931c == this.f36931c;
            case 5:
            case 6:
            case 15:
                return item.f36932d == this.f36932d;
            case 12:
                return item.f36933g.equals(this.f36933g) && item.f36934h.equals(this.f36934h);
            case 14:
                return item.f36931c == this.f36931c && item.f36933g.equals(this.f36933g);
        }
    }
}
