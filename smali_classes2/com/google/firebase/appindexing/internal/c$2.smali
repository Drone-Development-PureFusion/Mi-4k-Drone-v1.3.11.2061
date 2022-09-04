.class Lcom/google/firebase/appindexing/internal/c$2;
.super Lcom/google/firebase/appindexing/internal/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/appindexing/internal/c;->a([Ljava/lang/String;)Lcom/google/android/gms/g/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/String;

.field final synthetic b:Lcom/google/firebase/appindexing/internal/c;


# direct methods
.method constructor <init>(Lcom/google/firebase/appindexing/internal/c;[Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/google/firebase/appindexing/internal/c$2;->b:Lcom/google/firebase/appindexing/internal/c;

    iput-object p2, p0, Lcom/google/firebase/appindexing/internal/c$2;->a:[Ljava/lang/String;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/firebase/appindexing/internal/c$b;-><init>(Lcom/google/firebase/appindexing/internal/c$1;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/firebase/appindexing/internal/f;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/firebase/appindexing/internal/c$2;->a()Lcom/google/android/gms/internal/aif;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/c$2;->a:[Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/google/firebase/appindexing/internal/f;->a(Lcom/google/android/gms/internal/aif;[Ljava/lang/String;)V

    return-void
.end method
