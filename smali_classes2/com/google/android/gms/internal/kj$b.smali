.class Lcom/google/android/gms/internal/kj$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ko$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/kj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/jc;

.field private final b:Lcom/google/android/gms/internal/ki;

.field private final c:Lcom/google/android/gms/internal/lh;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/jc;Lcom/google/android/gms/internal/ki;Lcom/google/android/gms/internal/lh;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/kj$b;->a:Lcom/google/android/gms/internal/jc;

    iput-object p2, p0, Lcom/google/android/gms/internal/kj$b;->b:Lcom/google/android/gms/internal/ki;

    iput-object p3, p0, Lcom/google/android/gms/internal/kj$b;->c:Lcom/google/android/gms/internal/lh;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/lb;Lcom/google/android/gms/internal/lg;Z)Lcom/google/android/gms/internal/lg;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/kj$b;->c:Lcom/google/android/gms/internal/lh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/kj$b;->c:Lcom/google/android/gms/internal/lh;

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/kj$b;->a:Lcom/google/android/gms/internal/jc;

    invoke-virtual {v1, v0, p2, p3, p1}, Lcom/google/android/gms/internal/jc;->a(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lg;ZLcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/lg;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/kj$b;->b:Lcom/google/android/gms/internal/ki;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ki;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/lh;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/kj$b;->b:Lcom/google/android/gms/internal/ki;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ki;->a()Lcom/google/android/gms/internal/jy;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jy;->a(Lcom/google/android/gms/internal/kv;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jy;->c()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/lh;->c(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/kj$b;->c:Lcom/google/android/gms/internal/lh;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/jy;

    iget-object v1, p0, Lcom/google/android/gms/internal/kj$b;->c:Lcom/google/android/gms/internal/lh;

    invoke-static {}, Lcom/google/android/gms/internal/ld;->d()Lcom/google/android/gms/internal/ld;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/lc;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/jy;-><init>(Lcom/google/android/gms/internal/lc;ZZ)V

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/kj$b;->a:Lcom/google/android/gms/internal/jc;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/jc;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/jy;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/kj$b;->b:Lcom/google/android/gms/internal/ki;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ki;->c()Lcom/google/android/gms/internal/jy;

    move-result-object v0

    goto :goto_1
.end method
