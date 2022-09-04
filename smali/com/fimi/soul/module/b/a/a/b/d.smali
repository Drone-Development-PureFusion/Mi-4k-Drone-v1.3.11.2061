.class public Lcom/fimi/soul/module/b/a/a/b/d;
.super Lcom/fimi/soul/module/b/a/a/i;


# direct methods
.method public constructor <init>(Lcom/fimi/soul/module/b/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/b/a/a/i;-><init>(Lcom/fimi/soul/module/b/e;)V

    return-void
.end method


# virtual methods
.method protected a(Ljava/util/ArrayList;)Lcom/fimi/soul/module/b/a/a/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/fimi/soul/module/b/a/a/j;"
        }
    .end annotation

    new-instance v0, Lcom/fimi/soul/module/b/a/a/b/c;

    invoke-direct {v0, p0, p1}, Lcom/fimi/soul/module/b/a/a/b/c;-><init>(Lcom/fimi/soul/module/b/a/a/i;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public onCreate()V
    .locals 0

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/b/d;->requestPortraitOrientation()V

    invoke-super {p0}, Lcom/fimi/soul/module/b/a/a/i;->onCreate()V

    return-void
.end method
