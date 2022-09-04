.class public Lcom/google/android/gms/drive/internal/bx;
.super Lcom/google/android/gms/drive/internal/c;

# interfaces
.implements Lcom/google/android/gms/drive/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/drive/internal/bx$b;,
        Lcom/google/android/gms/drive/internal/bx$e;,
        Lcom/google/android/gms/drive/internal/bx$f;,
        Lcom/google/android/gms/drive/internal/bx$a;,
        Lcom/google/android/gms/drive/internal/bx$c;,
        Lcom/google/android/gms/drive/internal/bx$d;
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/drive/DriveId;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/drive/internal/c;-><init>(Lcom/google/android/gms/drive/DriveId;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/drive/d;Lcom/google/android/gms/drive/metadata/internal/i;)I
    .locals 1

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/drive/metadata/internal/i;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lcom/google/android/gms/drive/d;->f()Lcom/google/android/gms/drive/Contents;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->f()I

    move-result v0

    invoke-interface {p1}, Lcom/google/android/gms/drive/d;->g()V

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;ILcom/google/android/gms/drive/w;)Lcom/google/android/gms/common/api/i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/drive/n;",
            "I",
            "Lcom/google/android/gms/drive/w;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/drive/f$a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/android/gms/drive/n;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/drive/metadata/internal/i;->a(Ljava/lang/String;)Lcom/google/android/gms/drive/metadata/internal/i;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/drive/metadata/internal/i;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x1

    :goto_0
    new-instance v0, Lcom/google/android/gms/drive/internal/bx$1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/drive/internal/bx$1;-><init>(Lcom/google/android/gms/drive/internal/bx;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;IILcom/google/android/gms/drive/w;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v5, 0x0

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/drive/n;Ljava/lang/String;)Lcom/google/android/gms/drive/n;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ajw;->K:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/drive/n;->a(Lcom/google/android/gms/drive/metadata/a;Ljava/lang/Object;)Lcom/google/android/gms/drive/n;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/android/gms/drive/query/Query;)Lcom/google/android/gms/drive/query/Query;
    .locals 3

    new-instance v0, Lcom/google/android/gms/drive/query/Query$a;

    invoke-direct {v0}, Lcom/google/android/gms/drive/query/Query$a;-><init>()V

    sget-object v1, Lcom/google/android/gms/drive/query/b;->d:Lcom/google/android/gms/drive/metadata/b;

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/bx;->a()Lcom/google/android/gms/drive/DriveId;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/drive/query/a;->a(Lcom/google/android/gms/drive/metadata/b;Ljava/lang/Object;)Lcom/google/android/gms/drive/query/Filter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/query/Query$a;->a(Lcom/google/android/gms/drive/query/Filter;)Lcom/google/android/gms/drive/query/Query$a;

    move-result-object v0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/drive/query/Query;->a()Lcom/google/android/gms/drive/query/Filter;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/drive/query/Query;->a()Lcom/google/android/gms/drive/query/Filter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/query/Query$a;->a(Lcom/google/android/gms/drive/query/Filter;)Lcom/google/android/gms/drive/query/Query$a;

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/drive/query/Query;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/query/Query$a;->a(Ljava/lang/String;)Lcom/google/android/gms/drive/query/Query$a;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/query/Query;->c()Lcom/google/android/gms/drive/query/SortOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/query/Query$a;->a(Lcom/google/android/gms/drive/query/SortOrder;)Lcom/google/android/gms/drive/query/Query$a;

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/drive/query/Query$a;->a()Lcom/google/android/gms/drive/query/Query;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/android/gms/drive/n;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "MetadataChangeSet must be provided."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/drive/n;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/drive/metadata/internal/i;->a(Ljava/lang/String;)Lcom/google/android/gms/drive/metadata/internal/i;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/drive/metadata/internal/i;->b()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "May not create shortcut files using this method. Use DriveFolder.createShortcutFile() instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method private b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;Lcom/google/android/gms/drive/d;Lcom/google/android/gms/drive/w;)V
    .locals 2

    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "MetadataChangeSet must be provided."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/drive/n;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/drive/metadata/internal/i;->a(Ljava/lang/String;)Lcom/google/android/gms/drive/metadata/internal/i;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/drive/metadata/internal/i;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "May not create folders using this method. Use DriveFolder.createFolder() instead of mime type application/vnd.google-apps.folder"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p4, p1}, Lcom/google/android/gms/drive/w;->a(Lcom/google/android/gms/common/api/g;)V

    if-nez p3, :cond_3

    :cond_2
    return-void

    :cond_3
    instance-of v0, p3, Lcom/google/android/gms/drive/internal/bu;

    if-nez v0, :cond_4

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only DriveContents obtained from the Drive API are accepted."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-interface {p3}, Lcom/google/android/gms/drive/d;->a()Lcom/google/android/gms/drive/DriveId;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    invoke-interface {p3}, Lcom/google/android/gms/drive/d;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "DriveContents are already closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/drive/c$c;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/drive/internal/bx;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/query/Query;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/drive/n;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/drive/f$b;",
            ">;"
        }
    .end annotation

    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "MetadataChangeSet must be provided."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/drive/n;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/drive/n;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "application/vnd.google-apps.folder"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The mimetype must be of type application/vnd.google-apps.folder"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/drive/internal/bx$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/drive/internal/bx$2;-><init>(Lcom/google/android/gms/drive/internal/bx;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;Lcom/google/android/gms/drive/d;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/drive/n;",
            "Lcom/google/android/gms/drive/d;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/drive/f$a;",
            ">;"
        }
    .end annotation

    invoke-direct {p0, p2}, Lcom/google/android/gms/drive/internal/bx;->a(Lcom/google/android/gms/drive/n;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/drive/internal/bx;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;Lcom/google/android/gms/drive/d;Lcom/google/android/gms/drive/w;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;Lcom/google/android/gms/drive/d;Lcom/google/android/gms/drive/j;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/drive/n;",
            "Lcom/google/android/gms/drive/d;",
            "Lcom/google/android/gms/drive/j;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/drive/f$a;",
            ">;"
        }
    .end annotation

    invoke-direct {p0, p2}, Lcom/google/android/gms/drive/internal/bx;->a(Lcom/google/android/gms/drive/n;)V

    invoke-static {p4}, Lcom/google/android/gms/drive/w;->a(Lcom/google/android/gms/drive/j;)Lcom/google/android/gms/drive/w;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/drive/internal/bx;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;Lcom/google/android/gms/drive/d;Lcom/google/android/gms/drive/w;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;Lcom/google/android/gms/drive/d;Lcom/google/android/gms/drive/w;)Lcom/google/android/gms/common/api/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/drive/n;",
            "Lcom/google/android/gms/drive/d;",
            "Lcom/google/android/gms/drive/w;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/drive/f$a;",
            ">;"
        }
    .end annotation

    if-nez p4, :cond_1

    new-instance v0, Lcom/google/android/gms/drive/w$a;

    invoke-direct {v0}, Lcom/google/android/gms/drive/w$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/drive/w$a;->b()Lcom/google/android/gms/drive/j;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/w;

    :goto_0
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/gms/drive/internal/bx;->b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;Lcom/google/android/gms/drive/d;Lcom/google/android/gms/drive/w;)V

    invoke-virtual {p2}, Lcom/google/android/gms/drive/n;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/drive/metadata/internal/i;->a(Ljava/lang/String;)Lcom/google/android/gms/drive/metadata/internal/i;

    move-result-object v1

    invoke-direct {p0, p3, v1}, Lcom/google/android/gms/drive/internal/bx;->a(Lcom/google/android/gms/drive/d;Lcom/google/android/gms/drive/metadata/internal/i;)I

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/gms/drive/w;->e()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-direct {p0, p2, v2}, Lcom/google/android/gms/drive/internal/bx;->a(Lcom/google/android/gms/drive/n;Ljava/lang/String;)Lcom/google/android/gms/drive/n;

    move-result-object p2

    :cond_0
    invoke-direct {p0, p1, p2, v1, v0}, Lcom/google/android/gms/drive/internal/bx;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;ILcom/google/android/gms/drive/w;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0

    :cond_1
    move-object v0, p4

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/query/Query;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/drive/query/Query;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/drive/c$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/drive/internal/br;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/br;-><init>()V

    invoke-direct {p0, p2}, Lcom/google/android/gms/drive/internal/bx;->a(Lcom/google/android/gms/drive/query/Query;)Lcom/google/android/gms/drive/query/Query;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/drive/internal/br;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/query/Query;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method
