.class public Lcom/google/android/gms/internal/mu;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/google/android/gms/internal/mv;

.field public final c:Lcom/google/android/gms/internal/mv;

.field public final d:Lcom/google/android/gms/internal/mv;

.field public final e:Lcom/google/android/gms/internal/my;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/mv;Lcom/google/android/gms/internal/mv;Lcom/google/android/gms/internal/mv;Lcom/google/android/gms/internal/my;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mu;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/mu;->b:Lcom/google/android/gms/internal/mv;

    iput-object p3, p0, Lcom/google/android/gms/internal/mu;->c:Lcom/google/android/gms/internal/mv;

    iput-object p4, p0, Lcom/google/android/gms/internal/mu;->d:Lcom/google/android/gms/internal/mv;

    iput-object p5, p0, Lcom/google/android/gms/internal/mu;->e:Lcom/google/android/gms/internal/my;

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/mv;)Lcom/google/android/gms/internal/mz$a;
    .locals 10

    new-instance v3, Lcom/google/android/gms/internal/mz$a;

    invoke-direct {v3}, Lcom/google/android/gms/internal/mz$a;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mv;->a()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mv;->a()Ljava/util/Map;

    move-result-object v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-instance v9, Lcom/google/android/gms/internal/mz$b;

    invoke-direct {v9}, Lcom/google/android/gms/internal/mz$b;-><init>()V

    iput-object v2, v9, Lcom/google/android/gms/internal/mz$b;->a:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    iput-object v2, v9, Lcom/google/android/gms/internal/mz$b;->b:[B

    invoke-interface {v7, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/mz$d;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mz$d;-><init>()V

    iput-object v0, v1, Lcom/google/android/gms/internal/mz$d;->a:Ljava/lang/String;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/google/android/gms/internal/mz$b;

    invoke-interface {v7, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/mz$b;

    iput-object v0, v1, Lcom/google/android/gms/internal/mz$d;->b:[Lcom/google/android/gms/internal/mz$b;

    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/google/android/gms/internal/mz$d;

    invoke-interface {v5, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/mz$d;

    iput-object v0, v3, Lcom/google/android/gms/internal/mz$a;->a:[Lcom/google/android/gms/internal/mz$d;

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/mv;->c()J

    move-result-wide v0

    iput-wide v0, v3, Lcom/google/android/gms/internal/mz$a;->b:J

    return-object v3
.end method


# virtual methods
.method public run()V
    .locals 10

    new-instance v2, Lcom/google/android/gms/internal/mz$e;

    invoke-direct {v2}, Lcom/google/android/gms/internal/mz$e;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mu;->b:Lcom/google/android/gms/internal/mv;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/mu;->b:Lcom/google/android/gms/internal/mv;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/mu;->a(Lcom/google/android/gms/internal/mv;)Lcom/google/android/gms/internal/mz$a;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/internal/mz$e;->a:Lcom/google/android/gms/internal/mz$a;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mu;->c:Lcom/google/android/gms/internal/mv;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/mu;->c:Lcom/google/android/gms/internal/mv;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/mu;->a(Lcom/google/android/gms/internal/mv;)Lcom/google/android/gms/internal/mz$a;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/internal/mz$e;->b:Lcom/google/android/gms/internal/mz$a;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/mu;->d:Lcom/google/android/gms/internal/mv;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/mu;->d:Lcom/google/android/gms/internal/mv;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/mu;->a(Lcom/google/android/gms/internal/mv;)Lcom/google/android/gms/internal/mz$a;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/internal/mz$e;->c:Lcom/google/android/gms/internal/mz$a;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/mu;->e:Lcom/google/android/gms/internal/my;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/google/android/gms/internal/mz$c;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mz$c;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/mu;->e:Lcom/google/android/gms/internal/my;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/my;->a()I

    move-result v1

    iput v1, v0, Lcom/google/android/gms/internal/mz$c;->a:I

    iget-object v1, p0, Lcom/google/android/gms/internal/mu;->e:Lcom/google/android/gms/internal/my;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/my;->b()Z

    move-result v1

    iput-boolean v1, v0, Lcom/google/android/gms/internal/mz$c;->b:Z

    iput-object v0, v2, Lcom/google/android/gms/internal/mz$e;->d:Lcom/google/android/gms/internal/mz$c;

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/mu;->e:Lcom/google/android/gms/internal/my;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/mu;->e:Lcom/google/android/gms/internal/my;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/my;->c()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_6

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mu;->e:Lcom/google/android/gms/internal/my;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/my;->c()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_4
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v6, Lcom/google/android/gms/internal/mz$f;

    invoke-direct {v6}, Lcom/google/android/gms/internal/mz$f;-><init>()V

    iput-object v0, v6, Lcom/google/android/gms/internal/mz$f;->c:Ljava/lang/String;

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/mt;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mt;->b()J

    move-result-wide v8

    iput-wide v8, v6, Lcom/google/android/gms/internal/mz$f;->b:J

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/mt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mt;->a()I

    move-result v0

    iput v0, v6, Lcom/google/android/gms/internal/mz$f;->a:I

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/google/android/gms/internal/mz$f;

    invoke-interface {v3, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/mz$f;

    iput-object v0, v2, Lcom/google/android/gms/internal/mz$e;->e:[Lcom/google/android/gms/internal/mz$f;

    :cond_6
    invoke-static {v2}, Lcom/google/android/gms/internal/rd;->a(Lcom/google/android/gms/internal/rd;)[B

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/mu;->a:Landroid/content/Context;

    const-string v2, "persisted_config"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-void

    :catch_0
    move-exception v0

    const-string v1, "AsyncPersisterTask"

    const-string v2, "Could not persist config."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method
