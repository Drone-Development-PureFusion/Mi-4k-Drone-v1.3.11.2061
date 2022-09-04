.class public Lcom/google/android/gms/ads/g;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/g$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(F)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/h;->a()Lcom/google/android/gms/ads/internal/client/h;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/ads/internal/client/h;->a(F)V

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, v0, v0}, Lcom/google/android/gms/ads/g;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/g$a;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/google/android/gms/ads/g;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/g$a;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/g$a;)V
    .locals 2
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/h;->a()Lcom/google/android/gms/ads/internal/client/h;

    move-result-object v1

    if-nez p2, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, p0, p1, v0}, Lcom/google/android/gms/ads/internal/client/h;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/i;)V

    return-void

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/ads/g$a;->c()Lcom/google/android/gms/ads/internal/client/i;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Z)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/h;->a()Lcom/google/android/gms/ads/internal/client/h;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/ads/internal/client/h;->a(Z)V

    return-void
.end method

.method public static b(Landroid/content/Context;)Lcom/google/android/gms/ads/b/b;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/h;->a()Lcom/google/android/gms/ads/internal/client/h;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/ads/internal/client/h;->a(Landroid/content/Context;)Lcom/google/android/gms/ads/b/b;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/h;->a()Lcom/google/android/gms/ads/internal/client/h;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/ads/internal/client/h;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
