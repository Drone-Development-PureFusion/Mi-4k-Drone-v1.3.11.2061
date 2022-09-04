.class final Lcom/google/android/gms/internal/amt;
.super Ljava/lang/Object;


# direct methods
.method static a(Landroid/content/Context;)Z
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    :try_start_0
    const-string v2, "com.google.android.gms"

    const/16 v3, 0x40

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    invoke-static {p0}, Lcom/google/android/gms/common/m;->a(Landroid/content/Context;)Lcom/google/android/gms/common/m;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Lcom/google/android/gms/common/m;->b(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "InstantAppsApi"

    const-string v2, "Incorrect signature for Google Play Services"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method
