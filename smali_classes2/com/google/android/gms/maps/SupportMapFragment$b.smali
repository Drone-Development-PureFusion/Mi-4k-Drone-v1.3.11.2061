.class Lcom/google/android/gms/maps/SupportMapFragment$b;
.super Lcom/google/android/gms/c/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/maps/SupportMapFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/c/b",
        "<",
        "Lcom/google/android/gms/maps/SupportMapFragment$a;",
        ">;"
    }
.end annotation


# instance fields
.field protected a:Lcom/google/android/gms/c/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/c/g",
            "<",
            "Lcom/google/android/gms/maps/SupportMapFragment$a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroid/support/v4/app/Fragment;

.field private c:Landroid/app/Activity;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/support/v4/app/Fragment;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/c/b;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->d:Ljava/util/List;

    iput-object p1, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->b:Landroid/support/v4/app/Fragment;

    return-void
.end method

.method private a(Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->c:Landroid/app/Activity;

    invoke-virtual {p0}, Lcom/google/android/gms/maps/SupportMapFragment$b;->i()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/maps/SupportMapFragment$b;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/maps/SupportMapFragment$b;->a(Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/c/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/c/g",
            "<",
            "Lcom/google/android/gms/maps/SupportMapFragment$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->a:Lcom/google/android/gms/c/g;

    invoke-virtual {p0}, Lcom/google/android/gms/maps/SupportMapFragment$b;->i()V

    return-void
.end method

.method public a(Lcom/google/android/gms/maps/f;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/maps/SupportMapFragment$b;->a()Lcom/google/android/gms/c/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/maps/SupportMapFragment$b;->a()Lcom/google/android/gms/c/a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/SupportMapFragment$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/SupportMapFragment$a;->a(Lcom/google/android/gms/maps/f;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/maps/SupportMapFragment$b;->a()Lcom/google/android/gms/c/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/maps/SupportMapFragment$b;->a()Lcom/google/android/gms/c/a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/SupportMapFragment$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/SupportMapFragment$a;->c(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public i()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->c:Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->a:Lcom/google/android/gms/c/g;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/maps/SupportMapFragment$b;->a()Lcom/google/android/gms/c/a;

    move-result-object v0

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->c:Landroid/app/Activity;

    invoke-static {v0}, Lcom/google/android/gms/maps/e;->a(Landroid/content/Context;)I

    iget-object v0, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->c:Landroid/app/Activity;

    invoke-static {v0}, Lcom/google/android/gms/maps/a/v;->a(Landroid/content/Context;)Lcom/google/android/gms/maps/a/x;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->c:Landroid/app/Activity;

    invoke-static {v1}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/x;->b(Lcom/google/android/gms/c/e;)Lcom/google/android/gms/maps/a/d;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->a:Lcom/google/android/gms/c/g;

    new-instance v2, Lcom/google/android/gms/maps/SupportMapFragment$a;

    iget-object v3, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->b:Landroid/support/v4/app/Fragment;

    invoke-direct {v2, v3, v0}, Lcom/google/android/gms/maps/SupportMapFragment$a;-><init>(Landroid/support/v4/app/Fragment;Lcom/google/android/gms/maps/a/d;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/c/g;->a(Lcom/google/android/gms/c/a;)V

    iget-object v0, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/f;

    invoke-virtual {p0}, Lcom/google/android/gms/maps/SupportMapFragment$b;->a()Lcom/google/android/gms/c/a;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/SupportMapFragment$a;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/SupportMapFragment$a;->a(Lcom/google/android/gms/maps/f;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/android/gms/common/c; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1

    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/google/android/gms/common/c; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method public j()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/maps/SupportMapFragment$b;->a()Lcom/google/android/gms/c/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/maps/SupportMapFragment$b;->a()Lcom/google/android/gms/c/a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/SupportMapFragment$a;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/SupportMapFragment$a;->h()V

    :cond_0
    return-void
.end method
