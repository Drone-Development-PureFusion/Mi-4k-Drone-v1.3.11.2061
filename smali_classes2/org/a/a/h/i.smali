.class public Lorg/a/a/h/i;
.super Lorg/a/a/h/a;


# annotations
.annotation build Lorg/a/a/a/c;
.end annotation


# instance fields
.field private e:[B

.field private f:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Ljava/io/Serializable;)V
    .locals 1

    invoke-direct {p0}, Lorg/a/a/h/a;-><init>()V

    const-string v0, "Source object"

    invoke-static {p1, v0}, Lorg/a/a/o/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lorg/a/a/h/i;->f:Ljava/io/Serializable;

    return-void
.end method

.method public constructor <init>(Ljava/io/Serializable;Z)V
    .locals 1

    invoke-direct {p0}, Lorg/a/a/h/a;-><init>()V

    const-string v0, "Source object"

    invoke-static {p1, v0}, Lorg/a/a/o/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Lorg/a/a/h/i;->a(Ljava/io/Serializable;)V

    :goto_0
    return-void

    :cond_0
    iput-object p1, p0, Lorg/a/a/h/i;->f:Ljava/io/Serializable;

    goto :goto_0
.end method

.method private a(Ljava/io/Serializable;)V
    .locals 2

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v1, Ljava/io/ObjectOutputStream;

    invoke-direct {v1, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {v1, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->flush()V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lorg/a/a/h/i;->e:[B

    return-void
.end method


# virtual methods
.method public getContent()Ljava/io/InputStream;
    .locals 2

    iget-object v0, p0, Lorg/a/a/h/i;->e:[B

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/a/a/h/i;->f:Ljava/io/Serializable;

    invoke-direct {p0, v0}, Lorg/a/a/h/i;->a(Ljava/io/Serializable;)V

    :cond_0
    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Lorg/a/a/h/i;->e:[B

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method

.method public getContentLength()J
    .locals 2

    iget-object v0, p0, Lorg/a/a/h/i;->e:[B

    if-nez v0, :cond_0

    const-wide/16 v0, -0x1

    :goto_0
    return-wide v0

    :cond_0
    iget-object v0, p0, Lorg/a/a/h/i;->e:[B

    array-length v0, v0

    int-to-long v0, v0

    goto :goto_0
.end method

.method public isRepeatable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isStreaming()Z
    .locals 1

    iget-object v0, p0, Lorg/a/a/h/i;->e:[B

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public writeTo(Ljava/io/OutputStream;)V
    .locals 2

    const-string v0, "Output stream"

    invoke-static {p1, v0}, Lorg/a/a/o/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lorg/a/a/h/i;->e:[B

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/ObjectOutputStream;

    invoke-direct {v0, p1}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    iget-object v1, p0, Lorg/a/a/h/i;->f:Ljava/io/Serializable;

    invoke-virtual {v0, v1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/io/ObjectOutputStream;->flush()V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lorg/a/a/h/i;->e:[B

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    goto :goto_0
.end method
