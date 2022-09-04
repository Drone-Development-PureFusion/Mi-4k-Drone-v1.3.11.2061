.class Lcom/google/android/gms/internal/im$9$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/im$9;->a(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/iv;Lcom/google/android/gms/internal/hq;Lcom/google/android/gms/internal/iu$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/kg;

.field final synthetic b:Lcom/google/android/gms/internal/iu$a;

.field final synthetic c:Lcom/google/android/gms/internal/im$9;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/im$9;Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/iu$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$9$1;->c:Lcom/google/android/gms/internal/im$9;

    iput-object p2, p0, Lcom/google/android/gms/internal/im$9$1;->a:Lcom/google/android/gms/internal/kg;

    iput-object p3, p0, Lcom/google/android/gms/internal/im$9$1;->b:Lcom/google/android/gms/internal/iu$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/im$9$1;->c:Lcom/google/android/gms/internal/im$9;

    iget-object v0, v0, Lcom/google/android/gms/internal/im$9;->a:Lcom/google/android/gms/internal/im;

    invoke-static {v0}, Lcom/google/android/gms/internal/im;->d(Lcom/google/android/gms/internal/im;)Lcom/google/android/gms/internal/ir;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/im$9$1;->a:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ir;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/im$9$1;->c:Lcom/google/android/gms/internal/im$9;

    iget-object v1, v1, Lcom/google/android/gms/internal/im$9;->a:Lcom/google/android/gms/internal/im;

    invoke-static {v1}, Lcom/google/android/gms/internal/im;->e(Lcom/google/android/gms/internal/im;)Lcom/google/android/gms/internal/iu;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/im$9$1;->a:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/im$9$1;->c:Lcom/google/android/gms/internal/im$9;

    iget-object v1, v1, Lcom/google/android/gms/internal/im$9;->a:Lcom/google/android/gms/internal/im;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/im;Ljava/util/List;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/im$9$1;->b:Lcom/google/android/gms/internal/iu$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/iu$a;->a(Lcom/google/firebase/database/c;)Ljava/util/List;

    :cond_0
    return-void
.end method
