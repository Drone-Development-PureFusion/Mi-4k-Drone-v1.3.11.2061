.class public abstract Lcom/google/android/gms/internal/le;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/lh;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/le$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/google/android/gms/internal/le;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/lh;"
    }
.end annotation


# static fields
.field static final synthetic c:Z


# instance fields
.field private a:Ljava/lang/String;

.field protected final b:Lcom/google/android/gms/internal/lh;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/le;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/le;->c:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lcom/google/android/gms/internal/lh;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/le;->b:Lcom/google/android/gms/internal/lh;

    return-void
.end method

.method private static a(Lcom/google/android/gms/internal/lf;Lcom/google/android/gms/internal/kz;)I
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/lf;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kz;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v1, v0}, Ljava/lang/Double;->compareTo(Ljava/lang/Double;)I

    move-result v0

    return v0
.end method


# virtual methods
.method protected abstract a(Lcom/google/android/gms/internal/le;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation
.end method

.method public a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kv;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p0, p0, Lcom/google/android/gms/internal/le;->b:Lcom/google/android/gms/internal/lh;

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/la;->j()Lcom/google/android/gms/internal/la;

    move-result-object p0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-object p2

    :cond_0
    invoke-interface {p2}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kv;->f()Z

    move-result v1

    if-nez v1, :cond_1

    move-object p2, p0

    goto :goto_0

    :cond_1
    sget-boolean v1, Lcom/google/android/gms/internal/le;->c:Z

    if-nez v1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kv;->f()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->i()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/la;->j()Lcom/google/android/gms/internal/la;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->e()Lcom/google/android/gms/internal/ij;

    move-result-object v2

    invoke-virtual {v1, v2, p2}, Lcom/google/android/gms/internal/la;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/le;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object p2

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kv;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/le;->b(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object p0

    :cond_0
    :goto_0
    return-object p0

    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/la;->j()Lcom/google/android/gms/internal/la;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/la;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/le;->b:Lcom/google/android/gms/internal/lh;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/lh;->b(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object p0

    goto :goto_0
.end method

.method public a(Z)Ljava/lang/Object;
    .locals 3

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/le;->b:Lcom/google/android/gms/internal/lh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/le;->a()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, ".value"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/le;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, ".priority"

    iget-object v2, p0, Lcom/google/android/gms/internal/le;->b:Lcom/google/android/gms/internal/lh;

    invoke-interface {v2}, Lcom/google/android/gms/internal/lh;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/kv;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected b(Lcom/google/android/gms/internal/le;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/le",
            "<*>;)I"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/le;->u_()Lcom/google/android/gms/internal/le$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/le;->u_()Lcom/google/android/gms/internal/le$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/le$a;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/le;->a(Lcom/google/android/gms/internal/le;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/le$a;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/kv;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected b(Lcom/google/android/gms/internal/lh$a;)Ljava/lang/String;
    .locals 4

    sget-object v0, Lcom/google/android/gms/internal/le$1;->a:[I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/lh$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x16

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unknown hash version: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/internal/le;->b:Lcom/google/android/gms/internal/lh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/le;->b:Lcom/google/android/gms/internal/lh;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/lh$a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0xa

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "priority:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c(Lcom/google/android/gms/internal/lh;)I
    .locals 2

    invoke-interface {p1}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/kw;

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    sget-boolean v0, Lcom/google/android/gms/internal/le;->c:Z

    if-nez v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/internal/lh;->e()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Node is not leaf node!"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    instance-of v0, p0, Lcom/google/android/gms/internal/lf;

    if-eqz v0, :cond_3

    instance-of v0, p1, Lcom/google/android/gms/internal/kz;

    if-eqz v0, :cond_3

    check-cast p0, Lcom/google/android/gms/internal/lf;

    check-cast p1, Lcom/google/android/gms/internal/kz;

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/le;->a(Lcom/google/android/gms/internal/lf;Lcom/google/android/gms/internal/kz;)I

    move-result v0

    goto :goto_0

    :cond_3
    instance-of v0, p0, Lcom/google/android/gms/internal/kz;

    if-eqz v0, :cond_4

    instance-of v0, p1, Lcom/google/android/gms/internal/lf;

    if-eqz v0, :cond_4

    check-cast p1, Lcom/google/android/gms/internal/lf;

    check-cast p0, Lcom/google/android/gms/internal/kz;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/le;->a(Lcom/google/android/gms/internal/lf;Lcom/google/android/gms/internal/kz;)I

    move-result v0

    mul-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_4
    check-cast p1, Lcom/google/android/gms/internal/le;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/le;->b(Lcom/google/android/gms/internal/le;)I

    move-result v0

    goto :goto_0
.end method

.method public c(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/lh;
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kv;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/le;->b:Lcom/google/android/gms/internal/lh;

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/la;->j()Lcom/google/android/gms/internal/la;

    move-result-object v0

    goto :goto_0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/lh;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/le;->c(Lcom/google/android/gms/internal/lh;)I

    move-result v0

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/le;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/lh$a;->a:Lcom/google/android/gms/internal/lh$a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/le;->a(Lcom/google/android/gms/internal/lh$a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/mk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/le;->a:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/le;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f()Lcom/google/android/gms/internal/lh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/le;->b:Lcom/google/android/gms/internal/lh;

    return-object v0
.end method

.method public i()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/android/gms/internal/lg;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/android/gms/internal/lg;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/16 v2, 0x64

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/le;->a(Z)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v1, v2, :cond_0

    :goto_0
    return-object v0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "..."

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method protected abstract u_()Lcom/google/android/gms/internal/le$a;
.end method
