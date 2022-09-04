.class public Lcom/google/android/gms/drive/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "response_drive_id"


# instance fields
.field private final b:Lcom/google/android/gms/drive/internal/bk;

.field private c:Lcom/google/android/gms/drive/d;

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/drive/internal/bk;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/drive/internal/bk;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/drive/a;->b:Lcom/google/android/gms/drive/internal/bk;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;)Landroid/content/IntentSender;
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/drive/a;->d:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "Must call setInitialDriveContents to CreateFileActivityBuilder."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/g;->j()Z

    move-result v0

    const-string v1, "Client must be connected"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/drive/a;->c:Lcom/google/android/gms/drive/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/drive/a;->c:Lcom/google/android/gms/drive/d;

    invoke-interface {v0}, Lcom/google/android/gms/drive/d;->g()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/drive/a;->b:Lcom/google/android/gms/drive/internal/bk;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/drive/internal/bk;->a(Lcom/google/android/gms/common/api/g;)Landroid/content/IntentSender;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/drive/DriveId;)Lcom/google/android/gms/drive/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/a;->b:Lcom/google/android/gms/drive/internal/bk;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/drive/internal/bk;->a(Lcom/google/android/gms/drive/DriveId;)V

    return-object p0
.end method

.method public a(Lcom/google/android/gms/drive/d;)Lcom/google/android/gms/drive/a;
    .locals 3

    const/4 v2, 0x1

    if-eqz p1, :cond_3

    instance-of v0, p1, Lcom/google/android/gms/drive/internal/bu;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only DriveContents obtained from the Drive API are accepted."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-interface {p1}, Lcom/google/android/gms/drive/d;->a()Lcom/google/android/gms/drive/DriveId;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-interface {p1}, Lcom/google/android/gms/drive/d;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "DriveContents are already closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/drive/a;->b:Lcom/google/android/gms/drive/internal/bk;

    invoke-interface {p1}, Lcom/google/android/gms/drive/d;->f()Lcom/google/android/gms/drive/Contents;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/drive/Contents;->f()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/internal/bk;->a(I)V

    iput-object p1, p0, Lcom/google/android/gms/drive/a;->c:Lcom/google/android/gms/drive/d;

    :goto_0
    iput-boolean v2, p0, Lcom/google/android/gms/drive/a;->d:Z

    return-object p0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/drive/a;->b:Lcom/google/android/gms/drive/internal/bk;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/drive/internal/bk;->a(I)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/drive/n;)Lcom/google/android/gms/drive/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/a;->b:Lcom/google/android/gms/drive/internal/bk;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/drive/internal/bk;->a(Lcom/google/android/gms/drive/n;)V

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/drive/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/a;->b:Lcom/google/android/gms/drive/internal/bk;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/drive/internal/bk;->a(Ljava/lang/String;)V

    return-object p0
.end method
