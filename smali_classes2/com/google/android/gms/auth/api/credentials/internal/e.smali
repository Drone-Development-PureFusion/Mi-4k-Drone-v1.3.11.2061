.class public final Lcom/google/android/gms/auth/api/credentials/internal/e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/auth/api/credentials/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/auth/api/credentials/internal/e$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/auth/api/credentials/PasswordSpecification;
    .locals 2

    sget-object v0, Lcom/google/android/gms/auth/api/a;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/auth/api/credentials/internal/g;

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/credentials/internal/g;->d()Lcom/google/android/gms/auth/api/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/a$a;->a()Lcom/google/android/gms/auth/api/credentials/PasswordSpecification;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/a$a;->a()Lcom/google/android/gms/auth/api/credentials/PasswordSpecification;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/auth/api/credentials/PasswordSpecification;->a:Lcom/google/android/gms/auth/api/credentials/PasswordSpecification;

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/auth/api/credentials/HintRequest;)Landroid/app/PendingIntent;
    .locals 4

    const-string v0, "client must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "request must not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/auth/api/a;->e:Lcom/google/android/gms/common/api/a;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/a;)Z

    move-result v0

    const-string v1, "Auth.CREDENTIALS_API must be added to GoogleApiClient to use this API"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/g;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/google/android/gms/auth/api/credentials/internal/e;->b(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/auth/api/credentials/PasswordSpecification;

    move-result-object v1

    invoke-static {v0, p2, v1}, Lcom/google/android/gms/auth/api/credentials/internal/c;->a(Landroid/content/Context;Lcom/google/android/gms/auth/api/credentials/HintRequest;Lcom/google/android/gms/auth/api/credentials/PasswordSpecification;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/g;->b()Landroid/content/Context;

    move-result-object v1

    const/16 v2, 0x7d0

    const/high16 v3, 0x10000000

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/auth/api/credentials/internal/e$4;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/auth/api/credentials/internal/e$4;-><init>(Lcom/google/android/gms/auth/api/credentials/internal/e;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/auth/api/credentials/Credential;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/auth/api/credentials/Credential;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/auth/api/credentials/internal/e$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/auth/api/credentials/internal/e$2;-><init>(Lcom/google/android/gms/auth/api/credentials/internal/e;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/auth/api/credentials/Credential;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/auth/api/credentials/CredentialRequest;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/auth/api/credentials/CredentialRequest;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/auth/api/credentials/a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/auth/api/credentials/internal/e$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/auth/api/credentials/internal/e$1;-><init>(Lcom/google/android/gms/auth/api/credentials/internal/e;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/auth/api/credentials/CredentialRequest;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/auth/api/credentials/Credential;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/auth/api/credentials/Credential;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/auth/api/credentials/internal/e$3;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/auth/api/credentials/internal/e$3;-><init>(Lcom/google/android/gms/auth/api/credentials/internal/e;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/auth/api/credentials/Credential;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method
