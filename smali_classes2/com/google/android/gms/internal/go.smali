.class public Lcom/google/android/gms/internal/go;
.super Lcom/google/firebase/auth/n;


# instance fields
.field private a:Lcom/google/firebase/auth/api/model/GetTokenResponse;

.field private b:Lcom/google/android/gms/internal/gm;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/gm;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/gm;",
            ">;"
        }
    .end annotation
.end field

.field private h:Ljava/lang/String;

.field private i:Z

.field private j:Lcom/google/android/gms/internal/nr;


# direct methods
.method public constructor <init>(Lcom/google/firebase/b;Ljava/util/List;)V
    .locals 1
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Ljava/util/List",
            "<+",
            "Lcom/google/firebase/auth/w;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/auth/n;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/b;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/go;->c:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/fy;->a()Lcom/google/android/gms/internal/nr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/go;->j:Lcom/google/android/gms/internal/nr;

    const-string v0, "com.google.firebase.auth.internal.DefaultFirebaseUser"

    iput-object v0, p0, Lcom/google/android/gms/internal/go;->d:Ljava/lang/String;

    const-string v0, "2"

    iput-object v0, p0, Lcom/google/android/gms/internal/go;->h:Ljava/lang/String;

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/go;->a(Ljava/util/List;)Lcom/google/firebase/auth/n;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/google/android/gms/internal/go;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/google/android/gms/internal/go;->h:Ljava/lang/String;

    return-object p0
.end method

.method public a(Z)Lcom/google/android/gms/internal/go;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/go;->i:Z

    return-object p0
.end method

.method public a(Ljava/util/List;)Lcom/google/firebase/auth/n;
    .locals 5
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

    const/4 v2, 0x0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/go;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/go;->f:Ljava/util/List;

    new-instance v0, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v0}, Landroid/support/v4/util/ArrayMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/go;->g:Ljava/util/Map;

    move v1, v2

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    new-instance v3, Lcom/google/android/gms/internal/gm;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/w;

    invoke-direct {v3, v0}, Lcom/google/android/gms/internal/gm;-><init>(Lcom/google/firebase/auth/w;)V

    invoke-virtual {v3}, Lcom/google/android/gms/internal/gm;->b()Ljava/lang/String;

    move-result-object v0

    const-string v4, "firebase"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object v3, p0, Lcom/google/android/gms/internal/go;->b:Lcom/google/android/gms/internal/gm;

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/go;->e:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/go;->g:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/gm;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/go;->f:Ljava/util/List;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/gm;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/go;->b:Lcom/google/android/gms/internal/gm;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/go;->e:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gm;

    iput-object v0, p0, Lcom/google/android/gms/internal/go;->b:Lcom/google/android/gms/internal/gm;

    :cond_2
    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/go;->b:Lcom/google/android/gms/internal/gm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gm;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/firebase/auth/api/model/GetTokenResponse;)V
    .locals 1
    .param p1    # Lcom/google/firebase/auth/api/model/GetTokenResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/api/model/GetTokenResponse;

    iput-object v0, p0, Lcom/google/android/gms/internal/go;->a:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    return-void
.end method

.method public synthetic b(Z)Lcom/google/firebase/auth/n;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/go;->a(Z)Lcom/google/android/gms/internal/go;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/go;->b:Lcom/google/android/gms/internal/gm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gm;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/go;->b:Lcom/google/android/gms/internal/gm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gm;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/net/Uri;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/go;->b:Lcom/google/android/gms/internal/gm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gm;->d()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/go;->b:Lcom/google/android/gms/internal/gm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gm;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/go;->b:Lcom/google/android/gms/internal/gm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gm;->f()Z

    move-result v0

    return v0
.end method

.method public g()Lcom/google/firebase/b;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/go;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/firebase/b;->a(Ljava/lang/String;)Lcom/google/firebase/b;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/gm;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/go;->e:Ljava/util/List;

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/go;->i:Z

    return v0
.end method

.method public j()Ljava/util/List;
    .locals 1
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

    iget-object v0, p0, Lcom/google/android/gms/internal/go;->f:Ljava/util/List;

    return-object v0
.end method

.method public k()Ljava/util/List;
    .locals 1
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

    iget-object v0, p0, Lcom/google/android/gms/internal/go;->e:Ljava/util/List;

    return-object v0
.end method

.method public l()Lcom/google/firebase/auth/api/model/GetTokenResponse;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/go;->a:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/go;->l()Lcom/google/firebase/auth/api/model/GetTokenResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/auth/api/model/GetTokenResponse;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/go;->j:Lcom/google/android/gms/internal/nr;

    iget-object v1, p0, Lcom/google/android/gms/internal/go;->a:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/nr;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
