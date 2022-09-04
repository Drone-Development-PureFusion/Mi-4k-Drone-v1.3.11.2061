.class public Lcom/google/android/gms/drive/internal/br;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/drive/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/drive/internal/br$i;,
        Lcom/google/android/gms/drive/internal/br$g;,
        Lcom/google/android/gms/drive/internal/br$h;,
        Lcom/google/android/gms/drive/internal/br$d;,
        Lcom/google/android/gms/drive/internal/br$e;,
        Lcom/google/android/gms/drive/internal/br$f;,
        Lcom/google/android/gms/drive/internal/br$a;,
        Lcom/google/android/gms/drive/internal/br$b;,
        Lcom/google/android/gms/drive/internal/br$c;,
        Lcom/google/android/gms/drive/internal/br$j;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/drive/c$a;",
            ">;"
        }
    .end annotation

    const/high16 v0, 0x20000000

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/drive/internal/br;->a(Lcom/google/android/gms/common/api/g;I)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;I)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "I)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/drive/c$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/drive/internal/br$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/drive/internal/br$2;-><init>(Lcom/google/android/gms/drive/internal/br;Lcom/google/android/gms/common/api/g;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/query/Query;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/drive/query/Query;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/drive/c$c;",
            ">;"
        }
    .end annotation

    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Query must be provided."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/drive/internal/br$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/drive/internal/br$1;-><init>(Lcom/google/android/gms/drive/internal/br;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/query/Query;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/drive/c$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/drive/internal/br$3;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/drive/internal/br$3;-><init>(Lcom/google/android/gms/drive/internal/br;Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/util/List;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/drive/b;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/internal/bt;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/drive/internal/bt;->a(Lcom/google/android/gms/common/api/g;Ljava/util/List;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/DriveId;)Lcom/google/android/gms/drive/e;
    .locals 2

    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Id must be provided."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/g;->j()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Client must be connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/drive/internal/bv;

    invoke-direct {v0, p2}, Lcom/google/android/gms/drive/internal/bv;-><init>(Lcom/google/android/gms/drive/DriveId;)V

    return-object v0
.end method

.method public a()Lcom/google/android/gms/drive/o;
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/o;

    invoke-direct {v0}, Lcom/google/android/gms/drive/o;-><init>()V

    return-object v0
.end method

.method public b()Lcom/google/android/gms/drive/a;
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/a;

    invoke-direct {v0}, Lcom/google/android/gms/drive/a;-><init>()V

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/drive/f;
    .locals 2

    sget-object v0, Lcom/google/android/gms/drive/b;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/internal/bt;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/internal/bt;->l()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Client is not yet connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/drive/internal/bt;->j()Lcom/google/android/gms/drive/DriveId;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v0, Lcom/google/android/gms/drive/internal/bx;

    invoke-direct {v0, v1}, Lcom/google/android/gms/drive/internal/bx;-><init>(Lcom/google/android/gms/drive/DriveId;)V

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/DriveId;)Lcom/google/android/gms/drive/f;
    .locals 2

    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Id must be provided."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/g;->j()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Client must be connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/drive/internal/bx;

    invoke-direct {v0, p2}, Lcom/google/android/gms/drive/internal/bx;-><init>(Lcom/google/android/gms/drive/DriveId;)V

    return-object v0
.end method

.method public c(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/drive/f;
    .locals 2

    sget-object v0, Lcom/google/android/gms/drive/b;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/internal/bt;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/internal/bt;->l()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Client is not yet connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/drive/internal/bt;->k()Lcom/google/android/gms/drive/DriveId;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v0, Lcom/google/android/gms/drive/internal/bx;

    invoke-direct {v0, v1}, Lcom/google/android/gms/drive/internal/bx;-><init>(Lcom/google/android/gms/drive/DriveId;)V

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
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

    new-instance v0, Lcom/google/android/gms/drive/internal/br$4;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/drive/internal/br$4;-><init>(Lcom/google/android/gms/drive/internal/br;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public e(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/e;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/drive/internal/br$5;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/drive/internal/br$5;-><init>(Lcom/google/android/gms/drive/internal/br;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method
