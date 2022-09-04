.class Lcom/google/android/gms/internal/yg$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ut$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/yg;->requestInterstitialAd(Landroid/content/Context;Lcom/google/android/gms/ads/mediation/f;Landroid/os/Bundle;Lcom/google/android/gms/ads/mediation/a;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/yg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/yg;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/yg$1;->a:Lcom/google/android/gms/internal/yg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const-string v0, "Hinting CustomTabsService for the load of the new url."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 1

    const-string v0, "Disconnecting from CustomTabs service."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    return-void
.end method
