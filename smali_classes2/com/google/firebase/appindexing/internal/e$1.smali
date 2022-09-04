.class Lcom/google/firebase/appindexing/internal/e$1;
.super Lcom/google/firebase/appindexing/internal/e$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/appindexing/internal/e;->a(ILcom/google/firebase/appindexing/a;)Lcom/google/android/gms/g/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[Lcom/google/firebase/appindexing/internal/ActionImpl;

.field final synthetic b:Lcom/google/firebase/appindexing/internal/e;


# direct methods
.method constructor <init>(Lcom/google/firebase/appindexing/internal/e;[Lcom/google/firebase/appindexing/internal/ActionImpl;)V
    .locals 1

    iput-object p1, p0, Lcom/google/firebase/appindexing/internal/e$1;->b:Lcom/google/firebase/appindexing/internal/e;

    iput-object p2, p0, Lcom/google/firebase/appindexing/internal/e$1;->a:[Lcom/google/firebase/appindexing/internal/ActionImpl;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/firebase/appindexing/internal/e$b;-><init>(Lcom/google/firebase/appindexing/internal/e$1;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/aeb;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/aeh$d;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/aeh$d;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/e$1;->a:[Lcom/google/firebase/appindexing/internal/ActionImpl;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/aeb;->a(Lcom/google/android/gms/internal/aec;[Lcom/google/firebase/appindexing/internal/ActionImpl;)V

    return-void
.end method
