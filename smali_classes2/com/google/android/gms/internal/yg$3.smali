.class Lcom/google/android/gms/internal/yg$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/yg;->showInterstitial()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

.field final synthetic b:Lcom/google/android/gms/internal/yg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/yg;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/yg$3;->b:Lcom/google/android/gms/internal/yg;

    iput-object p2, p0, Lcom/google/android/gms/internal/yg$3;->a:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->c()Lcom/google/android/gms/ads/internal/overlay/e;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/yg$3;->b:Lcom/google/android/gms/internal/yg;

    invoke-static {v1}, Lcom/google/android/gms/internal/yg;->b(Lcom/google/android/gms/internal/yg;)Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/yg$3;->a:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/ads/internal/overlay/e;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void
.end method
