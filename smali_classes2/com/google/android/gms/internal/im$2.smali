.class Lcom/google/android/gms/internal/im$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/im;->b(Ljava/util/List;Lcom/google/android/gms/internal/ij;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/im$a;

.field final synthetic b:Lcom/google/android/gms/internal/im;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/im$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$2;->b:Lcom/google/android/gms/internal/im;

    iput-object p2, p0, Lcom/google/android/gms/internal/im$2;->a:Lcom/google/android/gms/internal/im$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/im$2;->b:Lcom/google/android/gms/internal/im;

    new-instance v1, Lcom/google/android/gms/internal/ja;

    iget-object v2, p0, Lcom/google/android/gms/internal/im$2;->b:Lcom/google/android/gms/internal/im;

    iget-object v3, p0, Lcom/google/android/gms/internal/im$2;->a:Lcom/google/android/gms/internal/im$a;

    invoke-static {v3}, Lcom/google/android/gms/internal/im$a;->j(Lcom/google/android/gms/internal/im$a;)Lcom/google/firebase/database/r;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/im$2;->a:Lcom/google/android/gms/internal/im$a;

    invoke-static {v4}, Lcom/google/android/gms/internal/im$a;->f(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/ij;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/internal/kg;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/kg;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ja;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/firebase/database/r;Lcom/google/android/gms/internal/kg;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/ie;)V

    return-void
.end method
