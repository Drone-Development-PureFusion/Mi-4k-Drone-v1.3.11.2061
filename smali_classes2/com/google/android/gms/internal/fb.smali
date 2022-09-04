.class public Lcom/google/android/gms/internal/fb;
.super Lcom/google/android/gms/c/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/c/h",
        "<",
        "Lcom/google/android/gms/internal/ew;",
        ">;"
    }
.end annotation


# static fields
.field private static a:Lcom/google/android/gms/internal/fb;


# direct methods
.method protected constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl"

    invoke-direct {p0, v0}, Lcom/google/android/gms/c/h;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/app/Activity;Lcom/google/android/gms/c/d;Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/internal/eu;)Lcom/google/android/gms/internal/et;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/common/e;->a(Landroid/content/Context;)I

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/common/c;

    invoke-direct {v1, v0}, Lcom/google/android/gms/common/c;-><init>(I)V

    throw v1

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/fb;->a()Lcom/google/android/gms/internal/fb;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/fb;->b(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ew;

    invoke-static {p0}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/ew;->a(Lcom/google/android/gms/c/e;Lcom/google/android/gms/c/d;Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/internal/eu;)Lcom/google/android/gms/internal/et;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/android/gms/c/h$a; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static a()Lcom/google/android/gms/internal/fb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/fb;->a:Lcom/google/android/gms/internal/fb;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/fb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/fb;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/fb;->a:Lcom/google/android/gms/internal/fb;

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/fb;->a:Lcom/google/android/gms/internal/fb;

    return-object v0
.end method


# virtual methods
.method protected a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ew;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/ew$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ew;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic b(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/fb;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ew;

    move-result-object v0

    return-object v0
.end method
