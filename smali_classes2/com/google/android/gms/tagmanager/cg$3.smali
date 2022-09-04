.class Lcom/google/android/gms/tagmanager/cg$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/cg$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/cg;->a(Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Lcom/google/android/gms/tagmanager/cf;)Lcom/google/android/gms/tagmanager/bn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Ljava/util/Map;

.field final synthetic c:Ljava/util/Map;

.field final synthetic d:Ljava/util/Map;

.field final synthetic e:Lcom/google/android/gms/tagmanager/cg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/cg;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/cg$3;->e:Lcom/google/android/gms/tagmanager/cg;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/cg$3;->a:Ljava/util/Map;

    iput-object p3, p0, Lcom/google/android/gms/tagmanager/cg$3;->b:Ljava/util/Map;

    iput-object p4, p0, Lcom/google/android/gms/tagmanager/cg$3;->c:Ljava/util/Map;

    iput-object p5, p0, Lcom/google/android/gms/tagmanager/cg$3;->d:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg$3;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/cg$3;->b:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {p2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/cb;->c()Lcom/google/android/gms/tagmanager/bz;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Lcom/google/android/gms/tagmanager/bz;->a(Ljava/util/List;Ljava/util/List;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg$3;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/cg$3;->d:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {p3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/cb;->d()Lcom/google/android/gms/tagmanager/bz;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Lcom/google/android/gms/tagmanager/bz;->a(Ljava/util/List;Ljava/util/List;)V

    :cond_1
    return-void
.end method
