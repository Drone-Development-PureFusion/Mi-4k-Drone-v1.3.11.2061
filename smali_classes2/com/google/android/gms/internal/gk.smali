.class public Lcom/google/android/gms/internal/gk;
.super Ljava/lang/Object;


# direct methods
.method public static a(Lcom/google/firebase/auth/a;)Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;
    .locals 2
    .param p0    # Lcom/google/firebase/auth/a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const-class v0, Lcom/google/firebase/auth/r;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/firebase/auth/r;

    invoke-static {p0}, Lcom/google/firebase/auth/r;->a(Lcom/google/firebase/auth/r;)Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const-class v0, Lcom/google/firebase/auth/e;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    check-cast p0, Lcom/google/firebase/auth/e;

    invoke-static {p0}, Lcom/google/firebase/auth/e;->a(Lcom/google/firebase/auth/e;)Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-class v0, Lcom/google/firebase/auth/u;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    check-cast p0, Lcom/google/firebase/auth/u;

    invoke-static {p0}, Lcom/google/firebase/auth/u;->a(Lcom/google/firebase/auth/u;)Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;

    move-result-object v0

    goto :goto_0

    :cond_2
    const-class v0, Lcom/google/firebase/auth/p;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    check-cast p0, Lcom/google/firebase/auth/p;

    invoke-static {p0}, Lcom/google/firebase/auth/p;->a(Lcom/google/firebase/auth/p;)Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;

    move-result-object v0

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported credential type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
