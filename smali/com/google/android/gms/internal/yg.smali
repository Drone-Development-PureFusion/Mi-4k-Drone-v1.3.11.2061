.class public Lcom/google/android/gms/internal/yg;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/mediation/e;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Lcom/google/android/gms/internal/ut;

.field private c:Lcom/google/android/gms/ads/mediation/f;

.field private d:Landroid/net/Uri;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/yg;)Lcom/google/android/gms/ads/mediation/f;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/yg;->c:Lcom/google/android/gms/ads/mediation/f;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/ut;->a(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/yg;)Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/yg;->a:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/yg;)Lcom/google/android/gms/internal/ut;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/yg;->b:Lcom/google/android/gms/internal/ut;

    return-object v0
.end method


# virtual methods
.method public onDestroy()V
    .locals 2

    const-string v0, "Destroying AdMobCustomTabsAdapter adapter."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/yg;->b:Lcom/google/android/gms/internal/ut;

    iget-object v1, p0, Lcom/google/android/gms/internal/yg;->a:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ut;->a(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Exception while unbinding from CustomTabsService."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public onPause()V
    .locals 1

    const-string v0, "Pausing AdMobCustomTabsAdapter adapter."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public onResume()V
    .locals 1

    const-string v0, "Resuming AdMobCustomTabsAdapter adapter."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public requestInterstitialAd(Landroid/content/Context;Lcom/google/android/gms/ads/mediation/f;Landroid/os/Bundle;Lcom/google/android/gms/ads/mediation/a;Landroid/os/Bundle;)V
    .locals 3

    const/4 v2, 0x0

    iput-object p2, p0, Lcom/google/android/gms/internal/yg;->c:Lcom/google/android/gms/ads/mediation/f;

    iget-object v0, p0, Lcom/google/android/gms/internal/yg;->c:Lcom/google/android/gms/ads/mediation/f;

    if-nez v0, :cond_0

    const-string v0, "Listener not set for mediation. Returning."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    instance-of v0, p1, Landroid/app/Activity;

    if-nez v0, :cond_1

    const-string v0, "AdMobCustomTabs can only work with Activity context. Bailing out."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/yg;->c:Lcom/google/android/gms/ads/mediation/f;

    invoke-interface {v0, p0, v2}, Lcom/google/android/gms/ads/mediation/f;->a(Lcom/google/android/gms/ads/mediation/e;I)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/internal/yg;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Default browser does not support custom tabs. Bailing out."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/yg;->c:Lcom/google/android/gms/ads/mediation/f;

    invoke-interface {v0, p0, v2}, Lcom/google/android/gms/ads/mediation/f;->a(Lcom/google/android/gms/ads/mediation/e;I)V

    goto :goto_0

    :cond_2
    const-string v0, "tab_url"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v0, "The tab_url retrieved from mediation metadata is empty. Bailing out."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/yg;->c:Lcom/google/android/gms/ads/mediation/f;

    invoke-interface {v0, p0, v2}, Lcom/google/android/gms/ads/mediation/f;->a(Lcom/google/android/gms/ads/mediation/e;I)V

    goto :goto_0

    :cond_3
    check-cast p1, Landroid/app/Activity;

    iput-object p1, p0, Lcom/google/android/gms/internal/yg;->a:Landroid/app/Activity;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/yg;->d:Landroid/net/Uri;

    new-instance v0, Lcom/google/android/gms/internal/ut;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ut;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/yg;->b:Lcom/google/android/gms/internal/ut;

    new-instance v0, Lcom/google/android/gms/internal/yg$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/yg$1;-><init>(Lcom/google/android/gms/internal/yg;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/yg;->b:Lcom/google/android/gms/internal/ut;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ut;->a(Lcom/google/android/gms/internal/ut$a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/yg;->b:Lcom/google/android/gms/internal/ut;

    iget-object v1, p0, Lcom/google/android/gms/internal/yg;->a:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ut;->b(Landroid/app/Activity;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/yg;->c:Lcom/google/android/gms/ads/mediation/f;

    invoke-interface {v0, p0}, Lcom/google/android/gms/ads/mediation/f;->a(Lcom/google/android/gms/ads/mediation/e;)V

    goto :goto_0
.end method

.method public showInterstitial()V
    .locals 7

    const/4 v2, 0x0

    const/4 v6, 0x0

    new-instance v0, Landroid/support/customtabs/CustomTabsIntent$Builder;

    iget-object v1, p0, Lcom/google/android/gms/internal/yg;->b:Lcom/google/android/gms/internal/ut;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ut;->b()Landroid/support/customtabs/CustomTabsSession;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/customtabs/CustomTabsIntent$Builder;-><init>(Landroid/support/customtabs/CustomTabsSession;)V

    invoke-virtual {v0}, Landroid/support/customtabs/CustomTabsIntent$Builder;->build()Landroid/support/customtabs/CustomTabsIntent;

    move-result-object v0

    iget-object v1, v0, Landroid/support/customtabs/CustomTabsIntent;->intent:Landroid/content/Intent;

    iget-object v3, p0, Lcom/google/android/gms/internal/yg;->d:Landroid/net/Uri;

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    new-instance v1, Lcom/google/android/gms/ads/internal/overlay/AdLauncherIntentInfoParcel;

    iget-object v0, v0, Landroid/support/customtabs/CustomTabsIntent;->intent:Landroid/content/Intent;

    invoke-direct {v1, v0}, Lcom/google/android/gms/ads/internal/overlay/AdLauncherIntentInfoParcel;-><init>(Landroid/content/Intent;)V

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    new-instance v3, Lcom/google/android/gms/internal/yg$2;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/yg$2;-><init>(Lcom/google/android/gms/internal/yg;)V

    new-instance v5, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    invoke-direct {v5, v6, v6, v6}, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;-><init>(IIZ)V

    move-object v4, v2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/overlay/AdLauncherIntentInfoParcel;Lcom/google/android/gms/ads/internal/client/a;Lcom/google/android/gms/ads/internal/overlay/g;Lcom/google/android/gms/ads/internal/overlay/p;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    sget-object v1, Lcom/google/android/gms/internal/abv;->a:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/internal/yg$3;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/yg$3;-><init>(Lcom/google/android/gms/internal/yg;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/abl;->c(Z)V

    return-void
.end method
