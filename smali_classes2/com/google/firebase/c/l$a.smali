.class public Lcom/google/firebase/c/l$a;
.super Lcom/google/firebase/c/j$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/c/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/c/j",
        "<",
        "Lcom/google/firebase/c/l$a;",
        ">.b;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/firebase/c/l;

.field private final c:J

.field private final d:Landroid/net/Uri;

.field private final e:Lcom/google/firebase/c/h;


# direct methods
.method constructor <init>(Lcom/google/firebase/c/l;Ljava/lang/Exception;JLandroid/net/Uri;Lcom/google/firebase/c/h;)V
    .locals 1

    iput-object p1, p0, Lcom/google/firebase/c/l$a;->a:Lcom/google/firebase/c/l;

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/c/j$b;-><init>(Lcom/google/firebase/c/j;Ljava/lang/Exception;)V

    iput-wide p3, p0, Lcom/google/firebase/c/l$a;->c:J

    iput-object p5, p0, Lcom/google/firebase/c/l$a;->d:Landroid/net/Uri;

    iput-object p6, p0, Lcom/google/firebase/c/l$a;->e:Lcom/google/firebase/c/h;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/c/l$a;->c:J

    return-wide v0
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/c/l$a;->a:Lcom/google/firebase/c/l;

    invoke-virtual {v0}, Lcom/google/firebase/c/l;->k()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic c()Ljava/lang/Exception;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    invoke-super {p0}, Lcom/google/firebase/c/j$b;->c()Ljava/lang/Exception;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Lcom/google/firebase/c/i;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-super {p0}, Lcom/google/firebase/c/j$b;->d()Lcom/google/firebase/c/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Lcom/google/firebase/c/j;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-super {p0}, Lcom/google/firebase/c/j$b;->e()Lcom/google/firebase/c/j;

    move-result-object v0

    return-object v0
.end method

.method public f()Landroid/net/Uri;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/c/l$a;->d:Landroid/net/Uri;

    return-object v0
.end method

.method public g()Lcom/google/firebase/c/h;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/c/l$a;->e:Lcom/google/firebase/c/h;

    return-object v0
.end method

.method public h()Landroid/net/Uri;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/c/l$a;->g()Lcom/google/firebase/c/h;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/firebase/c/h;->l()Landroid/net/Uri;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
