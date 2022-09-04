.class final Lcom/google/android/gms/internal/oi;
.super Lcom/google/android/gms/internal/oj;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/oi$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/oj",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/of;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/of",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/internal/nw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/nw",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/internal/nr;

.field private final d:Lcom/google/android/gms/internal/po;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/po",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final e:Lcom/google/android/gms/internal/ok;

.field private f:Lcom/google/android/gms/internal/oj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/oj",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/of;Lcom/google/android/gms/internal/nw;Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;Lcom/google/android/gms/internal/ok;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/of",
            "<TT;>;",
            "Lcom/google/android/gms/internal/nw",
            "<TT;>;",
            "Lcom/google/android/gms/internal/nr;",
            "Lcom/google/android/gms/internal/po",
            "<TT;>;",
            "Lcom/google/android/gms/internal/ok;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/oj;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/oi;->a:Lcom/google/android/gms/internal/of;

    iput-object p2, p0, Lcom/google/android/gms/internal/oi;->b:Lcom/google/android/gms/internal/nw;

    iput-object p3, p0, Lcom/google/android/gms/internal/oi;->c:Lcom/google/android/gms/internal/nr;

    iput-object p4, p0, Lcom/google/android/gms/internal/oi;->d:Lcom/google/android/gms/internal/po;

    iput-object p5, p0, Lcom/google/android/gms/internal/oi;->e:Lcom/google/android/gms/internal/ok;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/of;Lcom/google/android/gms/internal/nw;Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;Lcom/google/android/gms/internal/ok;Lcom/google/android/gms/internal/oi$1;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/google/android/gms/internal/oi;-><init>(Lcom/google/android/gms/internal/of;Lcom/google/android/gms/internal/nw;Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;Lcom/google/android/gms/internal/ok;)V

    return-void
.end method

.method private a()Lcom/google/android/gms/internal/oj;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/oj",
            "<TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/oi;->f:Lcom/google/android/gms/internal/oj;

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/oi;->c:Lcom/google/android/gms/internal/nr;

    iget-object v1, p0, Lcom/google/android/gms/internal/oi;->e:Lcom/google/android/gms/internal/ok;

    iget-object v2, p0, Lcom/google/android/gms/internal/oi;->d:Lcom/google/android/gms/internal/po;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/nr;->a(Lcom/google/android/gms/internal/ok;Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/oi;->f:Lcom/google/android/gms/internal/oj;

    goto :goto_0
.end method

.method public static a(Lcom/google/android/gms/internal/po;Ljava/lang/Object;)Lcom/google/android/gms/internal/ok;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/po",
            "<*>;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/android/gms/internal/ok;"
        }
    .end annotation

    const/4 v4, 0x0

    new-instance v0, Lcom/google/android/gms/internal/oi$a;

    const/4 v3, 0x0

    move-object v1, p1

    move-object v2, p0

    move-object v5, v4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/oi$a;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/po;ZLjava/lang/Class;Lcom/google/android/gms/internal/oi$1;)V

    return-object v0
.end method

.method public static b(Lcom/google/android/gms/internal/po;Ljava/lang/Object;)Lcom/google/android/gms/internal/ok;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/po",
            "<*>;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/android/gms/internal/ok;"
        }
    .end annotation

    const/4 v4, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/po;->b()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/po;->a()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v3, 0x1

    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/oi$a;

    move-object v1, p1

    move-object v2, p0

    move-object v5, v4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/oi$a;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/po;ZLjava/lang/Class;Lcom/google/android/gms/internal/oi$1;)V

    return-object v0

    :cond_0
    const/4 v3, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ps;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/oi;->a:Lcom/google/android/gms/internal/of;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/oi;->a()Lcom/google/android/gms/internal/oj;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/oj;->a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->f()Lcom/google/android/gms/internal/ps;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/oi;->a:Lcom/google/android/gms/internal/of;

    iget-object v1, p0, Lcom/google/android/gms/internal/oi;->d:Lcom/google/android/gms/internal/po;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/po;->b()Ljava/lang/reflect/Type;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/oi;->c:Lcom/google/android/gms/internal/nr;

    iget-object v2, v2, Lcom/google/android/gms/internal/nr;->b:Lcom/google/android/gms/internal/oe;

    invoke-interface {v0, p2, v1, v2}, Lcom/google/android/gms/internal/of;->a(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/oe;)Lcom/google/android/gms/internal/nx;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/oz;->a(Lcom/google/android/gms/internal/nx;Lcom/google/android/gms/internal/ps;)V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/pp;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/oi;->b:Lcom/google/android/gms/internal/nw;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/oi;->a()Lcom/google/android/gms/internal/oj;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/oj;->b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/oz;->a(Lcom/google/android/gms/internal/pp;)Lcom/google/android/gms/internal/nx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nx;->k()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/oi;->b:Lcom/google/android/gms/internal/nw;

    iget-object v2, p0, Lcom/google/android/gms/internal/oi;->d:Lcom/google/android/gms/internal/po;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/po;->b()Ljava/lang/reflect/Type;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/oi;->c:Lcom/google/android/gms/internal/nr;

    iget-object v3, v3, Lcom/google/android/gms/internal/nr;->a:Lcom/google/android/gms/internal/nv;

    invoke-interface {v1, v0, v2, v3}, Lcom/google/android/gms/internal/nw;->b(Lcom/google/android/gms/internal/nx;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/nv;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/android/gms/internal/ob; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/ob;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ob;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
