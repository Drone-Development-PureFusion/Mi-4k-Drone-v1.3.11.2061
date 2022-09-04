.class public abstract Lcom/google/android/gms/common/internal/w;
.super Lcom/google/android/gms/common/internal/p;

# interfaces
.implements Lcom/google/android/gms/common/api/a$f;
.implements Lcom/google/android/gms/common/internal/x$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroid/os/IInterface;",
        ">",
        "Lcom/google/android/gms/common/internal/p",
        "<TT;>;",
        "Lcom/google/android/gms/common/api/a$f;",
        "Lcom/google/android/gms/common/internal/x$a;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/internal/s;

.field private final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Landroid/accounts/Account;


# direct methods
.method protected constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V
    .locals 9

    invoke-static {p1}, Lcom/google/android/gms/common/internal/y;->a(Landroid/content/Context;)Lcom/google/android/gms/common/internal/y;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/common/b;->a()Lcom/google/android/gms/common/b;

    move-result-object v4

    invoke-static {p5}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/common/api/g$b;

    invoke-static {p6}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/common/api/g$c;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/common/internal/w;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/y;Lcom/google/android/gms/common/b;ILcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/y;Lcom/google/android/gms/common/b;ILcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V
    .locals 9

    invoke-static/range {p7 .. p7}, Lcom/google/android/gms/common/internal/w;->a(Lcom/google/android/gms/common/api/g$b;)Lcom/google/android/gms/common/internal/p$b;

    move-result-object v6

    invoke-static/range {p8 .. p8}, Lcom/google/android/gms/common/internal/w;->a(Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/common/internal/p$c;

    move-result-object v7

    invoke-virtual {p6}, Lcom/google/android/gms/common/internal/s;->i()Ljava/lang/String;

    move-result-object v8

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/common/internal/p;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/y;Lcom/google/android/gms/common/j;ILcom/google/android/gms/common/internal/p$b;Lcom/google/android/gms/common/internal/p$c;Ljava/lang/String;)V

    iput-object p6, p0, Lcom/google/android/gms/common/internal/w;->a:Lcom/google/android/gms/common/internal/s;

    invoke-virtual {p6}, Lcom/google/android/gms/common/internal/s;->b()Landroid/accounts/Account;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/common/internal/w;->f:Landroid/accounts/Account;

    invoke-virtual {p6}, Lcom/google/android/gms/common/internal/s;->f()Ljava/util/Set;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/common/internal/w;->b(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/common/internal/w;->e:Ljava/util/Set;

    return-void
.end method

.method private static a(Lcom/google/android/gms/common/api/g$b;)Lcom/google/android/gms/common/internal/p$b;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/internal/w$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/common/internal/w$1;-><init>(Lcom/google/android/gms/common/api/g$b;)V

    goto :goto_0
.end method

.method private static a(Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/common/internal/p$c;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/internal/w$2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/common/internal/w$2;-><init>(Lcom/google/android/gms/common/api/g$c;)V

    goto :goto_0
.end method

.method private b(Ljava/util/Set;)Ljava/util/Set;
    .locals 3
    .param p1    # Ljava/util/Set;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;)",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/internal/w;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/Scope;

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expanding scopes is not permitted, use implied scopes instead"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-object v1
.end method


# virtual methods
.method public final D()Landroid/accounts/Account;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/w;->f:Landroid/accounts/Account;

    return-object v0
.end method

.method protected final I()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/internal/w;->e:Ljava/util/Set;

    return-object v0
.end method

.method protected final J()Lcom/google/android/gms/common/internal/s;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/w;->a:Lcom/google/android/gms/common/internal/s;

    return-object v0
.end method

.method protected a(Ljava/util/Set;)Ljava/util/Set;
    .locals 0
    .param p1    # Ljava/util/Set;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;)",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation

    return-object p1
.end method
