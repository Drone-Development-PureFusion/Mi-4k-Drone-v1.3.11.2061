.class public Lcom/google/android/gms/internal/lp;
.super Lcom/google/android/gms/internal/lb;


# static fields
.field private static final a:Lcom/google/android/gms/internal/lp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/lp;

    invoke-direct {v0}, Lcom/google/android/gms/internal/lp;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/lp;->a:Lcom/google/android/gms/internal/lp;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/lb;-><init>()V

    return-void
.end method

.method public static d()Lcom/google/android/gms/internal/lp;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/lp;->a:Lcom/google/android/gms/internal/lp;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/lg;Lcom/google/android/gms/internal/lg;)I
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/lg;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/lg;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/lh;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kv;->a(Lcom/google/android/gms/internal/kv;)I

    move-result v0

    :cond_0
    return v0
.end method

.method public a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lg;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/lg;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/lg;-><init>(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/lh;)Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b()Lcom/google/android/gms/internal/lg;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/lg;

    invoke-static {}, Lcom/google/android/gms/internal/kv;->b()Lcom/google/android/gms/internal/kv;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/lh;->d:Lcom/google/android/gms/internal/kw;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/lg;-><init>(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    const-string v0, ".value"

    return-object v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/lg;

    check-cast p2, Lcom/google/android/gms/internal/lg;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/lp;->a(Lcom/google/android/gms/internal/lg;Lcom/google/android/gms/internal/lg;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/google/android/gms/internal/lp;

    return v0
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "ValueIndex"

    return-object v0
.end method
