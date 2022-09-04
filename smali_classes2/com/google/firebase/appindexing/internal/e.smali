.class public final Lcom/google/firebase/appindexing/internal/e;
.super Lcom/google/firebase/appindexing/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/appindexing/internal/e$b;,
        Lcom/google/firebase/appindexing/internal/e$a;
    }
.end annotation


# instance fields
.field private b:Lcom/google/firebase/appindexing/internal/e$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/appindexing/f;-><init>()V

    new-instance v0, Lcom/google/firebase/appindexing/internal/e$a;

    invoke-direct {v0, p1}, Lcom/google/firebase/appindexing/internal/e$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/firebase/appindexing/internal/e;->b:Lcom/google/firebase/appindexing/internal/e$a;

    return-void
.end method

.method private a(ILcom/google/firebase/appindexing/a;)Lcom/google/android/gms/g/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/firebase/appindexing/a;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    instance-of v0, p2, Lcom/google/firebase/appindexing/internal/ActionImpl;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/firebase/appindexing/d;

    const-string v1, "Custom Action objects are not allowed. Please use the \'Actions\' or \'ActionBuilder\' class for creating Action objects."

    invoke-direct {v0, v1}, Lcom/google/firebase/appindexing/d;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/g/i;->a(Ljava/lang/Exception;)Lcom/google/android/gms/g/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/firebase/appindexing/internal/ActionImpl;

    check-cast p2, Lcom/google/firebase/appindexing/internal/ActionImpl;

    aput-object p2, v0, v1

    aget-object v1, v0, v1

    invoke-virtual {v1}, Lcom/google/firebase/appindexing/internal/ActionImpl;->e()Lcom/google/firebase/appindexing/internal/ActionImpl$MetadataImpl;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/firebase/appindexing/internal/ActionImpl$MetadataImpl;->a(I)V

    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/e;->b:Lcom/google/firebase/appindexing/internal/e$a;

    new-instance v2, Lcom/google/firebase/appindexing/internal/e$1;

    invoke-direct {v2, p0, v0}, Lcom/google/firebase/appindexing/internal/e$1;-><init>(Lcom/google/firebase/appindexing/internal/e;[Lcom/google/firebase/appindexing/internal/ActionImpl;)V

    invoke-virtual {v1, v2}, Lcom/google/firebase/appindexing/internal/e$a;->b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/firebase/appindexing/a;)Lcom/google/android/gms/g/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/appindexing/a;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lcom/google/firebase/appindexing/internal/e;->a(ILcom/google/firebase/appindexing/a;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/firebase/appindexing/a;)Lcom/google/android/gms/g/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/appindexing/a;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lcom/google/firebase/appindexing/internal/e;->a(ILcom/google/firebase/appindexing/a;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method
