.class public final Lcom/google/android/gms/internal/ph;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ok;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ph$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/os;

.field private final b:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/os;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ph;->a:Lcom/google/android/gms/internal/os;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ph;->b:Z

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/nr;Ljava/lang/reflect/Type;)Lcom/google/android/gms/internal/oj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/nr;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lcom/google/android/gms/internal/oj",
            "<*>;"
        }
    .end annotation

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq p2, v0, :cond_0

    const-class v0, Ljava/lang/Boolean;

    if-ne p2, v0, :cond_1

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/pn;->f:Lcom/google/android/gms/internal/oj;

    :goto_0
    return-object v0

    :cond_1
    invoke-static {p2}, Lcom/google/android/gms/internal/po;->a(Ljava/lang/reflect/Type;)Lcom/google/android/gms/internal/po;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/nr;->a(Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ph;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ph;->b:Z

    return v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/nr;",
            "Lcom/google/android/gms/internal/po",
            "<TT;>;)",
            "Lcom/google/android/gms/internal/oj",
            "<TT;>;"
        }
    .end annotation

    const/4 v5, 0x1

    const/4 v3, 0x0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/po;->b()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/po;->a()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/util/Map;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/or;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/or;->b(Ljava/lang/reflect/Type;Ljava/lang/Class;)[Ljava/lang/reflect/Type;

    move-result-object v1

    aget-object v0, v1, v3

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ph;->a(Lcom/google/android/gms/internal/nr;Ljava/lang/reflect/Type;)Lcom/google/android/gms/internal/oj;

    move-result-object v4

    aget-object v0, v1, v5

    invoke-static {v0}, Lcom/google/android/gms/internal/po;->a(Ljava/lang/reflect/Type;)Lcom/google/android/gms/internal/po;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/nr;->a(Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;

    move-result-object v6

    iget-object v0, p0, Lcom/google/android/gms/internal/ph;->a:Lcom/google/android/gms/internal/os;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/os;->a(Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/ox;

    move-result-object v7

    new-instance v0, Lcom/google/android/gms/internal/ph$a;

    aget-object v3, v1, v3

    aget-object v5, v1, v5

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ph$a;-><init>(Lcom/google/android/gms/internal/ph;Lcom/google/android/gms/internal/nr;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/oj;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/oj;Lcom/google/android/gms/internal/ox;)V

    goto :goto_0
.end method
