.class public final Lcom/google/firebase/appindexing/a/h;
.super Lcom/google/firebase/appindexing/a/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/appindexing/a/e",
        "<",
        "Lcom/google/firebase/appindexing/a/h;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    const-string v0, "MusicAlbum"

    invoke-direct {p0, v0}, Lcom/google/firebase/appindexing/a/e;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(I)Lcom/google/firebase/appindexing/a/h;
    .locals 6

    const-string v0, "numTracks"

    const/4 v1, 0x1

    new-array v1, v1, [J

    const/4 v2, 0x0

    int-to-long v4, p1

    aput-wide v4, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/appindexing/a/h;->put(Ljava/lang/String;[J)Lcom/google/firebase/appindexing/a/e;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/a/h;

    return-object v0
.end method

.method public a(Lcom/google/firebase/appindexing/a/i;)Lcom/google/firebase/appindexing/a/h;
    .locals 3
    .param p1    # Lcom/google/firebase/appindexing/a/i;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "byArtist"

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/google/firebase/appindexing/a/i;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/appindexing/a/h;->a(Ljava/lang/String;[Lcom/google/firebase/appindexing/a/e;)Lcom/google/firebase/appindexing/a/e;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/a/h;

    return-object v0
.end method

.method public varargs a([Lcom/google/firebase/appindexing/a/k;)Lcom/google/firebase/appindexing/a/h;
    .locals 1
    .param p1    # [Lcom/google/firebase/appindexing/a/k;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "track"

    invoke-virtual {p0, v0, p1}, Lcom/google/firebase/appindexing/a/h;->a(Ljava/lang/String;[Lcom/google/firebase/appindexing/a/e;)Lcom/google/firebase/appindexing/a/e;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/a/h;

    return-object v0
.end method
