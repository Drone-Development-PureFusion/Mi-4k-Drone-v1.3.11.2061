.class Lcom/google/firebase/auth/FirebaseAuth$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/auth/FirebaseAuth;->a(Lcom/google/firebase/auth/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/mr;

.field final synthetic b:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/android/gms/internal/mr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth$2;->b:Lcom/google/firebase/auth/FirebaseAuth;

    iput-object p2, p0, Lcom/google/firebase/auth/FirebaseAuth$2;->a:Lcom/google/android/gms/internal/mr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth$2;->b:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->a(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/firebase/b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth$2;->a:Lcom/google/android/gms/internal/mr;

    invoke-virtual {v0, v1}, Lcom/google/firebase/b;->a(Lcom/google/android/gms/internal/mr;)V

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth$2;->b:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->b(Lcom/google/firebase/auth/FirebaseAuth;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/FirebaseAuth$a;

    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth$2;->b:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-interface {v0, v2}, Lcom/google/firebase/auth/FirebaseAuth$a;->a(Lcom/google/firebase/auth/FirebaseAuth;)V

    goto :goto_0

    :cond_0
    return-void
.end method
