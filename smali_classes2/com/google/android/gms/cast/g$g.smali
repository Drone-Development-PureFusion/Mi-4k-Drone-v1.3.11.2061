.class abstract Lcom/google/android/gms/cast/g$g;
.super Lcom/google/android/gms/cast/internal/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/cast/internal/b",
        "<",
        "Lcom/google/android/gms/cast/g$a;",
        ">;"
    }
.end annotation


# instance fields
.field h:Lcom/google/android/gms/cast/internal/p;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/g;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/internal/b;-><init>(Lcom/google/android/gms/common/api/g;)V

    new-instance v0, Lcom/google/android/gms/cast/g$g$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/cast/g$g$1;-><init>(Lcom/google/android/gms/cast/g$g;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/g$g;->h:Lcom/google/android/gms/cast/internal/p;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/cast/g$a;
    .locals 1

    new-instance v0, Lcom/google/android/gms/cast/g$g$2;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/cast/g$g$2;-><init>(Lcom/google/android/gms/cast/g$g;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method protected a(Lcom/google/android/gms/cast/internal/e;)V
    .locals 0

    return-void
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/cast/internal/e;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/g$g;->a(Lcom/google/android/gms/cast/internal/e;)V

    return-void
.end method

.method public synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/g$g;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/cast/g$a;

    move-result-object v0

    return-object v0
.end method
