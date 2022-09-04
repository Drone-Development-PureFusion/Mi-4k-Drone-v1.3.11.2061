.class public Lcom/google/android/gms/internal/kf;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/kf$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/internal/kf;

.field static final synthetic b:Z


# instance fields
.field private c:Ljava/lang/Integer;

.field private d:Lcom/google/android/gms/internal/kf$a;

.field private e:Lcom/google/android/gms/internal/lh;

.field private f:Lcom/google/android/gms/internal/kv;

.field private g:Lcom/google/android/gms/internal/lh;

.field private h:Lcom/google/android/gms/internal/kv;

.field private i:Lcom/google/android/gms/internal/lb;

.field private j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/kf;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/kf;->b:Z

    new-instance v0, Lcom/google/android/gms/internal/kf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/kf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/kf;->a:Lcom/google/android/gms/internal/kf;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/kf;->e:Lcom/google/android/gms/internal/lh;

    iput-object v1, p0, Lcom/google/android/gms/internal/kf;->f:Lcom/google/android/gms/internal/kv;

    iput-object v1, p0, Lcom/google/android/gms/internal/kf;->g:Lcom/google/android/gms/internal/lh;

    iput-object v1, p0, Lcom/google/android/gms/internal/kf;->h:Lcom/google/android/gms/internal/kv;

    invoke-static {}, Lcom/google/android/gms/internal/lk;->d()Lcom/google/android/gms/internal/lk;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/kf;->i:Lcom/google/android/gms/internal/lb;

    iput-object v1, p0, Lcom/google/android/gms/internal/kf;->j:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/util/Map;)Lcom/google/android/gms/internal/kf;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/android/gms/internal/kf;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/internal/kf;

    invoke-direct {v1}, Lcom/google/android/gms/internal/kf;-><init>()V

    const-string v0, "l"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, v1, Lcom/google/android/gms/internal/kf;->c:Ljava/lang/Integer;

    const-string v0, "sp"

    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "sp"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/li;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/kf;->a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/gms/internal/kf;->e:Lcom/google/android/gms/internal/lh;

    const-string v0, "sn"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/kv;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/kv;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/gms/internal/kf;->f:Lcom/google/android/gms/internal/kv;

    :cond_0
    const-string v0, "ep"

    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ep"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/li;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/kf;->a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/gms/internal/kf;->g:Lcom/google/android/gms/internal/lh;

    const-string v0, "en"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/internal/kv;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/kv;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/gms/internal/kf;->h:Lcom/google/android/gms/internal/kv;

    :cond_1
    const-string v0, "vf"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v2, "l"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/google/android/gms/internal/kf$a;->a:Lcom/google/android/gms/internal/kf$a;

    :goto_0
    iput-object v0, v1, Lcom/google/android/gms/internal/kf;->d:Lcom/google/android/gms/internal/kf$a;

    :cond_2
    const-string v0, "i"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-static {v0}, Lcom/google/android/gms/internal/lb;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/lb;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/gms/internal/kf;->i:Lcom/google/android/gms/internal/lb;

    :cond_3
    return-object v1

    :cond_4
    sget-object v0, Lcom/google/android/gms/internal/kf$a;->b:Lcom/google/android/gms/internal/kf$a;

    goto :goto_0
.end method

.method private static a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;
    .locals 4

    instance-of v0, p0, Lcom/google/android/gms/internal/lo;

    if-nez v0, :cond_0

    instance-of v0, p0, Lcom/google/android/gms/internal/ku;

    if-nez v0, :cond_0

    instance-of v0, p0, Lcom/google/android/gms/internal/kz;

    if-nez v0, :cond_0

    instance-of v0, p0, Lcom/google/android/gms/internal/la;

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-object p0

    :cond_1
    instance-of v0, p0, Lcom/google/android/gms/internal/lf;

    if-eqz v0, :cond_2

    new-instance v1, Lcom/google/android/gms/internal/kz;

    invoke-interface {p0}, Lcom/google/android/gms/internal/lh;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ll;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/kz;-><init>(Ljava/lang/Double;Lcom/google/android/gms/internal/lh;)V

    move-object p0, v1

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-interface {p0}, Lcom/google/android/gms/internal/lh;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x2b

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected value passed to normalizeValue: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private r()Lcom/google/android/gms/internal/kf;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/kf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/kf;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/kf;->c:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/google/android/gms/internal/kf;->c:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/google/android/gms/internal/kf;->e:Lcom/google/android/gms/internal/lh;

    iput-object v1, v0, Lcom/google/android/gms/internal/kf;->e:Lcom/google/android/gms/internal/lh;

    iget-object v1, p0, Lcom/google/android/gms/internal/kf;->f:Lcom/google/android/gms/internal/kv;

    iput-object v1, v0, Lcom/google/android/gms/internal/kf;->f:Lcom/google/android/gms/internal/kv;

    iget-object v1, p0, Lcom/google/android/gms/internal/kf;->g:Lcom/google/android/gms/internal/lh;

    iput-object v1, v0, Lcom/google/android/gms/internal/kf;->g:Lcom/google/android/gms/internal/lh;

    iget-object v1, p0, Lcom/google/android/gms/internal/kf;->h:Lcom/google/android/gms/internal/kv;

    iput-object v1, v0, Lcom/google/android/gms/internal/kf;->h:Lcom/google/android/gms/internal/kv;

    iget-object v1, p0, Lcom/google/android/gms/internal/kf;->d:Lcom/google/android/gms/internal/kf$a;

    iput-object v1, v0, Lcom/google/android/gms/internal/kf;->d:Lcom/google/android/gms/internal/kf$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/kf;->i:Lcom/google/android/gms/internal/lb;

    iput-object v1, v0, Lcom/google/android/gms/internal/kf;->i:Lcom/google/android/gms/internal/lb;

    return-object v0
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/internal/kf;
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/kf;->r()Lcom/google/android/gms/internal/kf;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/kf;->c:Ljava/lang/Integer;

    sget-object v1, Lcom/google/android/gms/internal/kf$a;->a:Lcom/google/android/gms/internal/kf$a;

    iput-object v1, v0, Lcom/google/android/gms/internal/kf;->d:Lcom/google/android/gms/internal/kf$a;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/kf;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/kf;->r()Lcom/google/android/gms/internal/kf;

    move-result-object v0

    iput-object p1, v0, Lcom/google/android/gms/internal/kf;->i:Lcom/google/android/gms/internal/lb;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/kf;
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/kf;->b:Z

    if-nez v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/lh;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/lf;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/mk;->a(Z)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/kf;->r()Lcom/google/android/gms/internal/kf;

    move-result-object v0

    iput-object p1, v0, Lcom/google/android/gms/internal/kf;->e:Lcom/google/android/gms/internal/lh;

    iput-object p2, v0, Lcom/google/android/gms/internal/kf;->f:Lcom/google/android/gms/internal/kv;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->e:Lcom/google/android/gms/internal/lh;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(I)Lcom/google/android/gms/internal/kf;
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/kf;->r()Lcom/google/android/gms/internal/kf;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/kf;->c:Ljava/lang/Integer;

    sget-object v1, Lcom/google/android/gms/internal/kf$a;->b:Lcom/google/android/gms/internal/kf$a;

    iput-object v1, v0, Lcom/google/android/gms/internal/kf;->d:Lcom/google/android/gms/internal/kf$a;

    return-object v0
.end method

.method public b(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/kf;
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/kf;->b:Z

    if-nez v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/lh;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/lf;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/mk;->a(Z)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/kf;->r()Lcom/google/android/gms/internal/kf;

    move-result-object v0

    iput-object p1, v0, Lcom/google/android/gms/internal/kf;->g:Lcom/google/android/gms/internal/lh;

    iput-object p2, v0, Lcom/google/android/gms/internal/kf;->h:Lcom/google/android/gms/internal/kv;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Lcom/google/android/gms/internal/lh;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->a()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot get index start value if start has not been set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->e:Lcom/google/android/gms/internal/lh;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/internal/kv;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->a()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot get index start name if start has not been set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->f:Lcom/google/android/gms/internal/kv;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->f:Lcom/google/android/gms/internal/kv;

    :goto_0
    return-object v0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/kv;->a()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    goto :goto_0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->g:Lcom/google/android/gms/internal/lh;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()Lcom/google/android/gms/internal/lh;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->d()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot get index end value if start has not been set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->g:Lcom/google/android/gms/internal/lh;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    check-cast p1, Lcom/google/android/gms/internal/kf;

    iget-object v2, p0, Lcom/google/android/gms/internal/kf;->c:Ljava/lang/Integer;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/google/android/gms/internal/kf;->c:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/google/android/gms/internal/kf;->c:Ljava/lang/Integer;

    invoke-virtual {v2, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_4
    move v0, v1

    goto :goto_0

    :cond_5
    iget-object v2, p1, Lcom/google/android/gms/internal/kf;->c:Ljava/lang/Integer;

    if-nez v2, :cond_4

    :cond_6
    iget-object v2, p0, Lcom/google/android/gms/internal/kf;->i:Lcom/google/android/gms/internal/lb;

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/google/android/gms/internal/kf;->i:Lcom/google/android/gms/internal/lb;

    iget-object v3, p1, Lcom/google/android/gms/internal/kf;->i:Lcom/google/android/gms/internal/lb;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :cond_7
    move v0, v1

    goto :goto_0

    :cond_8
    iget-object v2, p1, Lcom/google/android/gms/internal/kf;->i:Lcom/google/android/gms/internal/lb;

    if-nez v2, :cond_7

    :cond_9
    iget-object v2, p0, Lcom/google/android/gms/internal/kf;->h:Lcom/google/android/gms/internal/kv;

    if-eqz v2, :cond_b

    iget-object v2, p0, Lcom/google/android/gms/internal/kf;->h:Lcom/google/android/gms/internal/kv;

    iget-object v3, p1, Lcom/google/android/gms/internal/kf;->h:Lcom/google/android/gms/internal/kv;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/kv;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    :cond_a
    move v0, v1

    goto :goto_0

    :cond_b
    iget-object v2, p1, Lcom/google/android/gms/internal/kf;->h:Lcom/google/android/gms/internal/kv;

    if-nez v2, :cond_a

    :cond_c
    iget-object v2, p0, Lcom/google/android/gms/internal/kf;->g:Lcom/google/android/gms/internal/lh;

    if-eqz v2, :cond_e

    iget-object v2, p0, Lcom/google/android/gms/internal/kf;->g:Lcom/google/android/gms/internal/lh;

    iget-object v3, p1, Lcom/google/android/gms/internal/kf;->g:Lcom/google/android/gms/internal/lh;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    :cond_d
    move v0, v1

    goto :goto_0

    :cond_e
    iget-object v2, p1, Lcom/google/android/gms/internal/kf;->g:Lcom/google/android/gms/internal/lh;

    if-nez v2, :cond_d

    :cond_f
    iget-object v2, p0, Lcom/google/android/gms/internal/kf;->f:Lcom/google/android/gms/internal/kv;

    if-eqz v2, :cond_11

    iget-object v2, p0, Lcom/google/android/gms/internal/kf;->f:Lcom/google/android/gms/internal/kv;

    iget-object v3, p1, Lcom/google/android/gms/internal/kf;->f:Lcom/google/android/gms/internal/kv;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/kv;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    :cond_10
    move v0, v1

    goto :goto_0

    :cond_11
    iget-object v2, p1, Lcom/google/android/gms/internal/kf;->f:Lcom/google/android/gms/internal/kv;

    if-nez v2, :cond_10

    :cond_12
    iget-object v2, p0, Lcom/google/android/gms/internal/kf;->e:Lcom/google/android/gms/internal/lh;

    if-eqz v2, :cond_14

    iget-object v2, p0, Lcom/google/android/gms/internal/kf;->e:Lcom/google/android/gms/internal/lh;

    iget-object v3, p1, Lcom/google/android/gms/internal/kf;->e:Lcom/google/android/gms/internal/lh;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    :cond_13
    move v0, v1

    goto/16 :goto_0

    :cond_14
    iget-object v2, p1, Lcom/google/android/gms/internal/kf;->e:Lcom/google/android/gms/internal/lh;

    if-nez v2, :cond_13

    :cond_15
    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->k()Z

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kf;->k()Z

    move-result v3

    if-eq v2, v3, :cond_0

    move v0, v1

    goto/16 :goto_0
.end method

.method public f()Lcom/google/android/gms/internal/kv;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->d()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot get index end name if start has not been set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->h:Lcom/google/android/gms/internal/kv;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->h:Lcom/google/android/gms/internal/kv;

    :goto_0
    return-object v0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/kv;->b()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    goto :goto_0
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public h()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->d:Lcom/google/android/gms/internal/kf$a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->c:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_0
    mul-int/lit8 v2, v0, 0x1f

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x4cf

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->e:Lcom/google/android/gms/internal/lh;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->e:Lcom/google/android/gms/internal/lh;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->f:Lcom/google/android/gms/internal/kv;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->f:Lcom/google/android/gms/internal/kv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kv;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->g:Lcom/google/android/gms/internal/lh;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->g:Lcom/google/android/gms/internal/lh;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->h:Lcom/google/android/gms/internal/kv;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->h:Lcom/google/android/gms/internal/kv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kv;->hashCode()I

    move-result v0

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/kf;->i:Lcom/google/android/gms/internal/lb;

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/kf;->i:Lcom/google/android/gms/internal/lb;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    return v0

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    const/16 v0, 0x4d5

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_2

    :cond_4
    move v0, v1

    goto :goto_3

    :cond_5
    move v0, v1

    goto :goto_4

    :cond_6
    move v0, v1

    goto :goto_5
.end method

.method public i()I
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->g()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot get limit if limit has not been set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->c:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public j()Lcom/google/android/gms/internal/lb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->i:Lcom/google/android/gms/internal/lb;

    return-object v0
.end method

.method public k()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->d:Lcom/google/android/gms/internal/kf$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->d:Lcom/google/android/gms/internal/kf$a;

    sget-object v1, Lcom/google/android/gms/internal/kf$a;->a:Lcom/google/android/gms/internal/kf$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->a()Z

    move-result v0

    goto :goto_0
.end method

.method public l()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "sp"

    iget-object v2, p0, Lcom/google/android/gms/internal/kf;->e:Lcom/google/android/gms/internal/lh;

    invoke-interface {v2}, Lcom/google/android/gms/internal/lh;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->f:Lcom/google/android/gms/internal/kv;

    if-eqz v0, :cond_0

    const-string v0, "sn"

    iget-object v2, p0, Lcom/google/android/gms/internal/kf;->f:Lcom/google/android/gms/internal/kv;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/kv;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ep"

    iget-object v2, p0, Lcom/google/android/gms/internal/kf;->g:Lcom/google/android/gms/internal/lh;

    invoke-interface {v2}, Lcom/google/android/gms/internal/lh;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->h:Lcom/google/android/gms/internal/kv;

    if-eqz v0, :cond_1

    const-string v0, "en"

    iget-object v2, p0, Lcom/google/android/gms/internal/kf;->h:Lcom/google/android/gms/internal/kv;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/kv;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    const-string v0, "l"

    iget-object v2, p0, Lcom/google/android/gms/internal/kf;->c:Ljava/lang/Integer;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->d:Lcom/google/android/gms/internal/kf$a;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/google/android/gms/internal/kf$a;->a:Lcom/google/android/gms/internal/kf$a;

    :cond_2
    :goto_0
    sget-object v2, Lcom/google/android/gms/internal/kf$1;->a:[I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kf$a;->ordinal()I

    move-result v0

    aget v0, v2, v0

    packed-switch v0, :pswitch_data_0

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->i:Lcom/google/android/gms/internal/lb;

    invoke-static {}, Lcom/google/android/gms/internal/lk;->d()Lcom/google/android/gms/internal/lk;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "i"

    iget-object v2, p0, Lcom/google/android/gms/internal/kf;->i:Lcom/google/android/gms/internal/lb;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/lb;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-object v1

    :cond_5
    sget-object v0, Lcom/google/android/gms/internal/kf$a;->b:Lcom/google/android/gms/internal/kf$a;

    goto :goto_0

    :pswitch_0
    const-string v0, "vf"

    const-string v2, "l"

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :pswitch_1
    const-string v0, "vf"

    const-string v2, "r"

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public m()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->d()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->g()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public n()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->i:Lcom/google/android/gms/internal/lb;

    invoke-static {}, Lcom/google/android/gms/internal/lk;->d()Lcom/google/android/gms/internal/lk;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public o()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public p()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->j:Ljava/lang/String;

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->l()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/mb;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/kf;->j:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/kf;->j:Ljava/lang/String;

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public q()Lcom/google/android/gms/internal/ko;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/kl;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->j()Lcom/google/android/gms/internal/lb;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/kl;-><init>(Lcom/google/android/gms/internal/lb;)V

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/kn;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/kn;-><init>(Lcom/google/android/gms/internal/kf;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/kp;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/kp;-><init>(Lcom/google/android/gms/internal/kf;)V

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->l()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
