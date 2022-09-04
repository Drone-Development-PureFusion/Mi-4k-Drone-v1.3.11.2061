.class public abstract Lcom/google/firebase/auth/n;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/auth/w;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/google/firebase/auth/n;)Lcom/google/firebase/auth/FirebaseAuth;
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/auth/n;->h()Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    return-object v0
.end method

.method private h()Lcom/google/firebase/auth/FirebaseAuth;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/auth/n;->g()Lcom/google/firebase/b;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lcom/google/firebase/b;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/firebase/auth/UserProfileChangeRequest;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/auth/UserProfileChangeRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/UserProfileChangeRequest;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lcom/google/firebase/auth/n;->h()Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->a(Lcom/google/firebase/auth/n;Lcom/google/firebase/auth/UserProfileChangeRequest;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/firebase/auth/a;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/auth/a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/a;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lcom/google/firebase/auth/n;->h()Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->a(Lcom/google/firebase/auth/n;Lcom/google/firebase/auth/a;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public abstract a(Ljava/util/List;)Lcom/google/firebase/auth/n;
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<+",
            "Lcom/google/firebase/auth/w;",
            ">;)",
            "Lcom/google/firebase/auth/n;"
        }
    .end annotation
.end method

.method public abstract a()Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end method

.method public abstract a(Lcom/google/firebase/auth/api/model/GetTokenResponse;)V
    .param p1    # Lcom/google/firebase/auth/api/model/GetTokenResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public b(Lcom/google/firebase/auth/a;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/auth/a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/a;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/b;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lcom/google/firebase/auth/n;->h()Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->b(Lcom/google/firebase/auth/n;Lcom/google/firebase/auth/a;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/b;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {p0}, Lcom/google/firebase/auth/n;->h()Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->a(Lcom/google/firebase/auth/n;Ljava/lang/String;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public abstract b(Z)Lcom/google/firebase/auth/n;
.end method

.method public abstract b()Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end method

.method public c(Ljava/lang/String;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {p0}, Lcom/google/firebase/auth/n;->h()Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->b(Lcom/google/firebase/auth/n;Ljava/lang/String;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public c(Z)Lcom/google/android/gms/g/f;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/o;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/auth/n;->h()Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->a(Lcom/google/firebase/auth/n;Z)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public abstract c()Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end method

.method public abstract d()Landroid/net/Uri;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end method

.method public d(Ljava/lang/String;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {p0}, Lcom/google/firebase/auth/n;->h()Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->c(Lcom/google/firebase/auth/n;Ljava/lang/String;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public abstract e()Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end method

.method public abstract g()Lcom/google/firebase/b;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end method

.method public abstract i()Z
.end method

.method public abstract j()Ljava/util/List;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract k()Ljava/util/List;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<+",
            "Lcom/google/firebase/auth/w;",
            ">;"
        }
    .end annotation
.end method

.method public abstract l()Lcom/google/firebase/auth/api/model/GetTokenResponse;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end method

.method public abstract m()Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end method

.method public abstract n()Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end method

.method public o()Lcom/google/android/gms/g/f;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/auth/n;->h()Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/firebase/auth/FirebaseAuth;->b(Lcom/google/firebase/auth/n;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public p()Lcom/google/android/gms/g/f;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/auth/n;->h()Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/firebase/auth/FirebaseAuth;->c(Lcom/google/firebase/auth/n;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public q()Lcom/google/android/gms/g/f;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/auth/n;->h()Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lcom/google/firebase/auth/FirebaseAuth;->a(Lcom/google/firebase/auth/n;Z)Lcom/google/android/gms/g/f;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/auth/n$1;

    invoke-direct {v1, p0}, Lcom/google/firebase/auth/n$1;-><init>(Lcom/google/firebase/auth/n;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/g/f;->b(Lcom/google/android/gms/g/a;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method
