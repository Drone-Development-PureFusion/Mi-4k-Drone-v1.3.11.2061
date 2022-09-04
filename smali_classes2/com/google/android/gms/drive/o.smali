.class public Lcom/google/android/gms/drive/o;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/lang/String; = "response_drive_id"


# instance fields
.field private b:Ljava/lang/String;

.field private c:[Ljava/lang/String;

.field private d:Lcom/google/android/gms/drive/query/Filter;

.field private e:Lcom/google/android/gms/drive/DriveId;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;)Landroid/content/IntentSender;
    .locals 6

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/g;->j()Z

    move-result v0

    const-string v1, "Client must be connected"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/drive/o;->c:[Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/drive/o;->c:[Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/drive/o;->c:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/drive/o;->d:Lcom/google/android/gms/drive/query/Filter;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot use a selection filter and set mimetypes simultaneously"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/drive/o;->d:Lcom/google/android/gms/drive/query/Filter;

    if-nez v0, :cond_2

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    :try_start_0
    sget-object v0, Lcom/google/android/gms/drive/b;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/internal/bt;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/internal/bt;->i()Lcom/google/android/gms/drive/internal/n;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;

    iget-object v3, p0, Lcom/google/android/gms/drive/o;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/drive/o;->c:[Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/drive/o;->e:Lcom/google/android/gms/drive/DriveId;

    invoke-direct {v2, v3, v4, v5, v1}, Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/query/internal/FilterHolder;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/drive/internal/n;->a(Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;)Landroid/content/IntentSender;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Lcom/google/android/gms/drive/query/internal/FilterHolder;

    iget-object v1, p0, Lcom/google/android/gms/drive/o;->d:Lcom/google/android/gms/drive/query/Filter;

    invoke-direct {v0, v1}, Lcom/google/android/gms/drive/query/internal/FilterHolder;-><init>(Lcom/google/android/gms/drive/query/Filter;)V

    move-object v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to connect Drive Play Service"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public a(Lcom/google/android/gms/drive/DriveId;)Lcom/google/android/gms/drive/o;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/DriveId;

    iput-object v0, p0, Lcom/google/android/gms/drive/o;->e:Lcom/google/android/gms/drive/DriveId;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/drive/query/Filter;)Lcom/google/android/gms/drive/o;
    .locals 4

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "filter may not be null"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    invoke-static {p1}, Lcom/google/android/gms/drive/query/internal/g;->a(Lcom/google/android/gms/drive/query/Filter;)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_1
    const-string v0, "FullTextSearchFilter cannot be used as a selection filter"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/drive/o;->d:Lcom/google/android/gms/drive/query/Filter;

    return-object p0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/drive/o;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/drive/o;->b:Ljava/lang/String;

    return-object p0
.end method

.method public a([Ljava/lang/String;)Lcom/google/android/gms/drive/o;
    .locals 2

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "mimeTypes may not be null"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/drive/o;->c:[Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
