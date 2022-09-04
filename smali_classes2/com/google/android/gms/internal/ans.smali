.class public final Lcom/google/android/gms/internal/ans;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/plus/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ans$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;ILjava/lang/String;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingRemoteException"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "I",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/plus/b$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ans$1;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/ans$1;-><init>(Lcom/google/android/gms/internal/ans;Lcom/google/android/gms/common/api/g;ILjava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingRemoteException"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/plus/b$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ans$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ans$2;-><init>(Lcom/google/android/gms/internal/ans;Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/util/Collection;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingRemoteException"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/plus/b$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ans$4;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ans$4;-><init>(Lcom/google/android/gms/internal/ans;Lcom/google/android/gms/common/api/g;Ljava/util/Collection;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public varargs a(Lcom/google/android/gms/common/api/g;[Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingRemoteException"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/plus/b$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ans$5;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ans$5;-><init>(Lcom/google/android/gms/internal/ans;Lcom/google/android/gms/common/api/g;[Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/plus/a/a/a;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/google/android/gms/plus/c;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/plus/internal/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/e;->i()Lcom/google/android/gms/plus/a/a/a;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingRemoteException"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/plus/b$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ans$3;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ans$3;-><init>(Lcom/google/android/gms/internal/ans;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method
