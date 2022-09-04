.class public Lcom/baidu/tts/e/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/tts/e/c$a;
    }
.end annotation


# static fields
.field private static e:Lcom/baidu/tts/e/c;


# instance fields
.field private a:Lcom/baidu/tts/e/c$a;

.field private b:Landroid/database/sqlite/SQLiteDatabase;

.field private volatile c:Z

.field private d:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/tts/e/c;->c:Z

    iput-object p1, p0, Lcom/baidu/tts/e/c;->d:Landroid/content/Context;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/baidu/tts/e/c;
    .locals 2

    sget-object v0, Lcom/baidu/tts/e/c;->e:Lcom/baidu/tts/e/c;

    if-nez v0, :cond_1

    const-class v1, Lcom/baidu/tts/e/c;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/baidu/tts/e/c;->e:Lcom/baidu/tts/e/c;

    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/tts/e/c;

    invoke-direct {v0, p0}, Lcom/baidu/tts/e/c;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/baidu/tts/e/c;->e:Lcom/baidu/tts/e/c;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/baidu/tts/e/c;->e:Lcom/baidu/tts/e/c;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static e()V
    .locals 2

    sget-object v0, Lcom/baidu/tts/e/c;->e:Lcom/baidu/tts/e/c;

    if-eqz v0, :cond_1

    const-class v1, Lcom/baidu/tts/e/c;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/baidu/tts/e/c;->e:Lcom/baidu/tts/e/c;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    sput-object v0, Lcom/baidu/tts/e/c;->e:Lcom/baidu/tts/e/c;

    :cond_0
    monitor-exit v1

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/baidu/tts/e/c;->a:Lcom/baidu/tts/e/c$a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/tts/e/c$a;

    iget-object v1, p0, Lcom/baidu/tts/e/c;->d:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lcom/baidu/tts/e/c$a;-><init>(Lcom/baidu/tts/e/c;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/baidu/tts/e/c;->a:Lcom/baidu/tts/e/c$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Lcom/baidu/tts/e/c;->a:Lcom/baidu/tts/e/c$a;

    invoke-virtual {v0}, Lcom/baidu/tts/e/c$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/tts/e/c;->b:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :catch_0
    move-exception v0

    const/4 v0, 0x1

    :try_start_2
    iput-boolean v0, p0, Lcom/baidu/tts/e/c;->c:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(JIIILjava/lang/String;)V
    .locals 5

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v1, "code"

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "cmd_type"

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "cmd_id"

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "result"

    invoke-virtual {v0, v1, p6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/baidu/tts/e/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    const-string v2, "result"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, ""

    move-object v2, v0

    move v0, v1

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/tts/e/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    const-string v2, "result"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "_id in ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ")"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_0
.end method

.method public b()Landroid/database/Cursor;
    .locals 8

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/baidu/tts/e/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/tts/e/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "result"

    const/4 v2, 0x6

    new-array v2, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "_id"

    aput-object v5, v2, v4

    const/4 v4, 0x1

    const-string v5, "time"

    aput-object v5, v2, v4

    const/4 v4, 0x2

    const-string v5, "code"

    aput-object v5, v2, v4

    const/4 v4, 0x3

    const-string v5, "cmd_type"

    aput-object v5, v2, v4

    const/4 v4, 0x4

    const-string v5, "cmd_id"

    aput-object v5, v2, v4

    const/4 v4, 0x5

    const-string v5, "result"

    aput-object v5, v2, v4

    move-object v4, v3

    move-object v5, v3

    move-object v6, v3

    move-object v7, v3

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    :cond_0
    return-object v3
.end method

.method public declared-synchronized c()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/baidu/tts/e/c;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/tts/e/c;->a:Lcom/baidu/tts/e/c$a;

    invoke-virtual {v0}, Lcom/baidu/tts/e/c$a;->close()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/baidu/tts/e/c;->a:Lcom/baidu/tts/e/c$a;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/baidu/tts/e/c;->d:Landroid/content/Context;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/tts/e/c;->c:Z
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

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/tts/e/c;->c:Z

    return v0
.end method
