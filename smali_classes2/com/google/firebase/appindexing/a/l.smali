.class public final Lcom/google/firebase/appindexing/a/l;
.super Lcom/google/firebase/appindexing/a/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/appindexing/a/e",
        "<",
        "Lcom/google/firebase/appindexing/a/l;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    const-string v0, "Person"

    invoke-direct {p0, v0}, Lcom/google/firebase/appindexing/a/e;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/google/firebase/appindexing/a/l;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "email"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/appindexing/a/l;->put(Ljava/lang/String;[Ljava/lang/String;)Lcom/google/firebase/appindexing/a/e;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/a/l;

    return-object v0
.end method

.method public a(Z)Lcom/google/firebase/appindexing/a/l;
    .locals 3
    .param p1    # Z
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "isSelf"

    const/4 v1, 0x1

    new-array v1, v1, [Z

    const/4 v2, 0x0

    aput-boolean p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/appindexing/a/l;->put(Ljava/lang/String;[Z)Lcom/google/firebase/appindexing/a/e;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/a/l;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/google/firebase/appindexing/a/l;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "telephone"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/appindexing/a/l;->put(Ljava/lang/String;[Ljava/lang/String;)Lcom/google/firebase/appindexing/a/e;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/a/l;

    return-object v0
.end method
