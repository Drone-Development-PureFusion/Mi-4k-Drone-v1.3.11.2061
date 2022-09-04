.class public final Lcom/google/android/gms/auth/api/credentials/internal/g;
.super Lcom/google/android/gms/common/internal/w;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/w",
        "<",
        "Lcom/google/android/gms/auth/api/credentials/internal/k;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/auth/api/a$a;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/auth/api/a$a;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V
    .locals 7

    const/16 v3, 0x44

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/w;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V

    iput-object p4, p0, Lcom/google/android/gms/auth/api/credentials/internal/g;->a:Lcom/google/android/gms/auth/api/a$a;

    return-void
.end method


# virtual methods
.method protected a(Landroid/os/IBinder;)Lcom/google/android/gms/auth/api/credentials/internal/k;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/auth/api/credentials/internal/k$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/auth/api/credentials/internal/k;

    move-result-object v0

    return-object v0
.end method

.method protected a()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.credentials.service.START"

    return-object v0
.end method

.method protected synthetic b(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/auth/api/credentials/internal/g;->a(Landroid/os/IBinder;)Lcom/google/android/gms/auth/api/credentials/internal/k;

    move-result-object v0

    return-object v0
.end method

.method protected b()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"

    return-object v0
.end method

.method protected c()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/internal/g;->a:Lcom/google/android/gms/auth/api/a$a;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/internal/g;->a:Lcom/google/android/gms/auth/api/a$a;

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/a$a;->b()Landroid/os/Bundle;

    move-result-object v0

    goto :goto_0
.end method

.method d()Lcom/google/android/gms/auth/api/a$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/internal/g;->a:Lcom/google/android/gms/auth/api/a$a;

    return-object v0
.end method
