.class public Lcom/google/android/gms/internal/kk;
.super Ljava/lang/Object;


# static fields
.field static final synthetic a:Z


# instance fields
.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/kv;",
            "Lcom/google/android/gms/internal/ka;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/kk;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/kk;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/kk;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ka;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/android/gms/internal/kk;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ka;)V
    .locals 6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->b()Lcom/google/android/gms/internal/kc$a;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->a()Lcom/google/android/gms/internal/kv;

    move-result-object v2

    sget-boolean v0, Lcom/google/android/gms/internal/kk;->a:Z

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/kc$a;->b:Lcom/google/android/gms/internal/kc$a;

    if-eq v1, v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/kc$a;->d:Lcom/google/android/gms/internal/kc$a;

    if-eq v1, v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/kc$a;->a:Lcom/google/android/gms/internal/kc$a;

    if-eq v1, v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Only child changes supported for tracking"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    sget-boolean v0, Lcom/google/android/gms/internal/kk;->a:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->a()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kv;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/kk;->b:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/kk;->b:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ka;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ka;->b()Lcom/google/android/gms/internal/kc$a;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/kc$a;->b:Lcom/google/android/gms/internal/kc$a;

    if-ne v1, v4, :cond_2

    sget-object v4, Lcom/google/android/gms/internal/kc$a;->a:Lcom/google/android/gms/internal/kc$a;

    if-ne v3, v4, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/kk;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->a()Lcom/google/android/gms/internal/kv;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->c()Lcom/google/android/gms/internal/lc;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ka;->c()Lcom/google/android/gms/internal/lc;

    move-result-object v0

    invoke-static {v2, v4, v0}, Lcom/google/android/gms/internal/ka;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/lc;)Lcom/google/android/gms/internal/ka;

    move-result-object v0

    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void

    :cond_2
    sget-object v4, Lcom/google/android/gms/internal/kc$a;->a:Lcom/google/android/gms/internal/kc$a;

    if-ne v1, v4, :cond_3

    sget-object v4, Lcom/google/android/gms/internal/kc$a;->b:Lcom/google/android/gms/internal/kc$a;

    if-ne v3, v4, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/kk;->b:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    sget-object v4, Lcom/google/android/gms/internal/kc$a;->a:Lcom/google/android/gms/internal/kc$a;

    if-ne v1, v4, :cond_4

    sget-object v4, Lcom/google/android/gms/internal/kc$a;->d:Lcom/google/android/gms/internal/kc$a;

    if-ne v3, v4, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/internal/kk;->b:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ka;->e()Lcom/google/android/gms/internal/lc;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ka;->b(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lc;)Lcom/google/android/gms/internal/ka;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    sget-object v4, Lcom/google/android/gms/internal/kc$a;->d:Lcom/google/android/gms/internal/kc$a;

    if-ne v1, v4, :cond_5

    sget-object v4, Lcom/google/android/gms/internal/kc$a;->b:Lcom/google/android/gms/internal/kc$a;

    if-ne v3, v4, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/kk;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->c()Lcom/google/android/gms/internal/lc;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ka;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lc;)Lcom/google/android/gms/internal/ka;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_5
    sget-object v4, Lcom/google/android/gms/internal/kc$a;->d:Lcom/google/android/gms/internal/kc$a;

    if-ne v1, v4, :cond_6

    sget-object v1, Lcom/google/android/gms/internal/kc$a;->d:Lcom/google/android/gms/internal/kc$a;

    if-ne v3, v1, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/internal/kk;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->c()Lcom/google/android/gms/internal/lc;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ka;->e()Lcom/google/android/gms/internal/lc;

    move-result-object v0

    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/ka;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/lc;)Lcom/google/android/gms/internal/ka;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x30

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Illegal combination of changes: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " occurred after "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/kk;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->a()Lcom/google/android/gms/internal/kv;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0
.end method
