.class public Lcom/google/firebase/c/g;
.super Lcom/google/firebase/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/c/g$a;
    }
.end annotation


# static fields
.field public static final a:I = -0x32c8

.field public static final b:I = -0x32d2

.field public static final c:I = -0x32d3

.field public static final d:I = -0x32d4

.field public static final e:I = -0x32d5

.field public static final f:I = -0x32dc

.field public static final g:I = -0x32dd

.field public static final h:I = -0x32e6

.field public static final i:I = -0x32e7

.field public static final j:I = -0x32f0

.field static k:Ljava/io/IOException;

.field static final synthetic l:Z


# instance fields
.field private final m:I

.field private final n:I

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/google/firebase/c/g;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/firebase/c/g;->l:Z

    new-instance v0, Ljava/io/IOException;

    const-string v1, "The operation was canceled."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/c/g;->k:Ljava/io/IOException;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(ILjava/lang/Throwable;I)V
    .locals 7

    invoke-direct {p0}, Lcom/google/firebase/c;-><init>()V

    invoke-static {p1}, Lcom/google/firebase/c/g;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/c/g;->o:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/firebase/c/g;->p:Ljava/lang/Throwable;

    iput p1, p0, Lcom/google/firebase/c/g;->m:I

    iput p3, p0, Lcom/google/firebase/c/g;->n:I

    const-string v0, "StorageException"

    iget-object v1, p0, Lcom/google/firebase/c/g;->o:Ljava/lang/String;

    iget v2, p0, Lcom/google/firebase/c/g;->m:I

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/google/firebase/c/g;->n:I

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x34

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "StorageException has occurred.\n"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "\n Code: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " HttpResult: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/firebase/c/g;->p:Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    const-string v0, "StorageException"

    iget-object v1, p0, Lcom/google/firebase/c/g;->p:Ljava/lang/Throwable;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/c/g;->p:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    invoke-static {p1}, Lcom/google/firebase/c/g;->b(Lcom/google/android/gms/common/api/Status;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/google/firebase/c/g;-><init>(ILjava/lang/Throwable;I)V

    return-void
.end method

.method constructor <init>(Ljava/lang/Throwable;I)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-static {p1, p2}, Lcom/google/firebase/c/g;->b(Ljava/lang/Throwable;I)I

    move-result v0

    invoke-direct {p0, v0, p1, p2}, Lcom/google/firebase/c/g;-><init>(ILjava/lang/Throwable;I)V

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/Status;)Lcom/google/firebase/c/g;
    .locals 1
    .param p0    # Lcom/google/android/gms/common/api/Status;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->f()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    new-instance v0, Lcom/google/firebase/c/g;

    invoke-direct {v0, p0}, Lcom/google/firebase/c/g;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Ljava/lang/Throwable;)Lcom/google/firebase/c/g;
    .locals 2
    .param p0    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/google/firebase/c/g;->a(Ljava/lang/Throwable;I)Lcom/google/firebase/c/g;

    move-result-object v0

    sget-boolean v1, Lcom/google/firebase/c/g;->l:Z

    if-nez v1, :cond_0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    return-object v0
.end method

.method public static a(Ljava/lang/Throwable;I)Lcom/google/firebase/c/g;
    .locals 1
    .param p0    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    instance-of v0, p0, Lcom/google/firebase/c/g;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/firebase/c/g;

    :goto_0
    return-object p0

    :cond_0
    invoke-static {p1}, Lcom/google/firebase/c/g;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p0, :cond_1

    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/firebase/c/g;

    invoke-direct {v0, p0, p1}, Lcom/google/firebase/c/g;-><init>(Ljava/lang/Throwable;I)V

    move-object p0, v0

    goto :goto_0
.end method

.method static a(I)Ljava/lang/String;
    .locals 1

    sparse-switch p0, :sswitch_data_0

    const-string v0, "An unknown error occurred, please check the HTTP result code and inner exception for server response."

    :goto_0
    return-object v0

    :sswitch_0
    const-string v0, "An unknown error occurred, please check the HTTP result code and inner exception for server response."

    goto :goto_0

    :sswitch_1
    const-string v0, "Object does not exist at location."

    goto :goto_0

    :sswitch_2
    const-string v0, "Bucket does not exist."

    goto :goto_0

    :sswitch_3
    const-string v0, "Project does not exist."

    goto :goto_0

    :sswitch_4
    const-string v0, "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage."

    goto :goto_0

    :sswitch_5
    const-string v0, "User is not authenticated, please authenticate using Firebase Authentication and try again."

    goto :goto_0

    :sswitch_6
    const-string v0, "User does not have permission to access this object."

    goto :goto_0

    :sswitch_7
    const-string v0, "The operation retry limit has been exceeded."

    goto :goto_0

    :sswitch_8
    const-string v0, "Object has a checksum which does not match. Please retry the operation."

    goto :goto_0

    :sswitch_9
    const-string v0, "The operation was cancelled."

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x32f0 -> :sswitch_9
        -0x32e7 -> :sswitch_8
        -0x32e6 -> :sswitch_7
        -0x32dd -> :sswitch_6
        -0x32dc -> :sswitch_5
        -0x32d5 -> :sswitch_4
        -0x32d4 -> :sswitch_3
        -0x32d3 -> :sswitch_2
        -0x32d2 -> :sswitch_1
        -0x32c8 -> :sswitch_0
    .end sparse-switch
.end method

.method private static b(Lcom/google/android/gms/common/api/Status;)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, -0x32f0

    :goto_0
    return v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->d:Lcom/google/android/gms/common/api/Status;

    if-ne p0, v0, :cond_1

    const/16 v0, -0x32e6

    goto :goto_0

    :cond_1
    const/16 v0, -0x32c8

    goto :goto_0
.end method

.method private static b(Ljava/lang/Throwable;I)I
    .locals 1
    .param p0    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    sget-object v0, Lcom/google/firebase/c/g;->k:Ljava/io/IOException;

    if-ne p0, v0, :cond_0

    const/16 v0, -0x32f0

    :goto_0
    return v0

    :cond_0
    sparse-switch p1, :sswitch_data_0

    const/16 v0, -0x32c8

    goto :goto_0

    :sswitch_0
    const/16 v0, -0x32e6

    goto :goto_0

    :sswitch_1
    const/16 v0, -0x32dc

    goto :goto_0

    :sswitch_2
    const/16 v0, -0x32dd

    goto :goto_0

    :sswitch_3
    const/16 v0, -0x32d2

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x2 -> :sswitch_0
        0x191 -> :sswitch_1
        0x193 -> :sswitch_2
        0x194 -> :sswitch_3
    .end sparse-switch
.end method

.method private static b(I)Z
    .locals 1

    if-eqz p0, :cond_0

    const/16 v0, 0xc8

    if-lt p0, v0, :cond_1

    const/16 v0, 0x12c

    if-ge p0, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/firebase/c/g;->m:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/firebase/c/g;->n:I

    return v0
.end method

.method public c()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/firebase/c/g;->a()I

    move-result v0

    const/16 v1, -0x32e6

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getCause()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/c/g;->p:Ljava/lang/Throwable;

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/c/g;->p:Ljava/lang/Throwable;

    goto :goto_0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/c/g;->o:Ljava/lang/String;

    return-object v0
.end method
