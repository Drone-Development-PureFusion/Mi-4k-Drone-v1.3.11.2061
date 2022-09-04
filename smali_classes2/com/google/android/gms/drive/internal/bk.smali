.class public Lcom/google/android/gms/drive/internal/bk;
.super Ljava/lang/Object;


# instance fields
.field protected a:Lcom/google/android/gms/drive/n;

.field private b:Ljava/lang/Integer;

.field private c:Ljava/lang/String;

.field private d:Lcom/google/android/gms/drive/DriveId;

.field private final e:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/internal/bk;->e:I

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;)Landroid/content/IntentSender;
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/bk;->a:Lcom/google/android/gms/drive/n;

    const-string v1, "Must provide initial metadata to CreateFileActivityBuilder."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/g;->j()Z

    move-result v0

    const-string v1, "Client must be connected"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    sget-object v0, Lcom/google/android/gms/drive/b;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/internal/bt;

    iget-object v1, p0, Lcom/google/android/gms/drive/internal/bk;->a:Lcom/google/android/gms/drive/n;

    invoke-virtual {v1}, Lcom/google/android/gms/drive/n;->j()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/drive/internal/bt;->B()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->a(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/google/android/gms/drive/internal/bk;->b:Ljava/lang/Integer;

    if-nez v1, :cond_0

    const/4 v2, 0x0

    :goto_0
    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/drive/internal/bt;->i()Lcom/google/android/gms/drive/internal/n;

    move-result-object v6

    new-instance v0, Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;

    iget-object v1, p0, Lcom/google/android/gms/drive/internal/bk;->a:Lcom/google/android/gms/drive/n;

    invoke-virtual {v1}, Lcom/google/android/gms/drive/n;->j()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/drive/internal/bk;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/drive/internal/bk;->d:Lcom/google/android/gms/drive/DriveId;

    iget v5, p0, Lcom/google/android/gms/drive/internal/bk;->e:I

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;-><init>(Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;ILjava/lang/String;Lcom/google/android/gms/drive/DriveId;I)V

    invoke-interface {v6, v0}, Lcom/google/android/gms/drive/internal/n;->a(Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;)Landroid/content/IntentSender;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/drive/internal/bk;->b:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to connect Drive Play Service"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public a(I)V
    .locals 1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/bk;->b:Ljava/lang/Integer;

    return-void
.end method

.method public a(Lcom/google/android/gms/drive/DriveId;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/DriveId;

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/bk;->d:Lcom/google/android/gms/drive/DriveId;

    return-void
.end method

.method public a(Lcom/google/android/gms/drive/n;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/n;

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/bk;->a:Lcom/google/android/gms/drive/n;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/bk;->c:Ljava/lang/String;

    return-void
.end method
