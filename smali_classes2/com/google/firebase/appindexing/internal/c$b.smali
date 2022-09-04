.class abstract Lcom/google/firebase/appindexing/internal/c$b;
.super Lcom/google/android/gms/internal/aiv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/appindexing/internal/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/aiv",
        "<",
        "Lcom/google/firebase/appindexing/internal/b;",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/g/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/g/g",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/aiv;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/firebase/appindexing/internal/c$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/appindexing/internal/c$b;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/google/firebase/appindexing/internal/c$b;)Lcom/google/android/gms/g/g;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/appindexing/internal/c$b;->a:Lcom/google/android/gms/g/g;

    return-object v0
.end method


# virtual methods
.method protected a()Lcom/google/android/gms/internal/aif;
    .locals 1

    new-instance v0, Lcom/google/firebase/appindexing/internal/c$b$1;

    invoke-direct {v0, p0}, Lcom/google/firebase/appindexing/internal/c$b$1;-><init>(Lcom/google/firebase/appindexing/internal/c$b;)V

    return-object v0
.end method

.method protected synthetic a(Lcom/google/android/gms/common/api/a$c;Lcom/google/android/gms/g/g;)V
    .locals 0

    check-cast p1, Lcom/google/firebase/appindexing/internal/b;

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/appindexing/internal/c$b;->a(Lcom/google/firebase/appindexing/internal/b;Lcom/google/android/gms/g/g;)V

    return-void
.end method

.method protected final a(Lcom/google/firebase/appindexing/internal/b;Lcom/google/android/gms/g/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/appindexing/internal/b;",
            "Lcom/google/android/gms/g/g",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    iput-object p2, p0, Lcom/google/firebase/appindexing/internal/c$b;->a:Lcom/google/android/gms/g/g;

    invoke-virtual {p1}, Lcom/google/firebase/appindexing/internal/b;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/internal/f;

    invoke-virtual {p0, v0}, Lcom/google/firebase/appindexing/internal/c$b;->a(Lcom/google/firebase/appindexing/internal/f;)V

    return-void
.end method

.method protected abstract a(Lcom/google/firebase/appindexing/internal/f;)V
.end method
