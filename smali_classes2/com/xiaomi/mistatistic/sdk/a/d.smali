.class final Lcom/xiaomi/mistatistic/sdk/a/d;
.super Ljava/io/OutputStream;


# instance fields
.field private a:Ljava/io/OutputStream;

.field private b:Lcom/xiaomi/mistatistic/sdk/a/a;

.field private c:Lcom/xiaomi/mistatistic/sdk/a/b;

.field private d:I


# direct methods
.method public constructor <init>(Lcom/xiaomi/mistatistic/sdk/a/a;Ljava/io/OutputStream;)V
    .locals 1

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->d:I

    iput-object p2, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->a:Ljava/io/OutputStream;

    iput-object p1, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->b:Lcom/xiaomi/mistatistic/sdk/a/a;

    return-void
.end method

.method public constructor <init>(Lcom/xiaomi/mistatistic/sdk/a/b;Ljava/io/OutputStream;)V
    .locals 1

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->d:I

    iput-object p2, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->a:Ljava/io/OutputStream;

    iput-object p1, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->c:Lcom/xiaomi/mistatistic/sdk/a/b;

    return-void
.end method

.method private a(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->b:Lcom/xiaomi/mistatistic/sdk/a/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->b:Lcom/xiaomi/mistatistic/sdk/a/a;

    invoke-virtual {v0, p1}, Lcom/xiaomi/mistatistic/sdk/a/a;->a(Ljava/lang/Exception;)V

    :cond_0
    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->c:Lcom/xiaomi/mistatistic/sdk/a/b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->c:Lcom/xiaomi/mistatistic/sdk/a/b;

    invoke-virtual {v0, p1}, Lcom/xiaomi/mistatistic/sdk/a/b;->a(Ljava/lang/Exception;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->d:I

    return v0
.end method

.method public close()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/xiaomi/mistatistic/sdk/a/d;->a(Ljava/lang/Exception;)V

    throw v0
.end method

.method public flush()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/xiaomi/mistatistic/sdk/a/d;->a(Ljava/lang/Exception;)V

    throw v0
.end method

.method public write(I)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    iget v0, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->d:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/xiaomi/mistatistic/sdk/a/d;->a(Ljava/lang/Exception;)V

    throw v0
.end method

.method public write([B)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    iget v0, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->d:I

    array-length v1, p1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->d:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/xiaomi/mistatistic/sdk/a/d;->a(Ljava/lang/Exception;)V

    throw v0
.end method

.method public write([BII)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    iget v0, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->d:I

    add-int/2addr v0, p3

    iput v0, p0, Lcom/xiaomi/mistatistic/sdk/a/d;->d:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/xiaomi/mistatistic/sdk/a/d;->a(Ljava/lang/Exception;)V

    throw v0
.end method
