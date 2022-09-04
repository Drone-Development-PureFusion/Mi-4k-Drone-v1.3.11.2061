package com.tencent.stat;
/* loaded from: classes2.dex */
public class StatGameUser implements Cloneable {

    /* renamed from: a */
    private String f32131a = "";

    /* renamed from: b */
    private String f32132b = "";

    /* renamed from: c */
    private String f32133c = "";

    /* renamed from: clone */
    public StatGameUser m40156clone() {
        try {
            return (StatGameUser) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public String getAccount() {
        return this.f32132b;
    }

    public String getLevel() {
        return this.f32133c;
    }

    public String getWorldName() {
        return this.f32131a;
    }

    public void setAccount(String str) {
        this.f32132b = str;
    }

    public void setLevel(String str) {
        this.f32133c = str;
    }

    public void setWorldName(String str) {
        this.f32131a = str;
    }
}
