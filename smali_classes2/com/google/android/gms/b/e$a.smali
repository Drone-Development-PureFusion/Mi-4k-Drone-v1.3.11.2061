.class public Lcom/google/android/gms/b/e$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field final a:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/e$a;->a:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public b(Landroid/net/Uri;)Lcom/google/android/gms/b/e$a;
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "url"

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/b/e$a;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/e$a;

    return-object p0
.end method

.method public b(Ljava/lang/String;Lcom/google/android/gms/b/e;)Lcom/google/android/gms/b/e$a;
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/e$a;->a:Landroid/os/Bundle;

    iget-object v1, p2, Lcom/google/android/gms/b/e;->q:Landroid/os/Bundle;

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-object p0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/e$a;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/e$a;->a:Landroid/os/Bundle;

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public b(Ljava/lang/String;Z)Lcom/google/android/gms/b/e$a;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/b/e$a;->a:Landroid/os/Bundle;

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-object p0
.end method

.method public b(Ljava/lang/String;[Lcom/google/android/gms/b/e;)Lcom/google/android/gms/b/e$a;
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, p2, v0

    if-eqz v3, :cond_0

    iget-object v3, v3, Lcom/google/android/gms/b/e;->q:Landroid/os/Bundle;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/b/e$a;->a:Landroid/os/Bundle;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Landroid/os/Bundle;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/os/Parcelable;

    invoke-virtual {v2, p1, v0}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    :cond_2
    return-object p0
.end method

.method public b(Ljava/lang/String;[Ljava/lang/String;)Lcom/google/android/gms/b/e$a;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/e$a;->a:Landroid/os/Bundle;

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public b()Lcom/google/android/gms/b/e;
    .locals 2

    new-instance v0, Lcom/google/android/gms/b/e;

    iget-object v1, p0, Lcom/google/android/gms/b/e$a;->a:Landroid/os/Bundle;

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/e;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lcom/google/android/gms/b/e$a;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "name"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/b/e$a;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/e$a;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/google/android/gms/b/e$a;
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "id"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/b/e$a;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/e$a;

    :cond_0
    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/google/android/gms/b/e$a;
    .locals 1

    const-string v0, "type"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/b/e$a;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/e$a;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lcom/google/android/gms/b/e$a;
    .locals 1

    const-string v0, "description"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/b/e$a;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/e$a;

    return-object p0
.end method
