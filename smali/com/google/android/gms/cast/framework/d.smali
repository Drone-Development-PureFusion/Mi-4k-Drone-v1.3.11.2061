.class public Lcom/google/android/gms/cast/framework/d;
.super Lcom/google/android/gms/cast/framework/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/framework/d$b;,
        Lcom/google/android/gms/cast/framework/d$a;,
        Lcom/google/android/gms/cast/framework/d$c;,
        Lcom/google/android/gms/cast/framework/d$d;
    }
.end annotation


# static fields
.field private static final a:Lcom/google/android/gms/cast/internal/m;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/cast/a$d;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/cast/framework/u;

.field private final e:Lcom/google/android/gms/cast/a$b;

.field private final f:Lcom/google/android/gms/internal/afe;

.field private final g:Lcom/google/android/gms/internal/afq;

.field private h:Lcom/google/android/gms/common/api/g;

.field private i:Lcom/google/android/gms/cast/framework/media/c;

.field private j:Lcom/google/android/gms/cast/CastDevice;

.field private k:Lcom/google/android/gms/cast/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/cast/internal/m;

    const-string v1, "CastSession"

    invoke-direct {v0, v1}, Lcom/google/android/gms/cast/internal/m;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/cast/framework/d;->a:Lcom/google/android/gms/cast/internal/m;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/cast/framework/CastOptions;Lcom/google/android/gms/cast/a$b;Lcom/google/android/gms/internal/afe;Lcom/google/android/gms/internal/afq;)V
    .locals 3

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/cast/framework/j;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/d;->c:Ljava/util/Set;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/d;->b:Landroid/content/Context;

    iput-object p5, p0, Lcom/google/android/gms/cast/framework/d;->e:Lcom/google/android/gms/cast/a$b;

    iput-object p6, p0, Lcom/google/android/gms/cast/framework/d;->f:Lcom/google/android/gms/internal/afe;

    iput-object p7, p0, Lcom/google/android/gms/cast/framework/d;->g:Lcom/google/android/gms/internal/afq;

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/d;->u()Lcom/google/android/gms/c/e;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/cast/framework/d$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/cast/framework/d$b;-><init>(Lcom/google/android/gms/cast/framework/d;Lcom/google/android/gms/cast/framework/d$1;)V

    invoke-static {p1, p4, v0, v1}, Lcom/google/android/gms/internal/afc;->a(Landroid/content/Context;Lcom/google/android/gms/cast/framework/CastOptions;Lcom/google/android/gms/c/e;Lcom/google/android/gms/cast/framework/s;)Lcom/google/android/gms/cast/framework/u;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/d;->d:Lcom/google/android/gms/cast/framework/u;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/cast/framework/d;Lcom/google/android/gms/cast/a$a;)Lcom/google/android/gms/cast/a$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/d;->k:Lcom/google/android/gms/cast/a$a;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/cast/framework/d;Lcom/google/android/gms/cast/framework/media/c;)Lcom/google/android/gms/cast/framework/media/c;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/d;->i:Lcom/google/android/gms/cast/framework/media/c;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/cast/framework/u;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->d:Lcom/google/android/gms/cast/framework/u;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/cast/framework/d;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/d;->e(I)V

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/cast/framework/d;)Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->c:Ljava/util/Set;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/cast/a$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->e:Lcom/google/android/gms/cast/a$b;

    return-object v0
.end method

.method private c(Landroid/os/Bundle;)V
    .locals 6

    const/16 v1, 0x8

    const/4 v5, 0x0

    invoke-static {p1}, Lcom/google/android/gms/cast/CastDevice;->b(Landroid/os/Bundle;)Lcom/google/android/gms/cast/CastDevice;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/d;->j:Lcom/google/android/gms/cast/CastDevice;

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->j:Lcom/google/android/gms/cast/CastDevice;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/d;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/android/gms/cast/framework/d;->c(I)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0, v1}, Lcom/google/android/gms/cast/framework/d;->a(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/g;->g()V

    iput-object v5, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    :cond_2
    sget-object v0, Lcom/google/android/gms/cast/framework/d;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v1, "Acquiring a connection to Google Play Services for %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/google/android/gms/cast/framework/d;->j:Lcom/google/android/gms/cast/CastDevice;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v4, Lcom/google/android/gms/cast/framework/d$d;

    invoke-direct {v4, p0, v5}, Lcom/google/android/gms/cast/framework/d$d;-><init>(Lcom/google/android/gms/cast/framework/d;Lcom/google/android/gms/cast/framework/d$1;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->f:Lcom/google/android/gms/internal/afe;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/d;->j:Lcom/google/android/gms/cast/CastDevice;

    new-instance v3, Lcom/google/android/gms/cast/framework/d$c;

    invoke-direct {v3, p0, v5}, Lcom/google/android/gms/cast/framework/d$c;-><init>(Lcom/google/android/gms/cast/framework/d;Lcom/google/android/gms/cast/framework/d$1;)V

    move-object v5, v4

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/afe;->a(Landroid/content/Context;Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/a$d;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/common/api/g;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/g;->e()V

    goto :goto_0
.end method

.method static synthetic d(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/common/api/g;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/cast/framework/media/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->i:Lcom/google/android/gms/cast/framework/media/c;

    return-object v0
.end method

.method private e(I)V
    .locals 5

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->g:Lcom/google/android/gms/internal/afq;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/afq;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/g;->g()V

    iput-object v4, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    :cond_0
    iput-object v4, p0, Lcom/google/android/gms/cast/framework/d;->j:Lcom/google/android/gms/cast/CastDevice;

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->i:Lcom/google/android/gms/cast/framework/media/c;

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->i:Lcom/google/android/gms/cast/framework/media/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/common/api/g;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iput-object v4, p0, Lcom/google/android/gms/cast/framework/d;->i:Lcom/google/android/gms/cast/framework/media/c;

    :cond_1
    iput-object v4, p0, Lcom/google/android/gms/cast/framework/d;->k:Lcom/google/android/gms/cast/a$a;

    return-void

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/cast/framework/d;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Exception when setting GoogleApiClient."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method static synthetic f(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/internal/afq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->g:Lcom/google/android/gms/internal/afq;

    return-object v0
.end method

.method static synthetic l()Lcom/google/android/gms/cast/internal/m;
    .locals 1

    sget-object v0, Lcom/google/android/gms/cast/framework/d;->a:Lcom/google/android/gms/cast/internal/m;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/cast/framework/media/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->i:Lcom/google/android/gms/cast/framework/media/c;

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->e:Lcom/google/android/gms/cast/a$b;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/cast/a$b;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(D)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->e:Lcom/google/android/gms/cast/a$b;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/cast/a$b;->a(Lcom/google/android/gms/common/api/g;D)V

    :cond_0
    return-void
.end method

.method protected a(Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/d;->c(Landroid/os/Bundle;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/cast/a$d;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->e:Lcom/google/android/gms/cast/a$b;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/cast/a$b;->d(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/google/android/gms/cast/a$e;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->e:Lcom/google/android/gms/cast/a$b;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/cast/a$b;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Lcom/google/android/gms/cast/a$e;)V

    :cond_0
    return-void
.end method

.method protected a(Z)V
    .locals 7

    const/4 v6, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->d:Lcom/google/android/gms/cast/framework/u;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/cast/framework/u;->a(ZI)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-virtual {p0, v6}, Lcom/google/android/gms/cast/framework/d;->b(I)V

    return-void

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/cast/framework/d;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Unable to call %s on %s."

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "disconnectFromDevice"

    aput-object v4, v3, v6

    const/4 v4, 0x1

    const-class v5, Lcom/google/android/gms/cast/framework/u;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public b()Lcom/google/android/gms/cast/CastDevice;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->j:Lcom/google/android/gms/cast/CastDevice;

    return-object v0
.end method

.method protected b(Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/d;->c(Landroid/os/Bundle;)V

    return-void
.end method

.method public b(Lcom/google/android/gms/cast/a$d;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public b(Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->e:Lcom/google/android/gms/cast/a$b;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/cast/a$b;->a(Lcom/google/android/gms/common/api/g;Z)V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->e:Lcom/google/android/gms/cast/a$b;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/a$b;->a(Lcom/google/android/gms/common/api/g;)V

    :cond_0
    return-void
.end method

.method public d()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->e:Lcom/google/android/gms/cast/a$b;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/a$b;->g(Lcom/google/android/gms/common/api/g;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public e()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->e:Lcom/google/android/gms/cast/a$b;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/a$b;->h(Lcom/google/android/gms/common/api/g;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public f()Lcom/google/android/gms/cast/ApplicationMetadata;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->e:Lcom/google/android/gms/cast/a$b;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/a$b;->i(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/cast/ApplicationMetadata;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->e:Lcom/google/android/gms/cast/a$b;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/a$b;->j(Lcom/google/android/gms/common/api/g;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public h()D
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->e:Lcom/google/android/gms/cast/a$b;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/a$b;->e(Lcom/google/android/gms/common/api/g;)D

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method public i()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->e:Lcom/google/android/gms/cast/a$b;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d;->h:Lcom/google/android/gms/common/api/g;

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/a$b;->f(Lcom/google/android/gms/common/api/g;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public j()Lcom/google/android/gms/cast/a$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->k:Lcom/google/android/gms/cast/a$a;

    return-object v0
.end method

.method public k()J
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->i:Lcom/google/android/gms/cast/framework/media/c;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d;->i:Lcom/google/android/gms/cast/framework/media/c;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->f()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/d;->i:Lcom/google/android/gms/cast/framework/media/c;

    invoke-virtual {v2}, Lcom/google/android/gms/cast/framework/media/c;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    goto :goto_0
.end method
