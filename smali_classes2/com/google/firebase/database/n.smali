.class public Lcom/google/firebase/database/n;
.super Ljava/lang/Object;


# static fields
.field static final synthetic d:Z


# instance fields
.field protected final a:Lcom/google/android/gms/internal/im;

.field protected final b:Lcom/google/android/gms/internal/ij;

.field protected final c:Lcom/google/android/gms/internal/kf;

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/firebase/database/n;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/firebase/database/n;->d:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    iput-object p2, p0, Lcom/google/firebase/database/n;->b:Lcom/google/android/gms/internal/ij;

    sget-object v0, Lcom/google/android/gms/internal/kf;->a:Lcom/google/android/gms/internal/kf;

    iput-object v0, p0, Lcom/google/firebase/database/n;->c:Lcom/google/android/gms/internal/kf;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/firebase/database/n;->e:Z

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/kf;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    iput-object p2, p0, Lcom/google/firebase/database/n;->b:Lcom/google/android/gms/internal/ij;

    iput-object p3, p0, Lcom/google/firebase/database/n;->c:Lcom/google/android/gms/internal/kf;

    iput-boolean p4, p0, Lcom/google/firebase/database/n;->e:Z

    invoke-virtual {p3}, Lcom/google/android/gms/internal/kf;->o()Z

    move-result v0

    const-string v1, "Validation of queries failed."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mk;->a(ZLjava/lang/String;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/lh;Ljava/lang/String;)Lcom/google/firebase/database/n;
    .locals 5

    invoke-static {p2}, Lcom/google/android/gms/internal/ml;->c(Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/lh;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can only use simple values for startAt()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/database/n;->c:Lcom/google/android/gms/internal/kf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kf;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t call startAt() or equalTo() multiple times"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    if-eqz p2, :cond_2

    invoke-static {p2}, Lcom/google/android/gms/internal/kv;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/kv;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lcom/google/firebase/database/n;->c:Lcom/google/android/gms/internal/kf;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/kf;->a(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/kf;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/firebase/database/n;->b(Lcom/google/android/gms/internal/kf;)V

    invoke-direct {p0, v0}, Lcom/google/firebase/database/n;->a(Lcom/google/android/gms/internal/kf;)V

    sget-boolean v1, Lcom/google/firebase/database/n;->d:Z

    if-nez v1, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kf;->o()Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :cond_3
    new-instance v1, Lcom/google/firebase/database/n;

    iget-object v2, p0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    iget-object v3, p0, Lcom/google/firebase/database/n;->b:Lcom/google/android/gms/internal/ij;

    iget-boolean v4, p0, Lcom/google/firebase/database/n;->e:Z

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/google/firebase/database/n;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/kf;Z)V

    return-object v1
.end method

.method private a()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/database/n;->c:Lcom/google/android/gms/internal/kf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kf;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t call equalTo() and startAt() combined"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/database/n;->c:Lcom/google/android/gms/internal/kf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kf;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t call equalTo() and endAt() combined"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method private a(Lcom/google/android/gms/internal/ie;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/jd;->a()Lcom/google/android/gms/internal/jd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jd;->c(Lcom/google/android/gms/internal/ie;)V

    iget-object v0, p0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    new-instance v1, Lcom/google/firebase/database/n$2;

    invoke-direct {v1, p0, p1}, Lcom/google/firebase/database/n$2;-><init>(Lcom/google/firebase/database/n;Lcom/google/android/gms/internal/ie;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/im;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/kf;)V
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kf;->j()Lcom/google/android/gms/internal/lb;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ld;->d()Lcom/google/android/gms/internal/ld;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "You must use startAt(String value), endAt(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported"

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kf;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kf;->b()Lcom/google/android/gms/internal/lh;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kf;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/internal/kv;->a()Lcom/google/android/gms/internal/kv;

    move-result-object v3

    if-ne v2, v3, :cond_0

    instance-of v1, v1, Lcom/google/android/gms/internal/lo;

    if-nez v1, :cond_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/kf;->d()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kf;->e()Lcom/google/android/gms/internal/lh;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kf;->f()Lcom/google/android/gms/internal/kv;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/internal/kv;->b()Lcom/google/android/gms/internal/kv;

    move-result-object v3

    if-ne v2, v3, :cond_2

    instance-of v1, v1, Lcom/google/android/gms/internal/lo;

    if-nez v1, :cond_6

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/kf;->j()Lcom/google/android/gms/internal/lb;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/lk;->d()Lcom/google/android/gms/internal/lk;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kf;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kf;->b()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ll;->a(Lcom/google/android/gms/internal/lh;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/kf;->d()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kf;->e()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ll;->a(Lcom/google/android/gms/internal/lh;)Z

    move-result v0

    if-nez v0, :cond_6

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "When using orderByPriority(), values provided to startAt(), endAt(), or equalTo() must be valid priorities."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    return-void
.end method

.method private b(Lcom/google/android/gms/internal/lh;Ljava/lang/String;)Lcom/google/firebase/database/n;
    .locals 5

    invoke-static {p2}, Lcom/google/android/gms/internal/ml;->c(Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/lh;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can only use simple values for endAt()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {p2}, Lcom/google/android/gms/internal/kv;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/kv;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lcom/google/firebase/database/n;->c:Lcom/google/android/gms/internal/kf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kf;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t call endAt() or equalTo() multiple times"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/firebase/database/n;->c:Lcom/google/android/gms/internal/kf;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/kf;->b(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/kf;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/firebase/database/n;->b(Lcom/google/android/gms/internal/kf;)V

    invoke-direct {p0, v0}, Lcom/google/firebase/database/n;->a(Lcom/google/android/gms/internal/kf;)V

    sget-boolean v1, Lcom/google/firebase/database/n;->d:Z

    if-nez v1, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kf;->o()Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_3
    new-instance v1, Lcom/google/firebase/database/n;

    iget-object v2, p0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    iget-object v3, p0, Lcom/google/firebase/database/n;->b:Lcom/google/android/gms/internal/ij;

    iget-boolean v4, p0, Lcom/google/firebase/database/n;->e:Z

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/google/firebase/database/n;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/kf;Z)V

    return-object v1
.end method

.method private b()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/firebase/database/n;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "You can\'t combine multiple orderBy calls!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method private b(Lcom/google/android/gms/internal/ie;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/jd;->a()Lcom/google/android/gms/internal/jd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jd;->b(Lcom/google/android/gms/internal/ie;)V

    iget-object v0, p0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    new-instance v1, Lcom/google/firebase/database/n$3;

    invoke-direct {v1, p0, p1}, Lcom/google/firebase/database/n$3;-><init>(Lcom/google/firebase/database/n;Lcom/google/android/gms/internal/ie;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/im;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private b(Lcom/google/android/gms/internal/kf;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kf;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kf;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kf;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kf;->h()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t combine startAt(), endAt() and limit(). Use limitToFirst() or limitToLast() instead"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/google/firebase/database/a;)Lcom/google/firebase/database/a;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/hz;

    iget-object v1, p0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    invoke-virtual {p0}, Lcom/google/firebase/database/n;->o()Lcom/google/android/gms/internal/kg;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lcom/google/android/gms/internal/hz;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/firebase/database/a;Lcom/google/android/gms/internal/kg;)V

    invoke-direct {p0, v0}, Lcom/google/firebase/database/n;->b(Lcom/google/android/gms/internal/ie;)V

    return-object p1
.end method

.method public a(D)Lcom/google/firebase/database/n;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/firebase/database/n;->a(DLjava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    return-object v0
.end method

.method public a(DLjava/lang/String;)Lcom/google/firebase/database/n;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/kz;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ll;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/kz;-><init>(Ljava/lang/Double;Lcom/google/android/gms/internal/lh;)V

    invoke-direct {p0, v0, p3}, Lcom/google/firebase/database/n;->a(Lcom/google/android/gms/internal/lh;Ljava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    return-object v0
.end method

.method public a(I)Lcom/google/firebase/database/n;
    .locals 5

    if-gtz p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Limit must be a positive integer!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/database/n;->c:Lcom/google/android/gms/internal/kf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kf;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t call limitToLast on query with previously set limit!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/google/firebase/database/n;

    iget-object v1, p0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    iget-object v2, p0, Lcom/google/firebase/database/n;->b:Lcom/google/android/gms/internal/ij;

    iget-object v3, p0, Lcom/google/firebase/database/n;->c:Lcom/google/android/gms/internal/kf;

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/kf;->a(I)Lcom/google/android/gms/internal/kf;

    move-result-object v3

    iget-boolean v4, p0, Lcom/google/firebase/database/n;->e:Z

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/firebase/database/n;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/kf;Z)V

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/n;
    .locals 2

    if-eqz p1, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/lo;

    invoke-static {}, Lcom/google/android/gms/internal/ll;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/lo;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/lh;)V

    :goto_0
    invoke-direct {p0, v0, p2}, Lcom/google/firebase/database/n;->a(Lcom/google/android/gms/internal/lh;Ljava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/la;->j()Lcom/google/android/gms/internal/la;

    move-result-object v0

    goto :goto_0
.end method

.method public a(ZLjava/lang/String;)Lcom/google/firebase/database/n;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ku;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ll;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ku;-><init>(Ljava/lang/Boolean;Lcom/google/android/gms/internal/lh;)V

    invoke-direct {p0, v0, p2}, Lcom/google/firebase/database/n;->a(Lcom/google/android/gms/internal/lh;Ljava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/firebase/database/r;)Lcom/google/firebase/database/r;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ja;

    iget-object v1, p0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    invoke-virtual {p0}, Lcom/google/firebase/database/n;->o()Lcom/google/android/gms/internal/kg;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lcom/google/android/gms/internal/ja;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/firebase/database/r;Lcom/google/android/gms/internal/kg;)V

    invoke-direct {p0, v0}, Lcom/google/firebase/database/n;->b(Lcom/google/android/gms/internal/ie;)V

    return-object p1
.end method

.method public a(Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/database/n;->b:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/database/n;->b:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/kv;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kv;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/firebase/database/d;

    const-string v1, "Can\'t call keepSynced() on .info paths."

    invoke-direct {v0, v1}, Lcom/google/firebase/database/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    new-instance v1, Lcom/google/firebase/database/n$4;

    invoke-direct {v1, p0, p1}, Lcom/google/firebase/database/n$4;-><init>(Lcom/google/firebase/database/n;Z)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/im;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(D)Lcom/google/firebase/database/n;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/firebase/database/n;->b(DLjava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    return-object v0
.end method

.method public b(DLjava/lang/String;)Lcom/google/firebase/database/n;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/kz;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ll;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/kz;-><init>(Ljava/lang/Double;Lcom/google/android/gms/internal/lh;)V

    invoke-direct {p0, v0, p3}, Lcom/google/firebase/database/n;->b(Lcom/google/android/gms/internal/lh;Ljava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    return-object v0
.end method

.method public b(I)Lcom/google/firebase/database/n;
    .locals 5

    if-gtz p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Limit must be a positive integer!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/database/n;->c:Lcom/google/android/gms/internal/kf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kf;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t call limitToLast on query with previously set limit!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/google/firebase/database/n;

    iget-object v1, p0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    iget-object v2, p0, Lcom/google/firebase/database/n;->b:Lcom/google/android/gms/internal/ij;

    iget-object v3, p0, Lcom/google/firebase/database/n;->c:Lcom/google/android/gms/internal/kf;

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/kf;->b(I)Lcom/google/android/gms/internal/kf;

    move-result-object v3

    iget-boolean v4, p0, Lcom/google/firebase/database/n;->e:Z

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/firebase/database/n;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/kf;Z)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/google/firebase/database/n;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/database/n;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/n;
    .locals 2

    if-eqz p1, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/lo;

    invoke-static {}, Lcom/google/android/gms/internal/ll;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/lo;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/lh;)V

    :goto_0
    invoke-direct {p0, v0, p2}, Lcom/google/firebase/database/n;->b(Lcom/google/android/gms/internal/lh;Ljava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/la;->j()Lcom/google/android/gms/internal/la;

    move-result-object v0

    goto :goto_0
.end method

.method public b(Z)Lcom/google/firebase/database/n;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/database/n;->a(ZLjava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    return-object v0
.end method

.method public b(ZLjava/lang/String;)Lcom/google/firebase/database/n;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ku;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ll;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ku;-><init>(Ljava/lang/Boolean;Lcom/google/android/gms/internal/lh;)V

    invoke-direct {p0, v0, p2}, Lcom/google/firebase/database/n;->b(Lcom/google/android/gms/internal/lh;Ljava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/firebase/database/a;)V
    .locals 3

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "listener must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/hz;

    iget-object v1, p0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    invoke-virtual {p0}, Lcom/google/firebase/database/n;->o()Lcom/google/android/gms/internal/kg;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lcom/google/android/gms/internal/hz;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/firebase/database/a;Lcom/google/android/gms/internal/kg;)V

    invoke-direct {p0, v0}, Lcom/google/firebase/database/n;->a(Lcom/google/android/gms/internal/ie;)V

    return-void
.end method

.method public b(Lcom/google/firebase/database/r;)V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ja;

    iget-object v1, p0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    new-instance v2, Lcom/google/firebase/database/n$1;

    invoke-direct {v2, p0, p1}, Lcom/google/firebase/database/n$1;-><init>(Lcom/google/firebase/database/n;Lcom/google/firebase/database/r;)V

    invoke-virtual {p0}, Lcom/google/firebase/database/n;->o()Lcom/google/android/gms/internal/kg;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ja;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/firebase/database/r;Lcom/google/android/gms/internal/kg;)V

    invoke-direct {p0, v0}, Lcom/google/firebase/database/n;->b(Lcom/google/android/gms/internal/ie;)V

    return-void
.end method

.method public c(D)Lcom/google/firebase/database/n;
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/database/n;->a()V

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/database/n;->a(D)Lcom/google/firebase/database/n;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/database/n;->b(D)Lcom/google/firebase/database/n;

    move-result-object v0

    return-object v0
.end method

.method public c(DLjava/lang/String;)Lcom/google/firebase/database/n;
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/database/n;->a()V

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/firebase/database/n;->a(DLjava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/firebase/database/n;->b(DLjava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lcom/google/firebase/database/n;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/database/n;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/n;
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/database/n;->a()V

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/database/n;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/database/n;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    return-object v0
.end method

.method public c(Z)Lcom/google/firebase/database/n;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/database/n;->b(ZLjava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    return-object v0
.end method

.method public c(ZLjava/lang/String;)Lcom/google/firebase/database/n;
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/database/n;->a()V

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/database/n;->a(ZLjava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/database/n;->b(ZLjava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/google/firebase/database/r;)V
    .locals 3

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "listener must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ja;

    iget-object v1, p0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    invoke-virtual {p0}, Lcom/google/firebase/database/n;->o()Lcom/google/android/gms/internal/kg;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lcom/google/android/gms/internal/ja;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/firebase/database/r;Lcom/google/android/gms/internal/kg;)V

    invoke-direct {p0, v0}, Lcom/google/firebase/database/n;->a(Lcom/google/android/gms/internal/ie;)V

    return-void
.end method

.method public d(Ljava/lang/String;)Lcom/google/firebase/database/n;
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/database/n;->a()V

    invoke-virtual {p0, p1}, Lcom/google/firebase/database/n;->b(Ljava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/firebase/database/n;->c(Ljava/lang/String;)Lcom/google/firebase/database/n;

    move-result-object v0

    return-object v0
.end method

.method public d(Z)Lcom/google/firebase/database/n;
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/database/n;->a()V

    invoke-virtual {p0, p1}, Lcom/google/firebase/database/n;->b(Z)Lcom/google/firebase/database/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/firebase/database/n;->c(Z)Lcom/google/firebase/database/n;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;)Lcom/google/firebase/database/n;
    .locals 5

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Key can\'t be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const-string v0, "$key"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ".key"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x36

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Can\'t use \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' as path, please use orderByKey() instead!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const-string v0, "$priority"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, ".priority"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x3b

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Can\'t use \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' as path, please use orderByPriority() instead!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    const-string v0, "$value"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, ".value"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x38

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Can\'t use \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' as path, please use orderByValue() instead!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    invoke-static {p1}, Lcom/google/android/gms/internal/ml;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/firebase/database/n;->b()V

    new-instance v0, Lcom/google/android/gms/internal/ij;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ij;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->i()I

    move-result v1

    if-nez v1, :cond_7

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t use empty path, use orderByValue() instead!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v1, Lcom/google/android/gms/internal/lj;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/lj;-><init>(Lcom/google/android/gms/internal/ij;)V

    new-instance v0, Lcom/google/firebase/database/n;

    iget-object v2, p0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    iget-object v3, p0, Lcom/google/firebase/database/n;->b:Lcom/google/android/gms/internal/ij;

    iget-object v4, p0, Lcom/google/firebase/database/n;->c:Lcom/google/android/gms/internal/kf;

    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/kf;->a(Lcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/kf;

    move-result-object v1

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/google/firebase/database/n;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/kf;Z)V

    return-object v0
.end method

.method public j()Lcom/google/firebase/database/n;
    .locals 5

    invoke-direct {p0}, Lcom/google/firebase/database/n;->b()V

    iget-object v0, p0, Lcom/google/firebase/database/n;->c:Lcom/google/android/gms/internal/kf;

    invoke-static {}, Lcom/google/android/gms/internal/lk;->d()Lcom/google/android/gms/internal/lk;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kf;->a(Lcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/kf;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/firebase/database/n;->a(Lcom/google/android/gms/internal/kf;)V

    new-instance v1, Lcom/google/firebase/database/n;

    iget-object v2, p0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    iget-object v3, p0, Lcom/google/firebase/database/n;->b:Lcom/google/android/gms/internal/ij;

    const/4 v4, 0x1

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/google/firebase/database/n;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/kf;Z)V

    return-object v1
.end method

.method public k()Lcom/google/firebase/database/n;
    .locals 5

    invoke-direct {p0}, Lcom/google/firebase/database/n;->b()V

    iget-object v0, p0, Lcom/google/firebase/database/n;->c:Lcom/google/android/gms/internal/kf;

    invoke-static {}, Lcom/google/android/gms/internal/ld;->d()Lcom/google/android/gms/internal/ld;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kf;->a(Lcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/kf;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/firebase/database/n;->a(Lcom/google/android/gms/internal/kf;)V

    new-instance v1, Lcom/google/firebase/database/n;

    iget-object v2, p0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    iget-object v3, p0, Lcom/google/firebase/database/n;->b:Lcom/google/android/gms/internal/ij;

    const/4 v4, 0x1

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/google/firebase/database/n;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/kf;Z)V

    return-object v1
.end method

.method public l()Lcom/google/firebase/database/n;
    .locals 5

    invoke-direct {p0}, Lcom/google/firebase/database/n;->b()V

    new-instance v0, Lcom/google/firebase/database/n;

    iget-object v1, p0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    iget-object v2, p0, Lcom/google/firebase/database/n;->b:Lcom/google/android/gms/internal/ij;

    iget-object v3, p0, Lcom/google/firebase/database/n;->c:Lcom/google/android/gms/internal/kf;

    invoke-static {}, Lcom/google/android/gms/internal/lp;->d()Lcom/google/android/gms/internal/lp;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/kf;->a(Lcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/kf;

    move-result-object v3

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/firebase/database/n;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/kf;Z)V

    return-object v0
.end method

.method public m()Lcom/google/firebase/database/e;
    .locals 3

    new-instance v0, Lcom/google/firebase/database/e;

    iget-object v1, p0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    invoke-virtual {p0}, Lcom/google/firebase/database/n;->n()Lcom/google/android/gms/internal/ij;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/firebase/database/e;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)V

    return-object v0
.end method

.method public n()Lcom/google/android/gms/internal/ij;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/n;->b:Lcom/google/android/gms/internal/ij;

    return-object v0
.end method

.method public o()Lcom/google/android/gms/internal/kg;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/kg;

    iget-object v1, p0, Lcom/google/firebase/database/n;->b:Lcom/google/android/gms/internal/ij;

    iget-object v2, p0, Lcom/google/firebase/database/n;->c:Lcom/google/android/gms/internal/kf;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/kg;-><init>(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/kf;)V

    return-object v0
.end method
