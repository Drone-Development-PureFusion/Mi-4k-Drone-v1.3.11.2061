.class public Lcom/google/firebase/database/e;
.super Lcom/google/firebase/database/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/database/e$a;
    }
.end annotation


# static fields
.field private static e:Lcom/google/android/gms/internal/id;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/database/n;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/lh;",
            "Lcom/google/firebase/database/e$a;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/database/e;->n()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ml;->a(Lcom/google/android/gms/internal/ij;)V

    invoke-static {p2}, Lcom/google/android/gms/internal/mk;->a(Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/internal/mh;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/database/e;->a:Lcom/google/android/gms/internal/im;

    new-instance v2, Lcom/google/firebase/database/e$2;

    invoke-direct {v2, p0, p1, v0}, Lcom/google/firebase/database/e$2;-><init>(Lcom/google/firebase/database/e;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/mh;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/im;->a(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mh;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/g/f;

    return-object v0
.end method

.method private a(Ljava/lang/Object;Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/lh;",
            "Lcom/google/firebase/database/e$a;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/database/e;->n()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ml;->a(Lcom/google/android/gms/internal/ij;)V

    invoke-virtual {p0}, Lcom/google/firebase/database/e;->n()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/iz;->a(Lcom/google/android/gms/internal/ij;Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/mm;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ml;->a(Ljava/lang/Object;)V

    invoke-static {v0, p2}, Lcom/google/android/gms/internal/li;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-static {p3}, Lcom/google/android/gms/internal/mk;->a(Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/internal/mh;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/database/e;->a:Lcom/google/android/gms/internal/im;

    new-instance v3, Lcom/google/firebase/database/e$1;

    invoke-direct {v3, p0, v0, v1}, Lcom/google/firebase/database/e$1;-><init>(Lcom/google/firebase/database/e;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/mh;)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/im;->a(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mh;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/g/f;

    return-object v0
.end method

.method static a(Lcom/google/android/gms/internal/id;)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/io;->a(Lcom/google/android/gms/internal/ic;)V

    return-void
.end method

.method private b(Ljava/util/Map;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/google/firebase/database/e$a;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Can\'t pass null for argument \'update\' in updateChildren()"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/mm;->a(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/database/e;->n()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ml;->a(Lcom/google/android/gms/internal/ij;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ia;->b(Ljava/util/Map;)Lcom/google/android/gms/internal/ia;

    move-result-object v1

    invoke-static {p2}, Lcom/google/android/gms/internal/mk;->a(Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/internal/mh;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/database/e;->a:Lcom/google/android/gms/internal/im;

    new-instance v4, Lcom/google/firebase/database/e$3;

    invoke-direct {v4, p0, v1, v2, v0}, Lcom/google/firebase/database/e$3;-><init>(Lcom/google/firebase/database/e;Lcom/google/android/gms/internal/ia;Lcom/google/android/gms/internal/mh;Ljava/util/Map;)V

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/im;->a(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/mh;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/g/f;

    return-object v0
.end method

.method static b(Lcom/google/android/gms/internal/id;)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/io;->b(Lcom/google/android/gms/internal/ic;)V

    return-void
.end method

.method public static d()V
    .locals 1

    invoke-static {}, Lcom/google/firebase/database/e;->p()Lcom/google/android/gms/internal/id;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/database/e;->a(Lcom/google/android/gms/internal/id;)V

    return-void
.end method

.method public static e()V
    .locals 1

    invoke-static {}, Lcom/google/firebase/database/e;->p()Lcom/google/android/gms/internal/id;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/database/e;->b(Lcom/google/android/gms/internal/id;)V

    return-void
.end method

.method private static declared-synchronized p()Lcom/google/android/gms/internal/id;
    .locals 2

    const-class v1, Lcom/google/firebase/database/e;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/firebase/database/e;->e:Lcom/google/android/gms/internal/id;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/id;

    invoke-direct {v0}, Lcom/google/android/gms/internal/id;-><init>()V

    sput-object v0, Lcom/google/firebase/database/e;->e:Lcom/google/android/gms/internal/id;

    :cond_0
    sget-object v0, Lcom/google/firebase/database/e;->e:Lcom/google/android/gms/internal/id;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lcom/google/android/gms/g/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {v1}, Lcom/google/android/gms/internal/ll;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-direct {p0, p1, v0, v1}, Lcom/google/firebase/database/e;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/g/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/internal/ll;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/google/firebase/database/e;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/util/Map;)Lcom/google/android/gms/g/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/firebase/database/e;->b(Ljava/util/Map;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a()Lcom/google/firebase/database/e;
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/database/e;->a:Lcom/google/android/gms/internal/im;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/im;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mj;->a(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/kv;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/kv;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/database/e;

    iget-object v2, p0, Lcom/google/firebase/database/e;->a:Lcom/google/android/gms/internal/im;

    invoke-virtual {p0}, Lcom/google/firebase/database/e;->n()Lcom/google/android/gms/internal/ij;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/google/firebase/database/e;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)V

    return-object v1
.end method

.method public a(Ljava/lang/String;)Lcom/google/firebase/database/e;
    .locals 3

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Can\'t pass null for argument \'pathString\' in child()"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/database/e;->n()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/google/android/gms/internal/ml;->b(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0}, Lcom/google/firebase/database/e;->n()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ij;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ij;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/database/e;

    iget-object v2, p0, Lcom/google/firebase/database/e;->a:Lcom/google/android/gms/internal/im;

    invoke-direct {v1, v2, v0}, Lcom/google/firebase/database/e;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)V

    return-object v1

    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/internal/ml;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/firebase/database/e$a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lcom/google/firebase/database/e;->a(Ljava/lang/Object;Lcom/google/firebase/database/e$a;)V

    return-void
.end method

.method public a(Lcom/google/firebase/database/q$a;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/database/e;->a(Lcom/google/firebase/database/q$a;Z)V

    return-void
.end method

.method public a(Lcom/google/firebase/database/q$a;Z)V
    .locals 2

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Can\'t pass null for argument \'handler\' in runTransaction()"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/database/e;->n()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ml;->a(Lcom/google/android/gms/internal/ij;)V

    iget-object v0, p0, Lcom/google/firebase/database/e;->a:Lcom/google/android/gms/internal/im;

    new-instance v1, Lcom/google/firebase/database/e$4;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/firebase/database/e$4;-><init>(Lcom/google/firebase/database/e;Lcom/google/firebase/database/q$a;Z)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/im;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Ljava/lang/Object;Lcom/google/firebase/database/e$a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/internal/ll;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lcom/google/firebase/database/e;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;

    return-void
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/firebase/database/e$a;)V
    .locals 1

    invoke-static {p2}, Lcom/google/android/gms/internal/ll;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-direct {p0, p1, v0, p3}, Lcom/google/firebase/database/e;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;

    return-void
.end method

.method public a(Ljava/util/Map;Lcom/google/firebase/database/e$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/google/firebase/database/e$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/database/e;->b(Ljava/util/Map;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;

    return-void
.end method

.method public b()Lcom/google/android/gms/g/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/firebase/database/e;->a(Ljava/lang/Object;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/Object;)Lcom/google/android/gms/g/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/ll;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/google/firebase/database/e;->a(Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/Object;Lcom/google/firebase/database/e$a;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/ll;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/google/firebase/database/e;->a(Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;

    return-void
.end method

.method public c()Lcom/google/firebase/database/l;
    .locals 3

    invoke-virtual {p0}, Lcom/google/firebase/database/e;->n()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ml;->a(Lcom/google/android/gms/internal/ij;)V

    new-instance v0, Lcom/google/firebase/database/l;

    iget-object v1, p0, Lcom/google/firebase/database/e;->a:Lcom/google/android/gms/internal/im;

    invoke-virtual {p0}, Lcom/google/firebase/database/e;->n()Lcom/google/android/gms/internal/ij;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/firebase/database/l;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/firebase/database/e;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/firebase/database/e;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()Lcom/google/firebase/database/g;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/e;->a:Lcom/google/android/gms/internal/im;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/im;->c()Lcom/google/firebase/database/g;

    move-result-object v0

    return-object v0
.end method

.method public g()Lcom/google/firebase/database/e;
    .locals 3

    invoke-virtual {p0}, Lcom/google/firebase/database/e;->n()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->f()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/google/firebase/database/e;

    iget-object v2, p0, Lcom/google/firebase/database/e;->a:Lcom/google/android/gms/internal/im;

    invoke-direct {v0, v2, v1}, Lcom/google/firebase/database/e;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)V

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public h()Lcom/google/firebase/database/e;
    .locals 4

    new-instance v0, Lcom/google/firebase/database/e;

    iget-object v1, p0, Lcom/google/firebase/database/e;->a:Lcom/google/android/gms/internal/im;

    new-instance v2, Lcom/google/android/gms/internal/ij;

    const-string v3, ""

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ij;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/google/firebase/database/e;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/database/e;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/database/e;->n()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/database/e;->n()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->g()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kv;->e()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lcom/google/firebase/database/e;->g()Lcom/google/firebase/database/e;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/database/e;->a:Lcom/google/android/gms/internal/im;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/im;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lcom/google/firebase/database/e;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/database/e;->i()Ljava/lang/String;

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-static {v1, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "+"

    const-string v3, "%20"

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v1, v0

    new-instance v2, Lcom/google/firebase/database/d;

    const-string v3, "Failed to URLEncode key: "

    invoke-virtual {p0}, Lcom/google/firebase/database/e;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-direct {v2, v0, v1}, Lcom/google/firebase/database/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method
