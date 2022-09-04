.class public Lcom/google/android/gms/internal/cg;
.super Lcom/google/android/gms/internal/aqg;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/app$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/app$c;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/aqg;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/cg;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/cg;->b:Lcom/google/android/gms/internal/app$c;

    return-void
.end method


# virtual methods
.method protected varargs a(Lcom/google/android/gms/internal/apr;[Lcom/google/android/gms/internal/ea;)Lcom/google/android/gms/internal/ea;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/apr;",
            "[",
            "Lcom/google/android/gms/internal/ea",
            "<*>;)",
            "Lcom/google/android/gms/internal/ea",
            "<*>;"
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_1

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    array-length v0, p2

    if-lt v0, v1, :cond_2

    move v0, v1

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    aget-object v0, p2, v2

    invoke-static {v0}, Lcom/google/android/gms/internal/aqf;->d(Lcom/google/android/gms/internal/ea;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/cg;->b:Lcom/google/android/gms/internal/app$c;

    invoke-interface {v2}, Lcom/google/android/gms/internal/app$c;->a()Lcom/google/android/gms/internal/aow;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/aow;->g()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    array-length v2, p2

    if-le v2, v1, :cond_0

    aget-object v0, p2, v1

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ea;

    move-result-object v0

    return-object v0

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_1
.end method
