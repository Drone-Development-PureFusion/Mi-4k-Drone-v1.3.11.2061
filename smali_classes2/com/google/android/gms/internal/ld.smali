.class public Lcom/google/android/gms/internal/ld;
.super Lcom/google/android/gms/internal/lb;


# static fields
.field static final synthetic a:Z

.field private static final b:Lcom/google/android/gms/internal/ld;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/ld;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/ld;->a:Z

    new-instance v0, Lcom/google/android/gms/internal/ld;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ld;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ld;->b:Lcom/google/android/gms/internal/ld;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/lb;-><init>()V

    return-void
.end method

.method public static d()Lcom/google/android/gms/internal/ld;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ld;->b:Lcom/google/android/gms/internal/ld;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/lg;Lcom/google/android/gms/internal/lg;)I
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kv;->a(Lcom/google/android/gms/internal/kv;)I

    move-result v0

    return v0
.end method

.method public a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lg;
    .locals 3

    sget-boolean v0, Lcom/google/android/gms/internal/ld;->a:Z

    if-nez v0, :cond_0

    instance-of v0, p2, Lcom/google/android/gms/internal/lo;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/lg;

    invoke-interface {p2}, Lcom/google/android/gms/internal/lh;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/kv;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/la;->j()Lcom/google/android/gms/internal/la;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/lg;-><init>(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V

    return-object v1
.end method

.method public a(Lcom/google/android/gms/internal/lh;)Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b()Lcom/google/android/gms/internal/lg;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/lg;->b()Lcom/google/android/gms/internal/lg;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    const-string v0, ".key"

    return-object v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/lg;

    check-cast p2, Lcom/google/android/gms/internal/lg;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ld;->a(Lcom/google/android/gms/internal/lg;Lcom/google/android/gms/internal/lg;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/google/android/gms/internal/ld;

    return v0
.end method

.method public hashCode()I
    .locals 1

    const/16 v0, 0x25

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "KeyIndex"

    return-object v0
.end method
