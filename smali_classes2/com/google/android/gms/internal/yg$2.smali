.class Lcom/google/android/gms/internal/yg$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/internal/overlay/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/yg;->showInterstitial()V
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

    iput-object p1, p0, Lcom/google/android/gms/internal/yg$2;->a:Lcom/google/android/gms/internal/yg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public g()V
    .locals 1

    const-string v0, "AdMobCustomTabsAdapter overlay is resumed."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public i_()V
    .locals 2

    const-string v0, "AdMobCustomTabsAdapter overlay is closed."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/yg$2;->a:Lcom/google/android/gms/internal/yg;

    invoke-static {v0}, Lcom/google/android/gms/internal/yg;->a(Lcom/google/android/gms/internal/yg;)Lcom/google/android/gms/ads/mediation/f;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/yg$2;->a:Lcom/google/android/gms/internal/yg;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/f;->c(Lcom/google/android/gms/ads/mediation/e;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/yg$2;->a:Lcom/google/android/gms/internal/yg;

    invoke-static {v0}, Lcom/google/android/gms/internal/yg;->c(Lcom/google/android/gms/internal/yg;)Lcom/google/android/gms/internal/ut;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/yg$2;->a:Lcom/google/android/gms/internal/yg;

    invoke-static {v1}, Lcom/google/android/gms/internal/yg;->b(Lcom/google/android/gms/internal/yg;)Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ut;->a(Landroid/app/Activity;)V

    return-void
.end method

.method public j_()V
    .locals 2

    const-string v0, "Opening AdMobCustomTabsAdapter overlay."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/yg$2;->a:Lcom/google/android/gms/internal/yg;

    invoke-static {v0}, Lcom/google/android/gms/internal/yg;->a(Lcom/google/android/gms/internal/yg;)Lcom/google/android/gms/ads/mediation/f;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/yg$2;->a:Lcom/google/android/gms/internal/yg;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/f;->b(Lcom/google/android/gms/ads/mediation/e;)V

    return-void
.end method

.method public k_()V
    .locals 1

    const-string v0, "AdMobCustomTabsAdapter overlay is paused."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    return-void
.end method
