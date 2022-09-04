.class Lcom/google/android/gms/cast/framework/d$c;
.super Lcom/google/android/gms/cast/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/framework/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/framework/d;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/cast/framework/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/d$c;->a:Lcom/google/android/gms/cast/framework/d;

    invoke-direct {p0}, Lcom/google/android/gms/cast/a$d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/cast/framework/d;Lcom/google/android/gms/cast/framework/d$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/d$c;-><init>(Lcom/google/android/gms/cast/framework/d;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d$c;->a:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v1}, Lcom/google/android/gms/cast/framework/d;->b(Lcom/google/android/gms/cast/framework/d;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a$d;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/a$d;->a()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d$c;->a:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v0, p1}, Lcom/google/android/gms/cast/framework/d;->a(Lcom/google/android/gms/cast/framework/d;I)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d$c;->a:Lcom/google/android/gms/cast/framework/d;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/framework/d;->b(I)V

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d$c;->a:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v1}, Lcom/google/android/gms/cast/framework/d;->b(Lcom/google/android/gms/cast/framework/d;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a$d;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/a$d;->a(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/cast/ApplicationMetadata;)V
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d$c;->a:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v1}, Lcom/google/android/gms/cast/framework/d;->b(Lcom/google/android/gms/cast/framework/d;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a$d;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/a$d;->a(Lcom/google/android/gms/cast/ApplicationMetadata;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d$c;->a:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v1}, Lcom/google/android/gms/cast/framework/d;->b(Lcom/google/android/gms/cast/framework/d;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a$d;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/a$d;->b()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d$c;->a:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v1}, Lcom/google/android/gms/cast/framework/d;->b(Lcom/google/android/gms/cast/framework/d;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a$d;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/a$d;->b(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d$c;->a:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v1}, Lcom/google/android/gms/cast/framework/d;->b(Lcom/google/android/gms/cast/framework/d;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a$d;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/a$d;->c(I)V

    goto :goto_0

    :cond_0
    return-void
.end method
