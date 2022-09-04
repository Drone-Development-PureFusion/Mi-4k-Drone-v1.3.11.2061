.class public final Lcom/google/android/gms/internal/oc;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/pp;)Lcom/google/android/gms/internal/nx;
    .locals 6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->p()Z

    move-result v1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/pp;->a(Z)V

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/oz;->a(Lcom/google/android/gms/internal/pp;)Lcom/google/android/gms/internal/nx;
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/pp;->a(Z)V

    return-object v0

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v2, Lcom/google/android/gms/internal/ob;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x24

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Failed parsing JSON source: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " to Json"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Lcom/google/android/gms/internal/ob;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/pp;->a(Z)V

    throw v0

    :catch_1
    move-exception v0

    :try_start_2
    new-instance v2, Lcom/google/android/gms/internal/ob;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x24

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Failed parsing JSON source: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " to Json"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Lcom/google/android/gms/internal/ob;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0
.end method

.method public a(Ljava/io/Reader;)Lcom/google/android/gms/internal/nx;
    .locals 3

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/pp;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/pp;-><init>(Ljava/io/Reader;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/oc;->a(Lcom/google/android/gms/internal/pp;)Lcom/google/android/gms/internal/nx;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/nx;->k()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/pp;->f()Lcom/google/android/gms/internal/pq;

    move-result-object v0

    sget-object v2, Lcom/google/android/gms/internal/pq;->j:Lcom/google/android/gms/internal/pq;

    if-eq v0, v2, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/og;

    const-string v1, "Did not consume the entire document."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/og;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/pt; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_2

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/og;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/og;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/ny;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ny;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/og;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/og;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    return-object v1
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/internal/nx;
    .locals 1

    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/oc;->a(Ljava/io/Reader;)Lcom/google/android/gms/internal/nx;

    move-result-object v0

    return-object v0
.end method
