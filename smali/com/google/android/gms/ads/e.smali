.class public final Lcom/google/android/gms/ads/e;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/ads/internal/client/ad;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/ad;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/ad;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/e;->a:Lcom/google/android/gms/ads/internal/client/ad;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/e;->a:Lcom/google/android/gms/ads/internal/client/ad;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/ad;->a()V

    return-void
.end method

.method public b()Lcom/google/android/gms/ads/internal/client/ad;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/e;->a:Lcom/google/android/gms/ads/internal/client/ad;

    return-object v0
.end method
