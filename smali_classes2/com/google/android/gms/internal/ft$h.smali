.class final Lcom/google/android/gms/internal/ft$h;
.super Lcom/google/android/gms/internal/ge;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ft;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ge",
        "<",
        "Ljava/lang/Void;",
        "Lcom/google/android/gms/internal/gj;",
        ">;"
    }
.end annotation


# instance fields
.field private final n:Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/a;)V
    .locals 1
    .param p1    # Lcom/google/firebase/auth/a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ge;-><init>(I)V

    const-string v0, "credential cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/internal/gk;->a(Lcom/google/firebase/auth/a;)Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ft$h;->n:Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$h;->e:Lcom/google/android/gms/internal/ga;

    iget-object v1, p0, Lcom/google/android/gms/internal/ft$h;->n:Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;

    iget-object v2, p0, Lcom/google/android/gms/internal/ft$h;->b:Lcom/google/android/gms/internal/ge$a;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ga;->a(Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;Lcom/google/android/gms/internal/fz;)V

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$h;->c:Lcom/google/firebase/b;

    iget-object v1, p0, Lcom/google/android/gms/internal/ft$h;->i:Lcom/google/firebase/auth/api/model/GetAccountInfoUser;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/firebase/b;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;)Lcom/google/android/gms/internal/go;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$h;->d:Lcom/google/firebase/auth/n;

    invoke-virtual {v0}, Lcom/google/firebase/auth/n;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/go;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$h;->f:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/gj;

    iget-object v2, p0, Lcom/google/android/gms/internal/ft$h;->h:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/gj;->a(Lcom/google/firebase/auth/api/model/GetTokenResponse;Lcom/google/firebase/auth/n;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ft$h;->c()V

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/gq;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft$h;->a(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0
.end method
