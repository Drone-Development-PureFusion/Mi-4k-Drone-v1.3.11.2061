.class Lcom/google/android/gms/internal/im$18;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/is$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/im;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/google/android/gms/internal/im;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/im;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$18;->b:Lcom/google/android/gms/internal/im;

    iput-object p2, p0, Lcom/google/android/gms/internal/im$18;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/im$18;->a:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/im$18;->b:Lcom/google/android/gms/internal/im;

    invoke-static {v1}, Lcom/google/android/gms/internal/im;->g(Lcom/google/android/gms/internal/im;)Lcom/google/android/gms/internal/iu;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/im$18;->b:Lcom/google/android/gms/internal/im;

    const/16 v1, -0x9

    invoke-static {v0, p1, v1}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;I)Lcom/google/android/gms/internal/ij;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/im$18;->b:Lcom/google/android/gms/internal/im;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    return-void
.end method
