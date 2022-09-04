.class public Lcom/google/android/gms/internal/fx;
.super Lcom/google/android/gms/internal/oj;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/oj",
        "<",
        "Lcom/google/firebase/auth/api/model/GetAccountInfoUserList;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/internal/nr;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/oj;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/pp;)Lcom/google/firebase/auth/api/model/GetAccountInfoUserList;
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->f()Lcom/google/android/gms/internal/pq;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/pq;->i:Lcom/google/android/gms/internal/pq;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->j()V

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Lcom/google/firebase/auth/api/model/GetAccountInfoUserList;

    invoke-direct {v1}, Lcom/google/firebase/auth/api/model/GetAccountInfoUserList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/fx;->a:Lcom/google/android/gms/internal/nr;

    const-class v2, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/nr;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/oj;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->a()V

    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/oj;->b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;

    invoke-virtual {v1}, Lcom/google/firebase/auth/api/model/GetAccountInfoUserList;->a()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->b()V

    move-object v0, v1

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/nr;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/internal/nr;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/nr;

    iput-object v0, p0, Lcom/google/android/gms/internal/fx;->a:Lcom/google/android/gms/internal/nr;

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ps;Lcom/google/firebase/auth/api/model/GetAccountInfoUserList;)V
    .locals 5

    const/4 v2, 0x0

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->f()Lcom/google/android/gms/internal/ps;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/fx;->a:Lcom/google/android/gms/internal/nr;

    const-class v1, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/nr;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/oj;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->b()Lcom/google/android/gms/internal/ps;

    invoke-virtual {p2}, Lcom/google/firebase/auth/api/model/GetAccountInfoUserList;->a()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    move v1, v0

    :goto_1
    if-ge v2, v1, :cond_2

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;

    invoke-virtual {v3, p1, v0}, Lcom/google/android/gms/internal/oj;->a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    move v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->c()Lcom/google/android/gms/internal/ps;

    goto :goto_0
.end method

.method public bridge synthetic a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/google/firebase/auth/api/model/GetAccountInfoUserList;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/fx;->a(Lcom/google/android/gms/internal/ps;Lcom/google/firebase/auth/api/model/GetAccountInfoUserList;)V

    return-void
.end method

.method public synthetic b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/fx;->a(Lcom/google/android/gms/internal/pp;)Lcom/google/firebase/auth/api/model/GetAccountInfoUserList;

    move-result-object v0

    return-object v0
.end method
