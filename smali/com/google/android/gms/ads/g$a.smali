.class public final Lcom/google/android/gms/ads/g$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/ads/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/ads/internal/client/i;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/i;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/i;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/g$a;->a:Lcom/google/android/gms/ads/internal/client/i;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/google/android/gms/ads/g$a;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/g$a;->a:Lcom/google/android/gms/ads/internal/client/i;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/i;->a(Ljava/lang/String;)V

    return-object p0
.end method

.method public a(Z)Lcom/google/android/gms/ads/g$a;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/g$a;->a:Lcom/google/android/gms/ads/internal/client/i;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/i;->a(Z)V

    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/g$a;->a:Lcom/google/android/gms/ads/internal/client/i;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/i;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/g$a;->a:Lcom/google/android/gms/ads/internal/client/i;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/i;->b()Z

    move-result v0

    return v0
.end method

.method c()Lcom/google/android/gms/ads/internal/client/i;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/g$a;->a:Lcom/google/android/gms/ads/internal/client/i;

    return-object v0
.end method
