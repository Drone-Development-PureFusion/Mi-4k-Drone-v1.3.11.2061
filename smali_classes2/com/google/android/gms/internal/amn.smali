.class public Lcom/google/android/gms/internal/amn;
.super Lcom/google/android/gms/common/internal/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/amn$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/w",
        "<",
        "Lcom/google/android/gms/internal/amp;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Landroid/app/Activity;

.field private e:Lcom/google/android/gms/internal/amn$a;

.field private final f:Ljava/lang/String;

.field private final g:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;ILcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V
    .locals 7

    const/16 v3, 0xc

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/w;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V

    invoke-virtual {p3}, Lcom/google/android/gms/common/internal/s;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/amn;->f:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/amn;->a:Landroid/app/Activity;

    iput p4, p0, Lcom/google/android/gms/internal/amn;->g:I

    return-void
.end method


# virtual methods
.method public H()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/amp;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/amp$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/amp;

    move-result-object v0

    return-object v0
.end method

.method protected a()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.identity.service.BIND"

    return-object v0
.end method

.method public a(Lcom/google/android/gms/identity/intents/UserAddressRequest;I)V
    .locals 5

    invoke-virtual {p0}, Lcom/google/android/gms/internal/amn;->i()V

    new-instance v0, Lcom/google/android/gms/internal/amn$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/amn;->a:Landroid/app/Activity;

    invoke-direct {v0, p2, v1}, Lcom/google/android/gms/internal/amn$a;-><init>(ILandroid/app/Activity;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/amn;->e:Lcom/google/android/gms/internal/amn$a;

    :try_start_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/amn;->B()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/amn;->f:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "com.google.android.gms.identity.intents.EXTRA_ACCOUNT"

    new-instance v2, Landroid/accounts/Account;

    iget-object v3, p0, Lcom/google/android/gms/internal/amn;->f:Ljava/lang/String;

    const-string v4, "com.google"

    invoke-direct {v2, v3, v4}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    const-string v1, "com.google.android.gms.identity.intents.EXTRA_THEME"

    iget v2, p0, Lcom/google/android/gms/internal/amn;->g:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/amn;->h()Lcom/google/android/gms/internal/amp;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/amn;->e:Lcom/google/android/gms/internal/amn$a;

    invoke-interface {v1, v2, p1, v0}, Lcom/google/android/gms/internal/amp;->a(Lcom/google/android/gms/internal/amo;Lcom/google/android/gms/identity/intents/UserAddressRequest;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "AddressClientImpl"

    const-string v2, "Exception requesting user address"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "com.google.android.gms.identity.intents.EXTRA_ERROR_CODE"

    const/16 v2, 0x22b

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/amn;->e:Lcom/google/android/gms/internal/amn$a;

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/amn$a;->a(ILandroid/os/Bundle;)V

    goto :goto_0
.end method

.method protected synthetic b(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/amn;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/amp;

    move-result-object v0

    return-object v0
.end method

.method protected b()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.identity.intents.internal.IAddressService"

    return-object v0
.end method

.method public f()V
    .locals 2

    const/4 v1, 0x0

    invoke-super {p0}, Lcom/google/android/gms/common/internal/w;->f()V

    iget-object v0, p0, Lcom/google/android/gms/internal/amn;->e:Lcom/google/android/gms/internal/amn$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/amn;->e:Lcom/google/android/gms/internal/amn$a;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/amn$a;->a(Lcom/google/android/gms/internal/amn$a;Landroid/app/Activity;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/amn;->e:Lcom/google/android/gms/internal/amn$a;

    :cond_0
    return-void
.end method

.method protected h()Lcom/google/android/gms/internal/amp;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/common/internal/w;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/amp;

    return-object v0
.end method

.method protected i()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/common/internal/w;->F()V

    return-void
.end method
