.class public final Lcom/google/firebase/appindexing/a/g;
.super Lcom/google/firebase/appindexing/a/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/appindexing/a/e",
        "<",
        "Lcom/google/firebase/appindexing/a/g;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    const-string v0, "Message"

    invoke-direct {p0, v0}, Lcom/google/firebase/appindexing/a/e;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/appindexing/a/e;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/firebase/appindexing/a/l;)Lcom/google/firebase/appindexing/a/g;
    .locals 3
    .param p1    # Lcom/google/firebase/appindexing/a/l;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "sender"

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/google/firebase/appindexing/a/l;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/appindexing/a/g;->a(Ljava/lang/String;[Lcom/google/firebase/appindexing/a/e;)Lcom/google/firebase/appindexing/a/e;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/a/g;

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lcom/google/firebase/appindexing/a/g;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "text"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/appindexing/a/g;->put(Ljava/lang/String;[Ljava/lang/String;)Lcom/google/firebase/appindexing/a/e;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/a/g;

    return-object v0
.end method

.method public a(Ljava/util/Date;)Lcom/google/firebase/appindexing/a/g;
    .locals 6
    .param p1    # Ljava/util/Date;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "dateSent"

    const/4 v1, 0x1

    new-array v1, v1, [J

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    aput-wide v4, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/appindexing/a/g;->put(Ljava/lang/String;[J)Lcom/google/firebase/appindexing/a/e;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/a/g;

    return-object v0
.end method

.method public varargs a([Lcom/google/firebase/appindexing/a/b;)Lcom/google/firebase/appindexing/a/g;
    .locals 1
    .param p1    # [Lcom/google/firebase/appindexing/a/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "isPartOf"

    invoke-virtual {p0, v0, p1}, Lcom/google/firebase/appindexing/a/g;->a(Ljava/lang/String;[Lcom/google/firebase/appindexing/a/e;)Lcom/google/firebase/appindexing/a/e;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/a/g;

    return-object v0
.end method

.method public varargs a([Lcom/google/firebase/appindexing/a/c;)Lcom/google/firebase/appindexing/a/g;
    .locals 1
    .param p1    # [Lcom/google/firebase/appindexing/a/c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "messageAttachment"

    invoke-virtual {p0, v0, p1}, Lcom/google/firebase/appindexing/a/g;->a(Ljava/lang/String;[Lcom/google/firebase/appindexing/a/e;)Lcom/google/firebase/appindexing/a/e;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/a/g;

    return-object v0
.end method

.method public varargs a([Lcom/google/firebase/appindexing/a/l;)Lcom/google/firebase/appindexing/a/g;
    .locals 1
    .param p1    # [Lcom/google/firebase/appindexing/a/l;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "recipient"

    invoke-virtual {p0, v0, p1}, Lcom/google/firebase/appindexing/a/g;->a(Ljava/lang/String;[Lcom/google/firebase/appindexing/a/e;)Lcom/google/firebase/appindexing/a/e;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/a/g;

    return-object v0
.end method

.method public b(Ljava/util/Date;)Lcom/google/firebase/appindexing/a/g;
    .locals 6
    .param p1    # Ljava/util/Date;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "dateReceived"

    const/4 v1, 0x1

    new-array v1, v1, [J

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    aput-wide v4, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/appindexing/a/g;->put(Ljava/lang/String;[J)Lcom/google/firebase/appindexing/a/e;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/a/g;

    return-object v0
.end method

.method public c(Ljava/util/Date;)Lcom/google/firebase/appindexing/a/g;
    .locals 6
    .param p1    # Ljava/util/Date;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "dateRead"

    const/4 v1, 0x1

    new-array v1, v1, [J

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    aput-wide v4, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/appindexing/a/g;->put(Ljava/lang/String;[J)Lcom/google/firebase/appindexing/a/e;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/a/g;

    return-object v0
.end method
