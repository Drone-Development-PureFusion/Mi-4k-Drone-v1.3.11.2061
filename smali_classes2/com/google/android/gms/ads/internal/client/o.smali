.class public Lcom/google/android/gms/ads/internal/client/o;
.super Lcom/google/android/gms/ads/internal/reward/client/b$a;


# instance fields
.field private a:Lcom/google/android/gms/ads/internal/reward/client/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/reward/client/b$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/ads/internal/client/o;)Lcom/google/android/gms/ads/internal/reward/client/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/o;->a:Lcom/google/android/gms/ads/internal/reward/client/d;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/internal/reward/client/RewardedVideoAdRequestParcel;)V
    .locals 2

    const-string v0, "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->b(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/ads/internal/util/client/a;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/client/o$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/ads/internal/client/o$1;-><init>(Lcom/google/android/gms/ads/internal/client/o;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/internal/reward/client/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/o;->a:Lcom/google/android/gms/ads/internal/reward/client/d;

    return-void
.end method

.method public a(Lcom/google/android/gms/c/e;)V
    .locals 0

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public b(Lcom/google/android/gms/c/e;)V
    .locals 0

    return-void
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public c(Lcom/google/android/gms/c/e;)V
    .locals 0

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method
