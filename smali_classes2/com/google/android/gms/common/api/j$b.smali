.class final Lcom/google/android/gms/common/api/j$b;
.super Lcom/google/android/gms/internal/ahn;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/api/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/common/api/m;",
        ">",
        "Lcom/google/android/gms/internal/ahn",
        "<TR;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/api/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TR;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "TR;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ahn;-><init>(Lcom/google/android/gms/common/api/g;)V

    iput-object p2, p0, Lcom/google/android/gms/common/api/j$b;->a:Lcom/google/android/gms/common/api/m;

    return-void
.end method


# virtual methods
.method protected b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/Status;",
            ")TR;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/j$b;->a:Lcom/google/android/gms/common/api/m;

    return-object v0
.end method
