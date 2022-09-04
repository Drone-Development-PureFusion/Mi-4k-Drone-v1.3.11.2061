package com.tencent.stat.p268a;

import android.content.Context;
import com.tencent.stat.StatGameUser;
import com.tencent.stat.common.C10346k;
import org.json.JSONObject;
/* renamed from: com.tencent.stat.a.g */
/* loaded from: classes2.dex */
public class C10329g extends AbstractC10327e {

    /* renamed from: a */
    private StatGameUser f32191a;

    public C10329g(Context context, int i, StatGameUser statGameUser) {
        super(context, i);
        this.f32191a = null;
        this.f32191a = statGameUser.m40156clone();
    }

    @Override // com.tencent.stat.p268a.AbstractC10327e
    /* renamed from: a */
    public EnumC10328f mo5470a() {
        return EnumC10328f.MTA_GAME_USER;
    }

    @Override // com.tencent.stat.p268a.AbstractC10327e
    /* renamed from: a */
    public boolean mo5469a(JSONObject jSONObject) {
        if (this.f32191a == null) {
            return false;
        }
        C10346k.m5427a(jSONObject, "wod", this.f32191a.getWorldName());
        C10346k.m5427a(jSONObject, "gid", this.f32191a.getAccount());
        C10346k.m5427a(jSONObject, "lev", this.f32191a.getLevel());
        return true;
    }
}
