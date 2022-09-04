.class public Lcom/google/android/gms/auth/api/signin/internal/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/auth/api/signin/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/auth/api/signin/internal/b$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Lcom/google/android/gms/common/api/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;",
            ")",
            "Lcom/google/android/gms/common/api/h",
            "<",
            "Lcom/google/android/gms/auth/api/signin/b;",
            ">;"
        }
    .end annotation

    const-string v0, "GoogleSignInApiImpl"

    const-string v1, "trySilentSignIn"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/google/android/gms/auth/api/signin/internal/b$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/auth/api/signin/internal/b$1;-><init>(Lcom/google/android/gms/auth/api/signin/internal/b;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/aio;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/aio;-><init>(Lcom/google/android/gms/common/api/i;)V

    return-object v1
.end method

.method private a(Landroid/accounts/Account;Landroid/accounts/Account;)Z
    .locals 1

    if-nez p1, :cond_1

    if-nez p2, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1, p2}, Landroid/accounts/Account;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method private e(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    .locals 1

    sget-object v0, Lcom/google/android/gms/auth/api/a;->c:Lcom/google/android/gms/common/api/a$g;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/auth/api/signin/internal/c;

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/internal/c;->n_()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;)Landroid/content/Intent;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/auth/api/a;->c:Lcom/google/android/gms/common/api/a$g;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/auth/api/signin/internal/c;

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/internal/c;->e()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Lcom/google/android/gms/auth/api/signin/b;
    .locals 5

    const/4 v0, 0x0

    const-string v1, "GoogleSignInApiImpl"

    const-string v2, "getSavedSignInResultIfEligible"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/auth/api/signin/internal/j;->a(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/internal/j;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/internal/j;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->c()Landroid/accounts/Account;

    move-result-object v3

    invoke-virtual {p2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->c()Landroid/accounts/Account;

    move-result-object v4

    invoke-direct {p0, v3, v4}, Lcom/google/android/gms/auth/api/signin/internal/b;->a(Landroid/accounts/Account;Landroid/accounts/Account;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->e()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->d()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->d()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_2
    new-instance v3, Ljava/util/HashSet;

    invoke-virtual {v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->a()Ljava/util/ArrayList;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    new-instance v2, Ljava/util/HashSet;

    invoke-virtual {p2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->a()Ljava/util/ArrayList;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v3, v2}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/internal/j;->a()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->j()Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v0, Lcom/google/android/gms/auth/api/signin/b;

    sget-object v2, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/auth/api/signin/b;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0
.end method

.method public a(Landroid/content/Intent;)Lcom/google/android/gms/auth/api/signin/b;
    .locals 3

    if-eqz p1, :cond_0

    const-string v0, "googleSignInStatus"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "googleSignInAccount"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    const-string v0, "googleSignInAccount"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    const-string v1, "googleSignInStatus"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/common/api/Status;

    if-eqz v0, :cond_2

    sget-object v1, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    :cond_2
    new-instance v2, Lcom/google/android/gms/auth/api/signin/b;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/auth/api/signin/b;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    move-object v0, v2

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/h",
            "<",
            "Lcom/google/android/gms/auth/api/signin/b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/auth/api/signin/internal/b;->e(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/g;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/auth/api/signin/internal/b;->a(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Lcom/google/android/gms/auth/api/signin/b;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1, p1}, Lcom/google/android/gms/common/api/j;->b(Lcom/google/android/gms/common/api/m;Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/h;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/auth/api/signin/internal/b;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Lcom/google/android/gms/common/api/h;

    move-result-object v0

    goto :goto_0
.end method

.method public c(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 2
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

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/g;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/internal/j;->a(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/internal/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/internal/j;->c()V

    invoke-static {}, Lcom/google/android/gms/common/api/g;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/g;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/g;->d()V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/auth/api/signin/internal/b$2;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/auth/api/signin/internal/b$2;-><init>(Lcom/google/android/gms/auth/api/signin/internal/b;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 2
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

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/g;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/internal/j;->a(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/internal/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/internal/j;->c()V

    invoke-static {}, Lcom/google/android/gms/common/api/g;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/g;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/g;->d()V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/auth/api/signin/internal/b$3;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/auth/api/signin/internal/b$3;-><init>(Lcom/google/android/gms/auth/api/signin/internal/b;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method
