.class public Lcom/google/android/gms/drive/internal/bu;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/drive/d;


# instance fields
.field private final a:Lcom/google/android/gms/drive/Contents;

.field private b:Z

.field private c:Z

.field private d:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/drive/Contents;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lcom/google/android/gms/drive/internal/bu;->b:Z

    iput-boolean v0, p0, Lcom/google/android/gms/drive/internal/bu;->c:Z

    iput-boolean v0, p0, Lcom/google/android/gms/drive/internal/bu;->d:Z

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/Contents;

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/bu;->a:Lcom/google/android/gms/drive/Contents;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/drive/internal/bu;)Lcom/google/android/gms/drive/Contents;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/bu;->a:Lcom/google/android/gms/drive/Contents;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/drive/c$a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/bu;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DriveContents already closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/bu;->a:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->e()I

    move-result v0

    const/high16 v1, 0x10000000

    if-eq v0, v1, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/bu;->g()V

    new-instance v0, Lcom/google/android/gms/drive/internal/bu$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/drive/internal/bu$1;-><init>(Lcom/google/android/gms/drive/internal/bu;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/drive/n;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/drive/internal/bu;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;Lcom/google/android/gms/drive/x;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;Lcom/google/android/gms/drive/j;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/drive/n;",
            "Lcom/google/android/gms/drive/j;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    if-nez p3, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/drive/internal/bu;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;Lcom/google/android/gms/drive/x;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {p3}, Lcom/google/android/gms/drive/x;->a(Lcom/google/android/gms/drive/j;)Lcom/google/android/gms/drive/x;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;Lcom/google/android/gms/drive/x;)Lcom/google/android/gms/common/api/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/drive/n;",
            "Lcom/google/android/gms/drive/x;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    if-nez p3, :cond_5

    new-instance v0, Lcom/google/android/gms/drive/x$a;

    invoke-direct {v0}, Lcom/google/android/gms/drive/x$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/drive/x$a;->b()Lcom/google/android/gms/drive/j;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/x;

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/drive/internal/bu;->a:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v1}, Lcom/google/android/gms/drive/Contents;->e()I

    move-result v1

    const/high16 v2, 0x10000000

    if-ne v1, v2, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot commit contents opened with MODE_READ_ONLY"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/drive/x;->c()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/drive/j;->a(I)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/drive/internal/bu;->a:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v1}, Lcom/google/android/gms/drive/Contents;->g()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DriveContents must be valid for conflict detection."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/android/gms/drive/x;->a(Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/bu;->h()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DriveContents already closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/bu;->a()Lcom/google/android/gms/drive/DriveId;

    move-result-object v1

    if-nez v1, :cond_3

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Only DriveContents obtained through DriveFile.open can be committed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    if-eqz p2, :cond_4

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/bu;->g()V

    new-instance v1, Lcom/google/android/gms/drive/internal/bu$2;

    invoke-direct {v1, p0, p1, p2, v0}, Lcom/google/android/gms/drive/internal/bu$2;-><init>(Lcom/google/android/gms/drive/internal/bu;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;Lcom/google/android/gms/drive/x;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0

    :cond_4
    sget-object p2, Lcom/google/android/gms/drive/n;->f:Lcom/google/android/gms/drive/n;

    goto :goto_1

    :cond_5
    move-object v0, p3

    goto :goto_0
.end method

.method public a()Lcom/google/android/gms/drive/DriveId;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/bu;->a:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->b()Lcom/google/android/gms/drive/DriveId;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/bu;->a:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->e()I

    move-result v0

    return v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/bu;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DriveContents already closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/bu;->g()V

    new-instance v0, Lcom/google/android/gms/drive/internal/bu$4;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/drive/internal/bu$4;-><init>(Lcom/google/android/gms/drive/internal/bu;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/internal/bu$4;

    new-instance v1, Lcom/google/android/gms/drive/internal/bu$3;

    invoke-direct {v1, p0}, Lcom/google/android/gms/drive/internal/bu$3;-><init>(Lcom/google/android/gms/drive/internal/bu;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/internal/bu$4;->a(Lcom/google/android/gms/common/api/n;)V

    return-void
.end method

.method public c()Landroid/os/ParcelFileDescriptor;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/bu;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Contents have been closed, cannot access the output stream."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/bu;->a:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->a()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/io/InputStream;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/bu;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Contents have been closed, cannot access the input stream."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/bu;->a:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->e()I

    move-result v0

    const/high16 v1, 0x10000000

    if-eq v0, v1, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getInputStream() can only be used with contents opened with MODE_READ_ONLY."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/drive/internal/bu;->c:Z

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getInputStream() can only be called once per Contents instance."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/drive/internal/bu;->c:Z

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/bu;->a:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->c()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/io/OutputStream;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/bu;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Contents have been closed, cannot access the output stream."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/bu;->a:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->e()I

    move-result v0

    const/high16 v1, 0x20000000

    if-eq v0, v1, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/drive/internal/bu;->d:Z

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getOutputStream() can only be called once per Contents instance."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/drive/internal/bu;->d:Z

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/bu;->a:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->d()Ljava/io/OutputStream;

    move-result-object v0

    return-object v0
.end method

.method public f()Lcom/google/android/gms/drive/Contents;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/bu;->a:Lcom/google/android/gms/drive/Contents;

    return-object v0
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/bu;->a:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->a()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/util/o;->a(Landroid/os/ParcelFileDescriptor;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/drive/internal/bu;->b:Z

    return-void
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/drive/internal/bu;->b:Z

    return v0
.end method
