.class public Lcom/google/android/gms/internal/lk;
.super Lcom/google/android/gms/internal/lb;


# static fields
.field private static final a:Lcom/google/android/gms/internal/lk;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/lk;

    invoke-direct {v0}, Lcom/google/android/gms/internal/lk;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/lk;->a:Lcom/google/android/gms/internal/lk;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/lb;-><init>()V

    return-void
.end method

.method public static d()Lcom/google/android/gms/internal/lk;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/lk;->a:Lcom/google/android/gms/internal/lk;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/lg;Lcom/google/android/gms/internal/lg;)I
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/lg;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->f()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/lg;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/lh;->f()Lcom/google/android/gms/internal/lh;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v3

    invoke-static {v2, v0, v3, v1}, Lcom/google/android/gms/internal/li;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)I

    move-result v0

    return v0
.end method

.method public a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lg;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/lg;

    new-instance v1, Lcom/google/android/gms/internal/lo;

    const-string v2, "[PRIORITY-POST]"

    invoke-direct {v1, v2, p2}, Lcom/google/android/gms/internal/lo;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/lh;)V

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/lg;-><init>(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/lh;)Z
    .locals 1

    invoke-interface {p1}, Lcom/google/android/gms/internal/lh;->f()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Lcom/google/android/gms/internal/lg;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/kv;->b()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/lh;->d:Lcom/google/android/gms/internal/kw;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/lk;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lg;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get query definition on priority index!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/lg;

    check-cast p2, Lcom/google/android/gms/internal/lg;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/lk;->a(Lcom/google/android/gms/internal/lg;Lcom/google/android/gms/internal/lg;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/google/android/gms/internal/lk;

    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x302679

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "PriorityIndex"

    return-object v0
.end method
