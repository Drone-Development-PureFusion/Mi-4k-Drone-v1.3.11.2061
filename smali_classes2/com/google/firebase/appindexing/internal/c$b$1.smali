.class Lcom/google/firebase/appindexing/internal/c$b$1;
.super Lcom/google/android/gms/internal/aif$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/appindexing/internal/c$b;->a()Lcom/google/android/gms/internal/aif;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/firebase/appindexing/internal/c$b;


# direct methods
.method constructor <init>(Lcom/google/firebase/appindexing/internal/c$b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/appindexing/internal/c$b$1;->a:Lcom/google/firebase/appindexing/internal/c$b;

    invoke-direct {p0}, Lcom/google/android/gms/internal/aif$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/appindexing/internal/c$b$1;->a:Lcom/google/firebase/appindexing/internal/c$b;

    invoke-static {v0}, Lcom/google/firebase/appindexing/internal/c$b;->a(Lcom/google/firebase/appindexing/internal/c$b;)Lcom/google/android/gms/g/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Object;)V

    return-void
.end method
