.class Lcom/google/firebase/appindexing/internal/c$1;
.super Lcom/google/firebase/appindexing/internal/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/appindexing/internal/c;->a([Lcom/google/firebase/appindexing/g;)Lcom/google/android/gms/g/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[Lcom/google/firebase/appindexing/internal/Thing;

.field final synthetic b:Lcom/google/firebase/appindexing/internal/c;


# direct methods
.method constructor <init>(Lcom/google/firebase/appindexing/internal/c;[Lcom/google/firebase/appindexing/internal/Thing;)V
    .locals 1

    iput-object p1, p0, Lcom/google/firebase/appindexing/internal/c$1;->b:Lcom/google/firebase/appindexing/internal/c;

    iput-object p2, p0, Lcom/google/firebase/appindexing/internal/c$1;->a:[Lcom/google/firebase/appindexing/internal/Thing;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/firebase/appindexing/internal/c$b;-><init>(Lcom/google/firebase/appindexing/internal/c$1;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/firebase/appindexing/internal/f;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/firebase/appindexing/internal/c$1;->a()Lcom/google/android/gms/internal/aif;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/c$1;->a:[Lcom/google/firebase/appindexing/internal/Thing;

    invoke-interface {p1, v0, v1}, Lcom/google/firebase/appindexing/internal/f;->a(Lcom/google/android/gms/internal/aif;[Lcom/google/firebase/appindexing/internal/Thing;)V

    return-void
.end method
