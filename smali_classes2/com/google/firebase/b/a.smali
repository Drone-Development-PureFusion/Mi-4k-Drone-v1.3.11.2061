.class public Lcom/google/firebase/b/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/b/a$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = ""

.field public static final b:J = 0x0L

.field public static final c:D = 0.0

.field public static final d:Z = false

.field public static final e:[B

.field public static final f:I = 0x0

.field public static final g:I = 0x1

.field public static final h:I = 0x2

.field public static final i:I = -0x1

.field public static final j:I = 0x0

.field public static final k:I = 0x1

.field public static final l:I = 0x2

.field private static m:Lcom/google/firebase/b/a;


# instance fields
.field private n:Lcom/google/android/gms/internal/mv;

.field private o:Lcom/google/android/gms/internal/mv;

.field private p:Lcom/google/android/gms/internal/mv;

.field private q:Lcom/google/android/gms/internal/my;

.field private final r:Landroid/content/Context;

.field private final s:Ljava/util/concurrent/locks/ReadWriteLock;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/google/firebase/b/a;->e:[B

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 6

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/b/a;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/mv;Lcom/google/android/gms/internal/mv;Lcom/google/android/gms/internal/mv;Lcom/google/android/gms/internal/my;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/mv;Lcom/google/android/gms/internal/mv;Lcom/google/android/gms/internal/mv;Lcom/google/android/gms/internal/my;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>(Z)V

    iput-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    iput-object p1, p0, Lcom/google/firebase/b/a;->r:Landroid/content/Context;

    if-eqz p5, :cond_3

    iput-object p5, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    :goto_0
    iget-object v0, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    iget-object v1, p0, Lcom/google/firebase/b/a;->r:Landroid/content/Context;

    invoke-direct {p0, v1}, Lcom/google/firebase/b/a;->b(Landroid/content/Context;)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/my;->a(J)V

    if-eqz p2, :cond_0

    iput-object p2, p0, Lcom/google/firebase/b/a;->n:Lcom/google/android/gms/internal/mv;

    :cond_0
    if-eqz p3, :cond_1

    iput-object p3, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    :cond_1
    if-eqz p4, :cond_2

    iput-object p4, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    :cond_2
    return-void

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/my;

    invoke-direct {v0}, Lcom/google/android/gms/internal/my;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    goto :goto_0
.end method

.method private static a(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    .locals 6

    const/16 v0, 0x1000

    new-array v2, v0, [B

    const-wide/16 v0, 0x0

    :goto_0
    invoke-virtual {p0, v2}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    return-wide v0

    :cond_0
    const/4 v4, 0x0

    invoke-virtual {p1, v2, v4, v3}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v4, v3

    add-long/2addr v0, v4

    goto :goto_0
.end method

.method private static a(Lcom/google/android/gms/internal/mz$a;)Lcom/google/android/gms/internal/mv;
    .locals 12

    const/4 v1, 0x0

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    iget-object v4, p0, Lcom/google/android/gms/internal/mz$a;->a:[Lcom/google/android/gms/internal/mz$d;

    array-length v5, v4

    move v2, v1

    :goto_1
    if-ge v2, v5, :cond_2

    aget-object v0, v4, v2

    iget-object v6, v0, Lcom/google/android/gms/internal/mz$d;->a:Ljava/lang/String;

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    iget-object v8, v0, Lcom/google/android/gms/internal/mz$d;->b:[Lcom/google/android/gms/internal/mz$b;

    array-length v9, v8

    move v0, v1

    :goto_2
    if-ge v0, v9, :cond_1

    aget-object v10, v8, v0

    iget-object v11, v10, Lcom/google/android/gms/internal/mz$b;->a:Ljava/lang/String;

    iget-object v10, v10, Lcom/google/android/gms/internal/mz$b;->b:[B

    invoke-interface {v7, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_1
    invoke-interface {v3, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/mv;

    iget-wide v4, p0, Lcom/google/android/gms/internal/mz$a;->b:J

    invoke-direct {v0, v3, v4, v5}, Lcom/google/android/gms/internal/mv;-><init>(Ljava/util/Map;J)V

    goto :goto_0
.end method

.method private static a(Lcom/google/android/gms/internal/mz$c;)Lcom/google/android/gms/internal/my;
    .locals 2

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/my;

    invoke-direct {v0}, Lcom/google/android/gms/internal/my;-><init>()V

    iget v1, p0, Lcom/google/android/gms/internal/mz$c;->a:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/my;->a(I)V

    iget-boolean v1, p0, Lcom/google/android/gms/internal/mz$c;->b:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/my;->a(Z)V

    goto :goto_0
.end method

.method public static a()Lcom/google/firebase/b/a;
    .locals 2

    sget-object v0, Lcom/google/firebase/b/a;->m:Lcom/google/firebase/b/a;

    if-nez v0, :cond_1

    invoke-static {}, Lcom/google/firebase/b;->d()Lcom/google/firebase/b;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "FirebaseApp has not been initialized."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/firebase/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/b/a;->a(Landroid/content/Context;)Lcom/google/firebase/b/a;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    sget-object v0, Lcom/google/firebase/b/a;->m:Lcom/google/firebase/b/a;

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)Lcom/google/firebase/b/a;
    .locals 6

    const/4 v2, 0x3

    sget-object v0, Lcom/google/firebase/b/a;->m:Lcom/google/firebase/b/a;

    if-nez v0, :cond_1

    invoke-static {p0}, Lcom/google/firebase/b/a;->c(Landroid/content/Context;)Lcom/google/android/gms/internal/mz$e;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "FirebaseRemoteConfig"

    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "FirebaseRemoteConfig"

    const-string v1, "No persisted config was found. Initializing from scratch."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance v0, Lcom/google/firebase/b/a;

    invoke-direct {v0, p0}, Lcom/google/firebase/b/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/google/firebase/b/a;->m:Lcom/google/firebase/b/a;

    :cond_1
    :goto_0
    sget-object v0, Lcom/google/firebase/b/a;->m:Lcom/google/firebase/b/a;

    return-object v0

    :cond_2
    const-string v1, "FirebaseRemoteConfig"

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "FirebaseRemoteConfig"

    const-string v2, "Initializing from persisted config."

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    iget-object v1, v0, Lcom/google/android/gms/internal/mz$e;->a:Lcom/google/android/gms/internal/mz$a;

    invoke-static {v1}, Lcom/google/firebase/b/a;->a(Lcom/google/android/gms/internal/mz$a;)Lcom/google/android/gms/internal/mv;

    move-result-object v2

    iget-object v1, v0, Lcom/google/android/gms/internal/mz$e;->b:Lcom/google/android/gms/internal/mz$a;

    invoke-static {v1}, Lcom/google/firebase/b/a;->a(Lcom/google/android/gms/internal/mz$a;)Lcom/google/android/gms/internal/mv;

    move-result-object v3

    iget-object v1, v0, Lcom/google/android/gms/internal/mz$e;->c:Lcom/google/android/gms/internal/mz$a;

    invoke-static {v1}, Lcom/google/firebase/b/a;->a(Lcom/google/android/gms/internal/mz$a;)Lcom/google/android/gms/internal/mv;

    move-result-object v4

    iget-object v1, v0, Lcom/google/android/gms/internal/mz$e;->d:Lcom/google/android/gms/internal/mz$c;

    invoke-static {v1}, Lcom/google/firebase/b/a;->a(Lcom/google/android/gms/internal/mz$c;)Lcom/google/android/gms/internal/my;

    move-result-object v5

    if-eqz v5, :cond_4

    iget-object v0, v0, Lcom/google/android/gms/internal/mz$e;->e:[Lcom/google/android/gms/internal/mz$f;

    invoke-static {v0}, Lcom/google/firebase/b/a;->a([Lcom/google/android/gms/internal/mz$f;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/my;->a(Ljava/util/Map;)V

    :cond_4
    new-instance v0, Lcom/google/firebase/b/a;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/b/a;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/mv;Lcom/google/android/gms/internal/mv;Lcom/google/android/gms/internal/mv;Lcom/google/android/gms/internal/my;)V

    sput-object v0, Lcom/google/firebase/b/a;->m:Lcom/google/firebase/b/a;

    goto :goto_0
.end method

.method private static a([Lcom/google/android/gms/internal/mz$f;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/google/android/gms/internal/mz$f;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/mt;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-nez p0, :cond_1

    :cond_0
    return-object v0

    :cond_1
    array-length v2, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, p0, v1

    iget-object v4, v3, Lcom/google/android/gms/internal/mz$f;->c:Ljava/lang/String;

    iget v5, v3, Lcom/google/android/gms/internal/mz$f;->a:I

    iget-wide v6, v3, Lcom/google/android/gms/internal/mz$f;->b:J

    new-instance v3, Lcom/google/android/gms/internal/mt;

    invoke-direct {v3, v5, v6, v7}, Lcom/google/android/gms/internal/mt;-><init>(IJ)V

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method private a(Ljava/util/Map;Ljava/lang/String;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    if-nez p2, :cond_0

    :goto_0
    return-void

    :cond_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    move v2, v0

    :goto_1
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    if-nez v2, :cond_a

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v5, v1, Ljava/lang/String;

    if-eqz v5, :cond_3

    check-cast v1, Ljava/lang/String;

    sget-object v5, Lcom/google/android/gms/internal/mx;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    move v2, v0

    goto :goto_1

    :cond_3
    instance-of v5, v1, Ljava/lang/Long;

    if-eqz v5, :cond_4

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v5, Lcom/google/android/gms/internal/mx;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    instance-of v5, v1, Ljava/lang/Integer;

    if-eqz v5, :cond_5

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v5, Lcom/google/android/gms/internal/mx;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    instance-of v5, v1, Ljava/lang/Double;

    if-eqz v5, :cond_6

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v5, Lcom/google/android/gms/internal/mx;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_6
    instance-of v5, v1, Ljava/lang/Float;

    if-eqz v5, :cond_7

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v5, Lcom/google/android/gms/internal/mx;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_7
    instance-of v5, v1, [B

    if-eqz v5, :cond_8

    check-cast v1, [B

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_8
    instance-of v5, v1, Ljava/lang/Boolean;

    if-eqz v5, :cond_9

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v5, Lcom/google/android/gms/internal/mx;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The type of a default value needs to beone of String, Long, Double, Boolean, or byte[]."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    if-eqz v2, :cond_e

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mv;->a(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_c

    :cond_b
    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto/16 :goto_0

    :cond_c
    :try_start_1
    iget-object v0, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/internal/mv;->a(Ljava/util/Map;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/mv;->a(J)V

    :goto_3
    if-eqz p3, :cond_d

    iget-object v0, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/my;->a(Ljava/lang/String;)V

    :cond_d
    invoke-direct {p0}, Lcom/google/firebase/b/a;->f()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto/16 :goto_0

    :cond_e
    :try_start_2
    iget-object v0, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    if-nez v0, :cond_f

    new-instance v0, Lcom/google/android/gms/internal/mv;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-direct {v0, v1, v4, v5}, Lcom/google/android/gms/internal/mv;-><init>(Ljava/util/Map;J)V

    iput-object v0, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    :cond_f
    iget-object v0, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v0, v3, p2}, Lcom/google/android/gms/internal/mv;->a(Ljava/util/Map;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/mv;->a(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method private static a(Ljava/io/InputStream;)[B
    .locals 1

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-static {p0, v0}, Lcom/google/firebase/b/a;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method private b(Landroid/content/Context;)J
    .locals 6

    const-wide/16 v0, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/google/firebase/b/a;->r:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    iget-wide v0, v2, Landroid/content/pm/PackageInfo;->lastUpdateTime:J
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-wide v0

    :catch_0
    move-exception v2

    const-string v2, "FirebaseRemoteConfig"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x19

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Package ["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "] was not found!"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private static c(Landroid/content/Context;)Lcom/google/android/gms/internal/mz$e;
    .locals 5

    const/4 v1, 0x0

    if-nez p0, :cond_0

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    const-string v0, "persisted_config"

    invoke-virtual {p0, v0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    :try_start_1
    invoke-static {v3}, Lcom/google/firebase/b/a;->a(Ljava/io/InputStream;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/qv;->a([B)Lcom/google/android/gms/internal/qv;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/mz$e;

    invoke-direct {v2}, Lcom/google/android/gms/internal/mz$e;-><init>()V

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/mz$e;->b(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/rd;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/mz$e;
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v3, :cond_1

    :try_start_2
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_1
    :goto_1
    move-object v0, v2

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "FirebaseRemoteConfig"

    const-string v3, "Failed to close persisted config file."

    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v2, v1

    :goto_2
    :try_start_3
    const-string v3, "FirebaseRemoteConfig"

    const/4 v4, 0x3

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "FirebaseRemoteConfig"

    const-string v4, "Persisted config file was not found."

    invoke-static {v3, v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :cond_2
    if-eqz v2, :cond_3

    :try_start_4
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    :cond_3
    :goto_3
    move-object v0, v1

    goto :goto_0

    :catch_2
    move-exception v0

    const-string v2, "FirebaseRemoteConfig"

    const-string v3, "Failed to close persisted config file."

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_3

    :catch_3
    move-exception v0

    move-object v3, v1

    :goto_4
    :try_start_5
    const-string v2, "FirebaseRemoteConfig"

    const-string v4, "Cannot initialize from persisted config."

    invoke-static {v2, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-eqz v3, :cond_4

    :try_start_6
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    :cond_4
    :goto_5
    move-object v0, v1

    goto :goto_0

    :catch_4
    move-exception v0

    const-string v2, "FirebaseRemoteConfig"

    const-string v3, "Failed to close persisted config file."

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_5

    :catchall_0
    move-exception v0

    move-object v3, v1

    :goto_6
    if-eqz v3, :cond_5

    :try_start_7
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    :cond_5
    :goto_7
    throw v0

    :catch_5
    move-exception v1

    const-string v2, "FirebaseRemoteConfig"

    const-string v3, "Failed to close persisted config file."

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_7

    :catchall_1
    move-exception v0

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object v3, v2

    goto :goto_6

    :catch_6
    move-exception v0

    goto :goto_4

    :catch_7
    move-exception v0

    move-object v2, v3

    goto :goto_2
.end method

.method private f()V
    .locals 6

    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/mu;

    iget-object v1, p0, Lcom/google/firebase/b/a;->r:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/firebase/b/a;->n:Lcom/google/android/gms/internal/mv;

    iget-object v3, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    iget-object v4, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    iget-object v5, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/mu;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/mv;Lcom/google/android/gms/internal/mv;Lcom/google/android/gms/internal/mv;Lcom/google/android/gms/internal/my;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_0

    sget-object v1, Landroid/os/AsyncTask;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :cond_0
    :try_start_1
    new-instance v1, Lcom/google/firebase/b/a$a;

    invoke-direct {v1}, Lcom/google/firebase/b/a$a;-><init>()V

    invoke-virtual {v1, v0}, Lcom/google/firebase/b/a$a;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)J
    .locals 2

    const-string v0, "configns:firebase"

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/b/a;->a(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)J
    .locals 5

    const-wide/16 v0, 0x0

    if-nez p2, :cond_0

    :goto_0
    return-wide v0

    :cond_0
    iget-object v2, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v2, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v2, p1, p2}, Lcom/google/android/gms/internal/mv;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v3, p1, p2}, Lcom/google/android/gms/internal/mv;->b(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/mx;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, v3, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {v2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-wide v0

    iget-object v2, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catch_0
    move-exception v2

    :cond_1
    :try_start_2
    iget-object v2, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v2, p1, p2}, Lcom/google/android/gms/internal/mv;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v3, p1, p2}, Lcom/google/android/gms/internal/mv;->b(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/mx;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, v3, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {v2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-wide v0

    iget-object v2, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catch_1
    move-exception v2

    :cond_2
    iget-object v2, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public a(J)Lcom/google/android/gms/g/f;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/g/g;

    invoke-direct {v0}, Lcom/google/android/gms/g/g;-><init>()V

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    new-instance v1, Lcom/google/android/gms/internal/ajr$a$a;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ajr$a$a;-><init>()V

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/ajr$a$a;->a(J)Lcom/google/android/gms/internal/ajr$a$a;

    iget-object v2, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/my;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "_rcn_developer"

    const-string v3, "true"

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ajr$a$a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ajr$a$a;

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/b/a;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ajr$a$a;->a(I)Lcom/google/android/gms/internal/ajr$a$a;

    new-instance v2, Lcom/google/android/gms/config/internal/d;

    iget-object v3, p0, Lcom/google/firebase/b/a;->r:Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/google/android/gms/config/internal/d;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ajr$a$a;->a()Lcom/google/android/gms/internal/ajr$a;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/google/android/gms/config/internal/d;->a(Lcom/google/android/gms/internal/ajr$a;)Lcom/google/android/gms/common/api/i;

    move-result-object v1

    new-instance v2, Lcom/google/firebase/b/a$1;

    invoke-direct {v2, p0, v0}, Lcom/google/firebase/b/a$1;-><init>(Lcom/google/firebase/b/a;Lcom/google/android/gms/g/g;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/i;->a(Lcom/google/android/gms/common/api/n;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    invoke-virtual {v0}, Lcom/google/android/gms/g/g;->a()Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public a(I)V
    .locals 1

    const-string v0, "configns:firebase"

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/b/a;->a(ILjava/lang/String;)V

    return-void
.end method

.method public a(ILjava/lang/String;)V
    .locals 9

    const/4 v8, 0x3

    const/4 v1, 0x0

    if-nez p2, :cond_1

    const-string v0, "FirebaseRemoteConfig"

    invoke-static {v0, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "FirebaseRemoteConfig"

    const-string v1, "namespace cannot be null for setDefaults."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/my;->c()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/my;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/my;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/mt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mt;->a()I

    move-result v2

    if-ne p1, v2, :cond_3

    iget-object v2, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/my;->d()J

    move-result-wide v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mt;->b()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_3

    const-string v0, "FirebaseRemoteConfig"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "FirebaseRemoteConfig"

    const-string v1, "Skipped setting defaults from resource file as this resource file was already applied."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    :try_start_1
    iget-object v0, p0, Lcom/google/firebase/b/a;->r:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v6

    invoke-interface {v6}, Landroid/content/res/XmlResourceParser;->getEventType()I

    move-result v0

    move-object v2, v1

    move-object v3, v1

    move v4, v0

    move-object v0, v1

    :goto_1
    const/4 v7, 0x1

    if-eq v4, v7, :cond_9

    const/4 v7, 0x2

    if-ne v4, v7, :cond_5

    invoke-interface {v6}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v3

    :cond_4
    :goto_2
    invoke-interface {v6}, Landroid/content/res/XmlResourceParser;->next()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result v4

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :cond_5
    if-ne v4, v8, :cond_7

    :try_start_2
    const-string v3, "entry"

    invoke-interface {v6}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    if-eqz v2, :cond_6

    if-eqz v0, :cond_6

    invoke-interface {v5, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v1

    move-object v2, v1

    :cond_6
    move-object v3, v1

    goto :goto_2

    :cond_7
    const/4 v7, 0x4

    if-ne v4, v7, :cond_4

    const-string v4, "key"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v6}, Landroid/content/res/XmlResourceParser;->getText()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_8
    const-string v4, "value"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v6}, Landroid/content/res/XmlResourceParser;->getText()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_9
    new-instance v0, Lcom/google/android/gms/internal/mt;

    iget-object v1, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/my;->d()J

    move-result-wide v2

    invoke-direct {v0, p1, v2, v3}, Lcom/google/android/gms/internal/mt;-><init>(IJ)V

    iget-object v1, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    invoke-virtual {v1, p2, v0}, Lcom/google/android/gms/internal/my;->a(Ljava/lang/String;Lcom/google/android/gms/internal/mt;)V

    const/4 v0, 0x0

    invoke-direct {p0, v5, p2, v0}, Lcom/google/firebase/b/a;->a(Ljava/util/Map;Ljava/lang/String;Z)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    const-string v1, "FirebaseRemoteConfig"

    const-string v2, "Caught exception while parsing XML resource. Skipping setDefaults."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0
.end method

.method a(Lcom/google/android/gms/g/g;Lcom/google/android/gms/internal/ajr$b;)V
    .locals 8
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/g/g",
            "<",
            "Ljava/lang/Void;",
            ">;",
            "Lcom/google/android/gms/internal/ajr$b;",
            ")V"
        }
    .end annotation

    const/4 v1, 0x1

    if-eqz p2, :cond_0

    invoke-interface {p2}, Lcom/google/android/gms/internal/ajr$b;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/my;->a(I)V

    new-instance v0, Lcom/google/firebase/b/c;

    invoke-direct {v0}, Lcom/google/firebase/b/c;-><init>()V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Exception;)V

    invoke-direct {p0}, Lcom/google/firebase/b/a;->f()V

    :goto_0
    return-void

    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/ajr$b;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->i()I

    move-result v0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    sparse-switch v0, :sswitch_data_0

    :try_start_0
    invoke-interface {p2}, Lcom/google/android/gms/internal/ajr$b;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/Status;->f()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "FirebaseRemoteConfig"

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x2d

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unknown (successful) status code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object v0, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/my;->a(I)V

    new-instance v0, Lcom/google/firebase/b/c;

    invoke-direct {v0}, Lcom/google/firebase/b/c;-><init>()V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Exception;)V

    invoke-direct {p0}, Lcom/google/firebase/b/a;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :sswitch_0
    :try_start_1
    iget-object v0, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/my;->a(I)V

    new-instance v0, Lcom/google/firebase/b/c;

    invoke-direct {v0}, Lcom/google/firebase/b/c;-><init>()V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Exception;)V

    invoke-direct {p0}, Lcom/google/firebase/b/a;->f()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :sswitch_1
    :try_start_2
    iget-object v0, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/my;->a(I)V

    new-instance v0, Lcom/google/firebase/b/d;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ajr$b;->b()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Lcom/google/firebase/b/d;-><init>(J)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Exception;)V

    invoke-direct {p0}, Lcom/google/firebase/b/a;->f()V

    goto :goto_1

    :sswitch_2
    iget-object v0, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/my;->a(I)V

    iget-object v0, p0, Lcom/google/firebase/b/a;->n:Lcom/google/android/gms/internal/mv;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/firebase/b/a;->n:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mv;->b()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-interface {p2}, Lcom/google/android/gms/internal/ajr$b;->c()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v7, 0x0

    invoke-interface {p2, v1, v7, v0}, Lcom/google/android/gms/internal/ajr$b;->a(Ljava/lang/String;[BLjava/lang/String;)[B

    move-result-object v7

    invoke-interface {v5, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_3
    invoke-interface {v3, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/google/android/gms/internal/mv;

    iget-object v1, p0, Lcom/google/firebase/b/a;->n:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mv;->c()J

    move-result-wide v4

    invoke-direct {v0, v3, v4, v5}, Lcom/google/android/gms/internal/mv;-><init>(Ljava/util/Map;J)V

    iput-object v0, p0, Lcom/google/firebase/b/a;->n:Lcom/google/android/gms/internal/mv;

    :cond_5
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/firebase/b/a;->f()V

    goto/16 :goto_1

    :sswitch_3
    invoke-interface {p2}, Lcom/google/android/gms/internal/ajr$b;->c()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v7, 0x0

    invoke-interface {p2, v1, v7, v0}, Lcom/google/android/gms/internal/ajr$b;->a(Ljava/lang/String;[BLjava/lang/String;)[B

    move-result-object v7

    invoke-interface {v5, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_6
    invoke-interface {v3, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_7
    new-instance v0, Lcom/google/android/gms/internal/mv;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-direct {v0, v3, v4, v5}, Lcom/google/android/gms/internal/mv;-><init>(Ljava/util/Map;J)V

    iput-object v0, p0, Lcom/google/firebase/b/a;->n:Lcom/google/android/gms/internal/mv;

    iget-object v0, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/my;->a(I)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/firebase/b/a;->f()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x196c -> :sswitch_2
        -0x196a -> :sswitch_2
        -0x1969 -> :sswitch_3
        0x1964 -> :sswitch_0
        0x1965 -> :sswitch_0
        0x1966 -> :sswitch_1
        0x1967 -> :sswitch_0
        0x1968 -> :sswitch_0
        0x196b -> :sswitch_1
    .end sparse-switch
.end method

.method public a(Lcom/google/firebase/b/f;)V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/my;->b()Z

    move-result v1

    if-nez p1, :cond_1

    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/my;->a(Z)V

    if-eq v1, v0, :cond_0

    invoke-direct {p0}, Lcom/google/firebase/b/a;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/firebase/b/f;->a()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public a(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "configns:firebase"

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/b/a;->a(Ljava/util/Map;Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/util/Map;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/google/firebase/b/a;->a(Ljava/util/Map;Ljava/lang/String;Z)V

    return-void
.end method

.method public b()Z
    .locals 6

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v1, p0, Lcom/google/firebase/b/a;->n:Lcom/google/android/gms/internal/mv;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    :goto_0
    return v0

    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mv;->c()J

    move-result-wide v2

    iget-object v1, p0, Lcom/google/firebase/b/a;->n:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mv;->c()J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-wide v4

    cmp-long v1, v2, v4

    if-ltz v1, :cond_1

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/google/firebase/b/a;->n:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mv;->c()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/firebase/b/a;->n:Lcom/google/android/gms/internal/mv;

    iput-object v2, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    iget-object v2, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/internal/mv;->a(J)V

    new-instance v2, Lcom/google/android/gms/internal/mv;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0, v1}, Lcom/google/android/gms/internal/mv;-><init>(Ljava/util/Map;J)V

    iput-object v2, p0, Lcom/google/firebase/b/a;->n:Lcom/google/android/gms/internal/mv;

    invoke-direct {p0}, Lcom/google/firebase/b/a;->f()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public b(Ljava/lang/String;)[B
    .locals 1

    const-string v0, "configns:firebase"

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/b/a;->b(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)[B
    .locals 2

    if-nez p2, :cond_0

    sget-object v0, Lcom/google/firebase/b/a;->e:[B

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/mv;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/mv;->b(Ljava/lang/String;Ljava/lang/String;)[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/mv;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/mv;->b(Ljava/lang/String;Ljava/lang/String;)[B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :cond_2
    :try_start_2
    sget-object v0, Lcom/google/firebase/b/a;->e:[B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public c()Lcom/google/firebase/b/e;
    .locals 3

    new-instance v2, Lcom/google/android/gms/internal/mw;

    invoke-direct {v2}, Lcom/google/android/gms/internal/mw;-><init>()V

    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/b/a;->n:Lcom/google/android/gms/internal/mv;

    if-nez v0, :cond_0

    const-wide/16 v0, -0x1

    :goto_0
    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/mw;->a(J)V

    iget-object v0, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/my;->a()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/mw;->a(I)V

    new-instance v0, Lcom/google/firebase/b/f$a;

    invoke-direct {v0}, Lcom/google/firebase/b/f$a;-><init>()V

    iget-object v1, p0, Lcom/google/firebase/b/a;->q:Lcom/google/android/gms/internal/my;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/my;->b()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/b/f$a;->a(Z)Lcom/google/firebase/b/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/b/f$a;->a()Lcom/google/firebase/b/f;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/mw;->a(Lcom/google/firebase/b/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v2

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/firebase/b/a;->n:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mv;->c()J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-wide v0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "configns:firebase"

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/b/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p2, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/mv;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/mv;->b(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mx;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/mv;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/mv;->b(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mx;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :cond_2
    :try_start_2
    const-string v0, ""
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method d()I
    .locals 1

    const/16 v0, 0x27d8

    return v0
.end method

.method public d(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "configns:firebase"

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/b/a;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    const/4 v1, 0x1

    const/4 v0, 0x0

    if-nez p2, :cond_0

    :goto_0
    return v0

    :cond_0
    iget-object v2, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v2, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v2, p1, p2}, Lcom/google/android/gms/internal/mv;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v3, p1, p2}, Lcom/google/android/gms/internal/mv;->b(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/mx;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, v3, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    sget-object v3, Lcom/google/android/gms/internal/mx;->b:Ljava/util/regex/Pattern;

    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v3

    if-eqz v3, :cond_1

    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    move v0, v1

    goto :goto_0

    :cond_1
    :try_start_1
    sget-object v3, Lcom/google/android/gms/internal/mx;->c:Ljava/util/regex/Pattern;

    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v2

    if-eqz v2, :cond_2

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :cond_2
    :try_start_2
    iget-object v2, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v2, p1, p2}, Lcom/google/android/gms/internal/mv;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v3, p1, p2}, Lcom/google/android/gms/internal/mv;->b(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/mx;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, v3, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    sget-object v3, Lcom/google/android/gms/internal/mx;->b:Ljava/util/regex/Pattern;

    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v3

    if-eqz v3, :cond_3

    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    move v0, v1

    goto :goto_0

    :cond_3
    :try_start_3
    sget-object v1, Lcom/google/android/gms/internal/mx;->c:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto/16 :goto_0

    :cond_4
    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public e(Ljava/lang/String;)D
    .locals 2

    const-string v0, "configns:firebase"

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/b/a;->e(Ljava/lang/String;Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)D
    .locals 5

    const-wide/16 v0, 0x0

    if-nez p2, :cond_0

    :goto_0
    return-wide v0

    :cond_0
    iget-object v2, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v2, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v2, p1, p2}, Lcom/google/android/gms/internal/mv;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v3, p1, p2}, Lcom/google/android/gms/internal/mv;->b(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/mx;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, v3, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {v2}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-wide v0

    iget-object v2, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catch_0
    move-exception v2

    :cond_1
    :try_start_2
    iget-object v2, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v2, p1, p2}, Lcom/google/android/gms/internal/mv;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v3, p1, p2}, Lcom/google/android/gms/internal/mv;->b(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/mx;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, v3, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {v2}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-wide v0

    iget-object v2, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catch_1
    move-exception v2

    :cond_2
    iget-object v2, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public e()Lcom/google/android/gms/g/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-wide/32 v0, 0xa8c0

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/b/a;->a(J)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public f(Ljava/lang/String;)Lcom/google/firebase/b/g;
    .locals 1

    const-string v0, "configns:firebase"

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/b/a;->f(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/b/g;

    move-result-object v0

    return-object v0
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/b/g;
    .locals 3

    const/4 v2, 0x0

    if-nez p2, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/mx;

    sget-object v1, Lcom/google/firebase/b/a;->e:[B

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/mx;-><init>([BI)V

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/mv;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/mx;

    iget-object v1, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/mv;->b(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/mx;-><init>([BI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/mv;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/mx;

    iget-object v1, p0, Lcom/google/firebase/b/a;->p:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/mv;->b(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/mx;-><init>([BI)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :cond_2
    :try_start_2
    new-instance v0, Lcom/google/android/gms/internal/mx;

    sget-object v1, Lcom/google/firebase/b/a;->e:[B

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/mx;-><init>([BI)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public g(Ljava/lang/String;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "configns:firebase"

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/b/a;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    :goto_0
    return-object v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/firebase/b/a;->o:Lcom/google/android/gms/internal/mv;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/mv;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/firebase/b/a;->s:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method
