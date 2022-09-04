.class public Lcom/google/android/gms/internal/aoh;
.super Lcom/google/android/gms/common/internal/w;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/w",
        "<",
        "Lcom/google/android/gms/internal/aog;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Lcom/google/android/gms/common/internal/s;)V
    .locals 7

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    const/16 v3, 0x49

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/w;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/aog;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/aog$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/aog;

    move-result-object v0

    return-object v0
.end method

.method protected a()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.search.service.SEARCH_AUTH_START"

    return-object v0
.end method

.method protected synthetic b(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aoh;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/aog;

    move-result-object v0

    return-object v0
.end method

.method protected b()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.search.internal.ISearchAuthService"

    return-object v0
.end method
