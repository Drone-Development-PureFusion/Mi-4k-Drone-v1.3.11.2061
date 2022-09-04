.class Lcom/google/android/gms/tagmanager/cg$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/cg$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/cg;->a(Ljava/util/Set;Lcom/google/android/gms/tagmanager/cf;)Lcom/google/android/gms/tagmanager/bn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/tagmanager/cg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/cg;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/cg$4;->a:Lcom/google/android/gms/tagmanager/cg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/en$e;Ljava/util/Set;Ljava/util/Set;Lcom/google/android/gms/tagmanager/cb;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/en$e;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/en$a;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/en$a;",
            ">;",
            "Lcom/google/android/gms/tagmanager/cb;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/en$e;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p1}, Lcom/google/android/gms/internal/en$e;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/cb;->e()Lcom/google/android/gms/tagmanager/bz;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/en$e;->d()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/en$e;->i()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/tagmanager/bz;->a(Ljava/util/List;Ljava/util/List;)V

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/cb;->f()Lcom/google/android/gms/tagmanager/bz;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/en$e;->e()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/en$e;->j()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/tagmanager/bz;->a(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method
