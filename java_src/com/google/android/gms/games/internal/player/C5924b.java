package com.google.android.gms.games.internal.player;

import android.text.TextUtils;
/* renamed from: com.google.android.gms.games.internal.player.b */
/* loaded from: classes2.dex */
public final class C5924b {

    /* renamed from: A */
    public final String f20097A;

    /* renamed from: B */
    public final String f20098B;

    /* renamed from: C */
    public final String f20099C;

    /* renamed from: D */
    public final String f20100D;

    /* renamed from: E */
    public final String f20101E;

    /* renamed from: F */
    public final String f20102F;

    /* renamed from: G */
    public final String f20103G;

    /* renamed from: H */
    public final String f20104H;

    /* renamed from: I */
    public final String f20105I;

    /* renamed from: a */
    public final String f20106a;

    /* renamed from: b */
    public final String f20107b;

    /* renamed from: c */
    public final String f20108c;

    /* renamed from: d */
    public final String f20109d;

    /* renamed from: e */
    public final String f20110e;

    /* renamed from: f */
    public final String f20111f;

    /* renamed from: g */
    public final String f20112g;

    /* renamed from: h */
    public final String f20113h;

    /* renamed from: i */
    public final String f20114i;

    /* renamed from: j */
    public final String f20115j;

    /* renamed from: k */
    public final String f20116k;

    /* renamed from: l */
    public final String f20117l;

    /* renamed from: m */
    public final String f20118m;

    /* renamed from: n */
    public final String f20119n;

    /* renamed from: o */
    public final String f20120o;

    /* renamed from: p */
    public final String f20121p;

    /* renamed from: q */
    public final String f20122q;

    /* renamed from: r */
    public final String f20123r;

    /* renamed from: s */
    public final String f20124s;

    /* renamed from: t */
    public final String f20125t;

    /* renamed from: u */
    public final String f20126u;

    /* renamed from: v */
    public final String f20127v;

    /* renamed from: w */
    public final String f20128w;

    /* renamed from: x */
    public final String f20129x;

    /* renamed from: y */
    public final String f20130y;

    /* renamed from: z */
    public final String f20131z;

    public C5924b(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f20106a = "external_player_id";
            this.f20107b = "profile_name";
            this.f20108c = "profile_icon_image_uri";
            this.f20109d = "profile_icon_image_url";
            this.f20110e = "profile_hi_res_image_uri";
            this.f20111f = "profile_hi_res_image_url";
            this.f20112g = "last_updated";
            this.f20113h = "is_in_circles";
            this.f20114i = "played_with_timestamp";
            this.f20115j = "current_xp_total";
            this.f20116k = "current_level";
            this.f20117l = "current_level_min_xp";
            this.f20118m = "current_level_max_xp";
            this.f20119n = "next_level";
            this.f20120o = "next_level_max_xp";
            this.f20121p = "last_level_up_timestamp";
            this.f20122q = "player_title";
            this.f20123r = "has_all_public_acls";
            this.f20124s = "is_profile_visible";
            this.f20125t = "most_recent_external_game_id";
            this.f20126u = "most_recent_game_name";
            this.f20127v = "most_recent_activity_timestamp";
            this.f20128w = "most_recent_game_icon_uri";
            this.f20129x = "most_recent_game_hi_res_uri";
            this.f20130y = "most_recent_game_featured_uri";
            this.f20131z = "has_debug_access";
            this.f20097A = "gamer_tag";
            this.f20098B = "real_name";
            this.f20099C = "banner_image_landscape_uri";
            this.f20100D = "banner_image_landscape_url";
            this.f20101E = "banner_image_portrait_uri";
            this.f20102F = "banner_image_portrait_url";
            this.f20103G = "gamer_friend_status";
            this.f20104H = "gamer_friend_update_timestamp";
            this.f20105I = "is_muted";
            return;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("external_player_id");
        this.f20106a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        String valueOf3 = String.valueOf(str);
        String valueOf4 = String.valueOf("profile_name");
        this.f20107b = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
        String valueOf5 = String.valueOf(str);
        String valueOf6 = String.valueOf("profile_icon_image_uri");
        this.f20108c = valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new String(valueOf5);
        String valueOf7 = String.valueOf(str);
        String valueOf8 = String.valueOf("profile_icon_image_url");
        this.f20109d = valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7);
        String valueOf9 = String.valueOf(str);
        String valueOf10 = String.valueOf("profile_hi_res_image_uri");
        this.f20110e = valueOf10.length() != 0 ? valueOf9.concat(valueOf10) : new String(valueOf9);
        String valueOf11 = String.valueOf(str);
        String valueOf12 = String.valueOf("profile_hi_res_image_url");
        this.f20111f = valueOf12.length() != 0 ? valueOf11.concat(valueOf12) : new String(valueOf11);
        String valueOf13 = String.valueOf(str);
        String valueOf14 = String.valueOf("last_updated");
        this.f20112g = valueOf14.length() != 0 ? valueOf13.concat(valueOf14) : new String(valueOf13);
        String valueOf15 = String.valueOf(str);
        String valueOf16 = String.valueOf("is_in_circles");
        this.f20113h = valueOf16.length() != 0 ? valueOf15.concat(valueOf16) : new String(valueOf15);
        String valueOf17 = String.valueOf(str);
        String valueOf18 = String.valueOf("played_with_timestamp");
        this.f20114i = valueOf18.length() != 0 ? valueOf17.concat(valueOf18) : new String(valueOf17);
        String valueOf19 = String.valueOf(str);
        String valueOf20 = String.valueOf("current_xp_total");
        this.f20115j = valueOf20.length() != 0 ? valueOf19.concat(valueOf20) : new String(valueOf19);
        String valueOf21 = String.valueOf(str);
        String valueOf22 = String.valueOf("current_level");
        this.f20116k = valueOf22.length() != 0 ? valueOf21.concat(valueOf22) : new String(valueOf21);
        String valueOf23 = String.valueOf(str);
        String valueOf24 = String.valueOf("current_level_min_xp");
        this.f20117l = valueOf24.length() != 0 ? valueOf23.concat(valueOf24) : new String(valueOf23);
        String valueOf25 = String.valueOf(str);
        String valueOf26 = String.valueOf("current_level_max_xp");
        this.f20118m = valueOf26.length() != 0 ? valueOf25.concat(valueOf26) : new String(valueOf25);
        String valueOf27 = String.valueOf(str);
        String valueOf28 = String.valueOf("next_level");
        this.f20119n = valueOf28.length() != 0 ? valueOf27.concat(valueOf28) : new String(valueOf27);
        String valueOf29 = String.valueOf(str);
        String valueOf30 = String.valueOf("next_level_max_xp");
        this.f20120o = valueOf30.length() != 0 ? valueOf29.concat(valueOf30) : new String(valueOf29);
        String valueOf31 = String.valueOf(str);
        String valueOf32 = String.valueOf("last_level_up_timestamp");
        this.f20121p = valueOf32.length() != 0 ? valueOf31.concat(valueOf32) : new String(valueOf31);
        String valueOf33 = String.valueOf(str);
        String valueOf34 = String.valueOf("player_title");
        this.f20122q = valueOf34.length() != 0 ? valueOf33.concat(valueOf34) : new String(valueOf33);
        String valueOf35 = String.valueOf(str);
        String valueOf36 = String.valueOf("has_all_public_acls");
        this.f20123r = valueOf36.length() != 0 ? valueOf35.concat(valueOf36) : new String(valueOf35);
        String valueOf37 = String.valueOf(str);
        String valueOf38 = String.valueOf("is_profile_visible");
        this.f20124s = valueOf38.length() != 0 ? valueOf37.concat(valueOf38) : new String(valueOf37);
        String valueOf39 = String.valueOf(str);
        String valueOf40 = String.valueOf("most_recent_external_game_id");
        this.f20125t = valueOf40.length() != 0 ? valueOf39.concat(valueOf40) : new String(valueOf39);
        String valueOf41 = String.valueOf(str);
        String valueOf42 = String.valueOf("most_recent_game_name");
        this.f20126u = valueOf42.length() != 0 ? valueOf41.concat(valueOf42) : new String(valueOf41);
        String valueOf43 = String.valueOf(str);
        String valueOf44 = String.valueOf("most_recent_activity_timestamp");
        this.f20127v = valueOf44.length() != 0 ? valueOf43.concat(valueOf44) : new String(valueOf43);
        String valueOf45 = String.valueOf(str);
        String valueOf46 = String.valueOf("most_recent_game_icon_uri");
        this.f20128w = valueOf46.length() != 0 ? valueOf45.concat(valueOf46) : new String(valueOf45);
        String valueOf47 = String.valueOf(str);
        String valueOf48 = String.valueOf("most_recent_game_hi_res_uri");
        this.f20129x = valueOf48.length() != 0 ? valueOf47.concat(valueOf48) : new String(valueOf47);
        String valueOf49 = String.valueOf(str);
        String valueOf50 = String.valueOf("most_recent_game_featured_uri");
        this.f20130y = valueOf50.length() != 0 ? valueOf49.concat(valueOf50) : new String(valueOf49);
        String valueOf51 = String.valueOf(str);
        String valueOf52 = String.valueOf("has_debug_access");
        this.f20131z = valueOf52.length() != 0 ? valueOf51.concat(valueOf52) : new String(valueOf51);
        String valueOf53 = String.valueOf(str);
        String valueOf54 = String.valueOf("gamer_tag");
        this.f20097A = valueOf54.length() != 0 ? valueOf53.concat(valueOf54) : new String(valueOf53);
        String valueOf55 = String.valueOf(str);
        String valueOf56 = String.valueOf("real_name");
        this.f20098B = valueOf56.length() != 0 ? valueOf55.concat(valueOf56) : new String(valueOf55);
        String valueOf57 = String.valueOf(str);
        String valueOf58 = String.valueOf("banner_image_landscape_uri");
        this.f20099C = valueOf58.length() != 0 ? valueOf57.concat(valueOf58) : new String(valueOf57);
        String valueOf59 = String.valueOf(str);
        String valueOf60 = String.valueOf("banner_image_landscape_url");
        this.f20100D = valueOf60.length() != 0 ? valueOf59.concat(valueOf60) : new String(valueOf59);
        String valueOf61 = String.valueOf(str);
        String valueOf62 = String.valueOf("banner_image_portrait_uri");
        this.f20101E = valueOf62.length() != 0 ? valueOf61.concat(valueOf62) : new String(valueOf61);
        String valueOf63 = String.valueOf(str);
        String valueOf64 = String.valueOf("banner_image_portrait_url");
        this.f20102F = valueOf64.length() != 0 ? valueOf63.concat(valueOf64) : new String(valueOf63);
        String valueOf65 = String.valueOf(str);
        String valueOf66 = String.valueOf("gamer_friend_status");
        this.f20103G = valueOf66.length() != 0 ? valueOf65.concat(valueOf66) : new String(valueOf65);
        String valueOf67 = String.valueOf(str);
        String valueOf68 = String.valueOf("gamer_friend_update_timestamp");
        this.f20104H = valueOf68.length() != 0 ? valueOf67.concat(valueOf68) : new String(valueOf67);
        String valueOf69 = String.valueOf(str);
        String valueOf70 = String.valueOf("is_muted");
        this.f20105I = valueOf70.length() != 0 ? valueOf69.concat(valueOf70) : new String(valueOf69);
    }
}
