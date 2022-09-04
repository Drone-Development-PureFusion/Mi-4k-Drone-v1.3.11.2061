.class public Lcom/google/android/gms/wearable/internal/d;
.super Lcom/google/android/gms/common/data/j;

# interfaces
.implements Lcom/google/android/gms/wearable/i;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/j;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    return-void
.end method


# virtual methods
.method public synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/d;->e()Lcom/google/android/gms/wearable/i;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    const-string v0, "asset_id"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/d;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "asset_key"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/d;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Lcom/google/android/gms/wearable/i;
    .locals 1

    new-instance v0, Lcom/google/android/gms/wearable/internal/b;

    invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/b;-><init>(Lcom/google/android/gms/wearable/i;)V

    return-object v0
.end method
