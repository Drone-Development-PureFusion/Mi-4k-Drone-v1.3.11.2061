.class Lcom/google/firebase/appindexing/internal/c$c$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/g/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/appindexing/internal/c$c;->a(Lcom/google/firebase/appindexing/internal/c$b;)Lcom/google/android/gms/g/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/g/b",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/firebase/appindexing/internal/c$b;

.field final synthetic b:Lcom/google/android/gms/g/g;

.field final synthetic c:Lcom/google/firebase/appindexing/internal/c$c;


# direct methods
.method constructor <init>(Lcom/google/firebase/appindexing/internal/c$c;Lcom/google/firebase/appindexing/internal/c$b;Lcom/google/android/gms/g/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/appindexing/internal/c$c$2;->c:Lcom/google/firebase/appindexing/internal/c$c;

    iput-object p2, p0, Lcom/google/firebase/appindexing/internal/c$c$2;->a:Lcom/google/firebase/appindexing/internal/c$b;

    iput-object p3, p0, Lcom/google/firebase/appindexing/internal/c$c$2;->b:Lcom/google/android/gms/g/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/g/f;)V
    .locals 4
    .param p1    # Lcom/google/android/gms/g/f;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/appindexing/internal/c$c$2;->c:Lcom/google/firebase/appindexing/internal/c$c;

    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/c$c$2;->a:Lcom/google/firebase/appindexing/internal/c$b;

    iget-object v2, p0, Lcom/google/firebase/appindexing/internal/c$c$2;->b:Lcom/google/android/gms/g/g;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/google/firebase/appindexing/internal/c$c;->a(Lcom/google/firebase/appindexing/internal/c$c;Lcom/google/firebase/appindexing/internal/c$b;Lcom/google/android/gms/g/g;I)V

    return-void
.end method
