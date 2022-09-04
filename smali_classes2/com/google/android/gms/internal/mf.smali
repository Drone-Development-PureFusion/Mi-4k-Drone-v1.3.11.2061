.class public Lcom/google/android/gms/internal/mf;
.super Ljava/lang/Object;


# static fields
.field static final synthetic a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/mf;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/mf;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lcom/google/android/gms/internal/le;)J
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/le",
            "<*>;)J"
        }
    .end annotation

    const-wide/16 v0, 0x8

    instance-of v2, p0, Lcom/google/android/gms/internal/kz;

    if-eqz v2, :cond_1

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/le;->f()Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v2

    if-eqz v2, :cond_4

    :goto_1
    return-wide v0

    :cond_1
    instance-of v2, p0, Lcom/google/android/gms/internal/lf;

    if-nez v2, :cond_0

    instance-of v0, p0, Lcom/google/android/gms/internal/ku;

    if-eqz v0, :cond_2

    const-wide/16 v0, 0x4

    goto :goto_0

    :cond_2
    instance-of v0, p0, Lcom/google/android/gms/internal/lo;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/le;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    int-to-long v0, v0

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x18

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unknown leaf node type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    const-wide/16 v2, 0x18

    add-long/2addr v2, v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/le;->f()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/le;

    invoke-static {v0}, Lcom/google/android/gms/internal/mf;->a(Lcom/google/android/gms/internal/le;)J

    move-result-wide v0

    add-long/2addr v0, v2

    goto :goto_1
.end method

.method public static a(Lcom/google/android/gms/internal/lh;)J
    .locals 10

    const-wide/16 v4, 0x4

    invoke-interface {p0}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    move-wide v2, v4

    :cond_0
    :goto_0
    return-wide v2

    :cond_1
    invoke-interface {p0}, Lcom/google/android/gms/internal/lh;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    check-cast p0, Lcom/google/android/gms/internal/le;

    invoke-static {p0}, Lcom/google/android/gms/internal/mf;->a(Lcom/google/android/gms/internal/le;)J

    move-result-wide v2

    goto :goto_0

    :cond_2
    sget-boolean v0, Lcom/google/android/gms/internal/mf;->a:Z

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/google/android/gms/internal/kw;

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x16

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected node type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_3
    const-wide/16 v0, 0x1

    invoke-interface {p0}, Lcom/google/android/gms/internal/lh;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move-wide v2, v0

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kv;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    int-to-long v8, v1

    add-long/2addr v2, v8

    add-long/2addr v2, v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/mf;->a(Lcom/google/android/gms/internal/lh;)J

    move-result-wide v0

    add-long/2addr v0, v2

    move-wide v2, v0

    goto :goto_1

    :cond_4
    invoke-interface {p0}, Lcom/google/android/gms/internal/lh;->f()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0xc

    add-long/2addr v2, v0

    invoke-interface {p0}, Lcom/google/android/gms/internal/lh;->f()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/le;

    invoke-static {v0}, Lcom/google/android/gms/internal/mf;->a(Lcom/google/android/gms/internal/le;)J

    move-result-wide v0

    add-long/2addr v2, v0

    goto/16 :goto_0
.end method

.method public static b(Lcom/google/android/gms/internal/lh;)I
    .locals 4

    const/4 v0, 0x0

    invoke-interface {p0}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    return v0

    :cond_0
    invoke-interface {p0}, Lcom/google/android/gms/internal/lh;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    sget-boolean v1, Lcom/google/android/gms/internal/mf;->a:Z

    if-nez v1, :cond_2

    instance-of v1, p0, Lcom/google/android/gms/internal/kw;

    if-nez v1, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x16

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected node type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    invoke-interface {p0}, Lcom/google/android/gms/internal/lh;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/mf;->b(Lcom/google/android/gms/internal/lh;)I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_0
.end method
