.class public Lcom/google/firebase/database/g;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/firebase/database/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/google/firebase/b;

.field private final c:Lcom/google/android/gms/internal/in;

.field private final d:Lcom/google/android/gms/internal/id;

.field private e:Lcom/google/android/gms/internal/im;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/google/firebase/database/g;->a:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Lcom/google/firebase/b;Lcom/google/android/gms/internal/in;Lcom/google/android/gms/internal/id;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/database/g;->b:Lcom/google/firebase/b;

    iput-object p2, p0, Lcom/google/firebase/database/g;->c:Lcom/google/android/gms/internal/in;

    iput-object p3, p0, Lcom/google/firebase/database/g;->d:Lcom/google/android/gms/internal/id;

    return-void
.end method

.method static synthetic a(Lcom/google/firebase/database/g;)Lcom/google/android/gms/internal/im;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/g;->e:Lcom/google/android/gms/internal/im;

    return-object v0
.end method

.method public static a()Lcom/google/firebase/database/g;
    .locals 1

    invoke-static {}, Lcom/google/firebase/b;->d()Lcom/google/firebase/b;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/database/g;->a(Lcom/google/firebase/b;)Lcom/google/firebase/database/g;

    move-result-object v0

    return-object v0
.end method

.method public static declared-synchronized a(Lcom/google/firebase/b;)Lcom/google/firebase/database/g;
    .locals 7

    const-class v1, Lcom/google/firebase/database/g;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/firebase/database/g;->a:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/google/firebase/b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/google/firebase/b;->c()Lcom/google/firebase/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/e;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/firebase/database/d;

    const-string v2, "Failed to get FirebaseDatabase instance: FirebaseApp object has no DatabaseURL in its FirebaseOptions object."

    invoke-direct {v0, v2}, Lcom/google/firebase/database/d;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :cond_0
    :try_start_1
    invoke-static {v0}, Lcom/google/android/gms/internal/mk;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/mi;

    move-result-object v2

    iget-object v3, v2, Lcom/google/android/gms/internal/mi;->b:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v3

    if-nez v3, :cond_1

    new-instance v3, Lcom/google/firebase/database/d;

    iget-object v2, v2, Lcom/google/android/gms/internal/mi;->b:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ij;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x72

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Configured Database URL \'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "\' is invalid. It should point to the root of a Firebase Database but it includes a path: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/google/firebase/database/d;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/id;

    invoke-direct {v0}, Lcom/google/android/gms/internal/id;-><init>()V

    invoke-virtual {p0}, Lcom/google/firebase/b;->e()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {p0}, Lcom/google/firebase/b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/id;->c(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/id;->a(Lcom/google/firebase/b;)V

    sget-object v3, Lcom/google/firebase/database/g;->a:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/google/firebase/b;->b()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/google/firebase/database/g;

    iget-object v2, v2, Lcom/google/android/gms/internal/mi;->a:Lcom/google/android/gms/internal/in;

    invoke-direct {v5, p0, v2, v0}, Lcom/google/firebase/database/g;-><init>(Lcom/google/firebase/b;Lcom/google/android/gms/internal/in;Lcom/google/android/gms/internal/id;)V

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object v0, Lcom/google/firebase/database/g;->a:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/google/firebase/b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/database/g;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/database/g;->e:Lcom/google/android/gms/internal/im;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/firebase/database/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x4d

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Calls to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "() must be made before any other usage of FirebaseDatabase instance."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/firebase/database/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method public static g()Ljava/lang/String;
    .locals 1

    const-string v0, "3.0.0"

    return-object v0
.end method

.method private declared-synchronized h()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/database/g;->e:Lcom/google/android/gms/internal/im;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/database/g;->d:Lcom/google/android/gms/internal/id;

    iget-object v1, p0, Lcom/google/firebase/database/g;->c:Lcom/google/android/gms/internal/in;

    invoke-static {v0, v1, p0}, Lcom/google/android/gms/internal/io;->a(Lcom/google/android/gms/internal/ic;Lcom/google/android/gms/internal/in;Lcom/google/firebase/database/g;)Lcom/google/android/gms/internal/im;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/database/g;->e:Lcom/google/android/gms/internal/im;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/google/firebase/database/e;
    .locals 3

    invoke-direct {p0}, Lcom/google/firebase/database/g;->h()V

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Can\'t pass null for argument \'pathString\' in FirebaseDatabase.getReference()"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ml;->b(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ij;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ij;-><init>(Ljava/lang/String;)V

    new-instance v1, Lcom/google/firebase/database/e;

    iget-object v2, p0, Lcom/google/firebase/database/g;->e:Lcom/google/android/gms/internal/im;

    invoke-direct {v1, v2, v0}, Lcom/google/firebase/database/e;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)V

    return-object v1
.end method

.method public declared-synchronized a(Lcom/google/firebase/database/j$a;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "setLogLevel"

    invoke-direct {p0, v0}, Lcom/google/firebase/database/g;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/firebase/database/g;->d:Lcom/google/android/gms/internal/id;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/id;->a(Lcom/google/firebase/database/j$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "setPersistenceEnabled"

    invoke-direct {p0, v0}, Lcom/google/firebase/database/g;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/firebase/database/g;->d:Lcom/google/android/gms/internal/id;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/id;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public b()Lcom/google/firebase/b;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/g;->b:Lcom/google/firebase/b;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/google/firebase/database/e;
    .locals 5

    invoke-direct {p0}, Lcom/google/firebase/database/g;->h()V

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Can\'t pass null for argument \'url\' in FirebaseDatabase.getReferenceFromUrl()"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/mk;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/mi;

    move-result-object v0

    iget-object v1, v0, Lcom/google/android/gms/internal/mi;->a:Lcom/google/android/gms/internal/in;

    iget-object v1, v1, Lcom/google/android/gms/internal/in;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/database/g;->e:Lcom/google/android/gms/internal/im;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/im;->d()Lcom/google/android/gms/internal/in;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/internal/in;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v0, Lcom/google/firebase/database/d;

    invoke-virtual {p0}, Lcom/google/firebase/database/g;->c()Lcom/google/firebase/database/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/database/e;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x5d

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Invalid URL ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ") passed to getReference().  URL was expected to match configured Database URL: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/firebase/database/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v1, Lcom/google/firebase/database/e;

    iget-object v2, p0, Lcom/google/firebase/database/g;->e:Lcom/google/android/gms/internal/im;

    iget-object v0, v0, Lcom/google/android/gms/internal/mi;->b:Lcom/google/android/gms/internal/ij;

    invoke-direct {v1, v2, v0}, Lcom/google/firebase/database/e;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)V

    return-object v1
.end method

.method public c()Lcom/google/firebase/database/e;
    .locals 3

    invoke-direct {p0}, Lcom/google/firebase/database/g;->h()V

    new-instance v0, Lcom/google/firebase/database/e;

    iget-object v1, p0, Lcom/google/firebase/database/g;->e:Lcom/google/android/gms/internal/im;

    invoke-static {}, Lcom/google/android/gms/internal/ij;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/firebase/database/e;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)V

    return-object v0
.end method

.method public d()V
    .locals 2

    invoke-direct {p0}, Lcom/google/firebase/database/g;->h()V

    iget-object v0, p0, Lcom/google/firebase/database/g;->e:Lcom/google/android/gms/internal/im;

    new-instance v1, Lcom/google/firebase/database/g$1;

    invoke-direct {v1, p0}, Lcom/google/firebase/database/g$1;-><init>(Lcom/google/firebase/database/g;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/im;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public e()V
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/database/g;->h()V

    iget-object v0, p0, Lcom/google/firebase/database/g;->e:Lcom/google/android/gms/internal/im;

    invoke-static {v0}, Lcom/google/android/gms/internal/io;->b(Lcom/google/android/gms/internal/im;)V

    return-void
.end method

.method public f()V
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/database/g;->h()V

    iget-object v0, p0, Lcom/google/firebase/database/g;->e:Lcom/google/android/gms/internal/im;

    invoke-static {v0}, Lcom/google/android/gms/internal/io;->a(Lcom/google/android/gms/internal/im;)V

    return-void
.end method
