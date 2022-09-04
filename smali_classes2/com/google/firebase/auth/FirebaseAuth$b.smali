.class Lcom/google/firebase/auth/FirebaseAuth$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/gj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/auth/FirebaseAuth;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth$b;->a:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/firebase/auth/api/model/GetTokenResponse;Lcom/google/firebase/auth/n;)V
    .locals 2
    .param p1    # Lcom/google/firebase/auth/api/model/GetTokenResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v1, 0x1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, p1}, Lcom/google/firebase/auth/n;->a(Lcom/google/firebase/auth/api/model/GetTokenResponse;)V

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth$b;->a:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {v0, p2, p1, v1}, Lcom/google/firebase/auth/FirebaseAuth;->a(Lcom/google/firebase/auth/n;Lcom/google/firebase/auth/api/model/GetTokenResponse;Z)V

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth$b;->a:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {v0, p2, v1, v1}, Lcom/google/firebase/auth/FirebaseAuth;->a(Lcom/google/firebase/auth/n;ZZ)V

    return-void
.end method
