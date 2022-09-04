.class public Lcom/google/android/gms/internal/ft;
.super Lcom/google/android/gms/common/api/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ft$g;,
        Lcom/google/android/gms/internal/ft$b;,
        Lcom/google/android/gms/internal/ft$j;,
        Lcom/google/android/gms/internal/ft$r;,
        Lcom/google/android/gms/internal/ft$q;,
        Lcom/google/android/gms/internal/ft$f;,
        Lcom/google/android/gms/internal/ft$e;,
        Lcom/google/android/gms/internal/ft$k;,
        Lcom/google/android/gms/internal/ft$l;,
        Lcom/google/android/gms/internal/ft$c;,
        Lcom/google/android/gms/internal/ft$i;,
        Lcom/google/android/gms/internal/ft$p;,
        Lcom/google/android/gms/internal/ft$a;,
        Lcom/google/android/gms/internal/ft$t;,
        Lcom/google/android/gms/internal/ft$s;,
        Lcom/google/android/gms/internal/ft$u;,
        Lcom/google/android/gms/internal/ft$m;,
        Lcom/google/android/gms/internal/ft$h;,
        Lcom/google/android/gms/internal/ft$n;,
        Lcom/google/android/gms/internal/ft$o;,
        Lcom/google/android/gms/internal/ft$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/u",
        "<",
        "Lcom/google/android/gms/internal/gb$a;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/gb$a;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/internal/gb$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/google/android/gms/internal/gb;->b:Lcom/google/android/gms/common/api/a;

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/common/api/u;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/a$a;)V

    return-void
.end method

.method private a(Lcom/google/firebase/b;Lcom/google/firebase/auth/a;Lcom/google/firebase/auth/n;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;
    .locals 2
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/android/gms/internal/gj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Lcom/google/firebase/auth/a;",
            "Lcom/google/firebase/auth/n;",
            "Lcom/google/android/gms/internal/gj;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/b;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3}, Lcom/google/firebase/auth/n;->j()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/google/firebase/auth/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x4277

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-static {v0}, Lcom/google/android/gms/internal/fw;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/firebase/c;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/g/i;->a(Ljava/lang/Exception;)Lcom/google/android/gms/g/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ft$f;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ft$f;-><init>(Lcom/google/firebase/auth/a;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$f;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/firebase/auth/n;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/ge;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Lcom/google/firebase/b;Lcom/google/firebase/auth/c;Lcom/google/firebase/auth/n;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/android/gms/internal/gj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Lcom/google/firebase/auth/c;",
            "Lcom/google/firebase/auth/n;",
            "Lcom/google/android/gms/internal/gj;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$e;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ft$e;-><init>(Lcom/google/firebase/auth/c;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$e;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/firebase/auth/n;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/ge;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/firebase/b;Ljava/lang/String;Lcom/google/firebase/auth/n;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/android/gms/internal/gj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Ljava/lang/String;",
            "Lcom/google/firebase/auth/n;",
            "Lcom/google/android/gms/internal/gj;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$r;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ft$r;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$r;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/firebase/auth/n;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/ge;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            "CallbackT:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ge",
            "<TResultT;TCallbackT;>;)",
            "Lcom/google/android/gms/internal/ft$g",
            "<TResultT;TCallbackT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$g;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ft$g;-><init>(Lcom/google/android/gms/internal/ft;Lcom/google/android/gms/internal/ge;)V

    return-object v0
.end method

.method static synthetic a(Lcom/google/firebase/b;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;)Lcom/google/android/gms/internal/go;
    .locals 1

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/firebase/b;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;)Lcom/google/android/gms/internal/go;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/google/firebase/b;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;Z)Lcom/google/android/gms/internal/go;
    .locals 1

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/firebase/b;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;Z)Lcom/google/android/gms/internal/go;

    move-result-object v0

    return-object v0
.end method

.method private b(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/android/gms/internal/gj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Lcom/google/firebase/auth/n;",
            "Lcom/google/android/gms/internal/gj;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$q;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ft$q;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$q;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/firebase/auth/n;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ge;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method private static b(Lcom/google/firebase/b;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;)Lcom/google/android/gms/internal/go;
    .locals 1
    .param p0    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/google/firebase/auth/api/model/GetAccountInfoUser;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/firebase/b;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;Z)Lcom/google/android/gms/internal/go;

    move-result-object v0

    return-object v0
.end method

.method private static b(Lcom/google/firebase/b;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;Z)Lcom/google/android/gms/internal/go;
    .locals 5
    .param p0    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/google/firebase/auth/api/model/GetAccountInfoUser;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/gm;

    const-string v1, "firebase"

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/gm;-><init>(Lcom/google/firebase/auth/api/model/GetAccountInfoUser;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->h()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    new-instance v4, Lcom/google/android/gms/internal/gm;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/api/model/ProviderUserInfo;

    invoke-direct {v4, v0}, Lcom/google/android/gms/internal/gm;-><init>(Lcom/google/firebase/auth/api/model/ProviderUserInfo;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/go;

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/go;-><init>(Lcom/google/firebase/b;Ljava/util/List;)V

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/go;->b(Z)Lcom/google/firebase/auth/n;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/go;

    return-object v1
.end method


# virtual methods
.method public a(Lcom/google/firebase/auth/n;Lcom/google/android/gms/internal/gr;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/internal/gr;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/n;",
            "Lcom/google/android/gms/internal/gr;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$b;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ft$b;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$b;->a(Lcom/google/firebase/auth/n;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ge;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/firebase/b;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/internal/gj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Lcom/google/android/gms/internal/gj;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$m;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ft$m;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$m;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ge;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/firebase/b;Lcom/google/firebase/auth/a;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/android/gms/internal/gj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Lcom/google/firebase/auth/a;",
            "Lcom/google/android/gms/internal/gj;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$n;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ft$n;-><init>(Lcom/google/firebase/auth/a;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$n;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ge;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/android/gms/internal/gj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Lcom/google/firebase/auth/n;",
            "Lcom/google/android/gms/internal/gj;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$j;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ft$j;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$j;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/firebase/auth/n;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ge;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Lcom/google/firebase/auth/UserProfileChangeRequest;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/firebase/auth/UserProfileChangeRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/android/gms/internal/gj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Lcom/google/firebase/auth/n;",
            "Lcom/google/firebase/auth/UserProfileChangeRequest;",
            "Lcom/google/android/gms/internal/gj;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$u;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/ft$u;-><init>(Lcom/google/firebase/auth/UserProfileChangeRequest;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$u;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/firebase/auth/n;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/ge;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Lcom/google/firebase/auth/a;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/firebase/auth/a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/android/gms/internal/gj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Lcom/google/firebase/auth/n;",
            "Lcom/google/firebase/auth/a;",
            "Lcom/google/android/gms/internal/gj;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$h;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/ft$h;-><init>(Lcom/google/firebase/auth/a;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$h;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/firebase/auth/n;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/ge;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Ljava/lang/String;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/android/gms/internal/gj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Lcom/google/firebase/auth/n;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/gj;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/o;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$d;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/ft$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$d;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/firebase/auth/n;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/ge;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/google/android/gms/internal/gj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Lcom/google/firebase/auth/n;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/gj;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$i;

    invoke-direct {v0, p3, p4}, Lcom/google/android/gms/internal/ft$i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$i;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/firebase/auth/n;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p5}, Lcom/google/android/gms/internal/ge;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/firebase/b;Ljava/lang/String;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/t;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$c;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ft$c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$c;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/firebase/b;Ljava/lang/String;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/android/gms/internal/gj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/gj;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$o;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ft$o;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$o;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ge;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/firebase/b;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/android/gms/internal/gj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/gj;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$a;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/ft$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$a;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/ge;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Lcom/google/firebase/auth/a;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;
    .locals 2
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/firebase/auth/a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/android/gms/internal/gj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Lcom/google/firebase/auth/n;",
            "Lcom/google/firebase/auth/a;",
            "Lcom/google/android/gms/internal/gj;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/b;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const-class v0, Lcom/google/firebase/auth/c;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p3, Lcom/google/firebase/auth/c;

    invoke-direct {p0, p1, p3, p2, p4}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/firebase/b;Lcom/google/firebase/auth/c;Lcom/google/firebase/auth/n;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, p1, p3, p2, p4}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/firebase/b;Lcom/google/firebase/auth/a;Lcom/google/firebase/auth/n;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;

    move-result-object v0

    goto :goto_0
.end method

.method public b(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Ljava/lang/String;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/android/gms/internal/gj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Lcom/google/firebase/auth/n;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/gj;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$s;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/ft$s;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$s;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/firebase/auth/n;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/ge;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/firebase/b;Ljava/lang/String;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$l;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ft$l;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$l;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/firebase/b;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/android/gms/internal/gj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/gj;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$p;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/ft$p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$p;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/ge;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Ljava/lang/String;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/android/gms/internal/gj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Lcom/google/firebase/auth/n;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/gj;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$t;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/ft$t;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$t;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/firebase/auth/n;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/ge;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/google/firebase/b;Ljava/lang/String;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ft$k;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ft$k;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ft$k;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ge;)Lcom/google/android/gms/internal/ft$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Ljava/lang/String;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;
    .locals 2
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/android/gms/internal/gj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            "Lcom/google/firebase/auth/n;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/gj;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/b;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/auth/n;->j()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p2}, Lcom/google/firebase/auth/n;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x4278

    invoke-direct {v0, v1, p3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/fw;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/firebase/c;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/g/i;->a(Ljava/lang/Exception;)Lcom/google/android/gms/g/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_2
    const/4 v0, -0x1

    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    :cond_3
    :goto_1
    packed-switch v0, :pswitch_data_1

    invoke-direct {p0, p1, p3, p2, p4}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/firebase/b;Ljava/lang/String;Lcom/google/firebase/auth/n;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;

    move-result-object v0

    goto :goto_0

    :pswitch_0
    const-string v1, "password"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v0, 0x0

    goto :goto_1

    :pswitch_1
    invoke-direct {p0, p1, p2, p4}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;

    move-result-object v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x4889ba9b
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method
