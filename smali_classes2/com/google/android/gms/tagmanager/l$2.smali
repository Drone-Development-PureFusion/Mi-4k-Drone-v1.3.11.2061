.class final Lcom/google/android/gms/tagmanager/l$2;
.super Lcom/google/android/gms/tagmanager/af$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/l;->a()Lcom/google/android/gms/tagmanager/af;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/af$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/tagmanager/l;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Lcom/google/android/gms/tagmanager/c;

    invoke-static {p1, v0}, Lcom/google/android/gms/tagmanager/l;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/c;

    invoke-static {}, Lcom/google/android/gms/tagmanager/l;->b()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    if-eqz v0, :cond_0

    invoke-interface {v0, p2}, Lcom/google/android/gms/tagmanager/c;->a(Ljava/util/Map;)V

    :cond_0
    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/tagmanager/l;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/c;

    goto :goto_0
.end method

.method public b(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/tagmanager/l;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-class v0, Lcom/google/android/gms/tagmanager/d;

    invoke-static {p1, v0}, Lcom/google/android/gms/tagmanager/l;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/d;

    invoke-static {}, Lcom/google/android/gms/tagmanager/l;->c()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0, p2}, Lcom/google/android/gms/tagmanager/d;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/tagmanager/l;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/d;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method
