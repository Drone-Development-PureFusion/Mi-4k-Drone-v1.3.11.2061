.class Lcom/google/firebase/c/i$5;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/c/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/c/i;->a(J)Lcom/google/android/gms/g/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/google/android/gms/g/g;

.field final synthetic c:Lcom/google/firebase/c/i;


# direct methods
.method constructor <init>(Lcom/google/firebase/c/i;JLcom/google/android/gms/g/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/c/i$5;->c:Lcom/google/firebase/c/i;

    iput-wide p2, p0, Lcom/google/firebase/c/i$5;->a:J

    iput-object p4, p0, Lcom/google/firebase/c/i$5;->b:Lcom/google/android/gms/g/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/firebase/c/k$b;Ljava/io/InputStream;)V
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v2, 0x4000

    new-array v2, v2, [B

    :goto_0
    const/4 v3, 0x0

    const/16 v4, 0x4000

    invoke-virtual {p2, v2, v3, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_1

    add-int/2addr v0, v3

    int-to-long v4, v0

    iget-wide v6, p0, Lcom/google/firebase/c/i$5;->a:J

    cmp-long v4, v4, v6

    if-lez v4, :cond_0

    const-string v0, "StorageReference"

    const-string v1, "the maximum allowed buffer size was exceeded."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "the maximum allowed buffer size was exceeded."

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    throw v0

    :cond_0
    const/4 v4, 0x0

    :try_start_1
    invoke-virtual {v1, v2, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->flush()V

    iget-object v0, p0, Lcom/google/firebase/c/i$5;->b:Lcom/google/android/gms/g/g;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    return-void
.end method
