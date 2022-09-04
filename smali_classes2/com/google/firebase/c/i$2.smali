.class Lcom/google/firebase/c/i$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/g/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/c/i;->l()Lcom/google/android/gms/g/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/g/g;

.field final synthetic b:Lcom/google/firebase/c/i;


# direct methods
.method constructor <init>(Lcom/google/firebase/c/i;Lcom/google/android/gms/g/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/c/i$2;->b:Lcom/google/firebase/c/i;

    iput-object p2, p0, Lcom/google/firebase/c/i$2;->a:Lcom/google/android/gms/g/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 1
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/firebase/c/i$2;->a:Lcom/google/android/gms/g/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Exception;)V

    return-void
.end method
