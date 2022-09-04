.class Lcom/google/android/gms/internal/iu$11;
.super Lcom/google/android/gms/internal/he$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/jh;Lcom/google/android/gms/internal/ju;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/jc;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/he$b",
        "<",
        "Lcom/google/android/gms/internal/kv;",
        "Lcom/google/android/gms/internal/ju",
        "<",
        "Lcom/google/android/gms/internal/it;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/lh;

.field final synthetic b:Lcom/google/android/gms/internal/jc;

.field final synthetic c:Lcom/google/android/gms/internal/jh;

.field final synthetic d:Ljava/util/List;

.field final synthetic e:Lcom/google/android/gms/internal/iu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/jc;Lcom/google/android/gms/internal/jh;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/iu$11;->e:Lcom/google/android/gms/internal/iu;

    iput-object p2, p0, Lcom/google/android/gms/internal/iu$11;->a:Lcom/google/android/gms/internal/lh;

    iput-object p3, p0, Lcom/google/android/gms/internal/iu$11;->b:Lcom/google/android/gms/internal/jc;

    iput-object p4, p0, Lcom/google/android/gms/internal/iu$11;->c:Lcom/google/android/gms/internal/jh;

    iput-object p5, p0, Lcom/google/android/gms/internal/iu$11;->d:Ljava/util/List;

    invoke-direct {p0}, Lcom/google/android/gms/internal/he$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/ju;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/kv;",
            "Lcom/google/android/gms/internal/ju",
            "<",
            "Lcom/google/android/gms/internal/it;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/iu$11;->a:Lcom/google/android/gms/internal/lh;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/iu$11;->a:Lcom/google/android/gms/internal/lh;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/lh;->c(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/iu$11;->b:Lcom/google/android/gms/internal/jc;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/jc;->a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/jc;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/iu$11;->c:Lcom/google/android/gms/internal/jh;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/jh;->a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/jh;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/iu$11;->d:Ljava/util/List;

    iget-object v4, p0, Lcom/google/android/gms/internal/iu$11;->e:Lcom/google/android/gms/internal/iu;

    invoke-static {v4, v2, p2, v0, v1}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/jh;Lcom/google/android/gms/internal/ju;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/jc;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    return-void
.end method

.method public synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/kv;

    check-cast p2, Lcom/google/android/gms/internal/ju;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/iu$11;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/ju;)V

    return-void
.end method
