.class public final Lcom/google/android/gms/internal/abr;
.super Lcom/google/android/gms/ads/internal/util/client/b;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# direct methods
.method public static a()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/uf;->aG:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private static b()Z
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/abr;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static e(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/abr;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Ads"

    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method
