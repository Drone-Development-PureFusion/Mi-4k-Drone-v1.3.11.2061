.class public Lcom/google/android/gms/cast/framework/ae;
.super Lcom/google/android/gms/cast/framework/ab$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/google/android/gms/cast/framework/j;",
        ">",
        "Lcom/google/android/gms/cast/framework/ab$a;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/cast/framework/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/cast/framework/l",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/cast/framework/l;Ljava/lang/Class;)V
    .locals 0
    .param p1    # Lcom/google/android/gms/cast/framework/l;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/cast/framework/l",
            "<TT;>;",
            "Ljava/lang/Class",
            "<TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/ab$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/ae;->a:Lcom/google/android/gms/cast/framework/l;

    iput-object p2, p0, Lcom/google/android/gms/cast/framework/ae;->b:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const v0, 0x93c108

    return v0
.end method

.method public a(Lcom/google/android/gms/c/e;)V
    .locals 3
    .param p1    # Lcom/google/android/gms/c/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/j;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/ae;->b:Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/ae;->a:Lcom/google/android/gms/cast/framework/l;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/ae;->b:Ljava/lang/Class;

    invoke-virtual {v2, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/j;

    invoke-interface {v1, v0}, Lcom/google/android/gms/cast/framework/l;->a(Lcom/google/android/gms/cast/framework/j;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/c/e;I)V
    .locals 3
    .param p1    # Lcom/google/android/gms/c/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/j;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/ae;->b:Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/ae;->a:Lcom/google/android/gms/cast/framework/l;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/ae;->b:Ljava/lang/Class;

    invoke-virtual {v2, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/j;

    invoke-interface {v1, v0, p2}, Lcom/google/android/gms/cast/framework/l;->a(Lcom/google/android/gms/cast/framework/j;I)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/c/e;Ljava/lang/String;)V
    .locals 3
    .param p1    # Lcom/google/android/gms/c/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/j;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/ae;->b:Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/ae;->a:Lcom/google/android/gms/cast/framework/l;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/ae;->b:Ljava/lang/Class;

    invoke-virtual {v2, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/j;

    invoke-interface {v1, v0, p2}, Lcom/google/android/gms/cast/framework/l;->a(Lcom/google/android/gms/cast/framework/j;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/c/e;Z)V
    .locals 3
    .param p1    # Lcom/google/android/gms/c/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/j;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/ae;->b:Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/ae;->a:Lcom/google/android/gms/cast/framework/l;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/ae;->b:Ljava/lang/Class;

    invoke-virtual {v2, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/j;

    invoke-interface {v1, v0, p2}, Lcom/google/android/gms/cast/framework/l;->a(Lcom/google/android/gms/cast/framework/j;Z)V

    :cond_0
    return-void
.end method

.method public b()Lcom/google/android/gms/c/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/ae;->a:Lcom/google/android/gms/cast/framework/l;

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/c/e;)V
    .locals 3
    .param p1    # Lcom/google/android/gms/c/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/j;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/ae;->b:Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/ae;->a:Lcom/google/android/gms/cast/framework/l;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/ae;->b:Ljava/lang/Class;

    invoke-virtual {v2, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/j;

    invoke-interface {v1, v0}, Lcom/google/android/gms/cast/framework/l;->b(Lcom/google/android/gms/cast/framework/j;)V

    :cond_0
    return-void
.end method

.method public b(Lcom/google/android/gms/c/e;I)V
    .locals 3
    .param p1    # Lcom/google/android/gms/c/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/j;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/ae;->b:Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/ae;->a:Lcom/google/android/gms/cast/framework/l;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/ae;->b:Ljava/lang/Class;

    invoke-virtual {v2, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/j;

    invoke-interface {v1, v0, p2}, Lcom/google/android/gms/cast/framework/l;->b(Lcom/google/android/gms/cast/framework/j;I)V

    :cond_0
    return-void
.end method

.method public b(Lcom/google/android/gms/c/e;Ljava/lang/String;)V
    .locals 3
    .param p1    # Lcom/google/android/gms/c/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/j;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/ae;->b:Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/ae;->a:Lcom/google/android/gms/cast/framework/l;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/ae;->b:Ljava/lang/Class;

    invoke-virtual {v2, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/j;

    invoke-interface {v1, v0, p2}, Lcom/google/android/gms/cast/framework/l;->b(Lcom/google/android/gms/cast/framework/j;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public c(Lcom/google/android/gms/c/e;I)V
    .locals 3
    .param p1    # Lcom/google/android/gms/c/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/j;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/ae;->b:Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/ae;->a:Lcom/google/android/gms/cast/framework/l;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/ae;->b:Ljava/lang/Class;

    invoke-virtual {v2, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/j;

    invoke-interface {v1, v0, p2}, Lcom/google/android/gms/cast/framework/l;->c(Lcom/google/android/gms/cast/framework/j;I)V

    :cond_0
    return-void
.end method

.method public d(Lcom/google/android/gms/c/e;I)V
    .locals 3
    .param p1    # Lcom/google/android/gms/c/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/j;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/ae;->b:Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/ae;->a:Lcom/google/android/gms/cast/framework/l;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/ae;->b:Ljava/lang/Class;

    invoke-virtual {v2, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/j;

    invoke-interface {v1, v0, p2}, Lcom/google/android/gms/cast/framework/l;->d(Lcom/google/android/gms/cast/framework/j;I)V

    :cond_0
    return-void
.end method
