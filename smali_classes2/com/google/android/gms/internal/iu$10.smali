.class Lcom/google/android/gms/internal/iu$10;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ju$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/kh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ju$a",
        "<",
        "Lcom/google/android/gms/internal/it;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/iu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/iu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/iu$10;->a:Lcom/google/android/gms/internal/iu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/android/gms/internal/ij;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, Lcom/google/android/gms/internal/it;

    check-cast p3, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/iu$10;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/it;Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/it;Ljava/lang/Void;)Ljava/lang/Void;
    .locals 5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/it;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/it;->d()Lcom/google/android/gms/internal/kh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kh;->a()Lcom/google/android/gms/internal/kg;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/iu$10;->a:Lcom/google/android/gms/internal/iu;

    invoke-static {v1}, Lcom/google/android/gms/internal/iu;->h(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/iu$d;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/iu$10;->a:Lcom/google/android/gms/internal/iu;

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kg;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/iu$10;->a:Lcom/google/android/gms/internal/iu;

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/iv;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/internal/iu$d;->a(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/iv;)V

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/it;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/kh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kh;->a()Lcom/google/android/gms/internal/kg;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/iu$10;->a:Lcom/google/android/gms/internal/iu;

    invoke-static {v2}, Lcom/google/android/gms/internal/iu;->h(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/iu$d;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/iu$10;->a:Lcom/google/android/gms/internal/iu;

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kg;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/iu$10;->a:Lcom/google/android/gms/internal/iu;

    invoke-static {v4, v0}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/iv;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Lcom/google/android/gms/internal/iu$d;->a(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/iv;)V

    goto :goto_0
.end method
