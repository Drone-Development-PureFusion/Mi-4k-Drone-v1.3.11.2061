.class public abstract Lcom/google/firebase/auth/FirebaseAuth;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/mq;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/auth/FirebaseAuth$b;,
        Lcom/google/firebase/auth/FirebaseAuth$a;
    }
.end annotation


# static fields
.field private static g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/firebase/auth/FirebaseAuth;",
            ">;"
        }
    .end annotation
.end field

.field private static h:Lcom/google/firebase/auth/FirebaseAuth;


# instance fields
.field private a:Lcom/google/firebase/b;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/firebase/auth/FirebaseAuth$a;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/google/android/gms/internal/ft;

.field private d:Lcom/google/firebase/auth/n;

.field private e:Lcom/google/android/gms/internal/gs;

.field private f:Lcom/google/android/gms/internal/gt;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v0}, Landroid/support/v4/util/ArrayMap;-><init>()V

    sput-object v0, Lcom/google/firebase/auth/FirebaseAuth;->g:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/b;)V
    .locals 5

    invoke-static {p1}, Lcom/google/firebase/auth/FirebaseAuth;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ft;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/gs;

    invoke-virtual {p1}, Lcom/google/firebase/b;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/firebase/b;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/fy;->a()Lcom/google/android/gms/internal/nr;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/internal/gs;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/nr;)V

    invoke-direct {p0, p1, v0, v1}, Lcom/google/firebase/auth/FirebaseAuth;-><init>(Lcom/google/firebase/b;Lcom/google/android/gms/internal/ft;Lcom/google/android/gms/internal/gs;)V

    return-void
.end method

.method constructor <init>(Lcom/google/firebase/b;Lcom/google/android/gms/internal/ft;Lcom/google/android/gms/internal/gs;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/b;

    iput-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ft;

    iput-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gs;

    iput-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/gs;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->b:Ljava/util/List;

    invoke-static {}, Lcom/google/android/gms/internal/gt;->a()Lcom/google/android/gms/internal/gt;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/android/gms/internal/gt;

    invoke-virtual {p0}, Lcom/google/firebase/auth/FirebaseAuth;->f()V

    return-void
.end method

.method static a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ft;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/gb$a$a;

    invoke-virtual {p0}, Lcom/google/firebase/b;->c()Lcom/google/firebase/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/gb$a$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gb$a$a;->a()Lcom/google/android/gms/internal/gb$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/b;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gb;->a(Landroid/content/Context;Lcom/google/android/gms/internal/gb$a;)Lcom/google/android/gms/internal/ft;

    move-result-object v0

    return-object v0
.end method

.method public static a()Lcom/google/firebase/auth/FirebaseAuth;
    .locals 1

    invoke-static {}, Lcom/google/firebase/b;->d()Lcom/google/firebase/b;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->b(Lcom/google/firebase/b;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/firebase/b;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    return-object v0
.end method

.method private static b(Lcom/google/firebase/b;)Lcom/google/firebase/auth/FirebaseAuth;
    .locals 1
    .param p0    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p0}, Lcom/google/firebase/auth/FirebaseAuth;->c(Lcom/google/firebase/b;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/google/firebase/auth/FirebaseAuth;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->b:Ljava/util/List;

    return-object v0
.end method

.method private static declared-synchronized c(Lcom/google/firebase/b;)Lcom/google/firebase/auth/FirebaseAuth;
    .locals 4
    .param p0    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-class v1, Lcom/google/firebase/auth/FirebaseAuth;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/firebase/auth/FirebaseAuth;->g:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/google/firebase/b;->f()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/FirebaseAuth;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/gn;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/gn;-><init>(Lcom/google/firebase/b;)V

    invoke-virtual {p0, v0}, Lcom/google/firebase/b;->a(Lcom/google/android/gms/internal/mq;)V

    sget-object v2, Lcom/google/firebase/auth/FirebaseAuth;->h:Lcom/google/firebase/auth/FirebaseAuth;

    if-nez v2, :cond_0

    sput-object v0, Lcom/google/firebase/auth/FirebaseAuth;->h:Lcom/google/firebase/auth/FirebaseAuth;

    :cond_0
    sget-object v2, Lcom/google/firebase/auth/FirebaseAuth;->g:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/google/firebase/b;->f()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method static synthetic c(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/firebase/auth/n;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    return-object v0
.end method

.method public static getInstance(Lcom/google/firebase/b;)Lcom/google/firebase/auth/FirebaseAuth;
    .locals 1
    .param p0    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Keep;
    .end annotation

    invoke-static {p0}, Lcom/google/firebase/auth/FirebaseAuth;->b(Lcom/google/firebase/b;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/firebase/auth/a;)Lcom/google/android/gms/g/f;
    .locals 5
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

    const-class v0, Lcom/google/firebase/auth/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/firebase/auth/c;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    invoke-virtual {p1}, Lcom/google/firebase/auth/c;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/firebase/auth/c;->c()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/google/firebase/auth/FirebaseAuth$b;

    invoke-direct {v4, p0}, Lcom/google/firebase/auth/FirebaseAuth$b;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/firebase/b;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    new-instance v2, Lcom/google/firebase/auth/FirebaseAuth$b;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/FirebaseAuth$b;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/firebase/b;Lcom/google/firebase/auth/a;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/google/firebase/auth/n;Lcom/google/firebase/auth/UserProfileChangeRequest;)Lcom/google/android/gms/g/f;
    .locals 3
    .param p1    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/UserProfileChangeRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/n;",
            "Lcom/google/firebase/auth/UserProfileChangeRequest;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    new-instance v2, Lcom/google/firebase/auth/FirebaseAuth$b;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/FirebaseAuth$b;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Lcom/google/firebase/auth/UserProfileChangeRequest;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/firebase/auth/n;Lcom/google/firebase/auth/a;)Lcom/google/android/gms/g/f;
    .locals 6
    .param p1    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/n;",
            "Lcom/google/firebase/auth/a;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const-class v0, Lcom/google/firebase/auth/c;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p2, Lcom/google/firebase/auth/c;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    invoke-virtual {p2}, Lcom/google/firebase/auth/c;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lcom/google/firebase/auth/c;->c()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/google/firebase/auth/FirebaseAuth$b;

    invoke-direct {v5, p0}, Lcom/google/firebase/auth/FirebaseAuth$b;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    move-object v2, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    new-instance v2, Lcom/google/firebase/auth/FirebaseAuth$b;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/FirebaseAuth$b;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Lcom/google/firebase/auth/a;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/google/firebase/auth/n;Ljava/lang/String;)Lcom/google/android/gms/g/f;
    .locals 3
    .param p1    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/n;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/b;",
            ">;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    new-instance v2, Lcom/google/firebase/auth/FirebaseAuth$b;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/FirebaseAuth$b;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/ft;->d(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Ljava/lang/String;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/firebase/auth/n;Z)Lcom/google/android/gms/g/f;
    .locals 4
    .param p1    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/n;",
            "Z)",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/o;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x4457

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-static {v0}, Lcom/google/android/gms/internal/fw;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/firebase/c;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/g/i;->a(Ljava/lang/Exception;)Lcom/google/android/gms/g/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    invoke-virtual {v0}, Lcom/google/firebase/auth/n;->l()Lcom/google/firebase/auth/api/model/GetTokenResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/auth/api/model/GetTokenResponse;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    if-nez p2, :cond_1

    new-instance v1, Lcom/google/firebase/auth/o;

    invoke-virtual {v0}, Lcom/google/firebase/auth/api/model/GetTokenResponse;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/firebase/auth/o;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/google/android/gms/g/i;->a(Ljava/lang/Object;)Lcom/google/android/gms/g/f;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    invoke-virtual {v0}, Lcom/google/firebase/auth/api/model/GetTokenResponse;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lcom/google/firebase/auth/FirebaseAuth$3;

    invoke-direct {v3, p0}, Lcom/google/firebase/auth/FirebaseAuth$3;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v1, v2, p1, v0, v3}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Ljava/lang/String;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/g/f;
    .locals 3
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
            "Lcom/google/firebase/auth/b;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    new-instance v2, Lcom/google/firebase/auth/FirebaseAuth$b;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/FirebaseAuth$b;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/firebase/b;Ljava/lang/String;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/g/f;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/b;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    new-instance v2, Lcom/google/firebase/auth/FirebaseAuth$b;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/FirebaseAuth$b;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/firebase/b;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Z)Lcom/google/android/gms/g/f;
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

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    invoke-virtual {p0, v0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->a(Lcom/google/firebase/auth/n;Z)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/firebase/auth/FirebaseAuth$a;)V
    .locals 2
    .param p1    # Lcom/google/firebase/auth/FirebaseAuth$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/android/gms/internal/gt;

    new-instance v1, Lcom/google/firebase/auth/FirebaseAuth$1;

    invoke-direct {v1, p0, p1}, Lcom/google/firebase/auth/FirebaseAuth$1;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/FirebaseAuth$a;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gt;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/google/firebase/auth/n;)V
    .locals 4
    .param p1    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    const-string v0, "FirebaseAuth"

    invoke-virtual {p1}, Lcom/google/firebase/auth/n;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x24

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Notifying listeners about user ( "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " )."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/google/firebase/auth/n;->m()Ljava/lang/String;

    move-result-object v0

    :goto_1
    new-instance v1, Lcom/google/android/gms/internal/mr;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/mr;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/android/gms/internal/gt;

    new-instance v2, Lcom/google/firebase/auth/FirebaseAuth$2;

    invoke-direct {v2, p0, v1}, Lcom/google/firebase/auth/FirebaseAuth$2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/android/gms/internal/mr;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/gt;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    const-string v0, "FirebaseAuth"

    const-string v1, "Notifying listeners about a sign-out event."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public a(Lcom/google/firebase/auth/n;Lcom/google/firebase/auth/api/model/GetTokenResponse;Z)V
    .locals 5
    .param p1    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/api/model/GetTokenResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    if-nez v1, :cond_4

    :cond_0
    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    invoke-virtual {v0, p2}, Lcom/google/firebase/auth/n;->a(Lcom/google/firebase/auth/api/model/GetTokenResponse;)V

    :cond_1
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    invoke-virtual {p0, v0}, Lcom/google/firebase/auth/FirebaseAuth;->a(Lcom/google/firebase/auth/n;)V

    :cond_2
    if-eqz p3, :cond_3

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/gs;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/gs;->a(Lcom/google/firebase/auth/n;Lcom/google/firebase/auth/api/model/GetTokenResponse;)V

    :cond_3
    return-void

    :cond_4
    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    invoke-virtual {v1}, Lcom/google/firebase/auth/n;->l()Lcom/google/firebase/auth/api/model/GetTokenResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/auth/api/model/GetTokenResponse;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/google/firebase/auth/api/model/GetTokenResponse;->c()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    invoke-virtual {v3}, Lcom/google/firebase/auth/n;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/firebase/auth/n;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    if-eqz v1, :cond_5

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_5
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/firebase/auth/n;ZZ)V
    .locals 2
    .param p1    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    if-nez v0, :cond_2

    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    :goto_0
    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/gs;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gs;->a(Lcom/google/firebase/auth/n;)V

    :cond_0
    if-eqz p3, :cond_1

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    invoke-virtual {p0, v0}, Lcom/google/firebase/auth/FirebaseAuth;->a(Lcom/google/firebase/auth/n;)V

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    invoke-virtual {p1}, Lcom/google/firebase/auth/n;->i()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/n;->b(Z)Lcom/google/firebase/auth/n;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    invoke-virtual {p1}, Lcom/google/firebase/auth/n;->k()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/n;->a(Ljava/util/List;)Lcom/google/firebase/auth/n;

    goto :goto_0
.end method

.method public b(Lcom/google/firebase/auth/n;)Lcom/google/android/gms/g/f;
    .locals 3
    .param p1    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/n;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    new-instance v2, Lcom/google/firebase/auth/FirebaseAuth$b;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/FirebaseAuth$b;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/firebase/auth/n;Lcom/google/firebase/auth/a;)Lcom/google/android/gms/g/f;
    .locals 3
    .param p1    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/n;",
            "Lcom/google/firebase/auth/a;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/b;",
            ">;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    new-instance v2, Lcom/google/firebase/auth/FirebaseAuth$b;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/FirebaseAuth$b;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Lcom/google/firebase/auth/a;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/firebase/auth/n;Ljava/lang/String;)Lcom/google/android/gms/g/f;
    .locals 3
    .param p1    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/n;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    new-instance v2, Lcom/google/firebase/auth/FirebaseAuth$b;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/FirebaseAuth$b;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Ljava/lang/String;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/g/f;
    .locals 2
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
            "Lcom/google/firebase/auth/t;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/firebase/b;Ljava/lang/String;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/g/f;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/b;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    new-instance v2, Lcom/google/firebase/auth/FirebaseAuth$b;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/FirebaseAuth$b;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/firebase/b;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/google/firebase/auth/n;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    return-object v0
.end method

.method public b(Lcom/google/firebase/auth/FirebaseAuth$a;)V
    .locals 1
    .param p1    # Lcom/google/firebase/auth/FirebaseAuth$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(Lcom/google/firebase/auth/n;)Lcom/google/android/gms/g/f;
    .locals 2
    .param p1    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/n;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    new-instance v1, Lcom/google/firebase/auth/FirebaseAuth$4;

    invoke-direct {v1, p0, p1}, Lcom/google/firebase/auth/FirebaseAuth$4;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/n;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/firebase/auth/n;Lcom/google/android/gms/internal/gr;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/google/firebase/auth/n;Ljava/lang/String;)Lcom/google/android/gms/g/f;
    .locals 3
    .param p1    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/n;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    new-instance v2, Lcom/google/firebase/auth/FirebaseAuth$b;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/FirebaseAuth$b;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/ft;->c(Lcom/google/firebase/b;Lcom/google/firebase/auth/n;Ljava/lang/String;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lcom/google/android/gms/g/f;
    .locals 2
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

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/firebase/b;Ljava/lang/String;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/gs;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gs;->c(Lcom/google/firebase/auth/n;)V

    iput-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/gs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gs;->b()V

    invoke-virtual {p0, v2}, Lcom/google/firebase/auth/FirebaseAuth;->a(Lcom/google/firebase/auth/n;)V

    return-void
.end method

.method public d()Lcom/google/android/gms/g/f;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    invoke-virtual {v0}, Lcom/google/firebase/auth/n;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    check-cast v0, Lcom/google/android/gms/internal/go;

    new-instance v1, Lcom/google/android/gms/internal/gl;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/gl;-><init>(Lcom/google/android/gms/internal/go;)V

    invoke-static {v1}, Lcom/google/android/gms/g/i;->a(Ljava/lang/Object;)Lcom/google/android/gms/g/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    new-instance v2, Lcom/google/firebase/auth/FirebaseAuth$b;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/FirebaseAuth$b;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/firebase/b;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/g/f;

    move-result-object v0

    goto :goto_0
.end method

.method public d(Ljava/lang/String;)Lcom/google/android/gms/g/f;
    .locals 2
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

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Lcom/google/android/gms/internal/ft;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lcom/google/firebase/b;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ft;->c(Lcom/google/firebase/b;Ljava/lang/String;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/firebase/auth/FirebaseAuth;->c()V

    return-void
.end method

.method protected f()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/gs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gs;->a()Lcom/google/firebase/auth/n;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/google/firebase/auth/FirebaseAuth;->a(Lcom/google/firebase/auth/n;ZZ)V

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/gs;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gs;->b(Lcom/google/firebase/auth/n;)Lcom/google/firebase/auth/api/model/GetTokenResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Lcom/google/firebase/auth/n;

    invoke-virtual {p0, v1, v0, v2}, Lcom/google/firebase/auth/FirebaseAuth;->a(Lcom/google/firebase/auth/n;Lcom/google/firebase/auth/api/model/GetTokenResponse;Z)V

    :cond_0
    return-void
.end method
